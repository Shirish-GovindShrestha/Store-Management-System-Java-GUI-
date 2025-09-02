/**
 * Retailer Class
 *
 * @Shirish Govind Shrestha
 * @1.0
 */
public class Retailer extends Store
{
    // instance variables
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private String purchasedYear;
    private boolean isPaymentOnline;
    
    /**
     * Constructor for objects of class Retailer 
     */
    public Retailer(int storeID,String storeName,String location,String openingHour,double totalSales,double totalDiscount,int vatInclusivePrice,String purchasedYear,boolean isPaymentOnline)
    {
        // initialise instance variables
        super(storeID,storeName,location,openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.vatInclusivePrice=vatInclusivePrice;
        this.purchasedYear=purchasedYear;
        this.isPaymentOnline=isPaymentOnline;
        this.loyaltyPoint=0;
    }
    
    // accessor methods
    public int getVatInclusivePrice()
    {
        // returns vatInclusivePrice
        return this.vatInclusivePrice;
    }
    
    public int getLoyaltyPoint()
    {
        // returns loyaltyPoint
        return this.loyaltyPoint;
    }
    
    public String getPurchasedYear()
    {
        // returns purchaseYear 
        return this.purchasedYear;
    }
    
    public boolean isPaymentOnline()
    {
        // returns isPaymentOnline 
        return this.isPaymentOnline;
    }
    
    /*mutator method
     * Sets value for PaymentOnline*/
    public void setIsPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline=isPaymentOnline;
    }
    
    // Method to set loyalty points
    public void setLoyaltyPoint(boolean isPaymentOnline,int vatInclusivePrice)
    {   
        //Loyalty point = 1% of VAT inclusive price
        if(isPaymentOnline){
            this.loyaltyPoint=(int)(0.01*vatInclusivePrice);
        } 
    }
    
    //Method to remove project if product year is 2020 2021 2022
    public void removeProduct()
    {
        // checks if loyalpoint is zero
        if(this.loyaltyPoint==0){
           // checks if the year is 2020 2021 or 2022 
           if(this.purchasedYear=="2020" || this.purchasedYear=="2021" || this.purchasedYear=="2022"){
                //removes product
                this.vatInclusivePrice=0;
                this.loyaltyPoint=0;
                this.isPaymentOnline=false;
           }
        }
    }
    
    /* Display method
     * displays the attributes of the Retailer and Store
     * method overriding*/
    public void display()
    {
        super.display();
        if(vatInclusivePrice==0 && loyaltyPoint==0 && isPaymentOnline== false){
            System.out.println("The product has been removed");
        }
        else{
            System.out.println("VATInclusivePrice: "+this.vatInclusivePrice);
            System.out.println("Loyalty Point: "+this.loyaltyPoint);
            System.out.println("Purchased Year: "+this.purchasedYear);
        }
    }
}