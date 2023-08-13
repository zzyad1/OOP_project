/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoooz;

/**
 *
 * @author zyad mostafa
 */
public class Rectangle 
{
    private double length;
    private double wedth;
    private static int no_of_object;
    
    public Rectangle()
    {
         no_of_object++;
    }
    
    public void setlenght(double l)
    {
        l=70;
        length = l;   
    }
    
    public void setwedht(double w)
    {
        wedth = w;   
    }

    public double getLength() 
    {
        return length;
    }

    public double getWedth() 
    {
        return wedth;
    }
    public double getarea()
    {
        return length * wedth ;
    }   

    public static int getno_of_object() {
        return no_of_object;
    }
    
    
    
}
