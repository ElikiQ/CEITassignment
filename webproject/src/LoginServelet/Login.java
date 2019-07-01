package LoginServelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
        PrintWriter out = response.getWriter(); 
        String name=request.getParameter("userName"); 
        String password=request.getParameter("userPass"); 
        
  if(name.equals("dinesh") && password.contentEquals("1234") )               {
   RequestDispatcher rd  =request.getRequestDispatcher("success");

//To handle it you need to create success servlet which we will create in next step
    rd.forward(request, response);
   }else {
  out.print("Sorry Invalid UserName or Password !");
  RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");
      rd.include(request, response);
	}

}}
