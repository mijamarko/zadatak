package actions;

public class ActionFactory {
	
	public static ActionInterface createAction(String path) {
		ActionInterface action = null;
		switch(path) {
		case "/app/login":
			action = new LoginAction();
			break;
		case "/app/logout":
			action = new LogoutAction();
			break;
		case "/app/home":
			action = new HomeAction();
		case "/app/list":
			break;
		case "/app/view":
			break;
		}
		
		return action;
	}

}
