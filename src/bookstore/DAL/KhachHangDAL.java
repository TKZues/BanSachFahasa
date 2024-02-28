/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.DAL;

import bookstore.Entity.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HieuNguyen
 */
public class KhachHangDAL extends SqlDataConnection {

    private final String INSERT = "insert into tb_KhachHang(maKhachHang,tenKH,gioiTinhKH,diaChiKH,soDienThoaiKH) values(?,?,?,?,?)";
    private final String UPDATE = "UPDATE [dbo].[tb_KhachHang] SET [tenKH] = ? ,[gioiTinhKH]=?,[diaChiKH]=?,[soDienThoaiKH]=?  WHERE [maKhachHang]= ?";
    private final String DELETE = "DELETE FROM [dbo].[tb_KhachHang] WHERE maKhachHang = ?";

    public ArrayList<KhachHang> getAll(String TOP, String WHERE, String ORDER) {
        String GET_ALL = "select * from tb_KhachHang";
        ArrayList<KhachHang> arr = new ArrayList<>();
        if (TOP.length() != 0 || WHERE.length() != 0 || ORDER.length() != 0) {
            GET_ALL = "SELECT ";
            if (TOP.length() != 0) {
                GET_ALL += "TOP " + TOP;
            }
            GET_ALL += "* FROM tb_KhachHang ";
            if (WHERE.length() != 0) {
                GET_ALL += "WHERE " + WHERE;
            }
            if (ORDER.length() != 0) {
                GET_ALL += "ORDER BY " + ORDER;
            }
        }
//        System.out.println(GET_ALL);
        try {
            openConnection();
            PreparedStatement ps = con.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    KhachHang item = new KhachHang();
                    item.setmaKhachHang(rs.getString("maKhachHang"));
                    item.settenKH(rs.getString("tenKH"));
                    item.setgioiTinhKH(rs.getString("gioiTinhKH"));                  
                    item.setdiaChiKH(rs.getString("diaChiKH"));
                    item.setsoDienThoaiKH(rs.getString("soDienThoaiKH"));
                   
          
                    arr.add(item);
                }
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public boolean insertData(KhachHang data) {
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, data.getmaKhachHang());
            ps.setString(2, data.gettenKH());
            ps.setString(3, data.getgioiTinhKH());
            
            ps.setString(4, data.getdiaChiKH());
            ps.setString(5, data.getsoDienThoaiKH());
    
           
            int rs = ps.executeUpdate();
            if (rs > 0) {
                check = true;
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean updateData(KhachHang data) {
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareCall(UPDATE);
            ps.setString(1, data.gettenKH());
            ps.setString(2, data.getgioiTinhKH());
            
            ps.setString(3, data.getdiaChiKH());
            ps.setString(4, data.getsoDienThoaiKH());
             
            ps.setString(5, data.getmaKhachHang());
            int rs = ps.executeUpdate();
            if (rs > 0) {
                check = true;
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean deleteData(String id) {
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareCall(DELETE);
            ps.setString(1, id);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                check = true;
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    
}
