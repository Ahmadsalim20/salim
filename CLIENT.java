/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahmed_cars;

import static ahmed_cars.CAR.SIZE;

/**
 *
 * @author Ahmed
 */
public class CLIENT {
    
    public  int index1=-1;
    private int lingthnumber_car=0;
    private int lingthbrand=0;
    private int  lingthmodle=0;
    private int lingthyear_of_manufacture=0;
    private int lingthcolor=0 ;
    private int lingthprice=0; 
    
    private int number_car[];
    private int lingthname=0;
    private int lingthid_number=0;
    private int lingthhpone_number=0;
    private int lingthaddress=0;
//  private  int cont_car=0;
    
    private String name[];
    private int id_number[];
    private int hpone_number[];
    private String address[];
//  private  int cont_car[];

    
    public int[] getNumber_cat() {
        return number_car;
    }

    public void setNumber_cat(int number_cat) {
        if(lingthnumber_car<SIZE)
        {
            this.number_car[lingthnumber_car] = number_cat;
            lingthnumber_car++;
        }else
        {
            System.out.print("car storage is full ====================================================");
        }
        
    }
    
    public String[] getName() {
        return name;
    }

    public void setName(String name) {
        this.name[lingthname] = name;
    }

    public int[] getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number [lingthid_number]= id_number;
    }

    public int[] getHpone_number() {
        return hpone_number;
    }

    public void setHpone_number(int hpone_number) {
        this.hpone_number[lingthhpone_number] = hpone_number;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address[lingthaddress] = address;
    }

    private String brand[];
    private String  modle[];
    private int year_of_manufacture[];
    private String color[] ;
    private double price[]; 
    
    public CLIENT(int size)
    {
    number_car=new int [size];
    address=new String[size];
    hpone_number=new int[size];
    id_number=new int [size];
    name=new String[size];
    brand=new String[size];
    modle=new String[size];
    color=new String[size];
    price=new double[size];
    year_of_manufacture=new int[size];
    }

    public String[] getBrand() {
        return brand;
    }

     public void setBrand(String brand)
    {
        if(lingthbrand<=SIZE)
        { 
            this.brand[lingthbrand]= brand;
           lingthbrand++;
        }else
        {
            System.out.print("array is full ====================================================");
        }
        
    }

    public String[] getModle() {
        return modle;
    }

    public void setModle(String modle) {
         if(lingthmodle<=SIZE)
        {   
            this.modle[lingthmodle] = modle;
         lingthmodle++;
        }else
        {
            System.out.print("array is full ====================================================");
        }
        
    }
    public int[] getYear_of_manufacture() {
        return year_of_manufacture;
    }

     public void setYear_of_manufacture(int year_of_manufacture) {
         if(lingthyear_of_manufacture<=SIZE)
        {  
            this.year_of_manufacture[lingthyear_of_manufacture] = year_of_manufacture;
          lingthyear_of_manufacture++;
        }else
        {
            System.out.print("array is full ====================================================");
        }
        
    }

    public String[] getColor() {
        return color;
    }

      public void setColor(String color) {
         if(lingthcolor<=SIZE)
        {   
          this.color[lingthcolor] = color;
         lingthcolor++;
        }else
        {
            System.out.print("array is full ====================================================");
        }
        
    }

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(lingthprice<=SIZE)
        {  
            this.price[lingthprice] = price;
       lingthprice++;
           
        }else
        {
            System.out.print("array is full ====================================================");
        }
    }
   
    
    public void display_updete_info_clint(int indix)
    {
        System.out.println("name"+"   "+"id_number"+"   "+"hpone_number"+"   "+"addriss"+"   "+"number_car"+"   "+"brand"+"   "+"modle"+"   "+"yearofma"+"   "+"color"+"   "+"price");
        for(int i=0;i<lingthbrand;i++)
        {
             System.out.print("  "+name[indix]+"  ");
             System.out.print("  "+id_number[indix]+"  ");
             System.out.print("  "+hpone_number[indix]+"  ");
             System.out.print("  "+address[indix]+"  ");
             System.out.print("  "+number_car[indix]+"  ");
             System.out.print("  "+brand[indix]+"  ");
             System.out.print("  "+modle[indix]+"  ");
             System.out.print("  "+year_of_manufacture[indix]+"  ");
             System.out.print("  "+color[indix]+"  ");
             System.out.print("  "+price[indix]+"  ");
             System.out.println();
        }
       
    }
 
    public void display_cars_clint()
    {
        System.out.println("name"+"   "+"id_number"+"   "+"hpone_number"+"   "+"addriss"+"   "+"number_car"+"   "+"brand"+"   "+"modle"+"   "+"yearofma"+"   "+"color"+"   "+"price"+"   "+"tax");
        for(int i=0;i<lingthbrand;i++)
        {
             System.out.print("  "+name[i]+"  ");
             System.out.print("  "+id_number[i]+"  ");
             System.out.print("  "+hpone_number[i]+"  ");
             System.out.print("  "+address[i]+"  ");
             System.out.print("  "+number_car[i]+"  ");
             System.out.print("  "+brand[i]+"  ");
             System.out.print("  "+modle[i]+"  ");
             System.out.print("  "+year_of_manufacture[i]+"  ");
             System.out.print("  "+color[i]+"  ");
             System.out.print("  "+price[i]+"  ");
             System.out.println("  "+price[i]*1.15+"  ");
            System.out.println("========================================================================================");

        }
       
    }
    
       public void update_car_data(int value,int number_cat, String brand,String modle,int year_of_manufacture,String color,double price)
    {
        if(value>=0&&value<lingthbrand)
        {
        this.number_car[value] = number_cat;
        this.brand[value]=brand;
        this.modle[value]=modle;
        this.year_of_manufacture[value]=year_of_manufacture;
        this.color[value]=color;
        this.price[value]=price;
        }
        else
        {
             System.out.print("index out of array tray agin ====================================================");
        }
        
        
       
    }
     public void update_clint_info(int value,String name,int id_number,int hpone_number,String address)
        {
            if(value>=0&&value<lingthbrand)
            {
                this.name[value]=name;
                this.id_number[value]=id_number;
                this.hpone_number[value]=hpone_number;
                this.address[value]=address;
            }
            else
            {
                System.out.print("index out of array tray agin ====================================================");
            }
        }
      public int serchstring(String value)
    {
        
        if(lingthbrand!=0)
        {
            for(int i=0;i<lingthyear_of_manufacture;i++)
            {
                    String tchak=name[i];
                    if(tchak.equals(value))
                    {
                        index1=i;
                        System.out.print(" found clint ==================================================== \n");
                    }
                    else
                    {
                        System.out.print(" not found clint ==================================================== \n");
                    }
            } 
        }else
        {
            System.out.print(" there is on clint ====================================================\n");
        }
        return index1;
    }
    
}
