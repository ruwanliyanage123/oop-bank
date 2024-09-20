package designpatterns.builder;

class Person {
    // All final fields
    private final String name;
    private final int age;
    // Private constructor to enforce object creation through the Builder
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // Static nested Builder class
    public static class PersonBuilder {
        // Required parameter
        private final String name;
        // Optional parameter - initialized to default value
        private int age = 0;
        // Constructor for mandatory parameter
        public PersonBuilder(String name) {
            this.name = name;
        }
        // Setter method for optional parameter, returning the builder object
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        // Build method to create the Person object
        public Person build() {
            return new Person(this);
        }
    }
}
