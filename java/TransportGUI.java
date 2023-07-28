
//importing from package
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.Font;

//forming class nasmed as TransportGUI
public class TransportGUI implements ActionListener{

    //forming ArrayList of vehicle type
    ArrayList<Vehicle> dal = new ArrayList<Vehicle>();

    //instance variable in transport GUI of method 1
    private JFrame frame;
    private JPanel panel;
    private JLabel Transport_;
    private JButton AutoRickshaw, ElectricScooter;

    //instance variable in AutoRickshaw  of method 2
    private JFrame frame2;
    private JPanel panel2;
    private JLabel AutoRickshaw_;
    private JLabel vehicle_ID1, vehicle_name1, vehicle_weight1, vehicle_color1, vehicle_speed1;
    private JLabel engine_displacement, torque, number_of_seats, fuel_tank_capacity, ground_clearance,vvehicle_ID, charge_amount, booked_date, book1;
    private JTextField vIDtext1, vnametext1, vweighttext1, vcolortext1, vspeedtext1, vvehicle_IDtext;
    private JTextField edtext, torquetext, nostext, ftctext, gctext, catext;
    private JButton addbtn1, dybtn1, bkbtn1, crbtn1, bbtn1; 
    private JComboBox ys, month, date;
    private AutoRickhaw autorick_obj;
    
    //instance variable in ElectricScooter  of method 3
    private JFrame frame3;
    private JPanel panel3;
    private JLabel ElectricScooter_;
    private JLabel vehicle_ID2, vehicle_name2, vehicle_weight2, vehicle_color2, vehicle_speed2;
    private JLabel range, battery_capacity, price, charging_time, brand, mileage, has_purchased, sell;
    private JTextField vIDtext2, vnametext2, vweighttext2, vcolortext2, vspeedtext2;
    private JTextField rangetext, bctext, pricetext, cttext, brandtext, mileagetext;
    private JButton addbtn2, dybtn2, bkbtn2, crbtn2, bbtn2, purchase, sell_btn;
    

    //instance variable in purchased GUI of ElectricScooter  of method 4
    private JFrame frame4;
    private JPanel panel4;
    private JLabel for_purchase, vvehicle_ID1, brand1, price1, charging_time1, mileage1, range1;
    private JTextField vvehicle_IDtext1, brandtext1 , pricetext1, cttext1, mileagetext1, rangetext1;
    private JButton confirm, exit, clear;
    private ElectricScooter electro_obj;

    //instance variable in sell GUI of ElectricScooter  of method 5
    private JFrame frame5;
    private JPanel panel5;
    private JLabel for_sell, vvehicle_ID2, price2;
    private JTextField vvehicle_IDtext2, pricetext2;
    private JButton confirm1, exit1, clear2;

