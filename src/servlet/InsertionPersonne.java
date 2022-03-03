package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fonction.Person;

/**
 * Servlet implementation class InsertionPersonne
 */
@WebServlet("/InsertionPersonne")
public class InsertionPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertionPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
            String nom = request.getParameter("nom");
            System.out.println(nom);
            String prenom = request.getParameter("prenom");
            System.out.println(prenom);
            String sexe = request.getParameter("sexe");
            System.out.println(sexe);
            String dateNaissance = request.getParameter("dateNaissance"); 
            String adresse = request.getParameter("adresse");
            System.out.println(adresse);
          
            Person p = new Person();
            p.insertPerson(nom,prenom,sexe,adresse); 
            RequestDispatcher d = request.getRequestDispatcher("chambre.jsp");
            d.forward(request, response);
          }catch(Exception e){ 
              System.out.println(e);
          } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
