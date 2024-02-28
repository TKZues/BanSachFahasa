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
public class NhanVien {
    private String maNhanVien;
    private String tenNV;
    private String gioiTinhNV;
   
    private String diaChiNV;
    private String soDienThoaiNV;
    private String chucVu;
   

    public String getmaNhanVien() {
        return maNhanVien;
    }

    public void setmaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    public String getgioiTinhNV() {
        return gioiTinhNV;
    }

    public void setgioiTinhNV(String gioiTinhNV) {
        this.gioiTinhNV = gioiTinhNV;
    }
  

    public String getdiaChiNV() {
        return diaChiNV;
    }

    public void setdiaChiNV(String diaChiNV) {
        this.diaChiNV = diaChiNV;
    }

    public String getsoDienThoaiNV() {
        return soDienThoaiNV;
    }

    public void setsoDienThoaiNV(String soDienThoaiNV) {
        this.soDienThoaiNV = soDienThoaiNV;
    }
    public String getchucVu() {
        return chucVu;
    }

    public void setchucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
}
