import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class HomeEmpFin extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private Administrator admin;
	private EmployeeDB employeedb;
	private Request request;
	private RequestDB requestdb;
	private CupcakeDB cupcakedb ;
	private Cupcake cupcake;
	private String[] itemList;
	
    /**
     * Creates new form NewJFrame
     * @throws ParseException 
     */
    public HomeEmpFin() throws ParseException {
    	request = new Request();
    	requestdb = new RequestDB();
    	employeedb = new EmployeeDB();
    	admin = new Administrator();
    	admin.addEmployeeOnStartup();
    	cupcakedb = new CupcakeDB();
    	cupcakedb.addCakesToComboBox();
    	cupcake = new Cupcake();
    	cupcake.addProductOnStartup();
    	itemList = cupcakedb.cupcake.toArray(new String[]{});
        initComponents();
        cupcakedb.addCakesToInventory(inventoryTable1);
        requestdb.addRequestsOnStartup(PastOrderTable);
        requestdb.addRequestsToTable(PastOrderTable);
    	updateEmployeeRevenue();
        displayEmployeeInfo();
        layerNewOrder.setVisible(true);
        layerPastOrder.setVisible(false);
    }

    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        empPanel = new javax.swing.JTabbedPane();
        order = new javax.swing.JPanel();
        empToolPanel1 = new javax.swing.JPanel();
        newOrderPanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        javax.swing.JButton newOrderButton = new javax.swing.JButton();
        pastOrderPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JButton viewPastOrderButton = new javax.swing.JButton();
        empStagePanel1 = new javax.swing.JPanel();
        layerPastOrder = new javax.swing.JLayeredPane();
        orderPastPanel = new javax.swing.JPanel();
        orderScrollPanel1 = new javax.swing.JScrollPane();
        PastOrderTable = new javax.swing.JTable();
        searchItemInvButton1 = new javax.swing.JButton();
        dateSearchField = new javax.swing.JFormattedTextField();
        layerNewOrder = new javax.swing.JLayeredPane();
        orderPanel = new javax.swing.JPanel();
        orderScrollPanel = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        itemOrderComboBox = new javax.swing.JComboBox<String>(itemList);
        spinnerModel = new javax.swing.SpinnerNumberModel(1, 1, 9, 1);
        itemOrderSpinner = new javax.swing.JSpinner(spinnerModel);
        addItemOrderButton = new javax.swing.JButton();
        totalOrderField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        discardOrderButton = new javax.swing.JButton();
        completeOrderButton = new javax.swing.JButton();
        removeItemOrderButton = new javax.swing.JButton();
        inventory = new javax.swing.JPanel();
        empToolPanel2 = new javax.swing.JPanel();
        itemInventory = new javax.swing.JPanel();
        searchItemInvField = new javax.swing.JTextField();
        searchItemInvButton = new javax.swing.JButton();
        itemNameInvField = new javax.swing.JTextField();
        itemNameInvField.setEnabled(false);
        itemPriceInvField = new javax.swing.JTextField();
        itemPriceInvField.setEnabled(false);
        itemQtyInvField = new javax.swing.JTextField();
        itemQtyInvField.setEnabled(false);
        itemChangeNameButton = new javax.swing.JButton();
        itemChangeQtyButton = new javax.swing.JButton();
        changePriceInvButton = new javax.swing.JButton();
        saveInvButton = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        empStagePanel2 = new javax.swing.JPanel();
        invScrollPanel = new javax.swing.JScrollPane();
        inventoryTable1 = new javax.swing.JTable();
        perPro = new javax.swing.JPanel();
        empToolPanel3 = new javax.swing.JPanel();
        editEmpProPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        javax.swing.JButton EditEmpPerProfileButton = new javax.swing.JButton();
        empStagePanel3 = new javax.swing.JPanel();
        AddPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        empNameField = new javax.swing.JTextField();
        empNameField.setEnabled(false);
        empSurnameField = new javax.swing.JTextField();
        empSurnameField.setEnabled(false);
        jLabel30 = new javax.swing.JLabel();
        empAddressField = new javax.swing.JTextField();
        empAddressField.setEnabled(false);
        empRepPasswordField = new javax.swing.JTextField();
        empRepPasswordField.setEnabled(false);
        jLabel31 = new javax.swing.JLabel();
        empNewPasswordField = new javax.swing.JTextField();
        empNewPasswordField.setEnabled(false);
        empNumberField = new javax.swing.JTextField();
        empNumberField.setEnabled(false);
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        saveEmpButton = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empPerSalesTextfield = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        createProduct = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productFlavor = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productQuantity = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        productFlavorLabel= new javax.swing.JLabel();
        productPriceLabel = new javax.swing.JLabel();
        productQuantityLabel = new javax.swing.JLabel();
        createProductButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setMaximumSize(new java.awt.Dimension(619, 265));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("STKaiti", 0, 48));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Mormors Kager");

        title1.setFont(new java.awt.Font("STKaiti", 0, 24));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Employee");
        
        empPerSalesTextfield.setFont(new java.awt.Font("STKaiti", 0, 24));
        empPerSalesTextfield.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exitButton.setToolTipText("");
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png")));
        exitButton.setMaximumSize(new java.awt.Dimension(56, 49));
        exitButton.setMinimumSize(new java.awt.Dimension(56, 49));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(title)
                .addGap(15, 15, 15)
                .addComponent(title1))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        empPanel.setBackground(new java.awt.Color(204, 204, 204));
        empPanel.setPreferredSize(new java.awt.Dimension(1270, 700));

        order.setBackground(new java.awt.Color(204, 204, 204));

        empToolPanel1.setMaximumSize(new java.awt.Dimension(616, 594));

        newOrderPanel.setBackground(new java.awt.Color(204, 204, 204));
        newOrderPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        newOrderButton.setText("New Order");
        newOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newOrderButtonMouseClicked(evt);
            }
        });
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newOrderPanelLayout = new javax.swing.GroupLayout(newOrderPanel);
        newOrderPanel.setLayout(newOrderPanelLayout);
        newOrderPanelLayout.setHorizontalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel35))
                    .addComponent(newOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newOrderPanelLayout.setVerticalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newOrderButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pastOrderPanel.setBackground(new java.awt.Color(204, 204, 204));
        pastOrderPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pastOrderPanel.setMaximumSize(new java.awt.Dimension(619, 284));

        viewPastOrderButton.setText("View Past Orders");
        viewPastOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPastOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pastOrderPanelLayout = new javax.swing.GroupLayout(pastOrderPanel);
        pastOrderPanel.setLayout(pastOrderPanelLayout);
        pastOrderPanelLayout.setHorizontalGroup(
            pastOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastOrderPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(pastOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pastOrderPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6))
                    .addComponent(viewPastOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pastOrderPanelLayout.setVerticalGroup(
            pastOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pastOrderPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPastOrderButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout empToolPanel1Layout = new javax.swing.GroupLayout(empToolPanel1);
        empToolPanel1.setLayout(empToolPanel1Layout);
        empToolPanel1Layout.setHorizontalGroup(
            empToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empToolPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pastOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        empToolPanel1Layout.setVerticalGroup(
            empToolPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empToolPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pastOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        empStagePanel1.setBackground(new java.awt.Color(204, 204, 204));

        orderPastPanel.setBackground(new java.awt.Color(215, 239, 215));

        PastOrderTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        PastOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Price", "Date"
            }
        ) {

			private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PastOrderTable.setGridColor(new java.awt.Color(204, 204, 204));
        PastOrderTable.getTableHeader().setReorderingAllowed(false);
        orderScrollPanel1.setViewportView(PastOrderTable);

        searchItemInvButton1.setText("Search Date");

        dateSearchField.setText("DD/MM/YYYY");

        javax.swing.GroupLayout orderPastPanelLayout = new javax.swing.GroupLayout(orderPastPanel);
        orderPastPanel.setLayout(orderPastPanelLayout);
        orderPastPanelLayout.setHorizontalGroup(
            orderPastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderScrollPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addGroup(orderPastPanelLayout.createSequentialGroup()
                        .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(searchItemInvButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        orderPastPanelLayout.setVerticalGroup(
            orderPastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPastPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(orderPastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemInvButton1)
                    .addComponent(dateSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(orderScrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        layerPastOrder.setLayer(orderPastPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerPastOrderLayout = new javax.swing.GroupLayout(layerPastOrder);
        layerPastOrder.setLayout(layerPastOrderLayout);
        layerPastOrderLayout.setHorizontalGroup(
            layerPastOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerPastOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPastPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layerPastOrderLayout.setVerticalGroup(
            layerPastOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerPastOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPastPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        orderPanel.setBackground(new java.awt.Color(215, 239, 215));

        orderTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Item", "Qty.", "Price", "Date"
            }
        ) {
            
			private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.setGridColor(new java.awt.Color(204, 204, 204));
        orderTable.getTableHeader().setReorderingAllowed(false);
        orderScrollPanel.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(1).setHeaderValue("Item");
            orderTable.getColumnModel().getColumn(2).setHeaderValue("Qty.");
            orderTable.getColumnModel().getColumn(3).setHeaderValue("Price");
        }

        itemOrderComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(itemList));
        
        addItemOrderButton.setText("Add");
        addItemOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemOrderButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        discardOrderButton.setText("Discard order");
        discardOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardOrderButtonActionPerformed(evt);
            }
        });

        completeOrderButton.setText("Complete order");
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        removeItemOrderButton.setText("Remove");
        removeItemOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(discardOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(itemOrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemOrderSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addItemOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeItemOrderButton))))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemOrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemOrderSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemOrderButton)
                    .addComponent(removeItemOrderButton))
                .addGap(18, 18, 18)
                .addComponent(orderScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discardOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        layerNewOrder.setLayer(orderPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerNewOrderLayout = new javax.swing.GroupLayout(layerNewOrder);
        layerNewOrder.setLayout(layerNewOrderLayout);
        layerNewOrderLayout.setHorizontalGroup(
            layerNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerNewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layerNewOrderLayout.setVerticalGroup(
            layerNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerNewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout empStagePanel1Layout = new javax.swing.GroupLayout(empStagePanel1);
        empStagePanel1.setLayout(empStagePanel1Layout);
        empStagePanel1Layout.setHorizontalGroup(
            empStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerNewOrder)
            .addGroup(empStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(empStagePanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(layerPastOrder)
                    .addContainerGap()))
        );
        empStagePanel1Layout.setVerticalGroup(
            empStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(empStagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empStagePanel1Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(layerPastOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addComponent(empToolPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empStagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empToolPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empStagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        empPanel.addTab("Manage Orders", order);

        inventory.setBackground(new java.awt.Color(204, 204, 204));

        empToolPanel2.setMaximumSize(new java.awt.Dimension(616, 594));

        itemInventory.setBackground(new java.awt.Color(204, 204, 204));
        itemInventory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        itemInventory.setMaximumSize(new java.awt.Dimension(619, 284));

        itemChangeNameButton.setText("Change Item Name");
        itemChangeNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChangeNameButtonActionPerformed(evt);
            }
        });

        itemChangeQtyButton.setText("Change Quantity");
        itemChangeQtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChangeQtyButtonActionPerformed(evt);
            }
        });

        changePriceInvButton.setText("Change Price");
        changePriceInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemChangePriceButtonActionPerformed(evt);
            }
        });

        saveInvButton.setText("Save Changes");
        saveInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInvButtonActionPerformed(evt);
            }
        });

        searchItemInvButton.setText("Search Item");
        searchItemInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemInvButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout itemInventoryLayout = new javax.swing.GroupLayout(itemInventory);
        itemInventory.setLayout(itemInventoryLayout);
        itemInventoryLayout.setHorizontalGroup(
            itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInventoryLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(searchItemInvField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemQtyInvField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemPriceInvField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameInvField))
                        .addGap(18, 18, 18)
                        .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemChangeNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemChangeQtyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePriceInvButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                        .addComponent(searchItemInvButton)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemInventoryLayout.createSequentialGroup()
                        .addComponent(saveInvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        itemInventoryLayout.setVerticalGroup(
            itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchItemInvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchItemInvButton)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameInvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemChangeNameButton))
                .addGap(40, 40, 40)
                .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemQtyInvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemChangeQtyButton))
                .addGap(40, 40, 40)
                .addGroup(itemInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceInvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePriceInvButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(saveInvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout empToolPanel2Layout = new javax.swing.GroupLayout(empToolPanel2);
        empToolPanel2.setLayout(empToolPanel2Layout);
        empToolPanel2Layout.setHorizontalGroup(
            empToolPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empToolPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        empToolPanel2Layout.setVerticalGroup(
            empToolPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empToolPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        empStagePanel2.setBackground(new java.awt.Color(204, 255, 204));

        inventoryTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        inventoryTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Item", "Qty.", "Price"
            }
        ) {

			private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable1.setGridColor(new java.awt.Color(204, 204, 204));
        inventoryTable1.getTableHeader().setReorderingAllowed(false);
        invScrollPanel.setViewportView(inventoryTable1);

        javax.swing.GroupLayout empStagePanel2Layout = new javax.swing.GroupLayout(empStagePanel2);
        empStagePanel2.setLayout(empStagePanel2Layout);
        empStagePanel2Layout.setHorizontalGroup(
            empStagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empStagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        empStagePanel2Layout.setVerticalGroup(
            empStagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empStagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inventoryLayout = new javax.swing.GroupLayout(inventory);
        inventory.setLayout(inventoryLayout);
        inventoryLayout.setHorizontalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addComponent(empToolPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empStagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        inventoryLayout.setVerticalGroup(
            inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryLayout.createSequentialGroup()
                .addGroup(inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empToolPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empStagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        empPanel.addTab("Inventory", inventory);

        perPro.setBackground(new java.awt.Color(204, 204, 204));

        empToolPanel3.setMaximumSize(new java.awt.Dimension(616, 594));

        editEmpProPanel.setBackground(new java.awt.Color(204, 204, 204));
        editEmpProPanel.setMaximumSize(new java.awt.Dimension(619, 284));

        EditEmpPerProfileButton.setText("Edit Profile");
        EditEmpPerProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpPerProfileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editEmpProPanelLayout = new javax.swing.GroupLayout(editEmpProPanel);
        editEmpProPanel.setLayout(editEmpProPanelLayout);
        editEmpProPanelLayout.setHorizontalGroup(
            editEmpProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmpProPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(editEmpProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editEmpProPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel26))
                    .addComponent(EditEmpPerProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        editEmpProPanelLayout.setVerticalGroup(
            editEmpProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmpProPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEmpPerProfileButton)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout empToolPanel3Layout = new javax.swing.GroupLayout(empToolPanel3);
        empToolPanel3.setLayout(empToolPanel3Layout);
        empToolPanel3Layout.setHorizontalGroup(
            empToolPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empToolPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editEmpProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empToolPanel3Layout.setVerticalGroup(
            empToolPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empToolPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editEmpProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        empStagePanel3.setBackground(new java.awt.Color(204, 204, 204));

        AddPanel3.setBackground(new java.awt.Color(179, 229, 229));

        jLabel28.setText("Employee");

        jLabel29.setText("Name");

        jLabel30.setText("Surname");

        jLabel31.setText("Repeat Password");

        jLabel32.setText("New Password");

        jLabel33.setText("Telephone number");

        jLabel53.setText("Address");

        saveEmpButton.setText("Save");
        saveEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEmpButtonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPanel3Layout = new javax.swing.GroupLayout(AddPanel3);
        AddPanel3.setLayout(AddPanel3Layout);
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
                            .addComponent(empNameField)
                            .addComponent(empSurnameField)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33)
                            .addComponent(empNumberField)
                            .addComponent(jLabel53)
                            .addComponent(empAddressField)
                            .addComponent(empNewPasswordField)
                            .addComponent(empRepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel27))
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel28))
                    .addGroup(AddPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(saveEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(empNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empRepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(saveEmpButton))
        );

        jPanel14.setBackground(new java.awt.Color(238, 229, 187));
        jPanel14.setMaximumSize(new java.awt.Dimension(619, 284));

        jLabel37.setText("Personal Sales");

        jScrollPane1.setViewportView(empPerSalesTextfield);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel34))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel37))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout empStagePanel3Layout = new javax.swing.GroupLayout(empStagePanel3);
        empStagePanel3.setLayout(empStagePanel3Layout);
        empStagePanel3Layout.setHorizontalGroup(
            empStagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empStagePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        empStagePanel3Layout.setVerticalGroup(
            empStagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empStagePanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empStagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout perProLayout = new javax.swing.GroupLayout(perPro);
        perPro.setLayout(perProLayout);
        perProLayout.setHorizontalGroup(
            perProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perProLayout.createSequentialGroup()
                .addComponent(empToolPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empStagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        perProLayout.setVerticalGroup(
            perProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perProLayout.createSequentialGroup()
                .addGroup(perProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empToolPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empStagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        empPanel.addTab("Personal Profile", perPro);
        
        perPro.setBackground(new java.awt.Color(204, 204, 204));
        
        createProduct.setLayout((LayoutManager) new BoxLayout(createProduct, BoxLayout.Y_AXIS));
        
        productNameLabel.setText("Product name");
        productFlavorLabel.setText("Product Flavor");
        productPriceLabel.setText("Product price");
        productQuantityLabel.setText("Product Qty. in Stock");
        
        productName.setMaximumSize(new Dimension(400, 30));
        createProduct.add(productNameLabel);
        createProduct.add(productName);
        
        productFlavor.setMaximumSize(new Dimension(400, 30));
        createProduct.add(productFlavorLabel);
        createProduct.add(productFlavor);
        
        productPrice.setMaximumSize(new Dimension(400, 30));
        createProduct.add(productPriceLabel);
        createProduct.add(productPrice);
        
        productQuantity.setMaximumSize(new Dimension(400, 30));
        createProduct.add(productQuantityLabel);
        createProduct.add(productQuantity);
        
        createProductButton.setText("Create new product");
        createProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductButtonActionPerformed(evt);
            }
        });
        createProduct.add(createProductButton);
        
        empPanel.addTab("Create Product", createProduct);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        footerPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void viewPastOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        layerNewOrder.setVisible(false);
        layerPastOrder.setVisible(true);
    }

    private void EditEmpPerProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	empNameField.setEnabled(true);
		empSurnameField.setEnabled(true);
		empAddressField.setEnabled(true);
		empNumberField.setEnabled(true);
		empNewPasswordField.setEnabled(true);
		empRepPasswordField.setEnabled(true);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int exit=JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO EXIT?");
        if(exit==0){
        	cupcakedb.saveCupcakes();
        	requestdb.saveRequests();
        	employeedb.saveEmployees();
            System.exit(0);   
        }
    }
    
    private void saveEmpButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	this.updateEmployeeInfo();
    	employeedb.saveEmployees();
    }

    private void newOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        request = new Request();
    }

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        layerNewOrder.setVisible(true);
        layerPastOrder.setVisible(false);
    }
    
    private void addItemOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	cupcakedb.addToRequest(itemOrderComboBox, orderTable, itemOrderSpinner);
    	this.updateOrderTotal();
    }
    
    private void removeItemOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cupcakedb.removeFromRequest(orderTable);
        this.updateOrderTotal();
    }

    private void discardOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	request.cancelRequest(orderTable, 1, 2);
    	this.updateOrderTotal();
    }

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	request.closeRequest(orderTable, totalOrderField);
    	this.updateOrderTotal();
    	this.updateInventoryTable();
    	this.updateEmployeeRevenue();
    	requestdb.addRequestsToTable(PastOrderTable);
    	request = new Request();
    }

    private void itemChangeNameButtonActionPerformed(java.awt.event.ActionEvent evt) {
        itemNameInvField.setEnabled(true);
    }
    
    private void itemChangePriceButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	itemPriceInvField.setEnabled(true);
    }

    private void itemChangeQtyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        itemQtyInvField.setEnabled(true);
    }

    private void saveInvButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	this.updateProductAttributes();
    	this.updateInventoryTable();
    }

    private void searchItemInvButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	this.displayProductAttributes();
    }
    
    private void createProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	cupcake.createProduct(createProduct);
    	this.clearCreateProductFields();
    	cupcakedb.saveCupcakes();
    	this.updateInventoryTable();
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {

    	int exit=JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO EXIT?");
    	
        if(exit==0){
        	cupcakedb.saveCupcakes();
        	requestdb.saveRequests();
        	employeedb.saveEmployees();
            System.exit(0);
        }
    }
    
    private void displayProductAttributes() {
    	Cupcake cupcake = cupcakedb.searchFor(searchItemInvField.getText());
    	
    	itemNameInvField.setText(cupcake.getName());
    	itemPriceInvField.setText(cupcake.getProductPriceToString());
    	itemQtyInvField.setText(cupcake.getProductQuantityToString());
    }
    
    private void updateProductAttributes() {
    	Cupcake cupcake = cupcakedb.searchFor(searchItemInvField.getText());
    	
    	cupcake.setName(itemNameInvField.getText());
    	cupcake.setPrice(Double.parseDouble(itemPriceInvField.getText()));
    	cupcake.setQuantity(Integer.parseInt(itemQtyInvField.getText()));
    	
    	cupcakedb.saveCupcakes();
    	
    	searchItemInvField.setText("");
    	itemNameInvField.setText("");
    	itemNameInvField.setEnabled(false);
    	itemPriceInvField.setText("");
    	itemPriceInvField.setEnabled(false);
    	itemQtyInvField.setText("");
    	itemQtyInvField.setEnabled(false);
    	JOptionPane.showMessageDialog(inventory, "Succesfully saved.");    	
    }
    
    private Double getOrderTotal() {
    	double total = 0;
    	int row = orderTable.getRowCount();
    	
    	for(int i = 0; i < row; i++) {
    		total += ( Double.parseDouble(orderTable.getValueAt(i, 2).toString()) * Double.parseDouble(orderTable.getValueAt(i, 3).toString()) );
    	}
    	
    	total = Math.round(total * 100);
    	total = total/100;
    	
    	return total;
    }
    
    private void updateOrderTotal() {
    	totalOrderField.setText(Double.toString(getOrderTotal()));
    }
    
    private void updateInventoryTable() {
    	DefaultTableModel model = (DefaultTableModel) inventoryTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        	model.removeRow(i);
        }
    	cupcakedb.addCakesToInventory(inventoryTable1);
    	inventoryTable1.setModel(model);
    }
    
    private void updateEmployeeRevenue() {
    	Employee employee = Employee.employeeLogin();
    	
    	if(employee != null) {
    		double total = employee.getRevenue();
        	total = Math.round(total * 100);
        	total = total/100;
        	String newTotal = Double.toString(total);
    		
    		empPerSalesTextfield.setText(newTotal + " DKK");
    	} else {
    		empPerSalesTextfield.setText("N/A");
    	}
    }
    
    private void displayEmployeeInfo() {
    	Employee employee = Employee.employeeLogin();
    	
    	if(employee != null) {
    		empNameField.setText(employee.getFirstname());
    		empSurnameField.setText(employee.getLastname());
    		empAddressField.setText(employee.getAddress());
    		empNumberField.setText(employee.getTelephone());
    		empNewPasswordField.setText(employee.getPassword());
    		empRepPasswordField.setText(employee.getPassword());
    	}
    }
    
    private void updateEmployeeInfo() throws IllegalArgumentException {
    	Employee employee = Employee.employeeLogin();
    	
    	if(employee != null) {
    		String pass1 = empNewPasswordField.getText();
    		String pass2 = empRepPasswordField.getText();
    		
    		employee.setFirstname(empNameField.getText());
    		employee.setLastname(empSurnameField.getText());
    		employee.setAddress(empAddressField.getText());
    		employee.setTelephone(empNumberField.getText());
    		if(pass1.equals(pass2) && pass1 != null && pass2 != null) { 
    			employee.setPassword(pass1); 
    		} else if(pass1.equals("") && pass2.equals("")) {
    			employee.setPassword(employee.getPassword());
    		} else {
    			throw new IllegalArgumentException("Passwords do not match");
    		}
    	}
    	
    	empNameField.setEnabled(false);
    	empSurnameField.setEnabled(false);
    	empAddressField.setEnabled(false);
    	empNumberField.setEnabled(false);
    	empNumberField.setEnabled(false);
    	empNewPasswordField.setEnabled(false);
    	empRepPasswordField.setEnabled(false);
    	JOptionPane.showMessageDialog(empPanel, "Succesfully saved.");
    }
    
    private void clearCreateProductFields() {
    	productName.setText("");
    	productFlavor.setText("");
    	productPrice.setText("");
    	productQuantity.setText("");
    }

    public static void main(String args[]) {
       
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new HomeEmpFin().setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    private javax.swing.JPanel AddPanel3;
    private javax.swing.JTable PastOrderTable;
    private javax.swing.JButton addItemOrderButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton changePriceInvButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JFormattedTextField dateSearchField;
    private javax.swing.JButton discardOrderButton;
    private javax.swing.JPanel editEmpProPanel;
    private javax.swing.JTextField empNameField;
    private javax.swing.JTextField empSurnameField;
    private javax.swing.JTextField empAddressField;
    private javax.swing.JTextField empNumberField;
    private javax.swing.JTextField empNewPasswordField;
    private javax.swing.JTextField empRepPasswordField;
    private javax.swing.JTabbedPane empPanel;
    private javax.swing.JLabel empPerSalesTextfield;
    private javax.swing.JPanel empStagePanel1;
    private javax.swing.JPanel empStagePanel2;
    private javax.swing.JPanel empStagePanel3;
    private javax.swing.JPanel empToolPanel1;
    private javax.swing.JPanel empToolPanel2;
    private javax.swing.JPanel empToolPanel3;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane invScrollPanel;
    private javax.swing.JPanel inventory;
    private javax.swing.JTable inventoryTable1;
    private javax.swing.JButton itemChangeNameButton;
    private javax.swing.JButton itemChangeQtyButton;
    private javax.swing.JPanel itemInventory;
    private javax.swing.JTextField itemNameInvField;
    private javax.swing.JComboBox<String> itemOrderComboBox;
    private javax.swing.SpinnerModel spinnerModel;
    private javax.swing.JSpinner itemOrderSpinner;
    private javax.swing.JTextField itemPriceInvField;
    private javax.swing.JTextField itemQtyInvField;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLayeredPane layerNewOrder;
    private javax.swing.JLayeredPane layerPastOrder;
    private javax.swing.JPanel newOrderPanel;
    private javax.swing.JPanel order;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel orderPastPanel;
    private javax.swing.JScrollPane orderScrollPanel;
    private javax.swing.JScrollPane orderScrollPanel1;
    private javax.swing.JTable orderTable;
    private javax.swing.JPanel pastOrderPanel;
    private javax.swing.JPanel perPro;
    private javax.swing.JPanel createProduct;
    public static javax.swing.JTextField productName;
    public static javax.swing.JTextField productFlavor;
    public static javax.swing.JTextField productPrice;
    public static javax.swing.JTextField productQuantity;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productFlavorLabel;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JLabel productQuantityLabel;
    private javax.swing.JButton createProductButton;
    private javax.swing.JButton removeItemOrderButton;
    private javax.swing.JButton saveEmpButton;
    private javax.swing.JButton saveInvButton;
    private javax.swing.JButton searchItemInvButton;
    private javax.swing.JButton searchItemInvButton1;
    private javax.swing.JTextField searchItemInvField;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField totalOrderField;

    private void paint(JPanel StagePanel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
