/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subermarket;

import static com.mycompany.subermarket.Customer.offer;

/**
 *
 * @author Al Abouzaid
 */
public class Cashier extends User implements Details {
  public double salary;
  public double bouns;
  public double deduction;
public Cashier ()
 {
     
 }

    public Cashier(int id, String n,String add , String ph) {

        super(id, n, add, ph);  
    }

    public Cashier(double salary, double bouns, double deduction, int id, String n, String add, String ph, Gender gan) {
        super(id, n, add, ph, gan);
        this.salary = salary;
        this.bouns = bouns;
        this.deduction = deduction;
    }
  
                         
public void setsalary (double salary)
{
 this.salary=salary;
   }
public void setbouns (double bouns)
{
 this.bouns=bouns;
   }
public void setdeduction (double deduction)
{
 this.deduction=deduction;
 }
public double getsalary ()
{
    return salary;
}
public double getbouns ()
{
    return bouns ;
    
}
public double getdeduction ()
{
    return deduction ;
}
public static double CalcSubTotal(double... numbers)
    {
     double calc = 0;
     for (double number : numbers) {
        calc=calc+number;
        }
     
     return calc;
}
public static double CalcTax(double subtot )
{  
    final double Tax=0.14;

    subtot=subtot*Tax;
    subtot=Math.floor(subtot*100) / 100;
    return subtot;
}
public static double CalcTotal(double subtot ,double Taxs) 
{
    double Total=0;
    Total= subtot+Taxs-(subtot*offer(subtot));
    Total=Math.floor(Total*100) / 100;
    return Total;
}
@Override
    public String toString(){
      return " Cashier Name:  : " + this.getName() + "\n"
           + " Cashier ID:  : " + this.getID() + "\n"
           + " Cashier Address:  : " + this.getAddress() + "\n"
           + " Cashier Phone: : " + this.getPhone_num();
    }
    @Override
    public void Show_Details()
{
     System.out.println(" Cashier Name:  : " + this.getName());
        System.out.println(" Cashier ID:  : " + this.getID());
        System.out.println(" Cashier Address:  : " + this.getAddress());
        System.out.println(" Cashier Phone: : " + this.getPhone_num());
}



}

