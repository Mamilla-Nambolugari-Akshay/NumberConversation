package com.conversation;
import com.conversation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Convert
 */
public class Convert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Convert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s=request.getParameter("convert");
		String num=request.getParameter("number");
		String res=ConversationNumber.getValues(s,num);
		response.getWriter().print(res);
		request.setAttribute("myname",res);
		request.getRequestDispatcher("conversation.jsp").forward(request, response);
		
	}

}
