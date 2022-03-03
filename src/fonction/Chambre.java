package fonction;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import fonction.Connect;

public final class Chambre {
    public int idC;
    public String Types;
    public int nbrFandrina;

    public Chambre() {
    }
   
    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getTypes() {
        return Types;
    }

    public void setTypes(String Types) {
        this.Types = Types;
    }

    public int getNbrFandrina() {
        return nbrFandrina;
    }

    public void setNbrFandrina(int nbrFandrina) {
        this.nbrFandrina = nbrFandrina;
    }

    public Chambre(int idC, String Types, int nbrFandrina) {
        this.idC = idC;
        this.Types = Types;
        this.nbrFandrina = nbrFandrina;
    }

    
	

	public int gettaille(ResultSet r) throws Exception
	{
		int taille = 0;
		while (r.next()){
			taille++;
		}
		return taille;
	}

	public int getNbrColonne(){
		Field[] attribut = this.getClass().getDeclaredFields();
		int nbr = 0;
		for( int i =0; i < attribut.length; i++){
                    System.out.println(attribut[i].getName());
			nbr++;
		}
		return nbr;
	}
	public Chambre[] getChambre() throws Exception
	{
		Chambre[] ch = new Chambre[0];
		Connection conn = null;
		Statement state = null;
		ResultSet res = null;
                Connect con = new Connect();
	try{
		conn = con.getPostgreConnection();
		String select = "select *  from Chambre";
		state = conn.createStatement();
		res = state.executeQuery(select);
		int nbrCol = getNbrColonne();
		int i=1; 
		int nbr = this.gettaille(res);
		int indice = 0;
		int taille = 0;
		res = state.executeQuery(select);
		ch = new Chambre[nbr];
		while(res.next()){
                    ch[indice] = new Chambre(res.getInt("idC"),res.getString("Types"),res.getInt("nbrFandrina"));
                    System.out.println("Type Chambre:"+ch[indice].getTypes());
                    
                    /*System.out.println("atioooooooooo");
                    System.out.println("id ; "+res.getInt("idC"));
                    System.out.println("type ; "+res.getString("Types"));
                    System.out.println("nbr  ; "+res.getInt("nbrFandrina"));*/
                    indice++;
		}
		
        }
        catch(Exception e){ 
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
        return ch;
    }
   }
