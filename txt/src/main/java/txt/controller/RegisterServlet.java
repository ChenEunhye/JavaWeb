package txt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import txt.bean.UsersBean;
import txt.service.RegisterService;

/**
 * Servlet implementation class LoginServlet
 */
@SuppressWarnings("unused")
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usertel=request.getParameter("tel");
		String username=request.getParameter("usr");
		String useremail=request.getParameter("email");
		String userpwd=request.getParameter("pwd");
		System.out.println("usertel="+usertel);
		System.out.println("username="+username);
		System.out.println("useremail="+useremail);
		System.out.println("userpwd="+userpwd);
		UsersBean user = new UsersBean( usertel,username,useremail,userpwd);
		response.setContentType("text/html; charset=UTF-8");
		if(RegisterService.register(user)==0) {
			response.getWriter().print("注册成功");
			response.setHeader("refresh","3;login.jsp");}
		else {
			response.getWriter().print("注册失败,该用户已注册");
			response.setHeader("refresh","3;register.jsp");}
		
			
		}
		
		
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
