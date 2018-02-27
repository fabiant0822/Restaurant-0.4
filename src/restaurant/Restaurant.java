package restaurant;

import javax.swing.ImageIcon;

/**
 *
 * @author FABIANT-PC 1.0
 */
public class Restaurant extends javax.swing.JFrame {
    
    DB ab;

    /**
     * Creates new form Restaurant
     */
    public Restaurant() {
        initComponents();
        ImageIcon ikon = new ImageIcon(getClass().getResource("my16.png"));
        setIconImage(ikon.getImage());
        ab = new DB();
        ab.asztal_be(tblTable_1, cbxTable_1);
    }
    
    /**
     * Ha kijelölünk egy sort az asztalok táblában, akkor kimásolja a beviteli mezőkbe.
     */
    private void asztalok_tablabol() {
        int i = tblTable_1.getSelectedRow();
        txtTable.setText(tblTable_1.getValueAt(i, 1).toString());
        Object e = tblTable_1.getValueAt(i, 2);
        if (e != null)
            txtPlace.setText(e.toString());
        else 
            txtPlace.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrder = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jtpBase = new javax.swing.JTabbedPane();
        jtpOrder = new javax.swing.JPanel();
        jtpTable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTable = new javax.swing.JTextField();
        txtChair = new javax.swing.JTextField();
        txtPlace = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable_1 = new javax.swing.JTable();
        btnAdd_1 = new javax.swing.JButton();
        btnMod_1 = new javax.swing.JButton();
        btnDel_1 = new javax.swing.JButton();
        cbxTable_1 = new javax.swing.JComboBox<>();
        jtpProfile = new javax.swing.JPanel();
        jtpProduct = new javax.swing.JPanel();
        jtpBill = new javax.swing.JPanel();
        jtpReport = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmbOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmbSave = new javax.swing.JMenuItem();
        jmbSaveas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmbClose = new javax.swing.JMenuItem();
        jmOption = new javax.swing.JMenu();
        jmHelp = new javax.swing.JMenu();

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

        btnProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/employees.png"))); // NOI18N
        btnProfile.setText("Felhasználók");
        btnProfile.setToolTipText("");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jtpBase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpBase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtpOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpOrderLayout = new javax.swing.GroupLayout(jtpOrder);
        jtpOrder.setLayout(jtpOrderLayout);
        jtpOrderLayout.setHorizontalGroup(
            jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jtpOrderLayout.setVerticalGroup(
            jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jtpBase.addTab("Rendelés", jtpOrder);

        jtpTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Asztal szám:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Székek száma:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Helység:");

        txtTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTable.setToolTipText("");

        txtChair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPlace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblTable_1.setAutoCreateRowSorter(true);
        tblTable_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTable_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asztal", "Szék", "Helység"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTable_1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblTable_1);
        tblTable_1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAdd_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd_1.setMnemonic('H');
        btnAdd_1.setText("Hozzáad");
        btnAdd_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_1ActionPerformed(evt);
            }
        });

        btnMod_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMod_1.setMnemonic('M');
        btnMod_1.setText("Módosít");

        btnDel_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDel_1.setMnemonic('T');
        btnDel_1.setText("Töröl");
        btnDel_1.setToolTipText("");

