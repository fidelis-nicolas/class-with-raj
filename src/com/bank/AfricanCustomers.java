package com.bank;

public class AfricanCustomers extends Customers{
    private String continent;

    public AfricanCustomers(String name, String address, int age, long phoneNumber, String continent){
        super(name, address, age, phoneNumber);
        this.continent = continent;
    }

    @Override//annotation
    public void accountInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Age: " + this.getAge());
        System.out.println("Phone Number: " + this.getPhoneNUmber());
        System.out.println("Continent: " + this.continent);
        System.out.println();
    }
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
