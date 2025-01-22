package day2;

import java.util.Scanner;

public class Dog extends Animal{
    String toy="";

    public Dog(){}
    public Dog(String name, String type, int age){
        this.name=name;
        this.type=type;
        this.age=age;
    }

    public void printMore(){
        System.out.println(">> "+this.name+" likes "+this.toy+".");
    }

    public void askMore(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your favorite toy?");
        String toy;
        toy=sc.next();
        this.toy=toy;
    }
}
