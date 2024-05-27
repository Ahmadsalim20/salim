/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahmed_cars;

/**
 *
 * @author Ahmed
 */
public class BMW extends CAR {
    
    public BMW(int size)
    {
        super(size);
    }

    @Override
    public   double getTax()
    {
        return tax*1.15;
    }
}
