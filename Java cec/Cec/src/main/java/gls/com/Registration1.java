package gls.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration1
 */
@WebServlet("/Registration1")
public class Registration1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration1() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String uname=req.getParameter("uname");
		String uage=req.getParameter("uage");
		String gender=req.getParameter("gender");
		String uphoneno=req.getParameter("uphoneno");
		PrintWriter out=res.getWriter();
		out.println("uname"+uname);
		out.println("uage"+uage);
		out.println("uage"+gender);
		out.println("uphoneno"+uphoneno);
		RequestDispatcher rs=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namra","root","Root@123");
			PreparedStatement pst=con.prepareStatement("INSERT INTO user_info(uname,uage,gender,uphoneno)VALUES (?,?,?,?)");
			
			pst.setString(1,uname);
			pst.setString(2,uage);
			pst.setString(3,gender);
			pst.setString(4,uphoneno);
			
			int i=pst.executeUpdate();
			
			if(i>0)
			{
			rs=req.getRequestDispatcher("Login.jsp");
				
			}
			else
			{
				rs=req.getRequestDispatcher("Error.jsp");
				
			}
			rs.forward(req, res);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);	
			}
		
		
		
		
		
	}

}
