package txt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import txt.bean.UsersBean;
import txt.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String logout = request.getParameter("logout");
		if(logout != null) {
			request.getSession().invalidate();
		    response.sendRedirect("index.jsp");
		
		}
		String username=request.getParameter("username");
		String userpwd=request.getParameter("userpwd");
		System.out.println("username="+username);
		System.out.println("userpwd="+userpwd);
		UsersBean user = new UsersBean(username,userpwd);
		response.setContentType("text/html; charset=UTF-8");
		LoginService.login(user);
		if(user.getId()<0){
			response.getWriter().print("系统出现问题，我们会尽快修复，请稍候再来");
			response.setHeader("refresh","3;IndexServlet");}
		else if(user.getId()==0) {
			response.getWriter().print("您输入的密码不对，请重新输入");
			response.setHeader("refresh","3;index.jsp");}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index.jsp");
		 }
			
		}
		
		
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
