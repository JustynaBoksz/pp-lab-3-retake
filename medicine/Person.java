package medicine;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
