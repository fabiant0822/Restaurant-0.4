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

        btnOrder = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNeworder = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniClose = new javax.swing.JMenuItem();
        mnTable = new javax.swing.JMenu();
        mniOpened = new javax.swing.JMenuItem();
        mniFree = new javax.swing.JMenuItem();
        mniReserved = new javax.swing.JMenuItem();
        mnProfile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniEdit = new javax.swing.JMenuItem();
        mniDelete = new javax.swing.JMenuItem();
        mnProduct = new javax.swing.JMenu();
        mniDrink = new javax.swing.JMenuItem();
        mniFood = new javax.swing.JMenuItem();
        mnBill = new javax.swing.JMenu();
        mniBill = new javax.swing.JMenuItem();
        mniStorno = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        mniDay = new javax.swing.JMenuItem();
        mniDate = new javax.swing.JMenuItem();
        mnOption = new javax.swing.JMenu();
        mniOption = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        mniNamecard = new javax.swing.JMenuItem();
        mniHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FBNT Restaurant");
        setPreferredSize(new java.awt.Dimension(800, 625));
        setSize(new java.awt.Dimension(800, 625));

        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/notes32.png"))); // NOI18N
        btnOrder.setText("Rendelés");
        btnOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setText("Asztalok");
        btnTable.setAutoscrolls(true);
        btnTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTable.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProduct.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/menu.png"))); // NOI18N
        btnProduct.setText("Étlap/Itallap");
        btnProduct.setToolTipText("");
        btnProduct.setAutoscrolls(true);
        btnProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/menu.png"))); // NOI18N
        btnProduct.setVerifyInputWhenFocusTarget(false);
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/employees.png"))); // NOI18N
        btnProfile.setText("Felhasználók");
        btnProfile.setToolTipText("");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnBill.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/bill.png"))); // NOI18N
        btnBill.setText("Számla");
        btnBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnReport.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/report.png"))); // NOI18N
        btnReport.setText("Kimutatás");
        btnReport.setToolTipText("");
        btnReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnOption.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/settings.png"))); // NOI18N
        btnOption.setText("Beállítások");
        btnOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOption.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnHelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/help.png"))); // NOI18N
        btnHelp.setText("Súgó");
        btnHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnFile.setMnemonic('F');
        mnFile.setText("Fájl");

        mniNeworder.setText("Új rendelés");
        mnFile.add(mniNeworder);
        mnFile.add(jSeparator1);

        mniOpen.setText("Megnyitás");
        mnFile.add(mniOpen);

        mniSave.setText("Mentés");
        mnFile.add(mniSave);
        mnFile.add(jSeparator2);

        mniClose.setText("Bezárás");
        mnFile.add(mniClose);

        jMenuBar1.add(mnFile);

        mnTable.setMnemonic('A');
        mnTable.setText("Asztalok");

        mniOpened.setText("Nyitott asztalok");
        mnTable.add(mniOpened);

        mniFree.setText("Szabad asztalok");
        mnTable.add(mniFree);

        mniReserved.setText("Foglalt asztalok");
        mnTable.add(mniReserved);

        jMenuBar1.add(mnTable);

        mnProfile.setMnemonic('F');
        mnProfile.setText("Felhasználók");

        mniNew.setLabel("Új felhasználó");
        mnProfile.add(mniNew);

        mniEdit.setLabel("Felhasználó beállítások");
        mnProfile.add(mniEdit);

        mniDelete.setLabel("Felhasználó törlése");
        mnProfile.add(mniDelete);

        jMenuBar1.add(mnProfile);

        mnProduct.setMnemonic('T');
        mnProduct.setText("Termékek");

        mniDrink.setText("Itallap");
        mnProduct.add(mniDrink);

        mniFood.setText("Étlap");
        mnProduct.add(mniFood);

        jMenuBar1.add(mnProduct);

        mnBill.setMnemonic('z');
        mnBill.setText("Számlázás");
        mnBill.setToolTipText("");

        mniBill.setText("Számla készítése");
        mniBill.setActionCommand("");
        mnBill.add(mniBill);

        mniStorno.setText("Számla sztornó");
        mniStorno.setActionCommand("");
        mnBill.add(mniStorno);

        jMenuBar1.add(mnBill);

        mnReport.setMnemonic('K');
        mnReport.setText("Kimutatások");

        mniDay.setText("Napi forgalom");
        mnReport.add(mniDay);

        mniDate.setText("Forgalom lekérdezés");
        mnReport.add(mniDate);

        jMenuBar1.add(mnReport);

        mnOption.setMnemonic('B');
        mnOption.setText("Beállítások");

        mniOption.setText("Hamarosan...");
        mnOption.add(mniOption);

        jMenuBar1.add(mnOption);

        mnHelp.setMnemonic('S');
        mnHelp.setText("Súgó");

        mniNamecard.setText("Névjegy");
        mnHelp.add(mniNamecard);

        mniHelp.setText("Súgó");
        mnHelp.add(mniHelp);

        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(691, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOption, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBill, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTable, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnOrder, btnProduct, btnProfile, btnReport, btnTable});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnOrder, btnProduct, btnProfile, btnReport, btnTable});

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
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnBill;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenu mnOption;
    private javax.swing.JMenu mnProduct;
    private javax.swing.JMenu mnProfile;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenu mnTable;
    private javax.swing.JMenuItem mniBill;
    private javax.swing.JMenuItem mniClose;
    private javax.swing.JMenuItem mniDate;
    private javax.swing.JMenuItem mniDay;
    private javax.swing.JMenuItem mniDelete;
    private javax.swing.JMenuItem mniDrink;
    private javax.swing.JMenuItem mniEdit;
    private javax.swing.JMenuItem mniFood;
    private javax.swing.JMenuItem mniFree;
    private javax.swing.JMenuItem mniHelp;
    private javax.swing.JMenuItem mniNamecard;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniNeworder;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniOpened;
    private javax.swing.JMenuItem mniOption;
    private javax.swing.JMenuItem mniReserved;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JMenuItem mniStorno;
    // End of variables declaration//GEN-END:variables
}
