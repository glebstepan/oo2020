package kt3;

public class PersonMain {

    public static void main(String[] args) {

        PersonBag bag = new PersonBag();

        Person person1 = new Person("name1", 80, 120, 25);
        Person person2 = new Person("name2", 180, 1220, 15);
        Person person3 = new Person("name3", 100, 10, 5);
        Person person4 = new Person("name1", 110, 190, 25);

        bag.addPerson(person1);
        bag.addPerson(person2);
        bag.addPerson(person3);
        bag.addPerson(person4);

        bag.getBag();
        System.out.println();
        bag.getBagByName("name1");
        System.out.println();
        System.out.println("Average age: " + bag.averageAge());

    }
}
