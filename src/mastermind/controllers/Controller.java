package mastermind.controllers;

import mastermind.models.Session;

public abstract class Controller {
	
	protected Session session;

	Controller(Session session) {
		this.session = session;
	}
	
	public int getWidth() {
		return this.session.getWidth();
	}
	
	public StateValue getValueState() {
		return this.session.getValueState();
	}

}