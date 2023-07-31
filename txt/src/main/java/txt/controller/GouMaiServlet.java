package txt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import txt.bean.ZhouBianBean;
import txt.service.GouMaiService;

/**
 * Servlet implementation class ZhoubianServlet
 */
@WebServlet("/GouMaiServlet")
public class GouMaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GouMaiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sort = 0;
		String keyWord = null;
		String sortOrigin = (String)request.getParameter("sort");
		if(sortOrigin!=null)
			sort = Integer.parseInt(sortOrigin);
		keyWord = request.getParameter("keyWord");
		ZhouBianBean zhoubianData = new ZhouBianBean(sort,keyWord);
		GouMaiService.preparezhoubianData(zhoubianData);
		request.setAttribute("zhoubianData", zhoubianData);
		System.out.println("GouMaiServlet"+zhoubianData);
		request.getRequestDispatcher("goumai.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
