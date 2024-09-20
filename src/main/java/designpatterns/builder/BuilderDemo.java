package designpatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        // Using the builder to create a Person object
        Person person = new Person.PersonBuilder("John Doe")
                .age(30)
                .build();
        // Print the created Person object
        System.out.println(person);
        // Create another person with only the mandatory field
        Person personWithoutAge = new Person.PersonBuilder("Jane Doe").build();
        // Print the created Person object
        System.out.println(personWithoutAge);
    }
}