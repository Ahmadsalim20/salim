/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahmed_cars;
import java.util.Scanner;
/**
 *
 * @author Ahmed
 */
public class AHMED_CARS {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           BMW pmw1=new BMW(BMW.SIZE); 
           CLIENT clint=new CLIENT(BMW.SIZE);
           
     int number_car;
    String brand;
     String  modle;
     int year_of_manufacture;
     String color ;
     double price; 

      
        int key=1;
        while (key!=0)
        {
            System.out.print("'1'ADD CAR\n'2'display_Car_storage CAR\n'3'serch in storege\n'4'DELETE \n'5'serch\n'6'display_cats_clint \n'7'updat  car data in storing\n'8'sell car by nubmber car\n'9'sell  car by name car\n'10'update info clint\n'11'update info car of clint \n");
            int key1=input.nextInt();
            
            switch(key1)
            { 
       case 1:
           System.out.print("enter number car"); 
        pmw1.setNumber_cat(input.nextInt());
        System.out.print("enter brand");
        pmw1.setBrand(input.next());
        System.out.print("enter modle");
        pmw1.setModle(input.next());
        System.out.print("enter year_of_manufacture");
        pmw1.setYear_of_manufacture(input.nextInt()); 
        System.out.print("enter color");
        pmw1.setColor(input.next());
        System.out.print("enter price");
        pmw1.setPrice(input.nextDouble());
        break;
      
        case 2:
            pmw1.display_Car_storage();
        break;
        case 3: 
        System.out.print("  serch in storege enter name the car \n");
        pmw1.serchstring(input.next());
       ;break;
        case 4:
            System.out.print(" enter name car for delete\n");
             brand=input.next();
            pmw1.del_car(pmw1.serchstring(brand));
            break;
        case 5:
               System.out.print(" enter number car for serch\n");
            number_car=input.nextInt();
            pmw1.serchint(number_car);
                    ;break;
        case 6:
       clint.display_cars_clint();
       break;
        case 7:
               System.out.print(" enter  name car for updete \n");
              brand=input.next();
            if(pmw1.serchstring(brand)!=-1)
            {
        System.out.print("enter number car"); 
        int nuber2=input.nextInt();
        System.out.print("enter brand");
         brand=input.next();
        System.out.print("enter modle");
         modle=input.next();
        System.out.print("enter year_of_manufacture");
         year_of_manufacture=input.nextInt();
        System.out.print("enter color");
         color=input.next();
        System.out.print("enter price");
         price=input.nextDouble();
         pmw1.update_data(pmw1.serchstring(brand), nuber2, brand, modle, year_of_manufacture, color, price);

            }
            break;
        case 8:    
             if(pmw1.getLingthbrand()!=-1)
            {  
            System.out.print(" enter nubmber car for sell\n");
            int sercch=pmw1.serchint(input.nextInt());
            pmw1.sell_car(sercch);
                String arraybrand[]=pmw1.getBrand();
             String arraycolor[]=pmw1.getColor();
             int arrayyear_of[]=pmw1.getYear_of_manufacture();
             double arrayprice[]=pmw1.getPrice();
             double price1=arrayprice[sercch];
             
             int  array_NunberCar[]=pmw1.getNumber_cat();
             int NunberCar=array_NunberCar[sercch];
              clint.setNumber_cat(NunberCar);
             String olor1=arraycolor[sercch];
             String arraymodle[]=pmw1.getModle();
             int yars=arrayyear_of[sercch];
             String modle1=arraymodle[sercch];
             String brand1=arraybrand[sercch];
             clint.setBrand(brand1);
             clint.setModle(modle1);
             clint.setYear_of_manufacture(yars);
             clint.setColor(olor1);
             clint.setPrice(price1);
            System.out.print("enter name clint ");
            clint.setName(input.next());
            System.out.print("enter id number clint");
             clint.setId_number(input.nextInt());
            System.out.print("enter phone number clint");
            clint.setHpone_number(input.nextInt());
            System.out.print("enter addriss clint");
           clint.setAddress(input.next());
           clint.display_cars_clint();
           pmw1.setIndex1();
           break;
            }else
            {
                 System.out.print("car not found ====================================================");
            }
            break;
            
                 case 9:
                     
                          if(pmw1.getLingthbrand()!=-1)
            {  
            System.out.print(" enter name car for sell\n");
            int sercch=pmw1.serchstring(input.next());
            pmw1.sell_car(sercch);
            String arraybrand[]=pmw1.getBrand();
             String arraycolor[]=pmw1.getColor();
             int arrayyear_of[]=pmw1.getYear_of_manufacture();
             double arrayprice[]=pmw1.getPrice();
             double price1=arrayprice[sercch];
             String olor1=arraycolor[sercch];
             String arraymodle[]=pmw1.getModle();
             int yars=arrayyear_of[sercch];
             String modle1=arraymodle[sercch];
             String brand1=arraybrand[sercch];
             clint.setBrand(brand1);
             clint.setModle(modle1);
             clint.setYear_of_manufacture(yars);
             clint.setColor(olor1);
             clint.setPrice(price1);
            System.out.print("enter name clint ");
           clint.setName(input.next());
            System.out.print("enter id number clint");
           clint.setId_number(input.nextInt());
           System.out.print("enter phone number clint");
           clint.setHpone_number(input.nextInt());
          System.out.print("enter addriss clint");
           clint.setAddress(input.next());
           clint.display_cars_clint();
           pmw1.setIndex1();
            }else
            {
                 System.out.print("car not found ====================================================");
            }  break;
          
                 case 10:
                         
            System.out.print("enter name clint for update"); 
            String value3=input.next();
            if(clint.serchstring(input.next())!=-1)
            {
             System.out.print("enter clint name  ");
            String name=input.next();
            System.out.print("enter clint id number");
            int id_number=input.nextInt();
            System.out.print("enter clint phone number");
            int hpone_number=input.nextInt();
            System.out.print("enter clint addriss");
            String address=input.next();
           clint.update_clint_info(clint.serchstring(value3), name, id_number, hpone_number, address);
           clint.display_updete_info_clint(clint.serchstring(value3));
           }
            else
            {
                System.out.print("not found clint ===================================================="); 
            }
     break;
                 case 11:
                     System.out.print("enter car clint for update ===================================================="); 
           brand=input.next();
            if(clint.serchstring( brand)!=-1)
            {
            System.out.print("enter number car");
            number_car=input.nextInt();
            System.out.print("enter brand clint car  ");
            brand=input.next();
            System.out.print("enter  modle clint car");
            modle=input.next();
            System.out.print("enter  year_of_manufacture clint car ");
            year_of_manufacture=input.nextInt();
            System.out.print("enter color");
            color=input.next();
            System.out.print("enter  price clint car");
            price=input.nextDouble();
            clint.update_car_data(clint.serchstring( brand), number_car, brand, modle, year_of_manufacture, color, price);
            clint.display_updete_info_clint(clint.serchstring(brand));
           }
            else
            {
                System.out.print("not found clint ===================================================="); 
            }
        }
    }
}
    }