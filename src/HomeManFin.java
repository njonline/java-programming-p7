
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author daniele
 */
public class HomeManFin extends javax.swing.JFrame implements Observer {
	
	private static final long serialVersionUID = -672205673403473842L;
	private static Administrator administrator;

	/**
     * Creates new form NewJFrame
     */
    public HomeManFin() {
        initComponents();
        layerAddEmp.setVisible(false);
        layerEmpCard.setVisible(false);
        layerDeleteEmp.setVisible(false);
        layerGenRev.setVisible(false);
        layerEmpRev.setVisible(false);
        empCardSaveButton.setVisible(false);
    }

    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        exitButton24 = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        manTab = new javax.swing.JTabbedPane();
        manEmp = new javax.swing.JPanel();
        manToolPanel1 = new javax.swing.JPanel();
        searchEmpPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchEmpField = new javax.swing.JTextField();
        javax.swing.JButton SearchEmpButton = new javax.swing.JButton();
        newEmpPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JButton NewEmpButton = new javax.swing.JButton();
        manStagePanel1 = new javax.swing.JPanel();
        layerAddEmp = new javax.swing.JLayeredPane();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createEmpNameField = new javax.swing.JTextField();
        createEmpSurnameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        createEmpAddressField = new javax.swing.JTextField();
        repeatEmpPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        createEmpPasswordField = new javax.swing.JTextField();
        createEmpNumberField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        createEmployeeButton = new javax.swing.JButton();
        layerEmpCard = new javax.swing.JLayeredPane();
        empCard = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        iDField = new javax.swing.JTextField();
        empSurnameField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        empAddressField = new javax.swing.JTextField();
        empNumberField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        empCardEditButton = new javax.swing.JButton();
        empCardSaveButton = new javax.swing.JButton();
        empNameField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        layerDeleteEmp = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        deleteEmployeeButton = new javax.swing.JButton();
        salRev = new javax.swing.JPanel();
        manToolPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        searchEmpSalesField = new javax.swing.JTextField();
        javax.swing.JButton SearchEmpSalesButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        javax.swing.JButton TotalSalesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        manStagePanel2 = new javax.swing.JPanel();
        layerEmpRev = new javax.swing.JLayeredPane();
        addPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empSalesTextField = new javax.swing.JTextPane();
        jLabel39 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        empNameSalesField = new javax.swing.JTextField();
        empIDSalesField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        layerGenRev = new javax.swing.JLayeredPane();
        addPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel40 = new javax.swing.JLabel();
        perPro = new javax.swing.JPanel();
        manToolPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        javax.swing.JButton EditPerProfileButton = new javax.swing.JButton();
        manStagePanel3 = new javax.swing.JPanel();
        addPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        manNameField = new javax.swing.JTextField();
        manSurnameField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        manAddressField = new javax.swing.JTextField();
        manNewRepPasswordField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        manNewPasswordField = new javax.swing.JTextField();
        manNumberField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        saveManButton = new javax.swing.JButton();
        footerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setMaximumSize(new java.awt.Dimension(619, 265));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("STKaiti", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Mormors Kager");

        title1.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Manager");

        exitButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exitButton24.setToolTipText("");
        exitButton24.setMaximumSize(new java.awt.Dimension(56, 49));
        exitButton24.setMinimumSize(new java.awt.Dimension(56, 49));
        exitButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(title)
                .addGap(15, 15, 15)
                .addComponent(title1))
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        manTab.setBackground(new java.awt.Color(204, 204, 204));
        manTab.setPreferredSize(new java.awt.Dimension(1270, 700));

        manEmp.setBackground(new java.awt.Color(204, 204, 204));

        manToolPanel1.setMaximumSize(new java.awt.Dimension(616, 594));

        searchEmpPanel.setBackground(new java.awt.Color(204, 204, 204));
        searchEmpPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manageemployee.png"))); // NOI18N

        searchEmpField.setToolTipText("Insert ID number or name");

