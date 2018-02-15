package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String capitalizedName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		String adverb = request.getParameter("adverb");
		String noun = request.getParameter("noun");
		String adjective = request.getParameter("adjective");
		PrintWriter writer = response.getWriter();
		writer.println(capitalizedName + " muttered " + adverb + " while jumping into a speeding " + noun + " and sped off with the " + adjective + " cat!");
		writer.close(); 
	}

}
