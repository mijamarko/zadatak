package it.engineering.web.zadatak.actions;

import it.engineering.web.zadatak.constants.WebConstants;

public class ActionFactory {

	public static Action createAction(String path) {
		Action action = null;

		switch (path) {
		case WebConstants.PATH_LOGIN:
			action = new LoginAction();
			break;
		case WebConstants.PATH_LOGOUT:
			action = new LogoutAction();
			break;
		default:
			break;
		}
		
		return action;
	}

}