        SearchEmpButton.setText("Search Employee");
        SearchEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchEmpPanelLayout = new javax.swing.GroupLayout(searchEmpPanel);
        searchEmpPanel.setLayout(SearchEmpPanelLayout);
        SearchEmpPanelLayout.setHorizontalGroup(
            SearchEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmpPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(SearchEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SearchEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchEmpField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchEmpPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        SearchEmpPanelLayout.setVerticalGroup(
            SearchEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchEmpPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchEmpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchEmpButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        newEmpPanel.setBackground(new java.awt.Color(204, 204, 204));
        newEmpPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newEmpPanel.setMaximumSize(new java.awt.Dimension(619, 284));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hire.png"))); // NOI18N

        NewEmpButton.setText("New Employee");
        NewEmpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewEmpButtonMouseClicked(evt);
            }
        });
        NewEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewEmpPanelLayout = new javax.swing.GroupLayout(newEmpPanel);
        newEmpPanel.setLayout(NewEmpPanelLayout);
        NewEmpPanelLayout.setHorizontalGroup(
            NewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewEmpPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(NewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewEmpPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6))
                    .addComponent(NewEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewEmpPanelLayout.setVerticalGroup(
            NewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewEmpPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewEmpButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManToolPanel1Layout = new javax.swing.GroupLayout(manToolPanel1);
        manToolPanel1.setLayout(ManToolPanel1Layout);
        ManToolPanel1Layout.setHorizontalGroup(
            ManToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManToolPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ManToolPanel1Layout.setVerticalGroup(
            ManToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManToolPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchEmpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        manStagePanel1.setBackground(new java.awt.Color(204, 204, 204));

        addPanel.setBackground(new java.awt.Color(215, 239, 215));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hire.png"))); // NOI18N

        jLabel8.setText("Create Employee");

        jLabel4.setText("Name");

        createEmpNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmpNameFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Surname");

        createEmpAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmpAddressFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Repeat Password");

        jLabel11.setText("Assign Password");

        jLabel12.setText("Telephone number");

        jLabel13.setText("Address");

        createEmployeeButton.setText("Create");
        createEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(createEmpNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(createEmpSurnameField)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(createEmpNumberField)
                            .addComponent(jLabel13)
                            .addComponent(createEmpAddressField)
                            .addComponent(createEmpPasswordField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                                .addComponent(createEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(repeatEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmpSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmpAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmpNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createEmpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repeatEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(createEmployeeButton)
                .addContainerGap())
        );

        layerAddEmp.setLayer(addPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerAddEmpLayout = new javax.swing.GroupLayout(layerAddEmp);
        layerAddEmp.setLayout(LayerAddEmpLayout);
        LayerAddEmpLayout.setHorizontalGroup(
            LayerAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerAddEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayerAddEmpLayout.setVerticalGroup(
            LayerAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerAddEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        empCard.setBackground(new java.awt.Color(179, 229, 229));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hire.png"))); // NOI18N

        jLabel19.setText("Name");

        iDField.setEnabled(false);
        iDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        empSurnameField.setEnabled(false);

        jLabel20.setText("Surname");

        empAddressField.setEnabled(false);

        empNumberField.setEnabled(false);

        jLabel23.setText("Telephone number");

        jLabel24.setText("Address");

        empCardEditButton.setText("Edit");
        empCardEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpCardEditButtonActionPerformed(evt);
            }
        });

        empCardSaveButton.setText("Save");
        empCardSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpCardSaveButtonActionPerformed(evt);
            }
        });

        empNameField.setEnabled(false);
        empNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameFieldActionPerformed(evt);
            }
        });

        jLabel35.setText("ID");

