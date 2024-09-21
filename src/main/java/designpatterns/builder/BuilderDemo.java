package designpatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John Doe")
                .age(30)
                .address("123 Main St")
                .build();
    }
}