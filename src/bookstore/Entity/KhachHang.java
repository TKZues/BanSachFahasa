/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Entity;


/**
 *
 * @author HieuNguyen
 */
public class KhachHang {
    private String maKhachHang;
    private String tenKH;
    private String gioiTinhKH;
   
    private String diaChiKH;
    private String soDienThoaiKH;
   

    public String getmaKhachHang() {
        return maKhachHang;
    }

    public void setmaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String gettenKH() {
        return tenKH;
    }

    public void settenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getgioiTinhKH() {
        return gioiTinhKH;
    }

    public void setgioiTinhKH(String gioiTinhKH) {
        this.gioiTinhKH = gioiTinhKH;
    }
  

    public String getdiaChiKH() {
        return diaChiKH;
    }

    public void setdiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public String getsoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setsoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }
   
    
}
