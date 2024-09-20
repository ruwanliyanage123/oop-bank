package designpatterns.builder;

class Person {
    private final String name;
    private final int age;
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static class PersonBuilder {
        private final String name;
        private int age = 0;
        public PersonBuilder(String name) {
            this.name = name;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
