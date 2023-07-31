package com.example.exceptionhandling.model;

public class Trainee {
    private Integer id;
    private String name;

    private Integer weight;

    private String email;

    public Trainee(){

    }
    public Trainee(Integer id,String name,Integer weight,String email){
        this.id=id;
        this.name=name;
        this.weight=weight;
        this.email=email;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public Integer getWeight(){
        return weight;
    }
    public void setWeight(Integer weight){
        this.weight=weight;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
