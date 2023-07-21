package com.example.model;

public class ChucVu {
	
	private int idChucVu;
	private String tenChucVu;
	
	public int getIdChucVu() {
		return idChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setIdChucVu(int idChucVu) {
		this.idChucVu = idChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	

	public ChucVu(int idChucVu, String tenChucVu) {
		super();
		this.idChucVu = idChucVu;
		this.tenChucVu = tenChucVu;
	}
	public ChucVu() {
		// TODO Auto-generated constructor stub
	}

}
