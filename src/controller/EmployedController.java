package controller;

import model.Employed;
import ui.EmployedView;

public class EmployedController {
	
	private Employed model;
	private EmployedView view;
	
	public EmployedController(Employed model, EmployedView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setEmployedName(String name) {
		model.setName(name);
	}
	
	public String getEmployedName() {
		return model.getName();
	}
	
	public void setEmployedId(String id) {
		model.setId(id);
	}
	
	public String getEmployedId() {
		return model.getId();
	}
	
	
	public void setEmployedRole(String role) {
		model.setRole(role);
	}
	
	public String getEmployedRole() {
		return model.getRole();
	}
	
	public void updateView() {
		view.printEmployed(model.getId(), model.getName(),model.getRole());
	}
	
}
