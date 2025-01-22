package day2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal you =new Animal();

        askQuestion(sc, you);

        you.printType();
        you.askDetail();
        you.printDetail();
        switch(you.type){
            case "dog":
                Dog dog1 = new Dog(you.name, you.type, you.age);
                dog1.askMore();
                dog1.printMore();
                break;
            case "cat":
                Cat cat1 = new Cat(you.name, you.type, you.age);
                cat1.askMore();
                cat1.printMore();
                break;
            case "human":
                Human human1 = new Human(you.name, you.type, you.age);
                human1.askMore();
                human1.printMore();
                break;
            default:
                System.out.println("Sorry but it's not a valid type. Please try again.");
                askQuestion(sc, you);
                break;
        }
    }

    public static void askQuestion(Scanner sc, Animal you){
        System.out.println("Hello! Tell me about yourself.");
        System.out.println("What kind of animal are you?(dog, cat, human)");
        String type;
        type=sc.next();
        you.type=type;
    }
}

