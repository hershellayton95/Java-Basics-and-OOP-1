package javaoop.exercises._3;

public class Student {
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;

    Student(){}
    void setStudentName(String name){
        this.name = name;
    }
    void setStudentAge(int age){
        if (age>=0){
            this.age = age;
        } else {
            this.age = -1;
            System.out.println("Age couldn't be negative!");
        }
    }
    void setStudentGender(String gender){
        this.gender = gender;
    }
    void setStudentHeight(float height){
        this.height = height;
    }
    void setStudentWeight(float weight){
        this.weight = weight;
    }
    String getStudentName(){
        return this.name;
    }
    int getStudentAge(){
        if(age != -1){
            System.out.println("Age isn't setted!");
        }
        return this.age;
    }
     String getStudentGender(){
        return this.gender;
    }
    float getStudentHeight(){
        return this.height;
    }
    float getStudentWeight(){
        return this.weight;
    }
}
