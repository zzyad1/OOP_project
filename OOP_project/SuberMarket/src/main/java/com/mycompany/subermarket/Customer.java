/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subermarket;

/**
 *
 * @author Al Abouzaid
 */
    public class Customer extends User implements  Details
{
    
    
    public static double Discounts;

    public Customer() {
    }

    public Customer(int id, String n, String add, String ph, Gender gan) {
        super(id, n, add, ph, gan);
    }
    

    public Customer(int id, String n, String add, String ph) {
        super(id, n, add, ph);
    }

    
   
    public static double offer ( double Total)
    {
        if (Total>  200 && Total<500)
        {
            Discounts=0.10;
            return Discounts;
        }
        else if (Total>  500 && Total<1000)
        {
            Discounts=0.15;
            return Discounts;
        }
        else if (Total>  1000 && Total<2000)
        {
            Discounts=0.25;
             return Discounts;
        }
         else if (Total>  2000 )
        {
            Discounts=0.30;
             return Discounts;
        }
        else
              Discounts=0;
             return Discounts;
    }
    @Override
    public String toString(){
      return " Customer Name:  : " + this.getName() + "\n"
           + " Customer ID:  : " + this.getID() + "\n"
           + " Customer Address:  : " + this.getAddress() + "\n"
           + " Customer Phone: : " + this.getPhone_num();
    }
    @Override
    public void Show_Details()
    {
        System.out.println(" Customer Name:  : " + this.getName());
        System.out.println(" Customer ID:  : " + this.getID());
        System.out.println(" Customer Address:  : " + this.getAddress());
        System.out.println(" Customer Phone: : " + this.getPhone_num());
        
    }

    }

  