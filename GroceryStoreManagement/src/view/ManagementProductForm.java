package view;

import Utility.Uhelper;
import com.toedter.calendar.JDateChooser;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product_Management;
import service.Product_ManagementService;
import service.impl.Product_ManagementImpl;

public class ManagementProductForm extends javax.swing.JFrame {

    private LoginForm lgf = new LoginForm();
    private Product_ManagementService pms = new Product_ManagementImpl() {};
    private DefaultTableModel model = new DefaultTableModel();
    private int index;
    private int stt;

    /**
     * Creates new form Product_Management
     */
    public ManagementProductForm() {
        initComponents();
        setLocationRelativeTo(null);

        stt = 1;
        
        model = (DefaultTableModel) tblManagementPro.getModel();
        
        loadData(pms.getAll());
        
        lblUsername.setText("NV: "+pms.readFile());
        
        clearForm();
    }

    private void loadData(ArrayList<Product_Management> listProduct) {

        model.setRowCount(0);
        stt = 1;
        for (Product_Management pm : listProduct) {
            model.addRow(new Object[]{
                stt++,
                pm.getId_product(),
                pm.getName_product(),
                pm.getUnit_size(),
                pm.getQuantity(),
                pm.getReveneu()});
        }
    }

    private void showDetail() {
        Product_Management pm = pms.getAll().get(index);
        
        txtIdPro.setText(pm.getId_product());
        txtNamePro.setText(pm.getName_product());
        txtPrice.setText("" + pm.getUnit_size());
        txtReveneu.setText("" + pm.getReveneu());
        txtQuantity.setText("" + pm.getQuantity());
        dcFirstDay.setDate(pm.getDate_pro());

        tblManagementPro.setRowSelectionInterval(index, index);
    }

