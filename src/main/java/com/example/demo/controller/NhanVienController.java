package com.example.demo.controller;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.ConnectToDB;
import com.example.model.NhanVien;
import com.example.model.PhongBan;

@RestController
public class NhanVienController {
	
	private List<NhanVien> myListNV = new ArrayList<NhanVien>();
	
	@PostMapping("/createnhanvien")
	public NhanVien createNhanVien(@RequestBody NhanVien nhanVien)
	{
		myListNV.add(nhanVien);
		return nhanVien;
	}
	
	@GetMapping("/listnhanvien")
	public List<NhanVien> getAll()
	{
		return myListNV;
	}
	
	@GetMapping("/listPhongBan")
	public List<PhongBan> getAllListPhongBan() throws SQLException
	{
		return new ConnectToDB().getAllPhongBan();
	}
	
	@GetMapping("/listPhongBanMySQL")
	public List<PhongBan> getAllListPhongBanMySQL() throws SQLException
	{
		return new ConnectToDB().getAllPhongBanMySQL();
	}

	@PostMapping("/insertPhongBanMySQL")
	public String insertPhongBanMySQL(@RequestBody PhongBan phongBanModel) throws SQLException
	{
		String sql = "INSERT INTO PhongBan (tenPhongBan) VALUES (?)";
		PreparedStatement preparedStatement = new ConnectToDB().getConnection("mysql").prepareStatement(sql);
        preparedStatement.setString(1, phongBanModel.getTenPhongBan());
        preparedStatement.executeUpdate();
		return "OK";
	}

	
	public NhanVienController() {
		// TODO Auto-generated constructor stub
	}

}
