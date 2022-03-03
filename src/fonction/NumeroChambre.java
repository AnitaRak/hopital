package fonction;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import fonction.Connect;

public class NumeroChambre {
    public int idNC;
    public int numero;

    public NumeroChambre() {
    }
    
    

    public int getIdNC() {
        return idNC;
    }

    public void setIdNC(int idNC) {
        this.idNC = idNC;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumeroChambre(int idNC, int numero) {
        this.idNC = idNC;
        this.numero = numero;
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
	public NumeroChambre[] getNumeroChambre() throws Exception
	{
		NumeroChambre[] n = new NumeroChambre[0];
		Connection conn = null;
		Statement state = null;
		ResultSet res = null;
                Connect con = new Connect();
	try{
		conn = con.getPostgreConnection();
		String select = "select *  from NumeroChambre";
		state = conn.createStatement();
		res = state.executeQuery(select);
		int nbrCol = getNbrColonne();
		int i=1; 
		int nbr = this.gettaille(res);
		int indice = 0;
		int taille = 0;
		res = state.executeQuery(select);
		n = new NumeroChambre[nbr];
		while(res.next()){
                    n[indice] = new NumeroChambre(res.getInt("idNC"),res.getInt("numero"));
                    System.out.println("Numero Chambre:"+n[indice].getNumero());
                    
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
        return n;
    }
}