        cbxTable_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jtpTableLayout = new javax.swing.GroupLayout(jtpTable);
        jtpTable.setLayout(jtpTableLayout);
        jtpTableLayout.setHorizontalGroup(
            jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jtpTableLayout.createSequentialGroup()
                        .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTable)
                            .addComponent(txtChair)
                            .addComponent(txtPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtpTableLayout.createSequentialGroup()
                                .addComponent(btnAdd_1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMod_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jtpTableLayout.createSequentialGroup()
                                .addComponent(cbxTable_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jtpTableLayout.setVerticalGroup(
            jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTable_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd_1)
                    .addComponent(btnMod_1)
                    .addComponent(btnDel_1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpBase.addTab("Asztalok", jtpTable);

        jtpProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpProfile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpProfileLayout = new javax.swing.GroupLayout(jtpProfile);
        jtpProfile.setLayout(jtpProfileLayout);
        jtpProfileLayout.setHorizontalGroup(
            jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jtpProfileLayout.setVerticalGroup(
            jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jtpBase.addTab("Felhasználók", jtpProfile);

        jtpProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpProductLayout = new javax.swing.GroupLayout(jtpProduct);
        jtpProduct.setLayout(jtpProductLayout);
        jtpProductLayout.setHorizontalGroup(
            jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jtpProductLayout.setVerticalGroup(
            jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jtpBase.addTab("Étlap/Itallap", jtpProduct);

        jtpBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpBillLayout = new javax.swing.GroupLayout(jtpBill);
        jtpBill.setLayout(jtpBillLayout);
        jtpBillLayout.setHorizontalGroup(
            jtpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jtpBillLayout.setVerticalGroup(
            jtpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jtpBase.addTab("Számla", jtpBill);

        jtpReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpReport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpReportLayout = new javax.swing.GroupLayout(jtpReport);
        jtpReport.setLayout(jtpReportLayout);
        jtpReportLayout.setHorizontalGroup(
            jtpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jtpReportLayout.setVerticalGroup(
            jtpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jtpBase.addTab("Kimutatás", jtpReport);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jmFile.setMnemonic('F');
        jmFile.setText("File");

        jmbOpen.setMnemonic('N');
        jmbOpen.setText("Nyitás");
        jmFile.add(jmbOpen);
        jmFile.add(jSeparator1);

        jmbSave.setMnemonic('M');
        jmbSave.setText("Mentés");
        jmFile.add(jmbSave);

        jmbSaveas.setMnemonic('n');
        jmbSaveas.setText("Mentés másként");
        jmFile.add(jmbSaveas);
        jmFile.add(jSeparator2);

        jmbClose.setMnemonic('Z');
        jmbClose.setText("Zárás");
        jmFile.add(jmbClose);

        jMenuBar1.add(jmFile);

        jmOption.setMnemonic('B');
        jmOption.setText("Beállítások");
        jMenuBar1.add(jmOption);

        jmHelp.setMnemonic('S');
        jmHelp.setText("Súgó");
        jMenuBar1.add(jmHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOption)
                    .addComponent(btnHelp)
                    .addComponent(btnReport)
                    .addComponent(btnBill)
                    .addComponent(btnProduct)
                    .addComponent(btnProfile)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTable))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnOrder, btnProduct, btnProfile, btnReport, btnTable});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtpBase, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBill, btnHelp, btnOption, btnOrder, btnProduct, btnProfile, btnReport, btnTable});

        jtpBase.getAccessibleContext().setAccessibleName("Restaurant");
        jtpBase.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_1ActionPerformed
        ab.asztal_hozzaad(txtTable.getText(),txtChair.getText(),txtPlace.getText());
        ab.asztal_be(tblTable_1, cbxTable_1);
    }//GEN-LAST:event_btnAdd_1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Restaurant().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_1;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnDel_1;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMod_1;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTable;
    private javax.swing.JComboBox<String> cbxTable_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenu jmOption;
    private javax.swing.JMenuItem jmbClose;
    private javax.swing.JMenuItem jmbOpen;
    private javax.swing.JMenuItem jmbSave;
    private javax.swing.JMenuItem jmbSaveas;
    private javax.swing.JTabbedPane jtpBase;
    private javax.swing.JPanel jtpBill;
    private javax.swing.JPanel jtpOrder;
    private javax.swing.JPanel jtpProduct;
    private javax.swing.JPanel jtpProfile;
    private javax.swing.JPanel jtpReport;
    private javax.swing.JPanel jtpTable;
    private javax.swing.JTable tblTable_1;
    private javax.swing.JTextField txtChair;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
