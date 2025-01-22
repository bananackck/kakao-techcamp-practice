package day2;

import java.util.Scanner;

public class Animal{
    String name="";
    String type="";
    int age=0;

    public Animal(){}
    public Animal(String name, String type, int age){
        this.name = name;
        this.type=type;
        this.age=age;
    }

    public void printType() {
        System.out.println(">> "+"So you are a " + this.type + ".");
    }
    public void printDetail(){
        System.out.println(">> "+ this.name+" is a "+this.type+" and "+this.age+" years old.");
    }

    public void askDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("I want to know about you more!!");
        System.out.println("What's your name?");
        String name;
        name=sc.next();
        this.name=name;
        System.out.println("How old are you?");
        int age;
        age=sc.nextInt();
        this.age=age;
    }
    public void askPetDetail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("I want to know about your pet!!");
        System.out.println("What kind of animal is your pet?(dog, cat)");
        String type;
        type=sc.next();
        if(!type.equals("dog") && !type.equals("cat")){
            System.out.println("Sorry but it's not a valid type. Please try again.");
            askPetDetail();
            return;
        }
        this.type=type;


        System.out.println("What's your pet's name?");
        String name;
        name=sc.next();
        this.name=name;
        System.out.println("How old is your pet?");
        int age;
        age=sc.nextInt();
        this.age=age;
    }
    public void askMore(){}

}

