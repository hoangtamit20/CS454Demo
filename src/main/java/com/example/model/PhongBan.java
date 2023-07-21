package com.example.model;


public class PhongBan {

	public PhongBan() {
		// TODO Auto-generated constructor stub
	}
	
	private int idPhongBan;
	private String tenPhongBan;
	public int getIdPhongBan() {
		return idPhongBan;
	}
	public void setIdPhongBan(int idPhongBan) {
		this.idPhongBan = idPhongBan;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	public PhongBan(int idPhongBan, String tenPhongBan) {
		super();
		this.idPhongBan = idPhongBan;
		this.tenPhongBan = tenPhongBan;
	}
	
	
	

}
