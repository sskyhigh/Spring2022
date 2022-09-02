/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shao
 */
public class Cat extends dog{
    
    private int food;
    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }
    public Cat(String name, int age){
        super(name, age);
        this.food = 20;
    }
    public Cat(String name){
        super(name, 0);
    }
    public void display(){
        System.out.println("My name is: " + this.name + " I am " + this.age + " I eat " + this.food);
    }
    public void eat (int a){
        this.food -= a;
    }
}
