/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.GUI;

import bookstore.BLL.CTPNBLL;
import bookstore.BLL.PhieuNhapBLL;
import bookstore.Entity.CTPN;
import bookstore.Entity.PhieuNhap;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author HieuNguyen
 */
public class frmQLNhap extends javax.swing.JFrame {

    static String datePrint = "";
    private PhieuNhapBLL obj1 = new PhieuNhapBLL();
    ArrayList<PhieuNhap> lstpn = new ArrayList<>();
    private CTPNBLL obj2 = new CTPNBLL();
    ArrayList<CTPN> lstctpn = new ArrayList<>();
    static ArrayList<CTPN> lstEditctpn = new ArrayList<>();
    static String idNXB = "";

    /**
     * Creates new form frmQLNhap
     */
    public frmQLNhap() {
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("imgs/library.png")).getImage());
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        binDataPN("", "", "");
        binDataCTPN("", "", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbCTPN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiemCTPN = new javax.swing.JTextField();
        btnTimKiemCTPN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        bntLamTuoi = new javax.swing.JButton();
        btnInHoaDon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiemPN = new javax.swing.JTextField();
        btnTimKiemPN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhập Sách | Phần Mềm Quản Lý Cửa Hàng Bán Sách Fahasa");
        setLocation(new java.awt.Point(250, 50));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Chi Tiết Phiếu Nhập"));

        tbCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCTPNMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbCTPN);

        jLabel2.setText("Tìm Kiếm Theo Mã CTPN");

        btnTimKiemCTPN.setText("Tìm Kiếm");
        btnTimKiemCTPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemCTPNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTimKiemCTPN)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiemCTPN)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemCTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setEnabled(false);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        bntLamTuoi.setText("Làm Mới");
        bntLamTuoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntLamTuoiMouseClicked(evt);
            }
        });
        bntLamTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLamTuoiActionPerformed(evt);
            }
        });

        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(bntLamTuoi)
                .addGap(85, 85, 85)
                .addComponent(btnThem)
                .addGap(92, 92, 92)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnXoa)
                .addGap(93, 93, 93)
                .addComponent(btnInHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntLamTuoi, btnInHoaDon, btnSua, btnThem, btnXoa});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLamTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Phiếu Nhập"));
        jPanel3.setName(""); // NOI18N

        tbPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbPhieuNhap);

        jLabel1.setText("Tìm Kiếm Theo Mã Phiếu Nhập");

        btnTimKiemPN.setText("Tìm Kiếm");
        btnTimKiemPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemPNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTimKiemPN, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiemPN)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new frmHeThong().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnTimKiemPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemPNMouseClicked
        // TODO add your handling code here:
        String w = "maPhieuNhap like N'" + "%" + txtTimKiemPN.getText() + "%" + "'";
        binDataPN("", w, "");
    }//GEN-LAST:event_btnTimKiemPNMouseClicked

    private void btnTimKiemCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemCTPNMouseClicked
        // TODO add your handling code here:
        String w = "maCTPN like N'" + "%" + txtTimKiemCTPN.getText() + "%" + "'";
        binDataCTPN("", w, "");
    }//GEN-LAST:event_btnTimKiemCTPNMouseClicked

    private void tbPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhapMouseClicked
        // TODO add your handling code here:
        if (tbPhieuNhap.getSelectedRow() == -1) {
            return;
        }
        int row = tbPhieuNhap.getSelectedRow();
        String ID = "maPhieuNhap = '";
        ID += tbPhieuNhap.getValueAt(row, 0).toString() + "'";
