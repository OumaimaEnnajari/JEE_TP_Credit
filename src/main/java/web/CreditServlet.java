package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CreditMetierImp;
import metier.ICreditMetier;

import java.io.IOException;

/**
 * Servlet implementation class CreditServlet
 */
public class CreditServlet extends HttpServlet {
	
	private ICreditMetier metier;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
    	metier= new CreditMetierImp();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/jsp/VueCredit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		float montant= Float.parseFloat(request.getParameter("montant"));
		float taux= Float.parseFloat(request.getParameter("taux"));
		int duree= Integer.parseInt(request.getParameter("duree"));
		
		double credit= metier.calculeCredit(montant, taux, duree);
		ModelCredit model= new ModelCredit(taux, duree, credit, montant );
		request.setAttribute("model", model);
		this.getServletContext().getRequestDispatcher("/jsp/VueCredit.jsp").forward(request, response);
		
	}

}
