package it.engineering.web.zadatak.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.controllers.ApplicationController;

/**
 * Servlet implementation class DispatchServlet
 */
public class DispatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationController applicationController;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatchServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		applicationController = new ApplicationController();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String page = applicationController.processRequest(req, res);
		req.getRequestDispatcher(page).forward(req, res);
	}

}
