/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahmed_cars;

/**
 *
 * @author Ahmed
 */
public abstract class CAR implements NewInterface{
    public  int index1=-1;
    final static int SIZE=5;
    final public int mileage=0;
    protected double  tax;
    private int cont;
    private int lingthnumber_car=0;
    private int lingthbrand=0;
    private int  lingthmodle=0;
    private int lingthyear_of_manufacture=0;
    private int lingthcolor=0 ;
    private int lingthprice=0; 
    
    private int number_car[];
    private String brand[];
    private String  modle[];
    private int year_of_manufacture[];
    private String color[] ;
    private double price[]; 
    
    public CAR(int size){
    number_car=new int [size];
    brand=new String[size];
    modle=new String[size];
    color=new String[size];
    price=new double[size];
    year_of_manufacture=new int[size];
}

    public int getLingthbrand() {
        return lingthbrand;
    }

    
public  abstract double getTax();

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String[] getBrand() {
        return brand;
    }

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
            System.out.println("car storage is full ====================================================");
        }
        
    }
    
    public void setBrand(String brand)
    {
        if(lingthbrand<SIZE)
        {
            
            this.brand[lingthbrand]= brand;
            lingthbrand++;
        }else
        {
            System.out.println("car storage is full ====================================================");
        }
    }

    public String[] getModle() {
        return modle;
    }

    public void setModle(String modle) {
         if(lingthmodle<SIZE)
        {
            this.modle[lingthmodle] = modle;
            lingthmodle++;
        }else
        {
            System.out.println("car storage is full ====================================================");
            
        }
    }

    public int[] getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
         if(lingthyear_of_manufacture<SIZE)
        {
           
            this.year_of_manufacture[lingthyear_of_manufacture] = year_of_manufacture;
             lingthyear_of_manufacture++;
        }else
        {
            System.out.println("car storage is full ====================================================");
        }
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String color) {
         if(lingthcolor<SIZE)
        {
            
          this.color[lingthcolor] = color;
            lingthcolor++;
        }else
        {
            System.out.println("car storage is full ====================================================");
        }
        
    }

    public double[] getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(lingthprice<SIZE)
        { 
            this.price[lingthprice] = price;
        lingthprice++;
            
        }else
        {
            System.out.println("car storage is full ==================================================== ");
        }
    }
@Override
    public void display_Car_storage()
    {
        System.out.println("nuber car"+"   "+"brand"+"   "+"modle"+"   "+"yearofma"+"   "+"color"+"   "+"price"+"   "+"tax");
        for(int i=0;i<lingthbrand;i++)
        {
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
     
    public void del_car( int index)
    {
        if(lingthbrand!=0)
        {
            if(index>=0&&index<lingthbrand)
            {
              for(int i=index;i<lingthbrand;i++)
              {
                  brand[i]=brand[i+1];
                  modle[i]=modle[i+1];
                  year_of_manufacture[i]=year_of_manufacture[i+1];
                  color[i]=color[i+1];
                  price[i]=price[i+1];
                  number_car[i]=number_car[i+1];
 
              }
               lingthnumber_car--;
               lingthbrand--;
               lingthmodle--;
               lingthyear_of_manufacture--;
               lingthcolor-- ;
               lingthprice--;     
               System.out.print(" Deleted==================================================== \n");
            }else
            {
                  System.out.print(" index out of array tray agin==================================================== \n");
            }
            
        }else
            {
                  System.out.print(" here is on cars====================================================\n");
            }
    }
    
        public int  serchint(int value)
    {
        if(lingthbrand!=0)
        {
            for(int i=0;i<lingthnumber_car;i++)
            {
                if(value==number_car[i])
                {     
                     index1=i; 
                }

            }
            
        }else
        {
            System.out.print(" here is on cars====================================================\n");
        }
        if(lingthbrand>0&&index1==-1)
        {
       System.out.print("not fund car ====================================================\n");

        }
        return index1;
    }
        
    public int serchstring(String value)
    {
        if(lingthbrand!=0)
        {
            for(int i=0;i<lingthyear_of_manufacture;i++)
            {
                    String tchak=brand[i];
                    if(tchak.equalsIgnoreCase(value))
                    {
                        index1=i;
                        System.out.print(" fund car ====================================================\n");
                        break;
                    }
                    else
                    {
                        System.out.print(" not fund cat ====================================================\n");
                    }
            } 
        }else
        {
            System.out.print(" there is on cars ====================================================\n");
        }
        return index1;
    }
    
    public void sell_car(  int car_number)
    {
            System.out.println("   "+"brand"+"   "+"modle"+"   "+"yearofma"+"   "+"color"+"   "+"price");
      
     if(car_number!=-1)
     {
            System.out.print("  "+brand[car_number]+"  ");
            System.out.print("  "+modle[car_number]+"  ");
            System.out.print("  "+year_of_manufacture[car_number]+"  ");
            System.out.print("  "+color[car_number]+"  ");
            System.out.print("  "+price[car_number]+"  ");
            System.out.println();
            
             lingthnumber_car--;
             lingthbrand--;
             lingthmodle--;
             lingthyear_of_manufacture--;
             lingthcolor-- ;
             lingthprice--;     
     }else
     {
         System.out.print("car not found==================================================== ");
     }

    }
    public void update_data(int value,int number_cat, String brand,String modle,int year_of_manufacture,String color,double price)
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
             System.out.print("index out of array tray agin====================================================");
        }
       
    }

    public void setIndex1() {
        this.index1 =-1;
    }
    

}
