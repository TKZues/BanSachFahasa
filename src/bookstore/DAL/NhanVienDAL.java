/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.DAL;

import bookstore.Entity.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HieuNguyen
 */
public class NhanVienDAL extends SqlDataConnection {

    private final String INSERT = "insert into tb_NhanVien(maNhanVien,tenNV,gioiTinhNV,diaChiNV,soDienThoaiNV,chucVu) values(?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE [dbo].[tb_NhanVien] SET [tenNV] = ? ,[gioiTinhNV]=?,[diaChiNV]=?,[soDienThoaiNV]=?,[chucVu]= ?  WHERE [maNhanVien]= ?";
    private final String DELETE = "DELETE FROM [dbo].[tb_NhanVien] WHERE maNhanVien = ?";

    public ArrayList<NhanVien> getAll(String TOP, String WHERE, String ORDER) {
        String GET_ALL = "select * from tb_NhanVien";
        ArrayList<NhanVien> arr = new ArrayList<>();
        if (TOP.length() != 0 || WHERE.length() != 0 || ORDER.length() != 0) {
            GET_ALL = "SELECT ";
            if (TOP.length() != 0) {
                GET_ALL += "TOP " + TOP;
            }
            GET_ALL += "* FROM tb_NhanVien ";
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
                    NhanVien item = new NhanVien();
                    item.setmaNhanVien(rs.getString("maNhanVien"));
                    item.settenNV(rs.getString("tenNV"));
                    item.setgioiTinhNV(rs.getString("gioiTinhNV"));                  
                    item.setdiaChiNV(rs.getString("diaChiNV"));
                    item.setsoDienThoaiNV(rs.getString("soDienThoaiNV"));
                    item.setchucVu(rs.getString("chucVu"));
          
                    arr.add(item);
                }
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public boolean insertData(NhanVien data) {
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setString(1, data.getmaNhanVien());
            ps.setString(2, data.gettenNV());
            ps.setString(3, data.getgioiTinhNV());
            
            ps.setString(4, data.getdiaChiNV());
            ps.setString(5, data.getsoDienThoaiNV());
            ps.setString(6, data.getchucVu());
           
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

    public boolean updateData(NhanVien data) {
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareCall(UPDATE);
            ps.setString(1, data.gettenNV());
            ps.setString(2, data.getgioiTinhNV());
            
            ps.setString(3, data.getdiaChiNV());
            ps.setString(4, data.getsoDienThoaiNV());
            ps.setString(5, data.getchucVu());         
            ps.setString(6, data.getmaNhanVien());
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
