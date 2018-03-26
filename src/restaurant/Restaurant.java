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
        ab.asztal_be(tblTable_1, cbxTable_3);
        ab.tetelek_be(tblProduct_1, cbxProduct_3);
        ab.rendeles_be(tblOrder);
    }
    
    /**
     * Ha kijelölünk egy sort az asztalok táblában, akkor kimásolja a beviteli mezőkbe.
     */
    private void asztalok_tablabol() {
        int i = tblTable_1.getSelectedRow();
        txtTable.setText(tblTable_1.getValueAt(i, 0).toString());
        txtChair.setText(tblTable_1.getValueAt(i, 1).toString());
        Object e = tblTable_1.getValueAt(i, 2);
        if (e != null)
            txtPlace.setText(e.toString());
        else 
            txtPlace.setText("");
    }
    
    private void tetelek_tablabol() {
        int i = tblProduct_1.getSelectedRow();
        txtProduct.setText(tblProduct_1.getValueAt(i, 1).toString());
        txtPrice.setText(tblProduct_1.getValueAt(i, 2).toString());
        Object e = tblProduct_1.getValueAt(i, 3);
        if (e != null)
            txtUnit.setText(e.toString());
        else 
            txtUnit.setText("");
    }
    
    private void rendelesek_tablabol() {
        int i = tblOrder.getSelectedRow();
        String asztal = tblOrder.getValueAt(i, 1).toString();
        String tetel = tblOrder.getValueAt(i, 2).toString();
        cbxTable_3.setSelectedItem(asztal);
        cbxProduct_3.setSelectedItem(tetel);
        Object a = tblOrder.getValueAt(i, 3);
        if (a != null) 
            txtPiece_3.setText(a.toString());
        else
            txtPiece_3.setText("");
        Object b = tblOrder.getValueAt(i, 4);
        if (b != null) 
            txtPrice_3.setText(b.toString());
        else
            txtPrice_3.setText("");
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
     
    private void rendeles_max_kijelol() {
        int sordb = tblOrder.getRowCount();
        int max = 0;
        int sor = 0;
        for (int i = 0; i < sordb; i++) {
            int n = Integer.parseInt(tblOrder.getValueAt(i, 0).toString());
            if (n > max) {
                max = n;
                sor = i;
            }
        }
        tblOrder.setRowSelectionInterval(sor, sor);
        rendelesek_tablabol();
    }
     
    private void asztal_kijelol(int tbl) {
        int sordb = tblTable_1.getRowCount();
        for (int i = 0; i < sordb; i++) {
            int tb = Integer.parseInt(tblTable_1.getValueAt(i, 0).toString());
            if (tb == tbl) {
                    tblTable_1.setRowSelectionInterval(i, i);
                    asztalok_tablabol();
                    break;
            }
        }
    }
    
    private void tetelek_kijelol(int ttl) {
        int sordb = tblProduct_1.getRowCount();
        for (int i = 0; i < sordb; i++) {
            int pid = Integer.parseInt(tblProduct_1.getValueAt(i, 0).toString());
            if (pid == ttl) {
                tblProduct_1.setRowSelectionInterval(i, i);
                tetelek_tablabol();
                break;
            }
        }
    }
    
    private void szumma() {
        int szum = 0;
        for (int i = 0; i < tblOrder.getRowCount(); i++)
            szum += Integer.parseInt(tblOrder.getValueAt(i, 4).toString());
        txtSzum.setText(String.format("%,d Ft", szum));
    }
    
    private void help() {
        Help h = new Help(this, true);
        h.setVisible(true);
    }
    
    private int egysegar(String nev) {
        int db = tblProduct_1.getRowCount();
        for (int i = 0; i < db; i++) {
            String s = tblProduct_1.getValueAt(i, 1).toString();
            if (nev.equals(s))
                return Integer.parseInt(tblProduct_1.getValueAt(i, 2).toString());
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnOrder = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btn = new javax.swing.JTabbedPane();
        jtpOrder = new javax.swing.JPanel();
        cbxTable_3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxProduct_3 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtPiece_3 = new javax.swing.JTextField();
        btnAdd_3 = new javax.swing.JButton();
        btnMod_3 = new javax.swing.JButton();
        btnDel_3 = new javax.swing.JButton();
        btnBill_1 = new javax.swing.JButton();
        btnSave_1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtSzum = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrice_3 = new javax.swing.JTextField();
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
        jLabel10 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JTextField();
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
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 640));
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/notes32.png"))); // NOI18N
        btnOrder.setText("Rendelés");
        btnOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setMaximumSize(new java.awt.Dimension(50, 55));
        btnOrder.setMinimumSize(new java.awt.Dimension(50, 55));
        btnOrder.setPreferredSize(new java.awt.Dimension(60, 55));
        btnOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 11, 0, 10);
        getContentPane().add(btnOrder, gridBagConstraints);

        btnTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setText("Asztalok");
        btnTable.setAutoscrolls(true);
        btnTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTable.setMaximumSize(new java.awt.Dimension(50, 55));
        btnTable.setMinimumSize(new java.awt.Dimension(50, 55));
        btnTable.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/dining_table.png"))); // NOI18N
        btnTable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnTable, gridBagConstraints);
        btnTable.getAccessibleContext().setAccessibleDescription("");

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnProfile, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnProduct, gridBagConstraints);

        btnBill.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/bill.png"))); // NOI18N
        btnBill.setText("Számla");
        btnBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnBill, gridBagConstraints);

        btnReport.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/report.png"))); // NOI18N
        btnReport.setText("Kimutatás");
        btnReport.setToolTipText("");
        btnReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnReport, gridBagConstraints);

        btnOption.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/settings.png"))); // NOI18N
        btnOption.setText("Beállítások");
        btnOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOption.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 0, 10);
        getContentPane().add(btnOption, gridBagConstraints);

        btnHelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant/help.png"))); // NOI18N
        btnHelp.setText("Súgó");
        btnHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 11, 11, 10);
        getContentPane().add(btnHelp, gridBagConstraints);

        btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtpOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxTable_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Asztal:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tetel:");

        cbxProduct_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxProduct_3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProduct_3ItemStateChanged(evt);
            }
        });

        tblOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rendelesID", "Asztal", "Tétel", "Mennyiség", "Egységár"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(0).setMinWidth(0);
            tblOrder.getColumnModel().getColumn(0).setMaxWidth(0);
            tblOrder.getColumnModel().getColumn(1).setPreferredWidth(40);
            tblOrder.getColumnModel().getColumn(2).setPreferredWidth(400);
        }

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mennyiség:");

        txtPiece_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd_3.setText("Hozzáad");
        btnAdd_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_3ActionPerformed(evt);
            }
        });

        btnMod_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMod_3.setText("Módosít");
        btnMod_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod_3ActionPerformed(evt);
            }
        });

        btnDel_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDel_3.setText("Töröl");
        btnDel_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel_3ActionPerformed(evt);
            }
        });

        btnBill_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBill_1.setText("Számla");

        btnSave_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave_1.setText("Ment");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Végösszeg:");

        txtSzum.setBackground(new java.awt.Color(0, 51, 153));
        txtSzum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSzum.setForeground(new java.awt.Color(255, 255, 255));
        txtSzum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSzum.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Egységár:");

        txtPrice_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice_3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jtpOrderLayout = new javax.swing.GroupLayout(jtpOrder);
        jtpOrder.setLayout(jtpOrderLayout);
        jtpOrderLayout.setHorizontalGroup(
            jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpOrderLayout.createSequentialGroup()
                        .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtpOrderLayout.createSequentialGroup()
                                .addComponent(cbxTable_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbxProduct_3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jtpOrderLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPiece_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jtpOrderLayout.createSequentialGroup()
                        .addComponent(btnSave_1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jtpOrderLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSzum))
                            .addComponent(btnBill_1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jtpOrderLayout.setVerticalGroup(
            jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxTable_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxProduct_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPiece_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod_3)
                    .addComponent(btnDel_3)
                    .addComponent(btnAdd_3)
                    .addComponent(jLabel14)
                    .addComponent(txtPrice_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jtpOrderLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtSzum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBill_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn.addTab("Rendelés", jtpOrder);

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
        tblTable_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTable_1MouseClicked(evt);
            }
        });
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
        btnMod_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod_1ActionPerformed(evt);
            }
        });

        btnDel_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDel_1.setMnemonic('T');
        btnDel_1.setText("Töröl");
        btnDel_1.setToolTipText("");
        btnDel_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtpTableLayout = new javax.swing.GroupLayout(jtpTable);
        jtpTable.setLayout(jtpTableLayout);
        jtpTableLayout.setHorizontalGroup(
            jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
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
                        .addComponent(btnAdd_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod_1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        btn.addTab("Asztalok", jtpTable);

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
        jButton1.setText("Hozzáad");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Módosít");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Töröl");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Mentés");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Jelszó ismét:");

        txtPass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass1.setPreferredSize(new java.awt.Dimension(300, 23));

        javax.swing.GroupLayout jtpProfileLayout = new javax.swing.GroupLayout(jtpProfile);
        jtpProfile.setLayout(jtpProfileLayout);
        jtpProfileLayout.setHorizontalGroup(
            jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpProfileLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        btn.addTab("Felhasználók", jtpProfile);

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
        tblProduct_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProduct_1MouseClicked(evt);
            }
        });
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
        btnMod_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod_2ActionPerformed(evt);
            }
        });

        btn_Del_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Del_2.setText("Töröl");
        btn_Del_2.setPreferredSize(new java.awt.Dimension(83, 25));
        btn_Del_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Del_2ActionPerformed(evt);
            }
        });

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
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 13, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn.addTab("Étlap/Itallap", jtpProduct);

        jtpBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpBillLayout = new javax.swing.GroupLayout(jtpBill);
        jtpBill.setLayout(jtpBillLayout);
        jtpBillLayout.setHorizontalGroup(
            jtpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        jtpBillLayout.setVerticalGroup(
            jtpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        btn.addTab("Számla", jtpBill);

        jtpReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpReport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jtpReportLayout = new javax.swing.GroupLayout(jtpReport);
        jtpReport.setLayout(jtpReportLayout);
        jtpReportLayout.setHorizontalGroup(
            jtpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        jtpReportLayout.setVerticalGroup(
            jtpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        btn.addTab("Kimutatás", jtpReport);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = -13;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 11, 0);
        getContentPane().add(btn, gridBagConstraints);
        btn.getAccessibleContext().setAccessibleName("Restaurant");
        btn.getAccessibleContext().setAccessibleDescription("");

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_1ActionPerformed
        ab.asztal_hozzaad(Integer.parseInt(txtTable.getText()), Integer.parseInt(txtChair.getText()),txtPlace.getText());
        ab.asztal_be(tblTable_1, cbxTable_3);
            asztal_max_kijelol();
            txtTable.requestFocus();
            txtTable.selectAll();
    }//GEN-LAST:event_btnAdd_1ActionPerformed

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        btn.setSelectedIndex(1);
    }//GEN-LAST:event_btnTableActionPerformed

    private void btnAdd_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_2ActionPerformed
        ab.tetel_hozzaad(txtProduct.getText(), Integer.parseInt(txtPrice.getText()), txtUnit.getText());
        ab.tetelek_be(tblProduct_1, cbxProduct_3);
            tetelek_max_kijelol();    
            txtProduct.requestFocus();
            txtProduct.selectAll();
    }//GEN-LAST:event_btnAdd_2ActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        btn.setSelectedIndex(3);
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        btn.setSelectedIndex(2);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        btn.setSelectedIndex(0);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void tblTable_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTable_1MouseClicked
        asztalok_tablabol();
    }//GEN-LAST:event_tblTable_1MouseClicked

    private void tblProduct_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProduct_1MouseClicked
        tetelek_tablabol();
    }//GEN-LAST:event_tblProduct_1MouseClicked

    private void btnMod_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod_1ActionPerformed
       int i = tblTable_1.getSelectedRow();
        if (i == -1) return;
        int tbl = Integer.parseInt(tblTable_1.getValueAt(i, 0).toString());
        int chr = Integer.parseInt(tblTable_1.getValueAt(i, 1).toString());
        if (ab.asztal_modosit(tbl, chr, txtPlace.getText())>0) {
            ab.asztal_be(tblTable_1, cbxTable_3);
        asztal_kijelol(tbl);
        }
    }//GEN-LAST:event_btnMod_1ActionPerformed

    private void btnDel_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel_1ActionPerformed
        int i = tblTable_1.getSelectedRow();
        if (i == -1) return;
        ab.asztal_torol(Integer.parseInt(tblTable_1.getValueAt(i, 0).toString()));
        ab.asztal_be(tblTable_1, cbxTable_3);
    }//GEN-LAST:event_btnDel_1ActionPerformed

    private void btnMod_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod_2ActionPerformed
        int i = tblProduct_1.getSelectedRow();
        if (i == -1) return;
        int prc = Integer.parseInt(tblProduct_1.getValueAt (i, 2).toString());
        if (ab.tetel_modosit(txtProduct.getText(), prc, txtUnit.getText())>0)
            ab.tetelek_be(tblProduct_1, cbxProduct_3);
        tetelek_kijelol(prc);
    }//GEN-LAST:event_btnMod_2ActionPerformed

    private void btn_Del_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Del_2ActionPerformed
        int i = tblProduct_1.getSelectedRow();
        if (i == -1) return;
        ab.tetel_torol(Integer.parseInt(tblProduct_1.getValueAt(i, 0).toString()));
        ab.tetelek_be(tblProduct_1, cbxProduct_3);
    }//GEN-LAST:event_btn_Del_2ActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        help();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        rendelesek_tablabol();
    }//GEN-LAST:event_tblOrderMouseClicked

    private void btnAdd_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_3ActionPerformed
        int tbl = Integer.parseInt(cbxTable_3.getSelectedItem().toString());
        String ttl = cbxProduct_3.getSelectedItem().toString();
        int p = get_tetelID(ttl);
        int n = ab.rendeles_hozzaad(tbl, p, Integer.parseInt(txtPiece_3.getText()));
        if (n > 0) {
            ab.rendeles_be(tblOrder);
            rendeles_max_kijelol();
            txtPiece_3.requestFocus();
        }
        szumma();
    }//GEN-LAST:event_btnAdd_3ActionPerformed

    private void cbxProduct_3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProduct_3ItemStateChanged
        String nev = (cbxProduct_3.getSelectedItem().toString());
        int ea = egysegar(nev);
        txtPrice_3.setText(ea+"");
    }//GEN-LAST:event_cbxProduct_3ItemStateChanged

    private void btnMod_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod_3ActionPerformed
        int i = tblOrder.getSelectedRow();
        if (i == -1) return; 
        int tbl = Integer.parseInt(cbxTable_3.getSelectedItem().toString());
        String ttl = cbxProduct_3.getSelectedItem().toString();
        int p = get_tetelID(ttl);
        int rid = Integer.parseInt(tblOrder.getValueAt(i, 0).toString());
        int n = ab.rendeles_modosit(rid, tbl, p, Integer.parseInt(txtPiece_3.getText()));
        if (n > 0) {
            ab.rendeles_be(tblOrder);
            rendeles_max_kijelol();
            txtPiece_3.requestFocus();
        }
        szumma();
    }//GEN-LAST:event_btnMod_3ActionPerformed

    private void btnDel_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel_3ActionPerformed
        int i = tblOrder.getSelectedRow();
        if (i == -1) return;
        ab.rendeles_torol(Integer.parseInt(tblOrder.getValueAt(i, 0).toString()));
        ab.rendeles_be(tblOrder);
            rendeles_max_kijelol();
            txtPiece_3.requestFocus();
            szumma();
    }//GEN-LAST:event_btnDel_3ActionPerformed

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
    private javax.swing.JTabbedPane btn;
    private javax.swing.JButton btnAdd_1;
    private javax.swing.JButton btnAdd_2;
    private javax.swing.JButton btnAdd_3;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnBill_1;
    private javax.swing.JButton btnDel_1;
    private javax.swing.JButton btnDel_3;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMod_1;
    private javax.swing.JButton btnMod_2;
    private javax.swing.JButton btnMod_3;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSave_1;
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btn_Del_2;
    private javax.swing.JComboBox<String> cbxProduct_3;
    private javax.swing.JComboBox<String> cbxTable_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenu jmOption;
    private javax.swing.JMenuItem jmbClose;
    private javax.swing.JMenuItem jmbOpen;
    private javax.swing.JMenuItem jmbSave;
    private javax.swing.JMenuItem jmbSaveas;
    private javax.swing.JPanel jtpBill;
    private javax.swing.JPanel jtpOrder;
    private javax.swing.JPanel jtpProduct;
    private javax.swing.JPanel jtpProfile;
    private javax.swing.JPanel jtpReport;
    private javax.swing.JPanel jtpTable;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProduct_1;
    private javax.swing.JTable tblTable_1;
    private javax.swing.JTextField txtChair;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPass1;
    private javax.swing.JTextField txtPiece_3;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice_3;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtSzum;
    private javax.swing.JTextField txtTable;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
