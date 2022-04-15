package actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.KorisnikController;
import entities.Korisnik;

public class LoginAction implements ActionInterface {

	@Override
	public void executeRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session.getAttribute("loggedIn") == null  || (boolean) session.getAttribute("loggedIn") == false) {
			String username = (String) req.getAttribute("username");
			String password = (String) req.getAttribute("password");
			Korisnik k = new Korisnik();
			k.setUsername(username);
			k.setPassword(password);
			KorisnikController kc = new KorisnikController();
			kc.getAll().forEach(korisnik -> {
				if (korisnik.getUsername().equals(k.getUsername()) && korisnik.getPassword().equals(k.getPassword())) {
					session.setAttribute("loggedIn", true);
					req.setAttribute("username", korisnik.getUsername());
				} else {
					req.setAttribute("error", "Invalid login credentials. Please try again.");
					try {
						req.getRequestDispatcher("/app/error").forward(req, res);
					} catch (ServletException | IOException e) {
						e.printStackTrace();
					}
				}
			});
		}
		try {
			req.getRequestDispatcher("/app/home.jsp").forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
