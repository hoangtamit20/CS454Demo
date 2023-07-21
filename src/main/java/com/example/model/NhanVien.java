package com.example.model;

public class NhanVien {

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public NhanVien(int idNhanVien, String hoTen, int gioiTinh, String dienThoai, String cCCD, String hinhAnh,
			String trinhDoHocVan, int idChucVu, int idPhongBan) {
		super();
		this.idNhanVien = idNhanVien;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
		this.cCCD = cCCD;
		this.hinhAnh = hinhAnh;
		this.trinhDoHocVan = trinhDoHocVan;
		this.idChucVu = idChucVu;
		this.idPhongBan = idPhongBan;
	}



	public int getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getTrinhDoHocVan() {
		return trinhDoHocVan;
	}
	public void setTrinhDoHocVan(String trinhDoHocVan) {
		this.trinhDoHocVan = trinhDoHocVan;
	}
	public int getIdChucVu() {
		return idChucVu;
	}
	public void setIdChucVu(int idChucVu) {
		this.idChucVu = idChucVu;
	}
	public int getIdPhongBan() {
		return idPhongBan;
	}
	public void setIdPhongBan(int idPhongBan) {
		this.idPhongBan = idPhongBan;
	}

	private int idNhanVien;
	private String hoTen;
	private int gioiTinh;
	private String dienThoai;
	private String cCCD;
	private String hinhAnh;
	private String trinhDoHocVan;
	private int idChucVu;
	private int idPhongBan;

}
