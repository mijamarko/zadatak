package actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction implements ActionInterface {

	@Override
	public void executeRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("loggedIn", false);
		req.getSession().invalidate();
		req.getRequestDispatcher("/").forward(req, res);
	}

}
