/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.BLL;

import bookstore.DAL.NhanVienDAL;
import bookstore.Entity.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author ngong
 */
public class NhanVienBLL {
    NhanVienDAL obj = new NhanVienDAL();
    public  ArrayList<NhanVien> getAll(String top, String where, String order){
        return obj.getAll(top, where,order);
    }
    public boolean insertData(NhanVien data){
        return obj.insertData(data);
    }
    public boolean updateData(NhanVien data){
        return obj.updateData(data);
    }
    public boolean deleteData(String id){
        return obj.deleteData(id);
    }
}
