package oocl.eshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oocl.eshop.dao.MerchantDao;
import oocl.eshop.dao.PermissionDao;
import oocl.eshop.dao.impl.test.MerchantDaoImplTest;
import oocl.eshop.dao.impl.test.PermissionDaoImplTest;
import oocl.eshop.po.Merchant;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MerchantDao mer=new MerchantDaoImplTest();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password =request.getParameter("password");
		
		ServletContext app=this.getServletContext();
		
		if (!userName.equals(password)) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			List<Merchant> mers=mer.findAllMerchants();
			app.setAttribute("mers", mers);
			request.getRequestDispatcher("merManage.jsp").forward(request, response);
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
