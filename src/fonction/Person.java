package fonction;

import java.sql.Connection;
import java.sql.Statement;

public class Person {
    public int id;
    public String Nom;
    public String Prenom;
    public String Sexe;
    public String Adresse;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
	
  public void insertPerson(String nom,String prenom, String sexe, String adresse) throws Exception
  {
    try
    {
        Connection conn = null;
        Connect con = new Connect();
	conn = con.getPostgreConnection(); 
	Statement stmt = conn.createStatement();
    	String insert = "INSERT INTO Personne (nom,prenom,sexe,adresse) VALUES('"+nom+"',"+"'"+prenom+"',"+"'"+sexe+"',"+"'"+adresse+"')";
        System.out.println(insert);
        stmt.executeUpdate(insert);
    }
    catch(Exception e){ 
      System.out.println(e);
    }
  } 
}