/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subermarket;

    
    public class Manager extends User implements  Details
{
    public double Profit;

    public Manager() {
        
    }
 public Manager(int id, String n, String add, String ph) {
        super(id, n, add, ph );
    }
    
    public Manager(int id, String n, String add, String ph, Gender gan) {
        super(id, n, add, ph, gan);
    }
    

    public double getProfit() 
    {
        return Profit;
    }
    public double calcProfit()
    {
    
        return Profit;
    }
    @Override
    public String toString(){
      return " Manager name:  : " + this.getName() + "\n"
                + " Manager ID:  : " + this.getID() + "\n"
                + " Manager Address:  : " + this.getAddress() + "\n"
                + " Manager Phone: : " + this.getPhone_num();
    }

    
    @Override
    public void Show_Details()
    {
        System.out.println(" Manager Name:  : " + this.getName());
        System.out.println(" Manager ID:  : " + this.getID());
        System.out.println(" Manager Address:  : " + this.getAddress());
        System.out.println(" Manager Phone: : " + this.getPhone_num());
    }
    
    
    
}
