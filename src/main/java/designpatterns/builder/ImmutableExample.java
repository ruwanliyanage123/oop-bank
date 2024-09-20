package designpatterns.builder;

import java.util.List;

public final class ImmutableExample {
    private final String name;
    private final int age;

    public ImmutableExample(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
