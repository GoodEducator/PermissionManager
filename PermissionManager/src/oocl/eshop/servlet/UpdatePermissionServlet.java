package oocl.eshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oocl.eshop.po.Permission;
import oocl.eshop.service.PermissionManager;
import oocl.eshop.service.impl.PermissionManagerImpl;

/**
 * Servlet implementation class UpdatePermissionServlet
 */
public class UpdatePermissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PermissionManager pManager = new PermissionManagerImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePermissionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mId = Integer.parseInt(request.getParameter("mId"));
		int mStatus = Integer.parseInt(request.getParameter("status"));
		Permission p = new Permission(mId, mStatus);
		pManager.updatePermission(p);
		request.getRequestDispatcher("mian.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
