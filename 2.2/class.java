// Java class for comparison with Kotlin
public class Person {
    private final String name;
    private boolean isMarried;

    public Person(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public boolean getIsMarried() {
        return isMarried;
    }
}

// How to use class in Java
Person person = new Person("Bob", true);

System.out.println(person.getName());
// Bob

System.out.println(person.getIsMarried());
// true