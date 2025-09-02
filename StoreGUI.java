
/**
 * StoreGUI Class
 *
 * @Shirish Govind Shrestha
 * @1.0
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class StoreGUI{
    //width and height of the appliation
    private int width = 1700;
    private int height = 825;
    private boolean isUserManagingDepartment = false;

    //Creating arraylists
    private ArrayList<Store> storeList = new ArrayList<Store>(); 

    //Creating frame    
    private JFrame frame = new JFrame("Store Management Application");

    //Creating panels
    private JPanel homePanel = new JPanel(null);
    private JPanel homePanelRight = new JPanel(null);
    private JPanel homePanelLeft = new JPanel(null);
    private JPanel departmentRetailerPanel = new JPanel(null);
    private JPanel departmentRetailerPanelLeft = new JPanel(null);
    private JPanel departmentRetailerPanelRight = new JPanel(null);

    //Creating colors
    private Color cyanColor = new Color(55, 193, 200); 
    private Color lighterCyanColor = new Color(204, 244, 247);
    private Color whiteColor = Color.white; 

    //Creating fonts
    private Font labelFont = new Font("Monospaced", Font.BOLD, 30);
    private Font buttonFont = new Font("Monospaced", Font.BOLD, 40);
    private Font welcomeFont = new Font("Monospaced", Font.BOLD, 100);
    private Font comboBoxAndTextFieldFont = new Font("Monospaced", Font.BOLD, 20);
    private Font greetingFont = new Font("Arial",Font.ITALIC,20);

    //Creating images
    private ImageIcon homeMenuImage = new ImageIcon(getClass().getResource("homeImage.jpg"));
    private ImageIcon departmentImage =  new ImageIcon(getClass().getResource("departmentImage.jpg"));
    private ImageIcon retailerImage = new ImageIcon(getClass().getResource("retailerImage.jpg"));
    private ImageIcon womanStandingImage = new ImageIcon(getClass().getResource("womanStandingImage.png"));
    private ImageIcon manStandingImage = new ImageIcon(getClass().getResource("manStandingImage.png"));

    //Creating Jlabels
    private JLabel welcomeLabel = new JLabel("WELCOME USER");
    private JLabel storeIDLabel = new JLabel("Store id");
    private JLabel storeNameLabel = new JLabel("Store name");
    private JLabel locationLabel = new JLabel("Location");
    private JLabel openingHourLabel = new JLabel("Opening Hour");
    private JLabel totalSalesLabel = new JLabel("Total Sales");
    private JLabel totalDiscountLabel = new JLabel("Total Discount");
    private JLabel productNameLabel = new JLabel("Product Name");
    private JLabel markedPriceLabel = new JLabel("Marked Price");
    private JLabel sellingPriceLabel = new JLabel("Selling Price");
    private JLabel isInSalesLabel = new JLabel("In Sales");
    private JLabel vatInclusivePriceLabel = new JLabel("VAT Inclusice Price");
    private JLabel loyaltyPointLabel = new JLabel("Loyalty Point");
    private JLabel purchasedYearLabel = new JLabel("Purchased Year");
    private JLabel isPaymentOnlineLabel = new JLabel("Payment Online");
    private JLabel departmentImageLabel = new JLabel(departmentImage);
    private JLabel retailerImageLabel = new JLabel(retailerImage);
    private JLabel homeMenuImageLabel = new JLabel(homeMenuImage);
    private JLabel womanStandingLabel = new JLabel(womanStandingImage);
    private JLabel manStandingLabel = new JLabel(manStandingImage);
    private JLabel departmentWelcomeLabel = new JLabel("<html> Welcome user<br>Here we can manage department<html>");
    private JLabel retailerWelcomeLabel = new JLabel("<html> Welcome user<br>Here we can manage retailer<html>");

    //Creating JCheckBox
    private JCheckBox isPaymentOnlineCheckBox = new JCheckBox();
    private JCheckBox isInSalesCheckBox = new JCheckBox();

    //Creating JComboBoxs
    private String[] years = {"2024","2023", "2022", "2021","2020"};
    private JComboBox<String> purchasedYearComboBox = new JComboBox<String>(years);

    //Creating TextFields
    private JTextField storeIDTextField = new JTextField();
    private JTextField storeNameTextField = new JTextField();
    private JTextField locationTextField = new JTextField();
    private JTextField openingHourTextField = new JTextField();
    private JTextField totalSalesTextField = new JTextField();
    private JTextField totalDiscountTextField = new JTextField();
    private JTextField productNameTextField = new JTextField();
    private JTextField markedPriceTextField = new JTextField();
    private JTextField sellingPriceTextField = new JTextField();
    private JTextField vatInclusivePriceTextField = new JTextField();
    private JTextField loyaltyPointTextField = new JTextField();

    //Creating Jbuttons
    private JButton addDepartmentButton = new JButton("Add Department");
    private JButton addRetailerButton = new JButton("Add Retailer");
    private JButton calculateDiscountButton = new JButton("Calculate Discount");
    private JButton setLoyaltyPointButton = new JButton("Set Loyalty Point");
    private JButton removeProductButton = new JButton("Remove Product");
    private JButton displayButton = new JButton("Display Stores");
    private JButton clearButton = new JButton("Clear");
    private JButton backButton = new JButton("Back");
    private JButton manageDepartmentButton = new JButton("Manage Department");
    private JButton manageRetailerButton = new JButton("Manage Retailer");

    public StoreGUI(){
        //setting frame size and layout
        frame.setSize(width,height);
        frame.setLayout(null);

        //setting visibility of departmentRetailerPanel to false
        departmentRetailerPanel.setVisible(false);

        //Adding Action listener to manageDepartmentButton
        manageDepartmentButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    isUserManagingDepartment = true;
                    //adding department Component
                    departmentRetailerPanelLeft.add(productNameLabel);
                    departmentRetailerPanelLeft.add(markedPriceLabel);
                    departmentRetailerPanelRight.add(sellingPriceLabel);
                    departmentRetailerPanelLeft.add(isInSalesLabel);
                    departmentRetailerPanelLeft.add(manStandingLabel);
                    departmentRetailerPanelLeft.add(departmentWelcomeLabel);
                    departmentRetailerPanelLeft.add(productNameTextField);
                    departmentRetailerPanelLeft.add(markedPriceTextField);
                    departmentRetailerPanelRight.add(sellingPriceTextField);
                    departmentRetailerPanelRight.add(addDepartmentButton);
                    departmentRetailerPanelRight.add(calculateDiscountButton);
                    departmentRetailerPanelLeft.add(isInSalesCheckBox);

                    //removing retailer component
                    departmentRetailerPanelRight.remove(addRetailerButton);        
                    departmentRetailerPanelLeft.remove(vatInclusivePriceLabel);
                    departmentRetailerPanelRight.remove(loyaltyPointLabel);
                    departmentRetailerPanelLeft.remove(isPaymentOnlineLabel);
                    departmentRetailerPanelLeft.remove(womanStandingLabel);
                    departmentRetailerPanelLeft.remove(purchasedYearLabel);
                    departmentRetailerPanelLeft.remove(retailerWelcomeLabel);
                    departmentRetailerPanelLeft.remove(vatInclusivePriceTextField);
                    departmentRetailerPanelRight.remove(loyaltyPointTextField);
                    departmentRetailerPanelLeft.remove(isPaymentOnlineCheckBox);
                    departmentRetailerPanelLeft.remove(purchasedYearComboBox);
                    departmentRetailerPanelRight.remove(setLoyaltyPointButton);
                    departmentRetailerPanelRight.remove(removeProductButton);

                    homePanel.setVisible(false);
                    departmentRetailerPanel.setVisible(true);
                }
            });

        //Adding Action listener to manageRetailerButton
        manageRetailerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    isUserManagingDepartment = false;

                    //removing  department Component
                    departmentRetailerPanelLeft.remove(productNameLabel);
                    departmentRetailerPanelLeft.remove(markedPriceLabel);
                    departmentRetailerPanelRight.remove(sellingPriceLabel);
                    departmentRetailerPanelLeft.remove(manStandingLabel);
                    departmentRetailerPanelLeft.remove(departmentWelcomeLabel);
                    departmentRetailerPanelLeft.remove(isInSalesLabel);
                    departmentRetailerPanelLeft.remove(productNameTextField);
                    departmentRetailerPanelLeft.remove(markedPriceTextField);
                    departmentRetailerPanelRight.remove(sellingPriceTextField);
                    departmentRetailerPanelRight.remove(addDepartmentButton);
                    departmentRetailerPanelRight.remove(calculateDiscountButton);
                    departmentRetailerPanelLeft.remove(isInSalesCheckBox);

                    //adding retailer Component
                    departmentRetailerPanelLeft.add(vatInclusivePriceLabel);
                    departmentRetailerPanelRight.add(loyaltyPointLabel);
                    departmentRetailerPanelLeft.add(isPaymentOnlineLabel);
                    departmentRetailerPanelLeft.add(womanStandingLabel);
                    departmentRetailerPanelLeft.add(purchasedYearLabel);
                    departmentRetailerPanelLeft.add(retailerWelcomeLabel);
                    departmentRetailerPanelLeft.add(vatInclusivePriceTextField);
                    departmentRetailerPanelRight.add(loyaltyPointTextField);
                    departmentRetailerPanelLeft.add(isPaymentOnlineCheckBox);
                    departmentRetailerPanelLeft.add(purchasedYearComboBox);
                    departmentRetailerPanelRight.add(setLoyaltyPointButton);
                    departmentRetailerPanelRight.add(removeProductButton);
                    departmentRetailerPanelRight.add(addRetailerButton);
                    homePanel.setVisible(false);
                    departmentRetailerPanel.setVisible(true);
                }
            });

        //Adding Action listener to backButton
        backButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    departmentRetailerPanel.setVisible(false);
                    homePanel.setVisible(true);
                }});

        //adding actionListener to addDepartment Button
        addDepartmentButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        boolean isUniqueData = true;
                        int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                        String storeName = storeNameTextField.getText().trim();
                        String location = locationTextField.getText().trim();
                        String openingHour=openingHourTextField.getText();
                        double totalSales = Double.parseDouble(totalSalesTextField.getText().trim());
                        double totalDiscount = Double.parseDouble(totalDiscountTextField.getText().trim());
                        String productName = productNameTextField.getText().trim();
                        double markedPrice = Double.parseDouble(markedPriceTextField.getText().trim());
                        if(storeName.isEmpty()||location.isEmpty()||openingHour.isEmpty()||productName.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "Please enter valid text in the fields","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if(containsNumber(storeName)|| containsNumber(location)||containsNumber(productName)){
                            JOptionPane.showMessageDialog(frame,"Store Name, location, product name should not contain Number","Store Information", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        for(Store store : storeList){
                            if(store instanceof Department){
                                if(store.getStoreID()==storeID){
                                    isUniqueData= false;
                                }   
                            }
                        }
                        if(isUniqueData){
                            Department department = new Department(storeID,storeName,location,openingHour,totalSales,totalDiscount,productName,markedPrice);
                            storeList.add(department);
                            JOptionPane.showMessageDialog(frame,"Department Data stored Succesfully","Store Information", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(frame,"Data already exists","Store Information", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Please enter valid numbers and text in the fields.\n ID, Total Sales, Total Discount and Marked Price must be numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        //adding actionListener to addRetailer Button
        addRetailerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        boolean isUniqueData= true;
                        int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                        String storeName = storeNameTextField.getText().trim();
                        String location = locationTextField.getText().trim();
                        String openingHour= locationTextField.getText();
                        double totalSales = Double.parseDouble(totalSalesTextField.getText().trim());
                        double totalDiscount = Double.parseDouble(totalDiscountTextField.getText().trim());     
                        int vatInclusivePrice = Integer.parseInt(vatInclusivePriceTextField.getText().trim());
                        String purchasedYear = (String)purchasedYearComboBox.getSelectedItem();
                        boolean isPaymentOnline=isPaymentOnlineCheckBox.isSelected();
                        if(storeName.isEmpty()||location.isEmpty()||openingHour.isEmpty()||purchasedYear.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "Please enter valid text in the fields","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if(containsNumber(storeName)|| containsNumber(location)){
                            JOptionPane.showMessageDialog(frame,"Store Name, location should not contain Number","Store Information", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        for(Store store : storeList){
                            if(store instanceof Retailer){
                                if(store.getStoreID()==storeID){
                                    isUniqueData= false ;
                                }
                            }
                        }
                        if(isUniqueData){
                            Retailer retailer = new Retailer(storeID,storeName,location,openingHour, totalSales,totalDiscount,vatInclusivePrice,purchasedYear,isPaymentOnline);
                            storeList.add(retailer);    
                            JOptionPane.showMessageDialog(frame,"Retailer Data stored Succesfully","Store Information", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(frame,"Data already exists","Store Information", JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Please enter valid numbers and text in the fields.\n Store ID, Total Sales, Total Discount and VAT Inclusive price must be numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        //adding actionListener to calculateDiscount Button
        calculateDiscountButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                        boolean productFound = false;   
                        boolean isDiscountCalculated = false;
                        if(storeList.isEmpty()){
                            JOptionPane.showMessageDialog(frame,"No Store added","Empty Store List", JOptionPane.ERROR_MESSAGE);
                        }else{
                            for(Store store: storeList){
                                if(store instanceof Department){
                                    Department department = (Department) store;
                                    if(storeID==department.getStoreID()){
                                        productFound = true;
                                        if(department.isInSales()){
                                            department.calculateDiscountPrice(department.isInSales(),department.getMarkedPrice());
                                            isDiscountCalculated=true;
                                            totalSalesTextField.setText(String.valueOf(department.getTotalSales()));
                                            totalDiscountTextField.setText(String.format("%.2f",department.getTotalDiscount()));
                                            sellingPriceTextField.setText(String.valueOf(department.getSellingPrice()));
                                            break;
                                        }
                                    }
                                }
                            }
                            if (isDiscountCalculated){
                                JOptionPane.showMessageDialog(frame,"Discount calculated succesful","Store Information", JOptionPane.INFORMATION_MESSAGE); 
                                for(Store store: storeList){
                                    if(store instanceof Retailer){
                                        if(storeID== store.getStoreID()){
                                            store.setTotalSales(Double.parseDouble(totalSalesTextField.getText()));
                                            store.setTotalDiscount(Double.parseDouble(totalDiscountTextField.getText()));
                                        }
                                    }
                                }
                            }else if(productFound && !isDiscountCalculated){
                                JOptionPane.showMessageDialog(frame,"Item already sold", "Error", JOptionPane.ERROR_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(frame,"Store ID cannot be found in the List.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid store ID. Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        //adding actionListener to setloyaltypointButton
        setLoyaltyPointButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                        boolean productFound= false;
                        boolean isLoyaltyPointCalculated = false;
                        if(storeList.isEmpty()){
                            JOptionPane.showMessageDialog(frame,"No Store added","Empty Store List", JOptionPane.ERROR_MESSAGE);
                        }else{
                            for(Store store:storeList){
                                if(store instanceof Retailer){
                                    Retailer retailer = (Retailer) store;
                                    if(storeID==retailer.getStoreID()){
                                        productFound = true;
                                        if(retailer.isPaymentOnline()){
                                            retailer.setLoyaltyPoint(retailer.isPaymentOnline(),retailer.getVatInclusivePrice());
                                            loyaltyPointTextField.setText(String.valueOf(retailer.getLoyaltyPoint()));
                                            isLoyaltyPointCalculated= true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if(isLoyaltyPointCalculated){
                                JOptionPane.showMessageDialog(frame,"Loyalty Point Succesfully Caculated","Store Information", JOptionPane.INFORMATION_MESSAGE);
                            }else if(productFound && !isLoyaltyPointCalculated){
                                JOptionPane.showMessageDialog(frame,"Purchased was not made Online. Cannot Calculated Loyalty Point", "Error", JOptionPane.ERROR_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(frame,"Store ID cannot be found in the List.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid store ID. Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        //adding actionListener to removeProductButton
        removeProductButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                        boolean isProductRemoved = false;
                        boolean productFound = false;
                        if(storeList.isEmpty()){
                            JOptionPane.showMessageDialog(frame,"No Store added","Empty Store List", JOptionPane.ERROR_MESSAGE);
                        }else{
                            for(Store store: storeList){
                                if(store instanceof Retailer){
                                    Retailer retailer = (Retailer) store;
                                    if(storeID==retailer.getStoreID()){
                                        productFound = true;
                                        int confirmation = JOptionPane.showConfirmDialog(frame, "Confirm Removing product with store ID "+storeID,"Confirmation",JOptionPane.YES_NO_OPTION);
                                        if(confirmation==0){
                                            retailer.removeProduct();
                                            if (retailer.getVatInclusivePrice()==0 && retailer.getLoyaltyPoint()==0){
                                                isProductRemoved = true;    
                                            }
                                        }else{
                                            return;
                                        }
                                        break;
                                    }
                                }
                            }
                            if (isProductRemoved){
                                JOptionPane.showMessageDialog(frame,"Product has be removed","Store Information.", JOptionPane.INFORMATION_MESSAGE);
                            }else if(!isProductRemoved && productFound){
                                JOptionPane.showMessageDialog(frame,"Product cannot be removed","Store Information.", JOptionPane.ERROR_MESSAGE);
                            }else if(!productFound){
                                JOptionPane.showMessageDialog(frame,"Product not Found ", "Error", JOptionPane.ERROR_MESSAGE);   
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid store ID. Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        //adding actionlistener to displaybutton
        displayButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {    
                    if(storeList.isEmpty()){
                        JOptionPane.showMessageDialog(frame,"Store List is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        try{
                            int storeID= Integer.parseInt(storeIDTextField.getText().trim());
                            boolean productFound= false;
                            String displayOutput="";
                            for(Store store: storeList){
                                if(storeID==store.getStoreID()){
                                    String storeName = store.getStoreName();
                                    String location= store.getLocation();
                                    String openingHour = store.getOpeningHour();
                                    double totalSales= store.getTotalSales();
                                    double totalDiscount = store.getTotalDiscount();
                                    if(!isUserManagingDepartment){
                                        if(store instanceof Retailer){
                                            productFound = true;
                                            Retailer retailer = (Retailer) store;   
                                            int vatInclusivePrice = retailer.getVatInclusivePrice();
                                            int loyaltyPoint= retailer.getLoyaltyPoint();
                                            String purchasedYear= retailer.getPurchasedYear();
                                            boolean isPaymentOnline= retailer.isPaymentOnline();
                                            displayOutput="       Retailer Information\n"+
                                            "\n StoreID: "+storeID+
                                            "\n Location: "+location+
                                            "\n Opening Hour: "+openingHour+
                                            "\n Total Sales: " + totalSales+
                                            "\n Total Discount: "+ totalDiscount+
                                            "\n VAT Inclusive Price: "+vatInclusivePrice+
                                            "\n Loyalty Point: "+ loyaltyPoint+
                                            "\n purchased Year: "+purchasedYear;
                                            if(isPaymentOnline){
                                                displayOutput+="\nPurchased was made Online";
                                            }else{
                                                displayOutput+="\nPurchased was not made Online";
                                            }
                                        }
                                    }else{
                                        if(store instanceof Department){
                                            productFound = true;
                                            Department department = (Department) store;
                                            String productName = department.getProductName();
                                            double markedPrice =  department.getMarkedPrice();
                                            double sellingPrice = department.getSellingPrice();
                                            boolean isInSales = department.isInSales();
                                            displayOutput="    Department Information\n"+
                                            "\n StoreID: "+storeID+
                                            "\n Location: "+location+
                                            "\n Opening Hour: "+openingHour+
                                            "\n Total Sales: " + totalSales+
                                            "\n Total Discount: "+ totalDiscount+
                                            "\n Product Name: "+ productName+
                                            "\n Marked Price: "+ markedPrice+
                                            "\n Selling Price: "+ sellingPrice;
                                            if(isInSales){
                                                displayOutput+="\nProduct is in sales";
                                            }else{
                                                displayOutput+="\nProduct is not in sales";
                                            }
                                        }
                                    }
                                }
                            }
                            if(productFound && !isUserManagingDepartment){
                                JOptionPane.showMessageDialog(frame,displayOutput,"Retailer Information", JOptionPane.INFORMATION_MESSAGE);
                            }else if(productFound && isUserManagingDepartment){
                                JOptionPane.showMessageDialog(frame,displayOutput ,"Department Information", JOptionPane.INFORMATION_MESSAGE);
                            }else if(!productFound){
                                JOptionPane.showMessageDialog(frame,"No Information found for given store ID" ,"Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame,"Error while displaying Information" ,"ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });

        //adding actionlistener to clear button
        clearButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int confirmation = JOptionPane.showConfirmDialog(frame, "Do you want clear all fields?","Confirmation",JOptionPane.YES_NO_OPTION);
                    if(confirmation==0){
                        storeIDTextField.setText("");
                        storeNameTextField.setText("");
                        locationTextField.setText("");
                        openingHourTextField.setText("");
                        totalSalesTextField.setText("");
                        totalDiscountTextField.setText("");
                        productNameTextField.setText("");
                        markedPriceTextField.setText("");
                        sellingPriceTextField.setText("");
                        vatInclusivePriceTextField.setText("");
                        loyaltyPointTextField.setText("");
                        isPaymentOnlineCheckBox.setSelected(false);
                        purchasedYearComboBox.setSelectedIndex(0);
                    }
                }
            });

        // customizing Label
        customizeLabel(storeIDLabel);
        customizeLabel(storeNameLabel);
        customizeLabel(locationLabel);
        customizeLabel(openingHourLabel);
        customizeLabel(totalSalesLabel);
        customizeLabel(totalDiscountLabel);
        customizeLabel(productNameLabel);
        customizeLabel(markedPriceLabel);
        customizeLabel(sellingPriceLabel);
        customizeLabel(vatInclusivePriceLabel);
        customizeLabel(loyaltyPointLabel);
        customizeLabel(isPaymentOnlineLabel);
        customizeLabel(purchasedYearLabel);
        customizeLabel(welcomeLabel);
        customizeLabel(departmentWelcomeLabel);
        customizeLabel(retailerWelcomeLabel);
        customizeLabel(isInSalesLabel);

        //customizing Textfield
        customizeTextField(storeIDTextField);
        customizeTextField(storeNameTextField);
        customizeTextField(locationTextField);
        customizeTextField(openingHourTextField);
        customizeTextField(totalSalesTextField);
        customizeTextField(totalDiscountTextField);
        customizeTextField(productNameTextField);
        customizeTextField(markedPriceTextField);
        customizeTextField(sellingPriceTextField);
        customizeTextField(vatInclusivePriceTextField);
        customizeTextField(loyaltyPointTextField);

        //customizing button
        customizeButton(manageDepartmentButton);
        customizeButton(manageRetailerButton);
        customizeButton(addDepartmentButton);
        customizeButton(addRetailerButton);
        customizeButton(calculateDiscountButton);
        customizeButton(setLoyaltyPointButton);
        customizeButton(removeProductButton);
        customizeButton(displayButton);
        customizeButton(clearButton);
        customizeButton(backButton);

        //customizing checkbox
        isPaymentOnlineCheckBox.setContentAreaFilled(false);//transparent 
        isInSalesCheckBox.setContentAreaFilled(false);//transparent 

        //customizing comboBox
        purchasedYearComboBox.setFont(comboBoxAndTextFieldFont);// changing Font

        //adding background colour to panel
        homePanelRight.setBackground(lighterCyanColor);
        homePanelLeft.setBackground(cyanColor);
        departmentRetailerPanelRight.setBackground(lighterCyanColor);
        departmentRetailerPanelLeft.setBackground(cyanColor);

        //Setting bounds for main panel
        homePanel.setBounds(0,0,width,height);
        departmentRetailerPanel.setBounds(0,0,width,height);

        //Setting bounds for subpanel
        homePanelLeft.setBounds(0,0,1065,height);
        homePanelRight.setBounds(1065,0,635,height);
        departmentRetailerPanelLeft.setBounds(0,0,1065,height);
        departmentRetailerPanelRight.setBounds(1065,0,635,height);

        //Setting bounds for Label in home screen
        welcomeLabel.setBounds(120,50,800,100);
        departmentImageLabel.setBounds(10,10,450,300);
        retailerImageLabel.setBounds(10,375,450,300);
        homeMenuImageLabel.setBounds(0,235,1065,540);
        womanStandingLabel.setBounds(710,200,433,577);  
        manStandingLabel.setBounds(680,100,483,577);
        departmentWelcomeLabel.setBounds(610,160,700,100);
        retailerWelcomeLabel.setBounds(620,220,700,100);

        // Setting bounds for JLabels
        storeIDLabel.setBounds(120, 180, 200, 25);
        storeNameLabel.setBounds(120, 240, 200, 25);
        locationLabel.setBounds(120, 300, 200, 25);
        openingHourLabel.setBounds(120, 360, 250, 35);
        totalSalesLabel.setBounds(120, 420, 250, 25);
        totalDiscountLabel.setBounds(120, 480, 280, 25);
        productNameLabel.setBounds(120, 540, 280, 25);
        markedPriceLabel.setBounds(120, 600, 290, 25);
        isInSalesLabel.setBounds(120,660,290,25);
        sellingPriceLabel.setBounds(30, 330, 290, 40);
        vatInclusivePriceLabel.setBounds(120, 540, 350, 25);
        isPaymentOnlineLabel.setBounds(120,600,290,35);
        purchasedYearLabel.setBounds(120,660,290,25);
        loyaltyPointLabel.setBounds(30, 330, 290, 40);

        // Setting bounds for JTextFields
        storeIDTextField.setBounds(400, 180, 200, 40);
        storeNameTextField.setBounds(400, 240, 200, 40);
        locationTextField.setBounds(400, 300, 200, 40);
        openingHourTextField.setBounds(400, 360, 200, 40);
        totalSalesTextField.setBounds(400, 420, 200, 40);
        totalDiscountTextField.setBounds(400, 480,200, 40);
        productNameTextField.setBounds(400, 540, 200, 40);
        markedPriceTextField.setBounds(400, 600, 200, 40);
        sellingPriceTextField.setBounds(285, 330, 180, 40);
        vatInclusivePriceTextField.setBounds(500, 540, 200, 40);
        loyaltyPointTextField.setBounds(285, 330, 180, 40);

        // Setting bounds for JCheckBox and JComboBox
        isPaymentOnlineCheckBox.setBounds(400, 600, 30, 35);
        isInSalesCheckBox.setBounds(400,660,25,25);
        purchasedYearComboBox.setBounds(400, 660, 200, 30);

        // Setting bounds for JButtons
        manageDepartmentButton.setBounds(-30,300,540,60);
        manageRetailerButton.setBounds(-20,665,540,60);
        addDepartmentButton.setBounds(0,100, 400, 40);
        calculateDiscountButton.setBounds(-10, 250, 500, 40);
        displayButton.setBounds(0, 400, 400, 50);
        clearButton.setBounds(0, 550, 200, 40);
        backButton.setBounds(10, 20, 200, 60);
        addRetailerButton.setBounds(0, 100, 400, 40);
        setLoyaltyPointButton.setBounds(0, 250, 450, 50);
        removeProductButton.setBounds(0, 700, 400, 40);

        // Adding components 
        homePanelLeft.add(welcomeLabel);
        homePanelLeft.add(homeMenuImageLabel);
        homePanelRight.add(manageDepartmentButton);   
        homePanelRight.add(manageRetailerButton);
        homePanelRight.add(departmentImageLabel);
        homePanelRight.add(retailerImageLabel);

        departmentRetailerPanelLeft.add(storeIDLabel);
        departmentRetailerPanelLeft.add(storeNameLabel);
        departmentRetailerPanelLeft.add(locationLabel);
        departmentRetailerPanelLeft.add(openingHourLabel);
        departmentRetailerPanelLeft.add(totalSalesLabel);
        departmentRetailerPanelLeft.add(totalDiscountLabel);

        departmentRetailerPanelLeft.add(storeIDTextField);
        departmentRetailerPanelLeft.add(storeNameTextField);
        departmentRetailerPanelLeft.add(locationTextField);
        departmentRetailerPanelLeft.add(openingHourTextField);
        departmentRetailerPanelLeft.add(totalSalesTextField);
        departmentRetailerPanelLeft.add(totalDiscountTextField);   

        departmentRetailerPanelRight.add(clearButton);
        departmentRetailerPanelRight.add(displayButton);

        homePanel.add(homePanelRight);
        homePanel.add(homePanelLeft);

        departmentRetailerPanel.add(backButton);
        departmentRetailerPanel.add(departmentRetailerPanelLeft);
        departmentRetailerPanel.add(departmentRetailerPanelRight);

        //ading panel to frame
        frame.add(departmentRetailerPanel);
        frame.add(homePanel);

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new StoreGUI();
    }

    private void customizeButton(JButton button){
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//changes cursor
        button.setFocusable(false);//removes focus
        button.setBorderPainted(false);//removes border
        button.setContentAreaFilled(false);//transparent
        button.setFont(buttonFont);//changing Font
        if(button != backButton){
            button.setForeground(cyanColor);//changes text color
        }else{
            button.setForeground(lighterCyanColor);//changes text color
        }
    }   

    private void customizeLabel(JLabel label){
        label.setFont(labelFont);
        if(label==loyaltyPointLabel || label==sellingPriceLabel){
            label.setForeground(cyanColor);//changing textcolor
        }else if(label==welcomeLabel){
            label.setFont(welcomeFont);//changing Font and textcolor for welcomeLabel
            label.setForeground(whiteColor);
        }else if(label==departmentWelcomeLabel || label==retailerWelcomeLabel){
            label.setFont(greetingFont);//changing Font and textcolor for department and retailer welcomeLabel
            label.setForeground(whiteColor);
        }
        else{
            label.setForeground(whiteColor);
        }
    }
    //check
    private boolean containsNumber(String string){
        for(int i=0;i<string.length();i++){
            char character = string.charAt(i);
            if(Character.isDigit(character)){
                return true;
            }   
        }
        return false;
    }

    private void customizeTextField(JTextField textField){
        textField.setFont(comboBoxAndTextFieldFont);    
    }
}
