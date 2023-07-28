
/**
 * This is a vehicle class which have five attributes on it that is vehicle_ID, vehicle_name, vehicle_weight, vehicle color, vehicle_speed where keywords of vehicle_ID is int and others is String.
 * In the constructor, the constructor's parameters are used to initialize the vehicle_ID, vehicle_name, vehicle_color and vehicle_weight.
 * Each attribute has a corresponding accessor method.
 * vehicle_speed and vehicle_color has a setter method.
 * The values are displayed using the display method.
 * @author (Abhijan Basyal)
 * @version (2022/05/18)
 */

//creation of class vechicle
public class Vehicle
{
    //The five attributes of Vehicle 
    private int vehicle_ID ;
    private String vehicle_name;
    private String vehicle_weight;
    private String vehicle_color;
    private String vehicle_speed;
    
    //constructor with specific attribute arguments
    public Vehicle(int vehicle_ID,String vehicle_name,String vehicle_color,String vehicle_weight)
    {
        this.vehicle_ID = vehicle_ID;
        this.vehicle_name = vehicle_name;
        this.vehicle_color = vehicle_color;
        this.vehicle_weight = vehicle_weight;      
    }
    
    //accessor method for each attributes of Vehicle
    public int getvehicle_ID()
    {
        return this.vehicle_ID;
    }
    public String getvehicle_name()
    {
        return this.vehicle_name;
    }
    public String getvehicle_weight()
    {
        return this.vehicle_weight;
    }
    public String getvehicle_color()
    {
        return this.vehicle_color;
    }
    public String getvehicle_speed()
    {
        return this.vehicle_speed;
    }
    
    //setter method for vehicle_speed and vehicle_color
    public void setvehicle_speed(String vehicle_speed)
    {
        this.vehicle_speed = vehicle_speed;
    }
    public void setvehicle_color(String vehicle_color)
    {
        this.vehicle_color = vehicle_color;
    }
    
    //information display method
    public void display()
    {
    //displaying the attributes
     System.out.println("The ID of the vehicle is "+ this.vehicle_ID);
     System.out.println("The name of the vehicle is " + this.vehicle_name);
     System.out.println("The color of the vehicle is " + this.vehicle_color);
     System.out.println("The speed of the vehicle is " + this.vehicle_speed);
    
    //specified condition 
    if(this.vehicle_weight == "" )
    {
       System.out.println("The weight of the vehicle is empty");
    }
    else
    {
      System.out.println("The weight of the vehicle is" + this.vehicle_weight);  
    }
    }
}
