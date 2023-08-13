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
   
public class Products implements Details
{
     public int ID;
     public String name;
     public String description;
     public String ex_data;
     public double price ;
    
    
     public Products()
     {
          ID = 00;
         name = "no name" ;
         description = "descrip";
         ex_data = "2 years";
         price = 00; 
         
     }

    public Products(double price) {
        this.price = price;
    }
     
     
     
     public Products(int id ,String N ,String descrip  ,String exd ,double p)
     {
         ID = id;
         name = N;
         description = descrip;
         ex_data =  exd;
         price = p; 
         
         
     }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  

    public void setEx_data(String ex_data) {
        this.ex_data = ex_data;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEx_data() {
        return ex_data;
    }

    public double getPrice() {
        return price;
    }

    
     @Override
    public void Show_Details()
    {
        
    }
     
  
}