    //transport GUI
    public void method1(){

        //frame 
        frame = new JFrame();
        frame.setTitle("Transport GUI");

        //panel
        panel = new JPanel();
        panel.setBounds(0, 0, 300, 300);
        panel.setLayout(null);

        //Font 
        Font font1 = new Font("", Font.BOLD, 30);

        //Heading in TransportGUI 
        Transport_ = new JLabel("Transport GUI");
        Transport_.setFont(font1);
        Transport_.setBounds(30, 0, 270, 40);
        panel.add(Transport_);

        //button for going in AutoRickshaw frame
        AutoRickshaw = new JButton("AutoRickshaw");
        AutoRickshaw.setBounds(50, 110, 170, 40);
        AutoRickshaw.setFocusable(false);
        AutoRickshaw.addActionListener(this);
        panel.add(AutoRickshaw);

        //button for going in ElectricScooter frame
        ElectricScooter = new JButton("ElectricScooter");
        ElectricScooter.setBounds(50, 155, 170, 40);
        ElectricScooter.setFocusable(false);
        ElectricScooter.addActionListener(this);
        panel.add(ElectricScooter);

        //adding panel in frame
        frame.add(panel);

        //frame structure,size and location with layout
        frame.setBounds(100, 100, 300, 300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    //AutoRickshaw GUI
    public void method2(){

        //frame
        frame2 = new JFrame();
        frame2.setTitle("AutoRickshaw GUI");

        //panel 
        panel2 = new JPanel();
        panel2.setBounds(0, 0, 900, 600);
        panel2.setLayout(null);
        
        //font
        Font font1 = new Font("", Font.BOLD, 30);
        Font font2 = new Font("Serif", 0, 20);

        //Heading in AutoRickshaw GUI 
        AutoRickshaw_ = new JLabel("Auto Rickshaw");
        AutoRickshaw_.setFont(font1);
        AutoRickshaw_.setBounds(30, 10, 310, 50);
        panel2.add(AutoRickshaw_);

        //vehicle_ID
        vehicle_ID1 = new JLabel("Vehicle ID");
        vehicle_ID1.setBounds(30, 90, 190, 30);
        vehicle_ID1.setFont(font2);
        panel2.add(vehicle_ID1);

        //textField for vehicle ID
        vIDtext1 = new JTextField();
        vIDtext1.setBounds(220, 90, 220, 30);
        panel2.add(vIDtext1);

        //vehicle_name
        vehicle_name1 = new JLabel("Vehicle Name");
        vehicle_name1.setBounds(30, 130, 190, 30);
        vehicle_name1.setFont(font2);
        panel2.add(vehicle_name1);

        //textField for vehicle name
        vnametext1 = new JTextField();
        vnametext1.setBounds(220, 130, 220, 30);
        panel2.add(vnametext1);

        //vehicle_weight
        vehicle_weight1= new JLabel("Vehicle Weight");
        vehicle_weight1.setBounds(30, 170, 190, 30);
        vehicle_weight1.setFont(font2);
        panel2.add(vehicle_weight1);

        //textField for vehicle weight
        vweighttext1 = new JTextField();
        vweighttext1.setBounds(220, 170, 220, 30);
        panel2.add(vweighttext1);

        //vehicle_color
        vehicle_color1 = new JLabel("Vehicle Color");
        vehicle_color1.setBounds(30, 210, 190, 30);
        vehicle_color1.setFont(font2);
        panel2.add(vehicle_color1);

        //textField for vehicle color
        vcolortext1 = new JTextField();
        vcolortext1.setBounds(220, 210, 220, 30);
        panel2.add(vcolortext1);

        //vehicle_speed
        vehicle_speed1 = new JLabel("Vehicle Speed");
        vehicle_speed1.setBounds(30, 250, 190, 30);
        vehicle_speed1.setFont(font2);
        panel2.add(vehicle_speed1);

        //textField for vehicle speed
        vspeedtext1 = new JTextField();
        vspeedtext1.setBounds(220, 250, 220, 30);
        panel2.add(vspeedtext1);

        //engine_displacement
        engine_displacement = new JLabel("Engine Displacement");
        engine_displacement.setBounds(30, 290, 190, 30);
        engine_displacement.setFont(font2);
        panel2.add(engine_displacement);

        //textField for enginedisplacement
        edtext = new JTextField();
        edtext.setBounds(220, 290, 220, 30);
        panel2.add(edtext);

        //torque
        torque = new JLabel("Torque");
        torque.setBounds(30, 330, 190, 30);
        torque.setFont(font2);
        panel2.add(torque);

        //textField for torque
        torquetext = new JTextField();
        torquetext.setBounds(220, 330, 220, 30);
        panel2.add(torquetext);

        //ground clearance
        ground_clearance = new JLabel("Ground Clearance");
        ground_clearance.setBounds(30, 370, 190, 30);
        ground_clearance.setFont(font2);
        panel2.add(ground_clearance);

        //textField for ground clearance
        gctext = new JTextField();
        gctext.setBounds(220, 370, 220, 30);
        panel2.add(gctext);

        //fuel_tank_capacity
        fuel_tank_capacity = new JLabel("Fuel Tank Capacity");
        fuel_tank_capacity.setBounds(30, 410, 190, 30);
        fuel_tank_capacity.setFont(font2);
        panel2.add(fuel_tank_capacity);

        //textField for fuel tank capacity
        ftctext = new JTextField();
        ftctext.setBounds(220, 410, 220, 30);
        panel2.add(ftctext);
        
        //Making booking for auto rickshaw in same frame
        
        //heading as booking
        book1 = new JLabel("Booking");
        book1.setBounds(470, 90, 190, 30);
        book1.setFont(new Font("Serif",Font.BOLD, 25 ));
        panel2.add(book1);

        //vehicle iD for booking check
        vvehicle_ID = new JLabel("Vehicle ID");
        vvehicle_ID.setBounds(470, 130, 190, 30);
        vvehicle_ID.setFont(font2);
        panel2.add(vvehicle_ID);

        //vehicle id text area for booking check
        vvehicle_IDtext = new JTextField();
        vvehicle_IDtext.setBounds(640, 130, 220, 30);
        panel2.add(vvehicle_IDtext);

        //number of seats
        number_of_seats = new JLabel("Number of seats");
        number_of_seats.setBounds(470, 170, 190, 30);
        number_of_seats.setFont(font2);
        panel2.add(number_of_seats);

        //number of seats textfield
        nostext = new JTextField();
        nostext.setBounds(640, 170, 220, 30);
        panel2.add(nostext);

        //charge amount
        charge_amount = new JLabel("Charge Amount");
        charge_amount.setBounds(470, 210, 190, 30);
        charge_amount.setFont(font2);
        panel2.add(charge_amount);

        //charge amount text textfield
        catext = new JTextField();
        catext.setBounds(640, 210, 220, 30);
        panel2.add(catext);

        //booked_date
        booked_date = new JLabel("Booked Date");
        booked_date.setBounds(470, 250, 190, 30);
        booked_date.setFont(font2);
        panel2.add(booked_date);

        //combobox for booked date
        String[] yars = {"1995" , "1996" , "1997" , "1998" , "1999" ,"2000" , "2001" , "2002" , "2003" , "2004" , "2005" , "2006" , "2007" , "2008" , "2009" , "2010" , "2011" , "2012" , "2013" , "2014" , "2015" , "2016" , "2017" , "2018" , "2019" , "2020" , "2021" , "2022"};

        ys = new JComboBox(yars);
        ys.setBounds(640, 250, 60, 40);
        ys.setFocusable(false);
        panel2.add(ys);

        //months

        String[] months = {"Janauary" , "Feburary" , "March" , "April" , "May" ,"June" , "July" , "August" , "September" , "October" , "November" , "December"};

        month = new JComboBox(months);
        month.setBounds(708, 250, 90, 40);
        month.setFocusable(false);
        panel2.add(month);

        //date
        String[] dates = {"1" , "2" , "3" , "4" , "5" ,"6" , "7" , "8" , "9" , "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" , "20" , "21" , "22" , "23" , "24" , "25" , "26" , "27" , "28" , "29" , "30"};

        date = new JComboBox(dates);
        date.setBounds(808, 250, 40, 40);
        date.setFocusable(false);
        panel2.add(date);        

        //button add
        addbtn1 = new JButton("ADD");
        addbtn1.setBounds(50, 480, 100, 50);
        addbtn1.setFocusable(false);
        addbtn1.addActionListener(this);
        panel2.add(addbtn1);

        //button display
        dybtn1 = new JButton("DISPLAY");
        dybtn1.setBounds(200, 480, 100, 50);
        dybtn1.setFocusable(false);
        dybtn1.addActionListener(this);
        panel2.add(dybtn1);

        //button book
        bkbtn1 = new JButton("BOOK");
        bkbtn1.setBounds(350, 480, 100, 50);
        bkbtn1.setFocusable(false);
        bkbtn1.addActionListener(this);
        panel2.add(bkbtn1);

        //button clear
        crbtn1 = new JButton("CLEAR");
        crbtn1.setBounds(500, 480, 100, 50);
        crbtn1.setFocusable(false);
        crbtn1.addActionListener(this);
        panel2.add(crbtn1);

        //button back
        bbtn1 = new JButton("BACK");
        bbtn1.setBounds(650, 480, 100, 50);
        bbtn1.setFocusable(false);
        bbtn1.addActionListener(this);
        panel2.add(bbtn1);
        
        //adding panel in frame
        frame2.add(panel2);

        //frame structure,size and location with layout
        frame2.setBounds(100, 100, 900, 600);
        frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.setVisible(true);

    }
    
    //electricScooter GUI
    public void method3(){

        //frame
        frame3 = new JFrame();
        frame3.setTitle("Electric Scooter GUI");

        //panel
        panel3 = new JPanel();
        panel3.setBounds(0, 0, 900, 600);
        panel3.setLayout(null);
        
        //font
        Font font1 = new Font("", Font.BOLD, 30);
        Font font2 = new Font("Serif", 0, 20);

        //Heading as a ElectricScooter
        ElectricScooter_ = new JLabel("Electric Scooter");
        ElectricScooter_.setFont(font1);
        ElectricScooter_.setBounds(30, 10, 310, 50);
        panel3.add(ElectricScooter_);

        //vehicle_ID
        vehicle_ID2 = new JLabel("Vehicle ID");
        vehicle_ID2.setBounds(30, 90, 190, 30);
        vehicle_ID2.setFont(font2);
        panel3.add(vehicle_ID2);

        //textField for vehicle ID
        vIDtext2 = new JTextField();
        vIDtext2.setBounds(220, 90, 220, 30);
        panel3.add(vIDtext2);

        //vehicle_name
        vehicle_name2 = new JLabel("Vehicle Name");
        vehicle_name2.setBounds(30, 130, 190, 30);
        vehicle_name2.setFont(font2);
        panel3.add(vehicle_name2);

        //textField for vehicle name
        vnametext2 = new JTextField();
        vnametext2.setBounds(220, 130, 220, 30);
        panel3.add(vnametext2);

        //vehicle_weight
        vehicle_weight2 = new JLabel("Vehicle Weight");
        vehicle_weight2.setBounds(30, 170, 190, 30);
        vehicle_weight2.setFont(font2);
        panel3.add(vehicle_weight2);

        //textField for vehicle weight
        vweighttext2 = new JTextField();
        vweighttext2.setBounds(220, 170, 220, 30);
        panel3.add(vweighttext2);

        //vehicle_color
        vehicle_color2 = new JLabel("Vehicle Color");
        vehicle_color2.setBounds(30, 210, 190, 30);
        vehicle_color2.setFont(font2);
        panel3.add(vehicle_color2);

        //textField for vehicle color
        vcolortext2 = new JTextField();
        vcolortext2.setBounds(220, 210, 220, 30);
        panel3.add(vcolortext2);

        //vehicle_speed
        vehicle_speed2 = new JLabel("Vehicle Speed");
        vehicle_speed2.setBounds(30, 250, 190, 30);
        vehicle_speed2.setFont(font2);
        panel3.add(vehicle_speed2);

        //textField for vehicle speed
        vspeedtext2 = new JTextField();
        vspeedtext2.setBounds(220, 250, 220, 30);
        panel3.add(vspeedtext2);

        //battery_capacity
        battery_capacity = new JLabel("Battery Capacity");
        battery_capacity.setBounds(30, 290, 190, 30);
        battery_capacity.setFont(font2);
        panel3.add(battery_capacity);

        //textField for battery capacity
        bctext = new JTextField();
        bctext.setBounds(220, 290, 220, 30);
        panel3.add(bctext);
        
        //has_purchased 
        has_purchased = new JLabel("Click to Purchase");
        has_purchased.setBounds(470, 90, 240, 30);
        has_purchased.setFont(new Font("Serif",Font.BOLD, 25 ));
        panel3.add(has_purchased);

        //button for  has_purchased
        purchase = new JButton("Purchase");
        purchase.setBounds(640, 130, 150, 50);
        purchase.setFocusable(false);
        purchase.addActionListener(this);
        panel3.add(purchase);

        //sell
        sell = new JLabel("Click to Sell ");
        sell.setBounds(470, 210, 190, 30);
        sell.setFont(new Font("Serif",Font.BOLD, 25 ));
        panel3.add(sell);

        //sell button
        sell_btn = new JButton("Sell");
        sell_btn.setBounds(640, 250, 150, 50);
        sell_btn.setFocusable(false);
        sell_btn.addActionListener(this);
        panel3.add(sell_btn);

        //button add
        addbtn2 = new JButton("ADD");
        addbtn2.setBounds(50, 480, 100, 50);
        addbtn2.setFocusable(false);
        addbtn2.addActionListener(this);
        panel3.add(addbtn2);

        //button display
        dybtn2 = new JButton("DISPLAY");
        dybtn2.setBounds(200, 480, 100, 50);
        dybtn2.setFocusable(false);
        dybtn2.addActionListener(this);
        panel3.add(dybtn2);

        //button clear
        crbtn2 = new JButton("CLEAR");
        crbtn2.setBounds(350, 480, 100, 50);
        crbtn2.setFocusable(false);
        crbtn2.addActionListener(this);
        panel3.add(crbtn2);

        //button back
        bbtn2 = new JButton("BACK");
        bbtn2.setBounds(500, 480, 100, 50);
        bbtn2.setFocusable(false);
        bbtn2.addActionListener(this);
        panel3.add(bbtn2);
        
        //adding panel in frame
        frame3.add(panel3);
        
        //frame structure,size and location with layout
        frame3.setBounds(100, 100, 900, 600);
        frame3.setResizable(false);
        frame3.setLayout(null);
        frame3.setVisible(true);

    }

    //gui for purchased
    public void method4(){

        //frame 
        frame4 = new JFrame();
        frame4.setTitle("Purchased GUI");

        //panel 
        panel4 = new JPanel();
        panel4.setBounds(0, 0, 400, 600);
        panel4.setLayout(null);
        
        //font
        Font font1 = new Font("", Font.BOLD, 30);
        Font font2 = new Font("Serif", 0, 20);

        //for heading purchase
        for_purchase = new JLabel("For Purchase");
        for_purchase.setBounds(30, 10 , 310 , 50);
        for_purchase.setFont(font1);
        panel4.add(for_purchase);

        //vehicle_ID
        vvehicle_ID1 = new JLabel("Vehicle ID");
        vvehicle_ID1.setBounds(30, 90, 150, 30);
        vvehicle_ID1.setFont(font2);
        panel4.add(vvehicle_ID1);

        //textField for vehicle ID
        vvehicle_IDtext1 = new JTextField();
        vvehicle_IDtext1.setBounds(160, 90, 220, 30);
        panel4.add(vvehicle_IDtext1);

        //brand for sell
        brand1 = new JLabel("Brand");
        brand1.setBounds(30, 130, 190, 30);
        brand1.setFont(font2);
        panel4.add(brand1);

        //brandtext for sell brand
        brandtext1 = new JTextField();
        brandtext1.setBounds(160, 130, 220, 30);
        panel4.add(brandtext1);

        //sell for price
        price1 = new JLabel("Price");
        price1.setBounds(30, 170, 190, 30);
        price1.setFont(font2);
        panel4.add(price1);

        //sell for pricetext
        pricetext1 = new JTextField();
        pricetext1.setBounds(160, 170, 220, 30);
        panel4.add(pricetext1);

        //sell for charging time
        charging_time1 = new JLabel("Charging Time");
        charging_time1.setBounds(30, 210, 190, 30);
        charging_time1.setFont(font2);
        panel4.add(charging_time1);

        //textfield for charging time 
        cttext1 = new JTextField();
        cttext1.setBounds(160, 210, 220, 30);
        panel4.add(cttext1);

        //sell for mileage
        mileage1 = new JLabel("Mileage");
        mileage1.setBounds(30, 250, 190, 30);
        mileage1.setFont(font2);
        panel4.add(mileage1);

        //textfield for mileage
        mileagetext1 = new JTextField();
        mileagetext1.setBounds(160, 250, 220, 30);
        panel4.add(mileagetext1);

        //sell for range
        range1 = new JLabel("Range");
        range1.setBounds(30, 290, 190, 30);
        range1.setFont(font2);
        panel4.add(range1);

        //textfield for range
        rangetext1 = new JTextField();
        rangetext1.setBounds(160, 290, 220, 30);
        panel4.add(rangetext1);

        //clear for purchase
        clear = new JButton("Clear");
        clear.setBounds(50, 480, 100, 50);
        clear.setFocusable(false);
        clear.addActionListener(this);
        panel4.add(clear);

        //button confirm
        confirm = new JButton("Confirm");
        confirm.setBounds(160, 480, 100, 50);
        confirm.setFocusable(false);
        confirm.addActionListener(this);
        panel4.add(confirm);

        //button display
        exit = new JButton("Exit");
        exit.setBounds(270, 480, 100, 50);
        exit.setFocusable(false);
        exit.addActionListener(this);
        panel4.add(exit);
        
        //adding panel in frame
        frame4.add(panel4);
        
        //frame structure,size and location with layout
        frame4.setBounds(1000, 100, 400, 600);
        frame4.setResizable(false);
        frame4.setLayout(null);
        frame4.setVisible(true);

    }
    
    //sell GUI
    public void method5(){

        //frame 
        frame5 = new JFrame();
        frame5.setTitle("Sell GUI");

        //panel 
        panel5 = new JPanel();
        panel5.setBounds(0, 0, 400, 340);
        panel5.setLayout(null);
        
        //font
        Font font1 = new Font("", Font.BOLD, 30);
        Font font2 = new Font("Serif", 0, 20);

        //for heading as a sell
        for_sell = new JLabel("Sell");
        for_sell.setBounds(30, 10 , 310 , 50);
        for_sell.setFont(font1);
        panel5.add(for_sell);

        //vehicle_ID
        vvehicle_ID2 = new JLabel("Vehicle ID");
        vvehicle_ID2.setBounds(30, 90, 150, 30);
        vvehicle_ID2.setFont(font2);
        panel5.add(vvehicle_ID2);

        //textField for vehicle ID
        vvehicle_IDtext2 = new JTextField();
        vvehicle_IDtext2.setBounds(160, 90, 220, 30);
        panel5.add(vvehicle_IDtext2);

        //sell for price
        price2= new JLabel("Price");
        price2.setBounds(30, 130, 190, 30);
        price2.setFont(font2);
        panel5.add(price2);

        //sell for pricetext
        pricetext2 = new JTextField();
        pricetext2.setBounds(160, 130, 220, 30);
        panel5.add(pricetext2);

        //clear
        clear2 = new JButton("Clear");
        clear2.setBounds(50, 220, 100, 50);
        clear2.setFocusable(false);
        clear2.addActionListener(this);
        panel5.add(clear2);

        //button confirm
        confirm1 = new JButton("Confirm");
        confirm1.setBounds(160, 220, 100, 50);
        confirm1.setFocusable(false);
        confirm1.addActionListener(this);
        panel5.add(confirm1);

        //button display
        exit1 = new JButton("Exit");
        exit1.setBounds(270, 220, 100, 50);
        exit1.setFocusable(false);
        exit1.addActionListener(this);
        panel5.add(exit1);
        
        //adding panel in frame
        frame5.add(panel5);
        
        //frame structure,size and location with layout
        frame5.setBounds(1000, 100, 400, 340);
        frame5.setResizable(false);
        frame5.setLayout(null);
        frame5.setVisible(true);

    }

    //Action performed method
    public void actionPerformed(ActionEvent e)
    { 
        
        //going in auto rickshaw frame from transport GUI
        if(e.getSource() == AutoRickshaw){
            frame.dispose();
            method2();
        }
        
        //going in electric scooter frame from transport GUI
        if(e.getSource() == ElectricScooter){
            frame.dispose();
            method3();
        }
        
        //going back to transport GUI frame from auto rickshaw
        if(e.getSource() == bbtn1){
            frame2.dispose();
            method1();
        }
        
        //going back to transport GUI frame from Electric Scooter
        if(e.getSource() == bbtn2){
            frame3.dispose();
            method1();
        }
        
        //going in purchase GUI frame after clicking the button of purchase present in elctric scooter
        if(e.getSource() == purchase){
            method4();
        }
        
        //disposing the frame of purchase GUI
        if(e.getSource() == exit){
            frame4.dispose();
        }
        
        //going in sell GUI frame after clicking the button of sell present in elctric scooter
        if(e.getSource() == sell_btn){
            method5();
        }
        
        //disposing the frame of sell GUI
        if(e.getSource() == exit1){
            frame5.dispose();
        }

        //Button function for add fields of auto rickshawGUI in array
        if(e.getSource() == addbtn1)
        {
            
            //for catching the number format exception
            try{
                
                //conversion of variable according to the GUI
                int vID = Integer.parseInt(vIDtext1.getText());

                String vehicle_name1 = vnametext1.getText();

                String vehicle_weight1 = vweighttext1.getText();

                String vehicle_color1= vcolortext1.getText();

                String vehicle_speed1 = vspeedtext1.getText();

                int ed = Integer.parseInt(edtext.getText());

                String torque = torquetext.getText();

                int ftc = Integer.parseInt(ftctext.getText());

                String ground_clearance= gctext.getText();

                 
                // creating object
                AutoRickhaw arobj = new AutoRickhaw(vID,vehicle_name1, vehicle_weight1, vehicle_color1, vehicle_speed1, ed, torque, ftc, ground_clearance);
                dal.add(arobj);
                ////displaying output through message dialog box
                JOptionPane.showMessageDialog(panel2, "Successfully added");

            }catch(NumberFormatException exc)
            {
                
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(panel2, "Please fill all the fields");
            }
        }

        //Button function for electricscooterGUI
        if(e.getSource() == addbtn2)
        {
            
            //for catching the number format exception
            try{

                int vID2 = Integer.parseInt(vIDtext2.getText());

                String vehicle_name2 = vnametext2.getText();

                String vehicle_weight2 = vweighttext2.getText();

                String vehicle_color2= vcolortext2.getText();

                String vehicle_speed2 = vspeedtext2.getText();

                int bc = Integer.parseInt(bctext.getText());

                ElectricScooter erobj = new ElectricScooter(vID2, vehicle_name2, vehicle_weight2, vehicle_color2, vehicle_speed2, bc);
                dal.add(erobj);
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(panel2, "Successfully Added");

            }catch(NumberFormatException excep){
                
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(panel2, "Please filled all the fields");
            }
        }

        //clear button for auto rickshawGUI
        if(e.getSource() == crbtn1){

            vIDtext1.setText("");
            vnametext1.setText("");
            vweighttext1.setText("");
            vcolortext1.setText("");
            vspeedtext1.setText("");
            edtext.setText("");
            torquetext.setText("");
            ftctext.setText("");
            gctext.setText("");
            vvehicle_IDtext.setText("");
            catext.setText("");
            nostext.setText("");
            ys.setSelectedIndex(0);
            month.setSelectedIndex(0);
            date.setSelectedIndex(0);

        }
        
        //clear button for electric ScooterGUI
        if (e.getSource() == crbtn2){

            vIDtext2.setText("");
            vnametext2.setText("");
            vweighttext2.setText("");
            vcolortext2.setText("");
            vspeedtext2.setText("");
            bctext.setText("");

        }
        
        //clear for purchaseGUI
        if (e.getSource() == clear){

            vvehicle_IDtext1.setText("");
            brandtext1.setText("");
            pricetext1.setText("");
            cttext1.setText("");
            mileagetext1.setText("");
            rangetext1.setText("");

        }

        //clear for sellGUI
        if (e.getSource() == clear2){

            vvehicle_IDtext2.setText("");
            pricetext2.setText("");

        }

        ////button function of booking of Autorickshaw
        if(e.getSource() == bkbtn1){
            
            //for catching the number format exception
            try{
                String yars = ys.getSelectedItem().toString();
                String months = month.getSelectedItem().toString();
                String dates = date.getSelectedItem().toString();
                
                //book date varaible bd
                String bd = yars +"/"+ months+ "/" + dates; 
                
                //variable according to GUI
                int vIDl = Integer.parseInt(vvehicle_IDtext.getText());
                int ca = Integer.parseInt(catext.getText());
                int nos = Integer.parseInt(nostext.getText());
                
                //going through every instance in ArrayList
                for(Vehicle obj : dal){
                    
                    //checking if obj4 instance of ELectric scooter or not
                    if(obj instanceof AutoRickhaw)
                    {
                        
                        //downcasting
                        autorick_obj = (AutoRickhaw) obj;
                        
                        //comparision
                        if(autorick_obj.getvehicle_ID() == vIDl){
                            
                            
                            if(autorick_obj.getis_booked() == true){
                                
                                //displaying output through message dialog box
                                JOptionPane.showMessageDialog(frame2, "Auto rickshaw has been already booked","Error",JOptionPane.WARNING_MESSAGE);

                            }
                            else if(autorick_obj.getis_booked() == false){
                                
                                //displaying output through message dialog box
                                autorick_obj.book(bd,ca,nos);
                                JOptionPane.showMessageDialog(frame2, "The vehicle ID  "+ vIDl + " with booked date " + bd + "," + " charge amount " + ca + " and " + "number of seats " + nos + " is succesfully booked.");
    
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame2, "Does not Exist","Error",JOptionPane.WARNING_MESSAGE);
                        }
                    
                    }
                }
            }
            catch(NumberFormatException excep)
            {
                
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(frame2, "Please fill all the fields.");
            }
        }
        
        //display for auto rickshaw
        if(e.getSource() == dybtn1){
            
            for(Vehicle obj1 : dal){
                
                if (obj1 instanceof AutoRickhaw){
                    
                    AutoRickhaw dobj1 = (AutoRickhaw)obj1;
                    dobj1.display();
                }
            }
        }

        ////button function of confirmation of purchase
        if(e.getSource() == confirm){
            
            //for catching the number format exception
            try{
                
                //variable according to GUI
                int vIDm = Integer.parseInt(vvehicle_IDtext1.getText());
                String brand1 = brandtext1.getText();
                int prize = Integer.parseInt(pricetext1.getText());
                String charging_time1 = cttext1.getText();
                String mileage1 = mileagetext1.getText();
                int ranze = Integer.parseInt(rangetext1.getText());
                
                //going through every instance in ArrayList
                for(Vehicle obj2 : dal){
                    
                    //checking if obj4 instance of ELectric scooter or not
                    if(obj2 instanceof ElectricScooter)
                    {
                        
                        //downcasting
                        electro_obj= (ElectricScooter) obj2;
                        
                        //comparision
                        if(electro_obj.getvehicle_ID() == vIDm){
                            //
                            if(electro_obj.gethas_purchased() == true){
                                
                                //displaying output through message dialog box
                                JOptionPane.showMessageDialog(frame3, "The vehicle has been already purchased.`","Error",JOptionPane.WARNING_MESSAGE);

                            }
                            else if(electro_obj.gethas_purchased() == false){
                                
                                //displaying output through message dialog box
                                electro_obj.purchase(brand1,prize,charging_time1,mileage1,ranze);
                                JOptionPane.showMessageDialog(frame3, "The vehicle ID  "+ vIDm + " with brand " + brand1 + ", " + " price " + prize + ", " + " charging time " + charging_time1 + "," +"\n " + "mileage  " + mileage1 + " and " + "range "  + ranze + " is succesfully purchased.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame3, "Does not Exist","Error",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException except)
            {   
                
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(frame3, "Please fill all the fields.");
            }
        }
        
        //electric scooter display
        if(e.getSource() == dybtn2){
            for(Vehicle obj3 : dal){
                if (obj3 instanceof ElectricScooter){
                    ElectricScooter dobj2 = (ElectricScooter)obj3;
                    dobj2.display();
                }
            }
        }
        
        
        //button function of confirmation of sell
        if(e.getSource() == confirm1){

            //for catching the number format exception
            try{

                int vIDn = Integer.parseInt(vvehicle_IDtext2.getText());
                int prize1 = Integer.parseInt(pricetext2.getText());

                //going through every instance in ArrayList
                for(Vehicle obj4 : dal){

                    //checking if obj4 instance of ELectric scooter or not
                    if(obj4 instanceof ElectricScooter)
                    {
                        
                        //downcasting 
                        electro_obj= (ElectricScooter) obj4;

                        //checking the vehicle id in textfield is present in array list 
                        if(electro_obj.getvehicle_ID() == vIDn){
                            
                            //checking the condition for has sold
                            if(electro_obj.gethas_sold() == true){
                                
                                //displaying output throug message dialog box
                                JOptionPane.showMessageDialog(frame3, "The vehicle has been alrady sold.","Error`",JOptionPane.WARNING_MESSAGE);

                            }
                            else if(electro_obj.gethas_sold() == false){
                                
                                //displaying output through message dialog box
                                electro_obj.sell(prize1);
                                JOptionPane.showMessageDialog(frame3, "The vehicle ID "+ vIDn + "of price " + prize1 + "has been succefully sold." );

                            }
                        }else{
                            JOptionPane.showMessageDialog(frame3, "Does not Exist","Error",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException except)
            {
                
                //displaying output through message dialog box
                JOptionPane.showMessageDialog(frame3, "Please fill all the fields.");
            }
        }

    }
    
    //calling the main method for transport GUI
    public static void main(String []args){
        TransportGUI maingui = new TransportGUI();
        maingui.method1();
    }

}