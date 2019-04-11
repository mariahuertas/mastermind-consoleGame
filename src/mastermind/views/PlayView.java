package mastermind.views;

import mastermind.controllers.PlayController;
import mastermind.menus.PlayMenu;
import mastermind.utils.WithConsoleView;

class PlayView extends WithConsoleView {

	void interact(PlayController playController) {
		new PlayMenu(playController).execute();	
		new GameView(playController).writeln();
	}

}
