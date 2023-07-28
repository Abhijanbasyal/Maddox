
/**
 * This is a AutoRickshaw class which is a subclass of Vehicle class and has eight attributes with its data type which are engine_displacement(int), torque(String), number_of_seats(int), fuel_tank_capacity(int), ground_clearance(String), charge_amount(int), booked_date(String) and is_booked(boleean) where boolean is to check whether true or false.
 * The constructor accepts nine parameters which are the vehicle_ID, vehicle_name, vehicle_weight, vehicle_color, vehicle_speed, engine_displacement, torque, fuel_tank_capacity and ground_clearance where a call is made with four parameters that is vehicle_ID, vehicle_name, vehicle_color and vehicle_weight.This constructor call superclass constructor with four parameters vehicle_ID, vehicle_name, vehicle_color and vehicle_weight. Additionally, in the constructor, assigning the vehicle_speed, vehicle_color, engine_displacement, torque, fuel_tank_capacity and ground clearance with parameter values.
 * Setter method is called to set the vehicle_spped and vehicle_color in a constructor
 * is_booked is initialized to false.
 * For each attribute has a corresponding getter method.
 * charge_amount and number_of_seats has a setter method.
 * A method name book is built, which takes as prameters the booked_date,charge_amount and number_of_seats.If the vehicle is not booked, book date is intialized. Other methods are called and used inside this method to set the charge_amount and number_of_seats.The value true is assigned to is_booked, along with a message stating that the vehicle has already been booked.
 * A method display is build where in the display method the display method of vehicle is displayed using super keyword and when the vehicle is booked ,then engine_displacement, torque, fuel_tank_capacity, ground_clearance, booked_date is displayed. Also, the charge_amount and number_of_seats are specified whether it is set or not.
 * @author (Abhijan Basyal)
 * @version (2022/05/19)
 */

//Generating the AutoRickshaw class, which is a child class of the parent class Vehicle
public class AutoRickhaw extends Vehicle
{
    //The eight attributes of a AutoRickshaw
    private int engine_displacement;
    private String torque;
    private int number_of_seats;
    private int fuel_tank_capacity;
    private String ground_clearance;
    private int charge_amount;
    private String booked_date;
    private boolean is_booked;
    
    //constructor with specific attribute arguments
    public AutoRickhaw(int vehicle_ID,String vehicle_name,String vehicle_weight,String vehicle_color,String vehicle_speed,int engine_displacement,String torque,int fuel_tank_capacity,String ground_clearance)
    {
       //calling the constructor of the superclass with the specified parameters
       super(vehicle_ID,vehicle_name,vehicle_color,vehicle_weight);
       
       //initializing the value
       this.engine_displacement = engine_displacement;
       this.torque = torque;
       this.fuel_tank_capacity = fuel_tank_capacity;
       this.charge_amount = charge_amount;
       this.number_of_seats = number_of_seats;
       this.ground_clearance = ground_clearance;
       
       //calling setter method for vehicle_speed and vehicle_color
       super.setvehicle_speed(vehicle_speed);
       super.setvehicle_color(vehicle_color);
       
       //assigning the false value to is_booked
       this.is_booked = false;  
    }
    
    //accessor method for each attributes of AutoRickshaw
    public int getengine_displacement()
    {
        return this.engine_displacement;
    }
    public String gettorque()
    {
        return this.torque;
    }
    public int getnumber_of_seats()
    {
        return this.number_of_seats;
    }
    public int getfuel_tank_capacity()
    {
        return this.fuel_tank_capacity;
    }
    public String getground_clearance()
    {
        return this.ground_clearance;
    }
    public int getcharge_amount()
    {
        return this.charge_amount;
    }
    public String getbooked_date()
    {
        return this.booked_date;
    }
    public boolean getis_booked()
    {
        return this.is_booked;
    }
    
    //setter method for charge_amount and number of seats
    public  void setcharge_amount(int charge_amount)
    {
        this.charge_amount = charge_amount;
    }
    public void setnumber_of_seats(int number_of_seats)
    {
        
        this.number_of_seats = number_of_seats;
    }
    
    //designing a book method that accepts parameters for attributes
    public void book(String booked_date,int charge_amount,int number_of_seats)
    {
        //specified conditions
        if(this.is_booked == false)
        {
            this.booked_date = booked_date;
        }
        
        //calling setter method to set charge amount and number of seats
        setcharge_amount(charge_amount);
        setnumber_of_seats(number_of_seats);
        
        //assigning the true value to is_booked
        this.is_booked = true;
        
        //displaying the message that the vehicle is booked
        System.out.println( getvehicle_name() + "has been already booked");
    }
    
    //information display method  
    public void display()
    {
        //calling the method display from class vehicle
        super.display();
        
        //specified condition
        if(this.is_booked == true)
        {
            System.out.println("Engine Displacement is " + this.engine_displacement);
            System.out.println("Torque is " + this.torque);
            System.out.println("Fuel Tank Capacity is " + this.fuel_tank_capacity);
            System.out.println("Ground Clearance is " + this.ground_clearance);
            System.out.println("Booked Date is " + this.booked_date);  
        }
        
        //specified condition 
        if(this.charge_amount != 0)
        {
            
            System.out.println("The charge amount is " + this.charge_amount);
            
        }
        else
        {
            
            System.out.println("The charge amount is empty");
        
        }
        
        //specified condition
        if(this.number_of_seats != 0)
        {
         
            System.out.println("The number of seats is " + this.number_of_seats);
                 
        }
        else
        {
            
            System.out.println("The number of seats is empty");
        
        }
    }
}
