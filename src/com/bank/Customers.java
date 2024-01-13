package com.bank;

public class Customers {
    // A class is a blueprint of an object

    // Encapsulation
    private String name; // public, private, protected, default
    private String address;
    private int age;
    private long phoneNUmber;

    public Customers(){

    }
    public Customers(String name, String address, int age, long phoneNUmber){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNUmber = phoneNUmber;
    }
    public Customers (String name, long phoneNUmber){
        this.name = name;
        this.phoneNUmber = phoneNUmber;
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(long phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    //Behaviours of the class

    //Method overloading
    public void openAccount(String name){
        System.out.println("Opening account....");
    }
    public void openAccount(String name, int age){
        System.out.println("Opening account....");
    }
    public void openAccount(int age, String name){
        System.out.println("Opening account....");
    }
    public void openAccount(String name, int age, long acct){
        System.out.println("Opening account....");
    }


    public void accountInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phoneNUmber);
        System.out.println();
    }

    public void searchCustomersByCountry(Customers customers [], String country){
        for(Customers customer: customers){
            if (customer.getAddress().equalsIgnoreCase(country)){
                customer.accountInfo();
            }else {
                System.out.println("No customer from this address");
            }
        }
    }
    public void viewAllCustomers(Customers customers []){
        for(Customers customer: customers){
            System.out.println("All Customers");
            customer.accountInfo();
        }
    }

}
