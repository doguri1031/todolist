package com.example.todolist2.dto;

public class TodoDTO {
	
	private long todo_no;
	private String user_id;
	private String todo_body;
	private String todo_date;
	
	
	public TodoDTO() {
		
	}
	
	public TodoDTO(long todo_no, String user_id, String todo_body, String todo_date) {
		super();
		this.todo_no = todo_no;
		this.user_id = user_id;
		this.todo_body = todo_body;
		this.todo_date = todo_date;
	}
	public long getTodo_no() {
		return todo_no;
	}
	public void setTodo_no(long todo_no) {
		this.todo_no = todo_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTodo_body() {
		return todo_body;
	}
	public void setTodo_body(String todo_body) {
		this.todo_body = todo_body;
	}
	public String getTodo_date() {
		return todo_date;
	}
	public void setTodo_date(String todo_date) {
		this.todo_date = todo_date;
	}
	
	
	
	
}
