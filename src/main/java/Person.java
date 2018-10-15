package main.java;

public class Person {
    //p1,p2
    String name;
    //id1,id2
    String id;
    public  Person(String name,String id){
        this.name = name;
        this.id = id;

    }
    //n1
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
