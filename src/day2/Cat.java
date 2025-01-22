package day2;

import java.util.Scanner;

public class Cat extends Animal{
    String color="";

    public Cat(){}
    public Cat(String name, String type, int age){
        this.name=name;
        this.type=type;
        this.age=age;
    }

    public void printMore(){
        System.out.print(">> "+this.name+" is "+this.color+".");
        if(this.color.equals("black")){
            System.out.println("just like Jiji");
        }
        else{
            System.out.println();
        }
    }

    public void askMore(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What's the color of your fur?");
        String color;
        color=sc.next();
        this.color=color;
    }
}
