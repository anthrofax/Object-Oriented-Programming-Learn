package package1;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import packageConfig.DatabaseConfig;

public class Dashboard extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst1;
    PreparedStatement pst2;

    DefaultTableModel model = new DefaultTableModel();
    ArrayList<javax.swing.JCheckBox> foodCheckbox = new ArrayList<javax.swing.JCheckBox>();
    ArrayList<javax.swing.JLabel> foodLabel = new ArrayList<javax.swing.JLabel>();
    ArrayList<javax.swing.JSpinner> foodQty = new ArrayList<javax.swing.JSpinner>();

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Register the mysql driver 
            con = DriverManager.getConnection("jdbc:mysql://localhost/wanmarized", "root", "");
//            PreparedStatement insert = con.prepareStatement("SELECT * FROM users");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Dashboard() {
        initComponents();
        Connect();

        String query = "SELECT nama_produk, id_produk FROM produk";

        try (Connection connection = new DatabaseConfig().getConnection(); PreparedStatement pst = connection.prepareStatement(query); ResultSet resultSet = pst.executeQuery()) {

            foodpanel.setLayout(new BoxLayout(foodpanel, BoxLayout.Y_AXIS)); // Ganti layout manager menjadi Y_AXIS

            while (resultSet.next()) {
                String idProduk = resultSet.getString("id_produk");
                String namaProduk = resultSet.getString("nama_produk");

                // Buat dan konfigurasi JPanel untuk grup komponen
                javax.swing.JPanel group = new javax.swing.JPanel();
                group.setLayout(new LeftFlowLayout(60)); // Ganti layout manager menjadi FlowLayout

                // Buat dan konfigurasi JCheckBox
                javax.swing.JCheckBox foodName = new javax.swing.JCheckBox();
                foodName.setFont(new java.awt.Font("Helvetica Neue", 1, 12));
                foodName.setText(idProduk);
                foodName.setPreferredSize(new java.awt.Dimension(150, 30));

                javax.swing.JLabel foodNameLable = new javax.swing.JLabel();
                foodNameLable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
                foodNameLable.setText(namaProduk);
                foodNameLable.setPreferredSize(new java.awt.Dimension(100, 30));

                // Buat dan konfigurasi JSpinner
                javax.swing.JSpinner qty = new javax.swing.JSpinner();
                qty.setPreferredSize(new java.awt.Dimension(50, 30));

                // Tambahkan komponen-komponen ke grup
                group.add(foodName);
                group.add(foodNameLable);
                group.add(qty);

                // Menambahkan component ke Array List
                foodCheckbox.add(foodName);
                foodLabel.add(foodNameLable);
                foodQty.add(qty);

                // Tambahkan grup ke panel utama dengan menggunakan GridBagConstraints
                foodpanel.add(group);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpayment = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodpanel = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Wanmarized Resto");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produk", "Harga", "Kuantitas", "Harga Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Menu Makanan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Sub Total");

        jLabel3.setText("Payment");

        jLabel4.setText("Balance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        foodpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        foodpanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                foodpanelComponentShown(evt);
            }
        });

        javax.swing.GroupLayout foodpanelLayout = new javax.swing.GroupLayout(foodpanel);
        foodpanel.setLayout(foodpanelLayout);
        foodpanelLayout.setHorizontalGroup(
            foodpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        foodpanelLayout.setVerticalGroup(
            foodpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(foodpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(420, 420, 420)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    class LeftFlowLayout extends FlowLayout {

        private static final long serialVersionUID = 1L;
        private int marginRight;

        public LeftFlowLayout(int marginRight) {
            super(FlowLayout.LEFT);
            this.marginRight = marginRight;
        }

        @Override
        public void layoutContainer(Container target) {
            synchronized (target.getTreeLock()) {
                int n = target.getComponentCount();
                if (n > 0) {
                    Component c = target.getComponent(0);
                    Dimension preferredSize = c.getPreferredSize();
                    int x = target.getInsets().left;
                    int y = target.getInsets().top + (target.getHeight() - target.getInsets().top - target.getInsets().bottom - preferredSize.height) / 2;
                    c.setBounds(x, y, preferredSize.width, preferredSize.height);

                    for (int i = 1; i < n; i++) {
                        Component prev = target.getComponent(i - 1);
                        c = target.getComponent(i);
                        preferredSize = c.getPreferredSize();
                        x = prev.getX() + prev.getWidth() + marginRight;
                        y = target.getInsets().top + (target.getHeight() - target.getInsets().top - target.getInsets().bottom - preferredSize.height) / 2;
                        c.setBounds(x, y, preferredSize.width, preferredSize.height);
                    }
                }
            }
        }
    }

    public void sales() throws ClassNotFoundException {
        String subtot = txtsub.getText();
        String pay = txtpayment.getText();
        String bal = txtbalance.getText();
        int lastinsertid = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/wanmarized", "root", "");

            String query2 = "insert into sales(subtotal,pay,balance)values(?,?,?)";

            pst1 = con.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);

            pst1.setString(1, subtot);
            pst1.setString(2, pay);
            pst1.setString(3, bal);
            pst1.executeUpdate();

            ResultSet generatekey = pst1.getGeneratedKeys();

            if (generatekey.next()) {
                lastinsertid = generatekey.getInt(1);
            }

            String query1 = "insert into sales_product(sales_id,ricetype,price,qty,total)values(?,?,?,?,?)";
            pst2 = con.prepareStatement(query1);

            String ricetype = "";
            int price = 0;
            int qty = 0;
            int tot = 0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                ricetype = (String) jTable1.getValueAt(i, 0);
                price = (int) jTable1.getValueAt(i, 1);
                qty = (int) jTable1.getValueAt(i, 2);
                tot = (int) jTable1.getValueAt(i, 3);

                pst2.setInt(1, lastinsertid);
                pst2.setString(2, ricetype);
                pst2.setInt(3, price);
                pst2.setInt(4, qty);
                pst2.setInt(5, tot);
                pst2.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Penjualan berhasil disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

//            HashMap a = new HashMap();
//            a.put("invo", lastinsertid);
//
//            try {
//                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\kobinath\\Documents\\NetBeansProjects\\FriendRiceShop\\src\\friedrice\\report1.jrxml");
//                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
//
//                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
//
//                JasperViewer.viewReport(jprint);
//
//                //  JasperPrintManager.printReport(jprint, false); 
//            } catch (JRException ex) {
//                Logger.getLogger(friendrice.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            HashMap a = new HashMap();
//            a.put("invo", lastinsertid);
//
//            try {
//                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\kobinath\\Documents\\NetBeansProjects\\FriendRiceShop\\src\\friedrice\\report1.jrxml");
//                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
//
//                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
//
//                JasperViewer.viewReport(jprint);
//
//                //  JasperPrintManager.printReport(jprint, false); 
//            } catch (JRException ex) {
//                Logger.getLogger(friendrice.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            HashMap a = new HashMap();
//            a.put("invo", lastinsertid);
//
//            try {
//                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\kobinath\\Documents\\NetBeansProjects\\FriendRiceShop\\src\\friedrice\\report1.jrxml");
//                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
//
//                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
//
//                JasperViewer.viewReport(jprint);
//
//                //  JasperPrintManager.printReport(jprint, false); 
//            } catch (JRException ex) {
//                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            HashMap a = new HashMap();
//            a.put("invo", lastinsertid);
//
//            try {
//                JasperDes ign jdesign = JRXmlLoader.load("C:\\Users\\kobinath\\Documents\\NetBeansProjects\\FriendRiceShop\\src\\friedrice\\report1.jrxml");
//                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
//
//                JasperPrint jprint = JasperFillManager.fillReport(jreport, a, con);
//
//                JasperViewer.viewReport(jprint);
//
//                //  JasperPrintManager.printReport(jprint, false); 
//            } catch (JRException ex) {
//                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int sub, pay, bal;
        sub = Integer.parseInt(txtsub.getText());
        pay = Integer.parseInt(txtpayment.getText());

        bal = pay - sub;

        txtbalance.setText(String.valueOf(bal));

        try {
            sales();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuMakanan menumakanan = new MenuMakanan();
        setVisible(false);
        dispose();
        menumakanan.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin keluar?", "Logout", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            LoginPage login = new LoginPage();
            setVisible(false);
            dispose();
            login.setVisible(true);
        } else {

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        int price = 0;
        int sum = 0;

        model = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < foodCheckbox.size(); i++) {
            if (foodCheckbox.get(i).isSelected()) {
                String query1 = "Select harga_jual from produk where id_produk= ?";
                try (Connection connection = new DatabaseConfig().getConnection(); PreparedStatement pst = connection.prepareStatement(query1)) {
                    pst.setString(1, foodCheckbox.get(i).getText());

                    try (ResultSet resultSet = pst.executeQuery()) {
                        if (resultSet.next()) {
                            price = resultSet.getInt("harga_jual");
                        } else {
                            JOptionPane.showMessageDialog(null, "ID atau Password yang anda masukkan Salah!");
                        }
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }

                int qty = Integer.parseInt(foodQty.get(i).getValue().toString());
                int total = price * qty;

                model = (DefaultTableModel) jTable1.getModel();

                model.addRow(new Object[]{
                    foodCheckbox.get(i).getText(),
                    price,
                    qty,
                    total
                });
            }
        }

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum += Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }

        txtsub.setText(Integer.toString(sum));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void foodpanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_foodpanelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_foodpanelComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel foodpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
