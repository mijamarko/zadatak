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
		case WebConstants.PATH_HOME:
			action = new HomeAction();
			break;
		case WebConstants.PATH_VIEW_CITIES:
		case WebConstants.PATH_VIEW_CITY:
			action = new CityAction();
			break;
		default:
			break;
		}
		
		return action;
	}

}
