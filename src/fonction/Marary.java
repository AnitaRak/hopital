package fonction;

import java.sql.Connection;
import java.sql.Statement;

public class Marary {
    public int id;
    public int idC;
    public int idNumero;
    public int idPersonne;
    public int idMaladie;

    public Marary() {
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getIdNumero() {
        return idNumero;
    }

    public void setIdNumero(int idNumero) {
        this.idNumero = idNumero;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public int getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(int idMaladie) {
        this.idMaladie = idMaladie;
    }

    
    
    void inserer(int idC,int idNumero,int idPersonne,int idMaladie) throws Exception
  {
    try
    {
	Connection conn = null;
        Connect con = new Connect();
	conn = con.getPostgreConnection(); 
	Statement stmt = conn.createStatement();
    	String insere = "INSERT INTO Marary (idC,idNumero,idPersonne,idMaladie) VALUES("+idC+","+idNumero+","+idPersonne+","+idMaladie+")";
        System.out.println(insere);
        stmt.executeUpdate(insere);
    }
    catch(Exception e){ 
      System.out.println(e);
    }
  }
}
