/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shao
 */
public class Student implements Comparable <Student> {
        private String name;
        
        public Student(String name){
            this.name = name;
        }
        public boolean equals(Student other){
            if(this.name == other.name){
                  return true;
            }
            else{
                  return false;
            }
        }
        public int compareTo(Student Other){
            return this.name.compareTo(Other.name);
        }
        public String toString(){
            return this.name;       
        }
}

