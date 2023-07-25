package com.conversation;
import com.conversation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class OptionServlet
 */
public class OptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("selectoption"));
		if(id==100) {
			response.sendRedirect("conversation.jsp");
		}
		else if(id==101) {
			response.sendRedirect("timeconvert.jsp");
		}
		else if(id==102) {
			response.sendRedirect("numberseries.jsp");
		}
		else if(id==103) {
			response.sendRedirect("numberseries.jsp");
		}
		else {
			response.getWriter().print("<h1>Error</h1>");
		}
	}

}
