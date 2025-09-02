/**
 * Department Class
 *
 * @Shirish Govind Shrestha
 * @1.0
 */
public class Department extends Store
{
    // instance variables
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;
        
    /**
    * Constructor for objects of class department
    */
    public Department(int storeID,String storeName, String location, String openingHour,double totalSales,double totalDiscount,String productName,double markedPrice)
    {
        // initialise instance variables
        super(storeID,storeName,location,openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.isInSales=true;    
        this.sellingPrice=0;
        this.productName=productName;
        this.markedPrice=markedPrice;
    }
        
    // Accessors methods
    public String getProductName()
    {
        // returns product name
        return this.productName;
    }
    
    public double getMarkedPrice()
    {
        // returns marked price
        return this.markedPrice;
    }
    
    public double getSellingPrice()
    {
        // returns selling price
        return this.sellingPrice;
    }
    
    public boolean isInSales()
    {
        // returns isInSales
        return this.isInSales;
    } 
        
    /*mutator method
     * Sets value for MarkedPrice*/
    public void setMarkedPrice(double markedPrice)
    {
        this.markedPrice= markedPrice;
    }
    
    // Calculates Selling price as per its parameter marked price
    public void calculateDiscountPrice(boolean isInSales,double markedPrice)
    {
        // Checks if the product is in sales
        if(isInSales){
            //discount is assigned according the value of markedPrice
            double Discount=0;
            if(markedPrice>=5000){
                Discount=0.2;
            }
            else if(markedPrice>=3000 && markedPrice<5000){
                Discount=0.1;
            }
            else if(markedPrice>=1000 && markedPrice<3000){
                Discount=0.05;
            }
            else if(markedPrice>0 && markedPrice<1000){
                Discount=0;
            }
            else{
                
            }  
            // selling price is calculated
            this.sellingPrice=(markedPrice-markedPrice*Discount);
            // calls super class method to add discount
            super.setTotalDiscount(Discount*markedPrice);
            // calling super class method to add totalsales
            super.setTotalSales(this.sellingPrice); 
            // item has been sold
            this.isInSales=false;
        }
    }
    
    /* Display method
     * displays the attributes of the Department and Store
     * method overriding*/
    public void display()
    {
        super.display();
        // checks if the product is in sale and gives product name and marked price
        if(this.isInSales){
            System.out.println("Product Name: " + this.productName);
            System.out.println("Marked Price: " + this.markedPrice);
        }
        // else it prints product name and selling price
        else{
            System.out.println("Product Name: " + this.productName);
            System.out.println("Selling Price: " + this.sellingPrice);
        }
    }
}
