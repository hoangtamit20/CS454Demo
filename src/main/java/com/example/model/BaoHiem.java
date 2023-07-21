package com.example.model;

import java.sql.Date;

public class BaoHiem {
	private int idBaoHiem;
	private String soBaoHiem;
	private Date ngayCap;
	private String noiCap;
	private String noiKhamBenh;
	private int idNhanVien;
	
	public int getIdBaoHiem() {
		return idBaoHiem;
	}
	public void setIdBaoHiem(int idBaoHiem) {
		this.idBaoHiem = idBaoHiem;
	}
	public String getSoBaoHiem() {
		return soBaoHiem;
	}
	public void setSoBaoHiem(String soBaoHiem) {
		this.soBaoHiem = soBaoHiem;
	}
	public Date getNgayCap() {
		return ngayCap;
	}
	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}
	public String getNoiCap() {
		return noiCap;
	}
	public void setNoiCap(String noiCap) {
		this.noiCap = noiCap;
	}
	public String getNoiKhamBenh() {
		return noiKhamBenh;
	}
	public void setNoiKhamBenh(String noiKhamBenh) {
		this.noiKhamBenh = noiKhamBenh;
	}
	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public BaoHiem(int idBaoHiem, String soBaoHiem, Date ngayCap, String noiCap, String noiKhamBenh, int idNhanVien) {
		super();
		this.idBaoHiem = idBaoHiem;
		this.soBaoHiem = soBaoHiem;
		this.ngayCap = ngayCap;
		this.noiCap = noiCap;
		this.noiKhamBenh = noiKhamBenh;
		this.idNhanVien = idNhanVien;
	}
	
	
}
