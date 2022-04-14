package actions;

public class ActionFactory {
	
	public static ActionInterface createAction(String path) {
		ActionInterface action = null;
		switch(path) {
		case "/login":
			action = new LoginAction();
			break;
		case "/logout":
			action = new LogoutAction();
			break;
		case "/list":
			break;
		case "/view":
			break;
		}
		
		return action;
	}

}
