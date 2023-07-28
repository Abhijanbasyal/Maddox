/** 
*This is a ElectricScooter class which is also a subclass of vehicle and has eight attributes with its data type which are range(int), battery_capacity(int), price(int), charging_time(String), brand(String), mileage(String), has_purchased(boolean) and has_sold(boolean) where boolean is to check whether true or false.
*The constructor is accepts six parameters which are the vehicle_ID, vehicle_name, vehicle_weight, vehicle_speed, vehicle_color, battery_capacity where a call is made to the superclass constructor with four parameters vehicle_ID, vehicle_name, vehicle_color and vehicle_weight.
*Setter method is called to set the vehicle_speed and vehicle_color in a constructor.
*Initializing the corresponding parameter value of battery capacity in a constructor. Additionally,initializing the range and price to 0, brand, mileage, charging time to empty ("") string and has_purchased and has_sold status to false in a constructor.
*For each attribute has a corresponding getter method.
*brand has a setter method where it accepts a new brand as a parameter value and if the ElectricScooter attribute has_purchased is false,the new value is assed to the brand and if true then a suitable message is display that there is not possible to change the name of the brand.
*purchase has a method where brand,price,charging_time,mileage and range as parameters and if the ElectricScooter attribute has_purchased is false,the brand has a setter method along with brand name as a parameter.
*Initializing the corresponding parameter values of price, charging_time, mileage and range in a purchase method.
*has_purchased is set to true in a purchase method.
*sell has a method where it accepts new price as a parameter and if the status of has_sold is false,initializing the price with the values as specified in the parameter and charging_time,mileage to "" and battery capacity ,range to 0.
*has_sold is changed to true and has_purchased to false in a sell method.
*If the electric scooter is already sold,a suitable message is displayed that scooter has been already sold in a sell method.
*A method display is build where in the display method a display method of vehicle is displayed using super keyword and if the ElectricScooter has_purchased is true then the brand, battery_capacity, mileage, range and recharge_time is displayed.
*@author (Abhijan Basyal)
*Version (2022/05/19)
*/

//Generating the ElectricScooter class, which is a child class of the parent class Vehicle
public class ElectricScooter extends Vehicle
{
    //The eight attributes of ElectricScotter
    private int range; 
    private int battery_capacity; 
    private int price; 
    private String charging_time; 
    private String brand; 
    private String mileage; 
    private boolean has_purchased;
    private boolean has_sold;
    
    //constructor with specific attribute arguments
    public ElectricScooter (int vehicle_ID,String vehicle_name,String vehicle_weight,String vehicle_color,String vehicle_speed,int battery_capacity)
    {
        //calling the constructor of the superclass with the specified parameters
        super(vehicle_ID,vehicle_name,vehicle_weight,vehicle_color);
        
        //calling setter method of vehical color and speed from superclass
        super.setvehicle_speed(vehicle_speed);
        super.setvehicle_color(vehicle_color);
        
        //initializing the value
        this.battery_capacity = battery_capacity;
        this.range = 0;
        this.price = 0;
        this.brand = "";
        this.mileage = "";
        this.charging_time = "";
        this.has_purchased = false;
        this.has_sold = false;
    }
    
    //accessor method for each attributes of ElectricScooter
    public int getrange()
    {
        return this.range;
    }
    public int getbattery_capacity()
    {
        return this.battery_capacity;
    }
    public int getprice()
    {
        return this.price;
    }
    public String getcharging_time()
    {
        return this.charging_time;
    }
    public String getbrand()
    {
        return this.brand;
    }
    public String getmileage()
    {
        return this.mileage;
    }
    public boolean gethas_purchased()
    {
        return this.has_purchased;
    }
    public boolean gethas_sold()
    {
        return this.has_sold;
    }
    
    //setter method for brand
    public void setBrand(String brand)
    {
        //specified condition 
        if (this.has_purchased = false)
        {
            //assigning new value
            this.brand = brand;
        }
        else 
        {
            //displaying the messages that there is not possible to change the brand
            System.out.println("You can not change name of the brand");
        }
    }
    
    //building the method purchase
    public void purchase(String brand,int price,String charging_time,String mileage,int range)
    {
        //specified condition
        if (this.has_purchased = false)
        {
            //if the condition is true brand is setted
            setBrand(brand);
        }
        
        //initializing the value
        this.brand = brand;
        this.price = price;
        this.charging_time = charging_time;
        this.mileage = mileage;
        this.range = range;
        this.has_purchased = true;
    }
    
    //building the method sell
    public void sell(int price){
        //specified condition
        if (this.has_sold = false)
        {
            //Setting value if the condition meets its requirements
            this.price = price;
            this.charging_time = "";
            this.mileage = "";
            this.battery_capacity = 0;
            this.range = 0;
        }
        
        //intitalitizing the value of has_sold as true and has_purchased as false
        this.has_sold = true;
        this.has_purchased = false;
        
        //specified condition
        if(this.has_sold == true)
        {
            //displaying the message scooter has been already sold, if the condtion is true
            System.out.println("Scooter has been already sold.");
        }
    }
    
    //building the display method
    public void display(){
        //calling the method display from class vehicle
        super.display();
        
        //specified conditions
        if (this.has_purchased == true)
        {
            System.out.println("Brand name is " + this.brand);
            System.out.println("Battery capactity is " + this.battery_capacity);
            System.out.println("Mileage is " + this.mileage);
            System.out.println("Range is " + this.range);
            System.out.println("Charging Time is " + this.charging_time);
        }
    }
}

