package designpatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John Doe")
                .age(30)
                .build();
        System.out.println(person);
        Person personWithoutAge = new Person.PersonBuilder("Jane Doe").build();
        System.out.println(personWithoutAge);
    }
}