        javax.swing.GroupLayout EmpCardLayout = new javax.swing.GroupLayout(empCard);
        empCard.setLayout(EmpCardLayout);
        EmpCardLayout.setHorizontalGroup(
            EmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpCardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(240, 240, 240))
                    .addGroup(EmpCardLayout.createSequentialGroup()
                        .addComponent(empCardEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(empCardSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(EmpCardLayout.createSequentialGroup()
                        .addGroup(EmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iDField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(empSurnameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empAddressField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EmpCardLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        EmpCardLayout.setVerticalGroup(
            EmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpCardLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(34, 34, 34)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(EmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empCardEditButton)
                    .addComponent(empCardSaveButton))
                .addContainerGap())
        );

        empAddressField.getAccessibleContext().setAccessibleName("");
        empNumberField.getAccessibleContext().setAccessibleName("");

        layerEmpCard.setLayer(empCard, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerEmpCardLayout = new javax.swing.GroupLayout(layerEmpCard);
        layerEmpCard.setLayout(LayerEmpCardLayout);
        LayerEmpCardLayout.setHorizontalGroup(
            LayerEmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LayerEmpCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LayerEmpCardLayout.setVerticalGroup(
            LayerEmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerEmpCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(230, 134, 134));

        jLabel21.setText("Delete Employee");

        deleteEmployeeButton.setText("Delete");
        deleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(39, 39, 39))
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(deleteEmployeeButton)
                .addContainerGap())
        );

        layerDeleteEmp.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerDeleteEmpLayout = new javax.swing.GroupLayout(layerDeleteEmp);
        layerDeleteEmp.setLayout(LayerDeleteEmpLayout);
        LayerDeleteEmpLayout.setHorizontalGroup(
            LayerDeleteEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerDeleteEmpLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LayerDeleteEmpLayout.setVerticalGroup(
            LayerDeleteEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerDeleteEmpLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ManStagePanel1Layout = new javax.swing.GroupLayout(manStagePanel1);
        manStagePanel1.setLayout(ManStagePanel1Layout);
        ManStagePanel1Layout.setHorizontalGroup(
            ManStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManStagePanel1Layout.createSequentialGroup()
                .addGroup(ManStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layerAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layerEmpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layerDeleteEmp)
                .addContainerGap())
        );
        ManStagePanel1Layout.setVerticalGroup(
            ManStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(layerEmpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ManStagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layerDeleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ManEmpLayout = new javax.swing.GroupLayout(manEmp);
        manEmp.setLayout(ManEmpLayout);
        ManEmpLayout.setHorizontalGroup(
            ManEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManEmpLayout.createSequentialGroup()
                .addComponent(manToolPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manStagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManEmpLayout.setVerticalGroup(
            ManEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManEmpLayout.createSequentialGroup()
                .addGroup(ManEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manToolPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manStagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        manTab.addTab("Manage Employee", manEmp);

        salRev.setBackground(new java.awt.Color(204, 204, 204));

        manToolPanel2.setMaximumSize(new java.awt.Dimension(616, 594));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revenue.png"))); // NOI18N

        searchEmpSalesField.setToolTipText("Insert ID number or name");

        SearchEmpSalesButton.setText("Search Employee");
        SearchEmpSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmpSalesButtonActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manageemployee.png"))); // NOI18N

        jLabel1.setText("Employee Sales");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchEmpSalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchEmpSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchEmpSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchEmpSalesButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel9.setMaximumSize(new java.awt.Dimension(619, 284));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revenue.png"))); // NOI18N

        TotalSalesButton.setText("Show");
        TotalSalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSalesButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("General Sales");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel16))
                            .addComponent(TotalSalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalSalesButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManToolPanel2Layout = new javax.swing.GroupLayout(manToolPanel2);
        manToolPanel2.setLayout(ManToolPanel2Layout);
        ManToolPanel2Layout.setHorizontalGroup(
            ManToolPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManToolPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManToolPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ManToolPanel2Layout.setVerticalGroup(
            ManToolPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManToolPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        manStagePanel2.setBackground(new java.awt.Color(204, 204, 204));

        layerEmpRev.setBackground(new java.awt.Color(204, 204, 204));

        addPanel2.setBackground(new java.awt.Color(238, 229, 187));

        jScrollPane2.setViewportView(empSalesTextField);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revenue.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N

        jLabel22.setText("Name");

        empNameSalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        empIDSalesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setText("ID");

        javax.swing.GroupLayout AddPanel2Layout = new javax.swing.GroupLayout(addPanel2);
        addPanel2.setLayout(AddPanel2Layout);
        AddPanel2Layout.setHorizontalGroup(
            AddPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel39)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanel2Layout.createSequentialGroup()
                        .addGroup(AddPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddPanel2Layout.createSequentialGroup()
                                .addGroup(AddPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel25)
                                    .addComponent(empIDSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AddPanel2Layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addComponent(jLabel34)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(empNameSalesField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        AddPanel2Layout.setVerticalGroup(
            AddPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNameSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empIDSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        layerEmpRev.setLayer(addPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerEmpRevLayout = new javax.swing.GroupLayout(layerEmpRev);
        layerEmpRev.setLayout(LayerEmpRevLayout);
        LayerEmpRevLayout.setHorizontalGroup(
            LayerEmpRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerEmpRevLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayerEmpRevLayout.setVerticalGroup(
            LayerEmpRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayerEmpRevLayout.createSequentialGroup()
                .addComponent(addPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        addPanel4.setBackground(new java.awt.Color(51, 255, 51));

        jScrollPane3.setViewportView(jTextPane3);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revenue.png"))); // NOI18N

        javax.swing.GroupLayout AddPanel4Layout = new javax.swing.GroupLayout(addPanel4);
        addPanel4.setLayout(AddPanel4Layout);
        AddPanel4Layout.setHorizontalGroup(
            AddPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanel4Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel40)
                        .addGap(218, 218, 218))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        AddPanel4Layout.setVerticalGroup(
            AddPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        layerGenRev.setLayer(addPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayerGenRevLayout = new javax.swing.GroupLayout(layerGenRev);
        layerGenRev.setLayout(LayerGenRevLayout);
        LayerGenRevLayout.setHorizontalGroup(
            LayerGenRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(LayerGenRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LayerGenRevLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        LayerGenRevLayout.setVerticalGroup(
            LayerGenRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(LayerGenRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LayerGenRevLayout.createSequentialGroup()
                    .addComponent(addPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 91, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ManStagePanel2Layout = new javax.swing.GroupLayout(manStagePanel2);
        manStagePanel2.setLayout(ManStagePanel2Layout);
        ManStagePanel2Layout.setHorizontalGroup(
            ManStagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerEmpRev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(layerGenRev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ManStagePanel2Layout.setVerticalGroup(
            ManStagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManStagePanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(layerEmpRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(layerGenRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout SalRevLayout = new javax.swing.GroupLayout(salRev);
        salRev.setLayout(SalRevLayout);
        SalRevLayout.setHorizontalGroup(
            SalRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalRevLayout.createSequentialGroup()
                .addComponent(manToolPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manStagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(551, 551, 551))
        );
        SalRevLayout.setVerticalGroup(
            SalRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalRevLayout.createSequentialGroup()
                .addGroup(SalRevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manToolPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manStagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manTab.addTab("Sales & Revenue", salRev);

        perPro.setBackground(new java.awt.Color(204, 204, 204));

        manToolPanel3.setMaximumSize(new java.awt.Dimension(616, 594));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel13.setMaximumSize(new java.awt.Dimension(619, 284));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N

        EditPerProfileButton.setText("Edit Profile");
        EditPerProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPerProfileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel26))
                    .addComponent(EditPerProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditPerProfileButton)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ManToolPanel3Layout = new javax.swing.GroupLayout(manToolPanel3);
        manToolPanel3.setLayout(ManToolPanel3Layout);
        ManToolPanel3Layout.setHorizontalGroup(
            ManToolPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManToolPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManToolPanel3Layout.setVerticalGroup(
            ManToolPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManToolPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        manStagePanel3.setBackground(new java.awt.Color(204, 204, 204));

        addPanel3.setBackground(new java.awt.Color(179, 229, 229));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N

        jLabel28.setText("Manager");

        jLabel29.setText("Name");

        jLabel30.setText("Surname");

        jLabel31.setText("Repeat Password");

        jLabel32.setText("New Password");

        jLabel33.setText("Telephone number");

        jLabel53.setText("Address");

        saveManButton.setText("Save");

        javax.swing.GroupLayout AddPanel3Layout = new javax.swing.GroupLayout(addPanel3);
        addPanel3.setLayout(AddPanel3Layout);
        AddPanel3Layout.setHorizontalGroup(
            AddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanel3Layout.createSequentialGroup()
                .addGroup(AddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29)
                            .addComponent(manNameField)
                            .addComponent(manSurnameField)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33)
                            .addComponent(manNumberField)
                            .addComponent(jLabel53)
                            .addComponent(manAddressField)
                            .addComponent(manNewPasswordField)
                            .addComponent(manNewRepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(saveManButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(AddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddPanel3Layout.setVerticalGroup(
            AddPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manNewRepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(saveManButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout ManStagePanel3Layout = new javax.swing.GroupLayout(manStagePanel3);
        manStagePanel3.setLayout(ManStagePanel3Layout);
        ManStagePanel3Layout.setHorizontalGroup(
            ManStagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManStagePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        ManStagePanel3Layout.setVerticalGroup(
            ManStagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManStagePanel3Layout.createSequentialGroup()
                .addComponent(addPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PerProLayout = new javax.swing.GroupLayout(perPro);
        perPro.setLayout(PerProLayout);
        PerProLayout.setHorizontalGroup(
            PerProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerProLayout.createSequentialGroup()
                .addComponent(manToolPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manStagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PerProLayout.setVerticalGroup(
            PerProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerProLayout.createSequentialGroup()
                .addGroup(PerProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manToolPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PerProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manStagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        manTab.addTab("Personal Profile", perPro);

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manTab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manTab, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        footerPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void SearchEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {
       layerAddEmp.setVisible(false);
       layerEmpCard.setVisible(true);
       layerDeleteEmp.setVisible(true);
    }
    
    private void NewEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void EditPerProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void SearchEmpSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	layerGenRev.setVisible(false);
        layerEmpRev.setVisible(true);    }

    private void TotalSalesButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	layerGenRev.setVisible(true);
        layerEmpRev.setVisible(false);
    }

    private void CreateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        administrator.createEmployee();
    }

    private void EmpCardEditButtonActionPerformed(java.awt.event.ActionEvent evt) {
        empCardSaveButton.setVisible(true);
        empAddressField.setEnabled(true);
        empNumberField.setEnabled(true); 
    }

    private void NewEmpButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	layerAddEmp.setVisible(true);
    	layerEmpCard.setVisible(false);
    	layerDeleteEmp.setVisible(false);
    }

    private void EmpCardSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpCardSaveButtonActionPerformed
    
        if (empAddressField.getText().equals("") & empAddressField.getText().equals("")) {
        	empAddressField.setBackground(Color.red);
        	empNumberField.setBackground(Color.red);
        }
        else {
        	empAddressField.setEnabled(false);
            empNumberField.setEnabled(false);
        }
    }

    private void DeleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ExitButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        //exit method
        int exit=JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO EXIT?");
        if(exit==0){
            System.exit(0);   }
    }

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EmpNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CreateEmpNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CreateEmpAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    public static String getEmployeeName() {
    	return createEmpNameField.getText();
    }
    
    public static String getEmployeeSurname() {
    	return createEmpSurnameField.getText();
    }
    
    public static String getEmployeeAddress() {
    	return createEmpAddressField.getText();
    }
    
    public static String getEmployeePhone() {
    	return createEmpNumberField.getText();
    }
    
    public static String getEmployeePassword() {
    	return createEmpPasswordField.getText();
    }
    
    public static String getEmployeePasswordConfirmed() {
    	return repeatEmpPassword.getText();
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	
    	administrator = new Administrator();
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogManFin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogManFin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogManFin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogManFin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeManFin().setVisible(true);
                  
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel addPanel2;
    private javax.swing.JPanel addPanel3;
    private javax.swing.JPanel addPanel4;
    private javax.swing.JPanel bodyPanel;
    private static javax.swing.JTextField createEmpNameField;
    private static javax.swing.JTextField createEmpSurnameField;
    private static javax.swing.JTextField createEmpAddressField;
    private static javax.swing.JTextField createEmpNumberField;
    private static javax.swing.JTextField createEmpPasswordField;
    private static javax.swing.JTextField repeatEmpPassword;
    private static javax.swing.JButton createEmployeeButton;
    private static javax.swing.JButton deleteEmployeeButton;
    private static javax.swing.JTextField empAddressField;
    private javax.swing.JPanel empCard;
    private javax.swing.JButton empCardEditButton;
    private javax.swing.JButton empCardSaveButton;
    private javax.swing.JTextField empIDSalesField;
    private javax.swing.JTextField empNameField;
    private javax.swing.JTextField empNameSalesField;
    private javax.swing.JTextField empNumberField;
    private javax.swing.JTextPane empSalesTextField;
    private javax.swing.JTextField empSurnameField;
    private javax.swing.JButton exitButton24;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField iDField;
    private javax.swing.JLayeredPane layerAddEmp;
    private javax.swing.JLayeredPane layerDeleteEmp;
    private javax.swing.JLayeredPane layerEmpCard;
    private javax.swing.JLayeredPane layerEmpRev;
    private javax.swing.JLayeredPane layerGenRev;
    private javax.swing.JTextField manAddressField;
    private javax.swing.JPanel manEmp;
    private javax.swing.JTextField manNameField;
    private javax.swing.JTextField manNewPasswordField;
    private javax.swing.JTextField manNewRepPasswordField;
    private javax.swing.JTextField manNumberField;
    private javax.swing.JPanel manStagePanel1;
    private javax.swing.JPanel manStagePanel2;
    private javax.swing.JPanel manStagePanel3;
    private javax.swing.JTextField manSurnameField;
    private javax.swing.JTabbedPane manTab;
    private javax.swing.JPanel manToolPanel1;
    private javax.swing.JPanel manToolPanel2;
    private javax.swing.JPanel manToolPanel3;
    private javax.swing.JPanel newEmpPanel;
    private javax.swing.JPanel perPro;
    private javax.swing.JPanel salRev;
    private javax.swing.JButton saveManButton;
    private javax.swing.JTextField searchEmpField;
    private javax.swing.JPanel searchEmpPanel;
    private javax.swing.JTextField searchEmpSalesField;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables

    private void paint(JPanel StagePanel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void update() {

    }
    
	public void update(Observable o, Object arg) {
		update();
	}
}