    private void clearForm() {
        index = -1;
        txtIdPro.setText("");
        txtNamePro.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        txtReveneu.setText("");

        tblManagementPro.clearSelection();
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtFindInput = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtReveneu = new javax.swing.JTextField();
        txtIdPro = new javax.swing.JTextField();
        txtNamePro = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManagementPro = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        rdoReveneuASC = new javax.swing.JRadioButton();
        rdoReveneuDESC = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblIconCart = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAllProduct = new javax.swing.JButton();
        dcFirstDay = new com.toedter.calendar.JDateChooser();
        dcLastDay = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1920, 1412));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1412));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sản phẩm");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 270, 30);

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsername.setText("NV: NGUYỄN VĂN A");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(1100, 0, 250, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 40, 1380, 1);

        txtFindInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtFindInput);
        txtFindInput.setBounds(150, 60, 730, 38);

        btnFind.setBackground(new java.awt.Color(245, 71, 72));
        btnFind.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind);
        btnFind.setBounds(880, 60, 220, 40);

        jTextField3.setBackground(new java.awt.Color(245, 71, 72));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(0, 120, 1380, 1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Mã sản phẩm");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 140, 130, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Tên sản phẩm");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 130, 27);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Đơn giá");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 220, 70, 27);

        txtReveneu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtReveneu);
        txtReveneu.setBounds(290, 300, 410, 25);

        txtIdPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtIdPro);
        txtIdPro.setBounds(290, 140, 410, 25);

        txtNamePro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtNamePro);
        txtNamePro.setBounds(290, 180, 410, 25);

        btnAdd.setBackground(new java.awt.Color(245, 71, 72));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(890, 160, 120, 40);

        btnDelete.setBackground(new java.awt.Color(245, 71, 72));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(890, 220, 120, 40);

        btnUpdate.setBackground(new java.awt.Color(245, 71, 72));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(1110, 160, 120, 40);

        btnNew.setBackground(new java.awt.Color(245, 71, 72));
        btnNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Làm mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);
        btnNew.setBounds(1110, 220, 120, 40);

        btnLogOut.setBackground(new java.awt.Color(245, 71, 72));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(1230, 650, 120, 40);

        jButton8.setBackground(new java.awt.Color(245, 71, 72));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Đăng xuất");
        jPanel1.add(jButton8);
        jButton8.setBounds(1240, 650, 110, 40);

        btnExit.setBackground(new java.awt.Color(245, 71, 72));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(10, 650, 120, 40);

        tblManagementPro.setBackground(new java.awt.Color(255, 238, 238));
        tblManagementPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        tblManagementPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng", "Doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManagementPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManagementProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManagementPro);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(52, 350, 1210, 150);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(245, 71, 72));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(0, 511, 1400, 1);

        buttonGroup2.add(rdoReveneuASC);
        rdoReveneuASC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoReveneuASC.setText("Doanh thu tăng dần");
        jPanel1.add(rdoReveneuASC);
        rdoReveneuASC.setBounds(50, 530, 170, 27);

        buttonGroup2.add(rdoReveneuDESC);
        rdoReveneuDESC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoReveneuDESC.setText("Doanh thu giảm dần");
        jPanel1.add(rdoReveneuDESC);
        rdoReveneuDESC.setBounds(50, 560, 180, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Từ ngày:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 530, 70, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Đến ngày:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 530, 80, 22);

        btnSort.setBackground(new java.awt.Color(245, 71, 72));
        btnSort.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setText("Sắp xếp");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        jPanel1.add(btnSort);
        btnSort.setBounds(360, 600, 120, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon lịch.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(880, 540, 50, 45);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Icon lịch.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(510, 540, 50, 45);

        lblIconCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_xe_đẩy.jpg"))); // NOI18N
        jPanel1.add(lblIconCart);
        lblIconCart.setBounds(1270, 50, 60, 60);

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtPrice);
        txtPrice.setBounds(290, 220, 410, 25);

        txtQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(245, 71, 72)));
        jPanel1.add(txtQuantity);
        txtQuantity.setBounds(290, 260, 410, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Số lượng");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 260, 100, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Doanh thu");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 300, 100, 27);

        btnAllProduct.setBackground(new java.awt.Color(245, 71, 72));
        btnAllProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAllProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAllProduct.setText("Tất cả sản phẩm");
        btnAllProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllProduct);
        btnAllProduct.setBounds(970, 290, 170, 40);
        jPanel1.add(dcFirstDay);
        dcFirstDay.setBounds(400, 530, 88, 22);
        jPanel1.add(dcLastDay);
        dcLastDay.setBounds(780, 530, 88, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void tblManagementProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManagementProMouseClicked
        index = tblManagementPro.getSelectedRow();

        showDetail();
    }//GEN-LAST:event_tblManagementProMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(Uhelper.checkNull(txtIdPro, "Nhập mã sản phẩm!")) return;
        for (int i = 0; i < pms.getAll().size(); i++) {
            if(txtIdPro.getText().equalsIgnoreCase(pms.getAll().get(i).getId_product())){
                JOptionPane.showMessageDialog(this, "Trùng mã sản phẩm. Vui lòng điền mã khác.");
                return;
            }
        }
        
        
        if(Uhelper.checkNull(txtNamePro, "Nhập tên sản phẩm!")) return;
        if(Uhelper.checkNull(txtPrice, "Nhập đơn giá sản phẩm!")) return;
        if(Uhelper.checkNumber(txtPrice, "Nhập đơn giá là số và > 0!")) return;
        if(Uhelper.checkNull(txtQuantity, "Nhập số lượng sản phẩm!")) return;
        if(Uhelper.checkNumber(txtQuantity, "Nhập số lượng là số và > 0!")) return;
        if(Uhelper.checkNull(txtReveneu, "Nhập doanh thu sản phẩm!")) return;
        if(Uhelper.checkNumber(txtReveneu, "Nhập doanh thu là số và >= 0!")) return;
        
        String idPro = txtIdPro.getText();
        String name = txtNamePro.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        int unit_price = Integer.parseInt(txtPrice.getText());
        int revenue = Integer.parseInt(txtReveneu.getText());

        Product_Management pm = new Product_Management(idPro, name, unit_price, quantity, revenue);


        String result = pms.addNew(pm);
        JOptionPane.showMessageDialog(this, result);
        if(result.equals("Thêm thành công!")){
            loadData(pms.getAll());}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        index = tblManagementPro.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần sửa!");
            return;
        }
        Product_Management pm = pms.getAll().get(index);
        
        String ID_PRODUCT = txtIdPro.getText();
        String name = txtNamePro.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        int unit_price = Integer.parseInt(txtPrice.getText());
        int revenue = Integer.parseInt(txtReveneu.getText());

        pm.setName_product(name);
        pm.setUnit_size(unit_price);
        pm.setQuantity(quantity);
        pm.setReveneu(revenue);
        String result = pms.update(ID_PRODUCT, pm);
        JOptionPane.showMessageDialog(this, result);

        loadData(pms.getAll());
        showDetail();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        if(dcFirstDay.getDate() == null){
            JOptionPane.showMessageDialog(this, "Chọn ngày bắt đầu");
        }else if(dcLastDay.getDate()== null){
            JOptionPane.showMessageDialog(this, "Chọn ngày kết thúc");
        }
        String sort = "DESC";;
        if (rdoReveneuASC.isSelected()) {
            sort = "ASC";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Date firstDay =  dcFirstDay.getDate();
        Date lastDay = dcLastDay.getDate();

        ArrayList<Product_Management> lstP = pms.getAllSort(sort, sdf.format(firstDay), sdf.format(lastDay));
        if(lstP == null){
            JOptionPane.showMessageDialog(this, "List rỗng");
            return;
        }
        loadData(lstP);

    }//GEN-LAST:event_btnSortActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String ID_PRODUCT = txtFindInput.getText();

        Product_Management pm = pms.getById(ID_PRODUCT);

        if (pm == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm!");
            return;
        } else {
            txtIdPro.setText(pm.getId_product());
            txtNamePro.setText(pm.getName_product());
            txtPrice.setText("" + pm.getUnit_size());
            txtReveneu.setText("" + pm.getReveneu());
            txtQuantity.setText("" + pm.getQuantity());

            txtFindInput.setText("");
            for (int i = 0; i < pms.getAll().size(); i++) {
                if(pms.getAll().get(i).getId_product().equals(ID_PRODUCT)){
                    tblManagementPro.setRowSelectionInterval(i, i);
                }
            }
            
                
            
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        index = tblManagementPro.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần xóa!");
            return;
        }
        Product_Management pm = pms.getAll().get(index);
        
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?");
        if(hoi != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
            return;
        }
    
        JOptionPane.showMessageDialog(this, pms.deleteProduct(pm.getId_product()));
        loadData(pms.getAll());
        clearForm();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAllProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllProductActionPerformed
        loadData(pms.getAll());
    }//GEN-LAST:event_btnAllProductActionPerformed

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
            java.util.logging.Logger.getLogger(ManagementProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAllProduct;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dcFirstDay;
    private com.toedter.calendar.JDateChooser dcLastDay;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblIconCart;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rdoReveneuASC;
    private javax.swing.JRadioButton rdoReveneuDESC;
    private javax.swing.JTable tblManagementPro;
    private javax.swing.JTextField txtFindInput;
    private javax.swing.JTextField txtIdPro;
    private javax.swing.JTextField txtNamePro;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReveneu;
    // End of variables declaration//GEN-END:variables
}
