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
        ab.asztal_be(tblTable_1);
        ab.tetelek_be(tblProduct_1);
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
    
    private void tetelek_tablabol() {
        int i = tblProduct_1.getSelectedRow();
        txtProduct.setText(tblProduct_1.getValueAt(i, 1).toString());
        Object e = tblProduct_1.getValueAt(i, 2);
        if (e != null)
            txtPrice.setText(e.toString());
        else 
            txtPrice.setText("");
    }
    
     private int get_asztal(String tbl) {
        int i = 0;
        while (!tblTable_1.getValueAt(i, 1).equals(tbl))
            i++;
        return Integer.parseInt(tblTable_1.getValueAt(i, 0).toString());
    }
    
    private int get_tetelID (String ttl) {
        int i = 0;
        while (!tblProduct_1.getValueAt(i, 1).equals(ttl))
            i++;
        return Integer.parseInt(tblProduct_1.getValueAt(i, 0).toString());
    }
    
    private void asztal_max_kijelol() {
        int sordb = tblTable_1.getRowCount();
        int max = 0;
        int sor = 0;
        for (int i = 0; i < sordb; i++) {
            int n = Integer.parseInt(tblTable_1.getValueAt(i, 0).toString());
            if (n > max) {
                max = n;
                sor = i;
            }
        }
        tblTable_1.setRowSelectionInterval(sor, sor);
        asztalok_tablabol();
    }
    
     private void tetelek_max_kijelol() {
        int sordb = tblProduct_1.getRowCount();
        int max = 0;
        int sor = 0;
        for (int i = 0; i < sordb; i++) {
            int n = Integer.parseInt(tblProduct_1.getValueAt(i, 0).toString());
            if (n > max) {
                max = n;
                sor = i;
            }
        }
        tblProduct_1.setRowSelectionInterval(sor, sor);
        tetelek_tablabol();
    }
     
    private void asztal_kijelol(int tid) {
        int sordb = tblTable_1.getRowCount();
        for (int i = 0; i < sordb; i++) {
            int id = Integer.parseInt(tblTable_1.getValueAt(i, 0).toString());
            if (id == tid) {
                tblTable_1.setRowSelectionInterval(i, i);
                asztalok_tablabol();
                break;
            }
        }
    }
    
    private void tetelek_kijelol(int eid) {
        int sordb = tblProduct_1.getRowCount();
        for (int i = 0; i < sordb; i++) {
            int id = Integer.parseInt(tblProduct_1.getValueAt(i, 0).toString());
            if (id == eid) {
                tblProduct_1.setRowSelectionInterval(i, i);
                tetelek_tablabol();
                break;
            }
        }
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
        jtpProfile = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jtpProduct = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct_1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtUnit = new javax.swing.JTextField();
        btnAdd_2 = new javax.swing.JButton();
        btnMod_2 = new javax.swing.JButton();
        btn_Del_2 = new javax.swing.JButton();
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
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/employees.png"))); // NOI18N
        btnProfile.setText("Felhasználók");
        btnProfile.setToolTipText("");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

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
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

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
                        .addComponent(btnAdd_1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jtpTableLayout.setVerticalGroup(
            jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Felhasználónév:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Jelszó:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(300, 23));

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setPreferredSize(new java.awt.Dimension(300, 23));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Beállít");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Módosít");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Töröl");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Mentés");

        javax.swing.GroupLayout jtpProfileLayout = new javax.swing.GroupLayout(jtpProfile);
        jtpProfile.setLayout(jtpProfileLayout);
        jtpProfileLayout.setHorizontalGroup(
            jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpProfileLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jtpProfileLayout.setVerticalGroup(
            jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jtpBase.addTab("Felhasználók", jtpProfile);

        jtpProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tblProduct_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tétel", "Egységár", "Egység"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct_1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tblProduct_1);
        tblProduct_1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblProduct_1.getColumnModel().getColumnCount() > 0) {
            tblProduct_1.getColumnModel().getColumn(0).setMinWidth(0);
            tblProduct_1.getColumnModel().getColumn(0).setMaxWidth(0);
            tblProduct_1.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tétel:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Egységár:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Egység:");

        txtProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd_2.setText("Hozzáad");
        btnAdd_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_2ActionPerformed(evt);
            }
        });

        btnMod_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMod_2.setText("Módosít");
        btnMod_2.setPreferredSize(new java.awt.Dimension(83, 25));

        btn_Del_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Del_2.setText("Töröl");
        btn_Del_2.setPreferredSize(new java.awt.Dimension(83, 25));

        javax.swing.GroupLayout jtpProductLayout = new javax.swing.GroupLayout(jtpProduct);
        jtpProduct.setLayout(jtpProductLayout);
        jtpProductLayout.setHorizontalGroup(
            jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jtpProductLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(txtProduct))
                    .addGroup(jtpProductLayout.createSequentialGroup()
                        .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtpProductLayout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(btnAdd_2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Del_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addContainerGap())
        );

        jtpProductLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd_2, btnMod_2, btn_Del_2});

        jtpProductLayout.setVerticalGroup(
            jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpProductLayout.createSequentialGroup()
                        .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd_2)
                        .addComponent(btnMod_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Del_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(btnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnTable, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
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

        btnTable.getAccessibleContext().setAccessibleDescription("");
        jtpBase.getAccessibleContext().setAccessibleName("Restaurant");
        jtpBase.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_1ActionPerformed
        ab.asztal_hozzaad(Integer.parseInt(txtTable.getText()), Integer.parseInt(txtChair.getText()),txtPlace.getText());
        ab.asztal_be(tblTable_1);
            asztal_max_kijelol();
            txtTable.requestFocus();
            txtTable.selectAll();
    }//GEN-LAST:event_btnAdd_1ActionPerformed

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        jtpBase.setSelectedIndex(1);
    }//GEN-LAST:event_btnTableActionPerformed

    private void btnAdd_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_2ActionPerformed
        ab.tetel_hozzaad(txtProduct.getText(), Integer.parseInt(txtPrice.getText()), txtUnit.getText());
        ab.tetelek_be(tblProduct_1);
            tetelek_max_kijelol();    
            txtProduct.requestFocus();
            txtProduct.selectAll();
    }//GEN-LAST:event_btnAdd_2ActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        jtpBase.setSelectedIndex(3);
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        jtpBase.setSelectedIndex(2);
    }//GEN-LAST:event_btnProfileActionPerformed

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
    private javax.swing.JButton btnAdd_2;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnDel_1;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMod_1;
    private javax.swing.JButton btnMod_2;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btn_Del_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTable tblProduct_1;
    private javax.swing.JTable tblTable_1;
    private javax.swing.JTextField txtChair;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtTable;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
