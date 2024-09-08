package gls.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login1
 */
@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
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
		doGet(req, res);

		String uname=req.getParameter("uname");
		String uphoneno=req.getParameter("uphoneno");
		
		RequestDispatcher dispatcher=null;
		boolean ans=false;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namra","root","Root@123");
			PreparedStatement pst=con.prepareStatement("select * from user_info where uname=? and uphoneno=?");
			
			pst.setString(1,uname);
			pst.setString(2,uphoneno);
			
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				ans=true;
			}
			if(ans)
			{
				dispatcher =req.getRequestDispatcher("Home.jsp");
			}
			else
			{
				dispatcher =req.getRequestDispatcher("Error.jsp");
			}
			dispatcher.forward(req,res);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}