//        System.out.println(ID);
        binDataCTPN("", ID, "");
        btnSua.setEnabled(true);
        btnThem.setEnabled(false);
        btnXoa.setEnabled(true);
    }//GEN-LAST:event_tbPhieuNhapMouseClicked

    private void tbCTPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCTPNMouseClicked
        // TODO add your handling code here:
        if (tbCTPN.getSelectedRow() == -1) {
            return;
        }
        String ID = "maPhieuNhap = '";
        ID += tbCTPN.getValueAt(tbCTPN.getSelectedRow(), 1).toString() + "'";
        binDataPN("", ID, "");
    }//GEN-LAST:event_tbCTPNMouseClicked

    private void bntLamTuoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntLamTuoiMouseClicked
        // TODO add your handling code here:
        binDataCTPN("", "", "");
        binDataPN("", "", "");
        txtTimKiemCTPN.setText("");
        txtTimKiemPN.setText("");
        btnThem.setEnabled(true);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }//GEN-LAST:event_bntLamTuoiMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
//        new frmNhap().setVisible(true);
        new jdNhap(this, true).setVisible(true);
        binDataCTPN("", "", "");
        binDataPN("", "", "");
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
//        System.out.println(getIDCTPN());
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tbPhieuNhap.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chọn một Phiếu Nhập trước!");
            return;
        }
        String w = "maPhieuNhap = '" + tbPhieuNhap.getValueAt(row, 0).toString() + "'";
        lstEditctpn = obj2.getAll("", w, "");
        idNXB = tbPhieuNhap.getValueAt(row, 1).toString();
//        new frmNhap(true).setVisible(true);
        new jdNhap(this, true, true).setVisible(true);
        binDataCTPN("", "", "");
        binDataPN("", "", "");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tbPhieuNhap.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chọn một Phiếu Nhập trước!");
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa bản ghi?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            obj2.deleteData_PN(tbPhieuNhap.getValueAt(row, 0).toString());
            boolean c = obj1.deleteData(tbPhieuNhap.getValueAt(row, 0).toString());
            binDataCTPN("", "", "");
            binDataPN("", "", "");
            if (c) {
                JOptionPane.showMessageDialog(this, "Xóa phiếu nhập thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa phiếu nhập không thành công!");
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
        int row = tbPhieuNhap.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chọn một Phiếu Nhập trước!");
            return;
        }
        PhieuNhap data = new PhieuNhap();
        data.setMaPhieuNhap(tbPhieuNhap.getValueAt(row, 0).toString());
        data.setMaNXB(tbPhieuNhap.getValueAt(row, 1).toString());
        datePrint = tbPhieuNhap.getValueAt(row, 2).toString();
        data.setThanhTien(Integer.parseInt(tbPhieuNhap.getValueAt(row, 3).toString()));
