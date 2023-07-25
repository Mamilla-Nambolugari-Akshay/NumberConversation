package com.conversation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class NumberSeriesFile
 */
public class NumberSeriesFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberSeriesFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String opt=request.getParameter("numseries");
        String range1=request.getParameter("number");
        String range2=request.getParameter("num");
       
		String res=NumberSeriesCal.getNumberSeriesValues(opt,range1,range2);
		request.setAttribute("nseries",res);
		request.getRequestDispatcher("numberseries.jsp").forward(request, response);

	}

	

}
