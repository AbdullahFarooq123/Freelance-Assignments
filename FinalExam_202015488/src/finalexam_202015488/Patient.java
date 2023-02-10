/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_202015488;

/**
 *
 * @author
 */
public class Patient {
    private String name;
    private int age;
    private int phone;
    private String gender;
    public Patient(String name, int age, int phone, String gender){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.gender=gender;
    }
    public int getAge(){
        return age;
    }
    public int getPhone(){
        return phone;
    }
    public String getGender(){
        return gender;
    }
    public String getName(){
        return name;
    }
}
