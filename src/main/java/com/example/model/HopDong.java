package com.example.model;

import java.sql.Date;

public class HopDong {

	public HopDong() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	



	public HopDong(int idHopDong, Date ngayHopDong, Date ngayKetThuc, Date ngayKy, String noiDung, int lanKy,
			int thoiHan, int heSoLuong, int idNhanVien) {
		super();
		this.idHopDong = idHopDong;
		this.ngayHopDong = ngayHopDong;
		this.ngayKetThuc = ngayKetThuc;
		this.ngayKy = ngayKy;
		this.noiDung = noiDung;
		this.lanKy = lanKy;
		this.thoiHan = thoiHan;
		this.heSoLuong = heSoLuong;
		this.idNhanVien = idNhanVien;
	}







	private int idHopDong;
	public int getIdHopDong() {
		return idHopDong;
	}
	public void setIdHopDong(int idHopDong) {
		this.idHopDong = idHopDong;
	}
	public Date getNgayHopDong() {
		return ngayHopDong;
	}
	public void setNgayHopDong(Date ngayHopDong) {
		this.ngayHopDong = ngayHopDong;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public Date getNgayKy() {
		return ngayKy;
	}
	public void setNgayKy(Date ngayKy) {
		this.ngayKy = ngayKy;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public int getLanKy() {
		return lanKy;
	}
	public void setLanKy(int lanKy) {
		this.lanKy = lanKy;
	}
	public int getThoiHan() {
		return thoiHan;
	}
	public void setThoiHan(int thoiHan) {
		this.thoiHan = thoiHan;
	}
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getIdNhanVien() {
		return idNhanVien;
	}



	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}



	private Date ngayHopDong;
	private Date ngayKetThuc;
	private Date ngayKy;
	private String noiDung;
	private int lanKy;
	private int thoiHan;
	private int heSoLuong;
	private int idNhanVien;

}
