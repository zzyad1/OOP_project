
package com.mycompany.subermarket;

enum Gender {Male,Female};
public abstract class User {
         public int ID;
     public String name;
     public String Address;
     public String phone_num;
     public Gender g;
     
    public User()
    {
       
    }

    
     public User(int id ,String n ,String add ,String ph )
     {
         ID = id;
         name = n;
         Address = add;
         phone_num = ph; 
         
     }
    
         public User(int id ,String n ,String add ,String ph , Gender gan )
     {
         ID = id;
         name = n;
         Address = add;
         phone_num = ph; 
         g = gan;
         
     }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setG(Gender g) {
        this.g = g;
    }

  

  

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public Gender getG() {
        return g;
    }


   }

      