/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.BLL;

import bookstore.DAL.KhachHangDAL;
import bookstore.Entity.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author ngong
 */
public class KhachHangBLL {
    KhachHangDAL obj = new KhachHangDAL();
    public  ArrayList<KhachHang> getAll(String top, String where, String order){
        return obj.getAll(top, where,order);
    }
    public boolean insertData(KhachHang data){
        return obj.insertData(data);
    }
    public boolean updateData(KhachHang data){
        return obj.updateData(data);
    }
    public boolean deleteData(String id){
        return obj.deleteData(id);
    }
}
