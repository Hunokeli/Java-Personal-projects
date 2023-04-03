package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, double transaction){
        if(findCustomer(name)==null){
            Customer customer = new Customer(name,transaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        if(findCustomer(name)!=null){
            int index = 0;
            for (int i =0;i<customers.size();i++){
                Customer customer = customers.get(i);
                if (name == customer.getName()){
                    index=i;
                }
            }
            Customer customer = customers.get(index);
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String name){
        for (int i =0; i<customers.size();i++) {
            Customer customer = customers.get(i);
            if (name == customer.getName()) {
                return customer;
            }
        }
        return null;
    }
}
