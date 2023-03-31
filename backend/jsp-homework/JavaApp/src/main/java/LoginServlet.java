import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Kullanıcı adı ve şifre al
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		 if(username.equals("admin") && password.equals("12345")) {
			 HttpSession session = request.getSession();
			    session.setAttribute("username", username);
			    session.setAttribute("password", password);
		        response.sendRedirect("home.jsp");
		    } else {
		        response.sendRedirect("login.jsp");
		    }
		 
		 
		// Kullanıcı adı ve şifreyi doğrula
			//if(username.equals("kullaniciadi") && password.equals("sifre")) {
				// Kullanıcı adı ve şifre doğruysa, "home.jsp" sayfasına yönlendir
				//response.sendRedirect("home.jsp");
			//} else {
				// Kullanıcı adı ve şifre yanlışsa, "login.jsp" sayfasına yönlendir
			//	response.sendRedirect("login.jsp");
			//}
	}
}
