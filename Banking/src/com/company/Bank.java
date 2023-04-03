package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name)==null){
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String name, double transaction){
        if(findBranch(branchName)!=null){
            int index = 0;
            for (int i =0;i<branches.size();i++){
                Branch branch = branches.get(i);
                if (name == branch.getName()){
                    index=i;
                }
            }
            Branch branch = branches.get(index);
            branch.newCustomer(name,transaction);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String name, double transaction){
        if(findBranch(branchName)!=null){
            int index = 0;
            for (int i =0;i<branches.size();i++){
                Branch branch = branches.get(i);
                if (name == branch.getName()){
                    index=i;
                }
            }
            Branch branch = branches.get(index);
            branch.addCustomerTransaction(name,transaction);
            return true;
        }
        return false;
    }

    public Branch findBranch(String name){
        for (int i =0; i<branches.size();i++) {
            Branch branch = branches.get(i);
            if (name == branch.getName()) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean transactions){
        if(findBranch(branchName)!=null){
            int index = 0;
            for (int i =0;i<branches.size();i++){
                Branch branch = branches.get(i);
                if (name == branch.getName()){
                    index=i;
                }
            }
            Branch branch = branches.get(index);
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i =0;i< customers.size();i++){
                Customer customer = customers.get(i);
                System.out.println(customer.getName());
                if(transactions){
                    System.out.println(customer.getTransactions());
                }
            }
            return true;
        }


        return false;
    }
}
