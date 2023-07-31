package txt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import txt.bean.HuDongBean;
import txt.bean.UsersBean;
import txt.dao.HuDongDao;
import txt.service.HuDongService;


/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HuDongServlet")
public class HuDongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HuDongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nicheng = null;
		String pinglun = null;
		int userid = 0;
		String nichengOrigin = (String)request.getParameter("nicheng");
		String pinglunOrigin = (String)request.getParameter("pinglun");
		String userId = (String)request.getParameter("userId");
		if(nichengOrigin!=null)
			nicheng =nichengOrigin;
		if(pinglunOrigin!=null)
			pinglun =pinglunOrigin;
		if(userId != null)
			userid = Integer.parseInt(userId);
		HuDongBean hudong = new HuDongBean(nicheng,pinglun,userid);
		System.out.println(hudong.getNicheng());
		System.out.println(hudong.getPinglun());
		if(hudong.getNicheng()!=null&&hudong.getPinglun()!=null)
		hudong =HuDongService.inseret(hudong);
		List<HuDongBean> hudongList = HuDongService.selectById();
		response.setContentType("text/html; charset=UTF-8");
		request.setAttribute("hudongData", hudongList);
		System.out.print(hudongList);
		request.getRequestDispatcher("hudong.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
