package restaurant;

import javax.swing.ImageIcon;

/**
 *
 * @author FABIANT-PC 1.0
 */
public class Restaurant extends javax.swing.JFrame {

    /**
     * Creates new form Restaurant
     */
    public Restaurant() {
        initComponents();
        ImageIcon ikon = new ImageIcon(getClass().getResource("my16.png"));
        setIconImage(ikon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTable = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnTable = new javax.swing.JMenu();
        mnProfile = new javax.swing.JMenu();
        mnProduct = new javax.swing.JMenu();
        mnPartner = new javax.swing.JMenu();
        mnBill = new javax.swing.JMenu();
        mnReport = new javax.swing.JMenu();
        mnOption = new javax.swing.JMenu();
        mnHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FBNT Restaurant");

        btnTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setText("Asztalok");
        btnTable.setAutoscrolls(true);
        btnTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTable.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProduct.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/menu.png"))); // NOI18N
        btnProduct.setText("Étlap/Itallap");
        btnProduct.setToolTipText("");
        btnProduct.setAutoscrolls(true);
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/menu.png"))); // NOI18N
        btnProduct.setVerifyInputWhenFocusTarget(false);
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/employees.png"))); // NOI18N
        btnProfile.setText("Felhasználók");
        btnProfile.setToolTipText("");
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnBill.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/bill.png"))); // NOI18N
        btnBill.setText("Számla");
        btnBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnReport.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/report.png"))); // NOI18N
        btnReport.setText("Kimutatás");
        btnReport.setToolTipText("");
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnOption.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/settings.png"))); // NOI18N
        btnOption.setText("Beállítások");
        btnOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOption.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnHelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/help.png"))); // NOI18N
        btnHelp.setText("Súgó");
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnFile.setMnemonic('F');
        mnFile.setText("Fájl");
        jMenuBar1.add(mnFile);

        mnTable.setMnemonic('A');
        mnTable.setText("Asztalok");
        jMenuBar1.add(mnTable);

        mnProfile.setMnemonic('F');
        mnProfile.setText("Felhasználók");
        jMenuBar1.add(mnProfile);

        mnProduct.setMnemonic('T');
        mnProduct.setText("Termékek");
        jMenuBar1.add(mnProduct);

        mnPartner.setMnemonic('P');
        mnPartner.setText("Partnerek");
        jMenuBar1.add(mnPartner);

        mnBill.setMnemonic('z');
        mnBill.setText("Számlázás");
        mnBill.setToolTipText("");
        jMenuBar1.add(mnBill);

        mnReport.setMnemonic('K');
        mnReport.setText("Kimutatások");
        jMenuBar1.add(mnReport);

        mnOption.setMnemonic('B');
        mnOption.setText("Beállítások");
        jMenuBar1.add(mnOption);

        mnHelp.setMnemonic('S');
        mnHelp.setText("Súgó");
        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHelp)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnProduct, btnProfile, btnReport, btnTable});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(503, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnProduct, btnProfile, btnReport, btnTable});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnBill;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenu mnOption;
    private javax.swing.JMenu mnPartner;
    private javax.swing.JMenu mnProduct;
    private javax.swing.JMenu mnProfile;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenu mnTable;
    // End of variables declaration//GEN-END:variables
}
