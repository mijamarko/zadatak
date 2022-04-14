package actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ActionInterface {
	
	void executeRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;

}
