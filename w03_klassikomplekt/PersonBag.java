package kt3;

import java.util.ArrayList;
import java.util.List;

public class PersonBag {
    private List<Person> bag = new ArrayList<>();
    private int age = 0;

    public void addPerson(Person person){
        bag.add(person);
    }

    public void getBag(){
        for (Person person : bag) {
            System.out.println(person.getInfo());
        }
    }

    public void getBagByName(String name){
        for (Person person : bag) {
            if (person.getName() == name) {
                System.out.println(person.getInfo());
            }
        }
    }

    public int averageAge(){
        for (Person person : bag) {
            age += person.getAge();
        }
        return age / bag.size();
    }
}
