package main;

import controller.EmployedController;
import model.Employed;
import ui.EmployedView;

public class Main {

	public static void main(String[] args) {
		
		
		//fetch student record based on his roll no from the database
		 Employed model = employedFromDatabase();
		 //Create a view : to write student details on console
		 EmployedView view = new EmployedView();
		 EmployedController controller = new EmployedController(model, view);
		 controller.updateView();
		 //update model data
		 controller.setEmployedName("Diana");
		 controller.updateView();
	}
	
	 private static Employed employedFromDatabase(){
		 Employed e = new Employed();
		 e.setName("Danna");
		 e.setId("A00377319");
		 e.setRole("Developer");
		 return e;
	 }

}
