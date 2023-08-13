/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zyadstady;

/**
 *
 * @author zyad mostafa
 */
public class Rectangel {
    private double length;
    private double wedth;
    
    public void setlenght(double l)
    {
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
}
