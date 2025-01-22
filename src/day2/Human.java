package day2;

import java.util.Scanner;

public class Human extends Animal{
    String job="";
    boolean havePet=false;
    Animal pet;

    public Human(){}
    public Human(String name, String type, int age){
        this.name=name;
        this.type=type;
        this.age=age;
    }

    public void printMore(){
        System.out.println(">> "+this.name+" is a "+this.job+".");
    }

    public void askMore(){
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your job?");
        String job;
        job=sc.next();
        this.job=job;

        System.out.println("Do you have a pet?(yes, no)");
        String havePet;
        havePet=sc.next();
        this.havePet= havePet.equals("yes");

        if(this.havePet){    this.makePet(); }
    }

    public void makePet(){
        Animal animal = new Animal();
        animal.askPetDetail();

        if(animal.type.equals("dog")){
            Dog pet=new Dog(animal.name, animal.type, animal.age);
            pet.askMore();
            pet.printMore();
        }
        if(animal.type.equals("cat")){
            Cat pet=new Cat(animal.name, animal.type, animal.age);
            pet.askMore();
            pet.printMore();
        }
    }
}
