package gls.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Update() {
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
		//doGet(req, res);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String pname = req.getParameter("pname");
		String pprice = req.getParameter("pprice");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/namra","root","Root@123");
			PreparedStatement pst=con.prepareStatement("update product set pprice = ? where pname = ?");
			pst.setString(1, pprice);
			pst.setString(2, pname);
			pst.executeUpdate();
			String linkUrl = "Home.jsp";
			out.println("<html>");
			out.println("<body>");
			out.println("<a href = '"+ linkUrl+"'>"+"GO to Home Page"+"</a>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}

}
