/**
 * Store Class
 *
 * @Shirish Govind Shrestha
 * @1.0
 */
public class Store
{
    // instance variables
    private int storeID;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    
    /**
     * Constructor for objects of class Store
     */
    public Store(int storeID,String storeName, String location, String openingHour)
    {
        // initialise instance variables
        this.storeID=storeID;
        this.storeName= storeName;
        this.location=location;
        this.openingHour=openingHour;
        this.totalSales=0;
        this.totalDiscount=0;
    }
    
    // accessor methods:
    public int getStoreID()
    {
        // returns storeID
        return this.storeID;
    }
    
    public String getStoreName()
    {
        // returns storeName 
        return this.storeName;  
    }
    
    public String getLocation()
    {
        // returns location  
        return this.location;   
    }
    
    public String getOpeningHour()
    {
        // returns openingHour  
        return this.openingHour;   
    }
    
    public double getTotalSales()
    {
        // returns totalSales  
        return this.totalSales;   
    }
    
    public double getTotalDiscount()
    {
        // returns totalDiscount
        return this.totalDiscount;   
    }
    
    /* setter method
     * set total sales*/
    public void setTotalSales(double totalSales)
    {
        // adds parameter to the instance variable
        this.totalSales+=totalSales; 
    }
    
    /* setter method
     * sets total discount*/
    public void setTotalDiscount(double totalDiscount)
    {
        // adds parameter to the instance variable
        this.totalDiscount+=totalDiscount;
    }
    
    /* display method 
     * displays Attributes of Class store*/
    public void display()
    {
        System.out.println("StoreId: "+ this.storeID);
        System.out.println("Store Name: "+ this.storeName);
        System.out.println("Location: "+ this.location);
        System.out.println("Opening Hour: "+ this.openingHour);
        System.out.println("Total Sales: "+ this.totalSales);
        if (this.totalSales==0 && this.totalDiscount==0){
            System.out.println("No items has been sold");
        }
    }
}



