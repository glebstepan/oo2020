package kt3;

public class Person {

    private String name;
    private int weight;
    private int height;
    private int age;

    public Person(String name, int width, int height, int age){
        this.name = name;
        this.weight = width;
        this.height = height;
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public int getAge(){ return age; }

    public int getHeight(){
        return height;
    }

    public String getName(){
        return name;
    }


    public String getInfo(){
        return "Name: " + name + ", width: " + weight + ", height: " + height + ", age: " + age;
    }
}
