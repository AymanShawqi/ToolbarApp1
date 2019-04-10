package com.android.toolbarapp1;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Person> getPersons(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1,"Ayman"));
        personList.add(new Person(2,"Ali"));
        personList.add(new Person(3,"Omar"));
        personList.add(new Person(4,"Osama"));
        personList.add(new Person(5,"Ahmed"));
        personList.add(new Person(6,"Magid"));
        personList.add(new Person(7,"Ramzy"));
        personList.add(new Person(8,"Youssif"));
        personList.add(new Person(9,"Heba"));
        personList.add(new Person(10,"Amal"));
        personList.add(new Person(11,"Ranya"));
        personList.add(new Person(12,"Ameria"));
        personList.add(new Person(13,"yassmin"));
        personList.add(new Person(14,"mrawn"));
        personList.add(new Person(15,"kareem"));
        personList.add(new Person(16,"ashrif"));
        personList.add(new Person(17,"akram"));
        personList.add(new Person(18,"mazen"));
        personList.add(new Person(19,"rashed"));
        personList.add(new Person(20,"ramy"));
        return personList;
    }
}
