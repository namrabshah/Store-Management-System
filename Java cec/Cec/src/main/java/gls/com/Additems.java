package gls.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Additems
 */
@WebServlet("/Additems")
public class Additems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Additems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();	
		String pname=request.getParameter("pname");
		String pprice=request.getParameter("pprice");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namra","root","Root@123");
		PreparedStatement pst=con.prepareStatement("insert into product(pname,pprice)values(?,?)");
		pst.setString(1, pname);
		pst.setString(2, pprice);
		int s=pst.executeUpdate();
		if(s>0)
		{
		out.println("inserted book");
		}
		else
		{
//		out.println("not inserted");
		response.sendRedirect("Error.jsp");
		}

	}
		catch(Exception e)
		{
		System.out.println("hi");	
		}
	}
}
