package gls.com;

import java.io.IOException;
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
 * Servlet implementation class Forget1
 */
@WebServlet("/Forget1")
public class Forget1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forget1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String uname=req.getParameter("uname");
		String uage=req.getParameter("uage");
		String uphoneno=req.getParameter("uphoneno");
		RequestDispatcher dispatcher=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namra","root","Root@123");
			PreparedStatement pst = con.prepareStatement("update user_info set uphoneno = ? where uname = ? and uage =? ");
			
			pst.setString(1, uphoneno);
			pst.setString(2, uname);
			pst.setString(3, uage);
			
			int r = pst.executeUpdate();
			
			if(r > 0)
			{
				dispatcher=req.getRequestDispatcher("Login.jsp");
			}
			else
			{
				dispatcher=req.getRequestDispatcher("forget11.jsp");
			}
			
			dispatcher.forward(req, res);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