//        System.out.println(data.getMaPhieuNhap()+" "+data.getTenKH()+" "+data.getNgayXuat()+" "+data.getThanhTien());
        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext = "";
            String file = "";

            if (len > 4) {
                ext = filename.substring(len - 4, len);
            }

            if (ext.equals(".xls")) {
                file = path + "\\" + filename;
            } else {
                file = path + "\\" + filename + ".xls";
            }
            try {
                toExcel(data, tbCTPN, new File(file));
                if (JOptionPane.showConfirmDialog(this, "Mở file?", "Xuất file thành công!!!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    File f = new File(file);
                    try {
                        Desktop.getDesktop().open(f);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(frmSach.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Xuất file không thành công!");
            }
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void bntLamTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLamTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntLamTuoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    public static void toExcel(PhieuNhap px, JTable table, File file) throws IOException {
        String sheetName = "Sheet1";//name of sheet
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName);
        TableModel model = table.getModel();
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("Mã Phiếu Nhập");
        cell = row.createCell(1);
        cell.setCellValue(px.getMaPhieuNhap());
        cell = row.createCell(3);
        cell.setCellValue("Ngày nhập");
        cell = row.createCell(4);
        cell.setCellValue(datePrint);
        row = sheet.createRow(1);
        cell = row.createCell(0);
        cell.setCellValue("Nhà Xuất Bản");
        cell = row.createCell(1);
        cell.setCellValue(px.getMaNXB());

//        Get col name
        row = sheet.createRow(3);
        cell = row.createCell(0);
        cell.setCellValue("STT");
        for (int i = 0; i < model.getColumnCount(); i++) {
            cell = row.createCell(i + 1);
            cell.setCellValue(model.getColumnName(i).toString());
        }
//        iterating r number of rows
        for (int r = 0; r < model.getRowCount(); r++) {
            row = sheet.createRow(r + 4);
            cell = row.createCell(0);
            cell.setCellValue(r + 1);
            //iterating c number of columns
            for (int c = 0; c < model.getColumnCount(); c++) {
                cell = row.createCell(c + 1);
                cell.setCellValue(model.getValueAt(r, c).toString());
            }
        }
        row = sheet.createRow(model.getRowCount() + 4);
        cell = row.createCell(model.getColumnCount() - 1);
        cell.setCellValue("Tổng tiền");
        cell = row.createCell(model.getColumnCount());
        cell.setCellValue(px.getThanhTien());

        FileOutputStream fileOut = new FileOutputStream(file);

        //write this workbook to an Outputstream.
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }

    String getIDPN() {
        String id = "PN";
        int val = 0;
        binDataPN("", "", "");
        int l = tbPhieuNhap.getRowCount();
        for (int i = 0; i < l; i++) {
            if (Integer.parseInt(tbPhieuNhap.getValueAt(i, 0).toString().substring(2)) > val) {
                val = Integer.parseInt(tbPhieuNhap.getValueAt(i, 0).toString().substring(2));
            }
        }
        id += String.valueOf(val + 1);
        return id;
    }

    String getIDCTPN() {
        String id = "CTPN";
        int val = 0;
        binDataCTPN("", "", "");
        int l = tbCTPN.getRowCount();
        for (int i = 0; i < l; i++) {
            if (Integer.parseInt(tbCTPN.getValueAt(i, 0).toString().substring(4)) > val) {
                val = Integer.parseInt(tbCTPN.getValueAt(i, 0).toString().substring(4));
            }
        }
        id += String.valueOf(val + 1);
        return id;
    }

    public void binDataPN(String t, String w, String o) {
        lstpn = obj1.getAll(t, w, o);
        Vector col = new Vector();
        col.add("Mã Phiếu Nhập");
        col.add("Nhà Xuất Bản");
        col.add("Ngày Nhập");
        col.add("Thành Tiền");
        Vector data = new Vector();
        for (PhieuNhap i : lstpn) {
            Vector row = new Vector();
            row.add(i.getMaPhieuNhap());
            row.add(i.getMaNXB());
            row.add(i.getNgayNhap());
            row.add(i.getThanhTien());
            data.add(row);
        }
        DefaultTableModel dtm = new DefaultTableModel(data, col);
        tbPhieuNhap.setModel(dtm);
    }

    public void binDataCTPN(String t, String w, String o) {
        lstctpn = obj2.getAll(t, w, o);
        Vector col = new Vector();
        col.add("Mã CTPN");
        col.add("Mã PN");
        col.add("Mã Sách");
        col.add("Số Lượng");
        col.add("Đơn Giá");
        col.add("Thành Tiền");

        Vector data = new Vector();
        for (CTPN i : lstctpn) {
            Vector row = new Vector();
            row.add(i.getMaCTPN());
            row.add(i.getMaPhieuNhap());
            row.add(i.getMaSach());
            row.add(i.getSoLuong());
            row.add(i.getDonGia());
            row.add(i.getThanhTien());
            data.add(row);
        }
        DefaultTableModel dtm = new DefaultTableModel(data, col);
        tbCTPN.setModel(dtm);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQLNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLamTuoi;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemCTPN;
    private javax.swing.JButton btnTimKiemPN;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbCTPN;
    private javax.swing.JTable tbPhieuNhap;
    private javax.swing.JTextField txtTimKiemCTPN;
    private javax.swing.JTextField txtTimKiemPN;
    // End of variables declaration//GEN-END:variables
}
