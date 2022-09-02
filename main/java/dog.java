/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shao
 */
public class dog {
    public String name;
    public int age;
    
    public dog(String name, int age){
        this.name = name;
        this.age = age;
        add2();
    }
    public void display(){
        System.out.println("I am  " + this.name + " I am " + this.age + " years old");
    }
        public int getAge(){
        return this.age;
        }
        public void setAge(int q){
            this.age = q;
        }
        private int add2(){
            return this.age + 2;
        }
    }

