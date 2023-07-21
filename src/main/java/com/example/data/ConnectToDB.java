package com.example.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.ChucVu;
import com.example.model.HopDong;
import com.example.model.NhanVien;
import com.example.model.PhongBan;
public class ConnectToDB {

	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/QLNhanVienDB";
    private static final String MYSQL_USERNAME = "root";
    private static final String MYSQL_PASSWORD = "123456";

    private static final String SQL_SERVER_URL = "jdbc:sqlserver://HoangTam\\TAMHOANG;encrypt=true;trustServerCertificate=true;databaseName=QLNhanVienDB";
    private static final String SQL_SERVER_USERNAME = "sa";
    private static final String SQL_SERVER_PASSWORD = "123456";

    public static Connection getConnection(String databaseType) throws SQLException {
        if (databaseType.equals("mysql")) {
            return DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } else if (databaseType.equals("sqlserver")) {
            return DriverManager.getConnection(SQL_SERVER_URL, SQL_SERVER_USERNAME, SQL_SERVER_PASSWORD);
        } else {
//        	System.out.println("Toi da vao day!");
            throw new SQLException("Invalid database type: " + databaseType);
        }
    }
    
    
    
    public List<PhongBan> getAllPhongBan() throws SQLException
    {
    	List<PhongBan> listPB = new ArrayList<PhongBan>();
    	String sql = "SELECT * FROM PhongBan";
        PreparedStatement statement = getConnection("sqlserver").prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            listPB.add(new PhongBan(resultSet.getInt("idPhongBan"),resultSet.getString("tenPhongBan")));
        }
    	return listPB;
    }
    
    
    public List<ChucVu> getAllChucVu() throws SQLException
    {
    	List<ChucVu> listChucVu = new ArrayList<ChucVu>();
    	String sql = "SELECT * FROM PhongBan";
        PreparedStatement statement = getConnection("sqlserver").prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
        	listChucVu.add(new ChucVu(resultSet.getInt("idChucVu"),resultSet.getString("tenChucVu")));
        }
    	return listChucVu;
    }
    
    public List<NhanVien> getAllNhanVien() throws SQLException
    {
    	var listNhanVien = new ArrayList<NhanVien>();
    	String sql = "SELECT * FROM NhanVien";
    	PreparedStatement statement = getConnection("sqlserver").prepareStatement(sql);
    	ResultSet resultSet = statement.executeQuery();
    	while(resultSet.next())
    	{
    		listNhanVien.add(new NhanVien(resultSet.getInt("idNhanVien"),
    				resultSet.getString("hoTen"),
    				resultSet.getInt("gioiTinh"),
    				resultSet.getString("dienThoai"),
    				resultSet.getString("cCCD"),
    				resultSet.getString("hinhAnh"),
    				resultSet.getString("trinhDoHocVan"),
    				resultSet.getInt("idChucVu"),
    				resultSet.getInt("idPhongBan")
    				));
    	}
    	return listNhanVien;
    }
    
    public List<HopDong> getAllHopDong() throws SQLException
    {
    	var listHopDong = new ArrayList<HopDong>();
    	String sql = "SELECT * FROM HopDong";
    	PreparedStatement statement = getConnection("sqlserver").prepareStatement(sql);
    	ResultSet resultSet = statement.executeQuery();
    	while(resultSet.next())
    	{
    		try {
				listHopDong.add(new HopDong(resultSet.getInt("idHopDong"),
						resultSet.getDate("ngayBatDau"),
						resultSet.getDate("ngayKetThuc"),
						resultSet.getDate("ngayKy"),
						resultSet.getString("noiDung"),
						resultSet.getInt("lanKy"),
						resultSet.getInt("thoiHan"),
						resultSet.getInt("heSoLuong"),
						resultSet.getInt("idNhanVien")
						));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	return listHopDong;
    }
    
    public List<PhongBan> getAllPhongBanMySQL() throws SQLException
    {
        String sql1 = "INSERT INTO PhongBan (tenPhongBan) VALUES (?)";
		PreparedStatement preparedStatement = new ConnectToDB().getConnection("mysql").prepareStatement(sql1);
        preparedStatement.setString(1, "khong co");
        preparedStatement.executeUpdate();

    	List<PhongBan> listPB = new ArrayList<PhongBan>();
    	String sql = "SELECT * FROM PhongBan";
        PreparedStatement statement = getConnection("mysql").prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            listPB.add(new PhongBan(resultSet.getInt("idPhongBan"),resultSet.getString("tenPhongBan")));
        }
    	return listPB;
    }

}
