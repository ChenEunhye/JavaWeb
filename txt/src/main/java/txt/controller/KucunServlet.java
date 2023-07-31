package txt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import txt.bean.ZhouBianBean;
import txt.service.ZhouBianService;
import txt.service.GouMaiService;
/**
 * Servlet implementation class KucunServlet
 */
@WebServlet("/KucunServlet")
public class KucunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KucunServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = null;
		int id = 0;
		int kucun = 0;
		action = request.getParameter("action");
		id = Integer.parseInt(request.getParameter("id"));
		kucun = Integer.parseInt(request.getParameter("kucun"));
		ZhouBianBean zhoubianData = new ZhouBianBean(action,id,kucun);
		GouMaiService.updatekucun(zhoubianData);
		response.sendRedirect("GouMaiServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
