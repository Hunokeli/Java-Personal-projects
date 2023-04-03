package com.company;

public class Main {

    public static void main(String[] args) {
        int prime = 0;
        int counter = 0;
        for(int i=1;i<=1000;i++){
            if (i%3 ==0 && i%5 == 0){
                prime +=i;
                counter +=1;
                System.out.println(i+ " is divisible by 3 and 5");
                if (counter == 5){
                    System.out.println("Total is "+prime);
                    System.out.println("Ending loop.");
                    break;
                }

            }
        }


    }


}
