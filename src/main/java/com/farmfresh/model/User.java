package com.farmfresh.model;

public class User {
    // DATA MEMBERS: 
    private int id;
    private String name;
    private String email;
    private String password;

    // Setter Functions for Validating the values for the Data members

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // Getter Functions for Printing the values of Data members
    
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public User(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void displayMenu(){
        System.out.println("ID: " + this.id);
        System.out.println("NAME: " + this.name);
        System.out.println("Email: " + this.email);
    }
}
