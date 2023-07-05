package controller;

import java.util.HashMap;
import java.util.Map;

import controller.Board.BoardInfoController;
import controller.Board.MainController;
public class HandlerMapping {

	private Map<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/board.do", new MainController());
		mappings.put("/boardinfo.do", new BoardInfoController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path); 
	}
}
