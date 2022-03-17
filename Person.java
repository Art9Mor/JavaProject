import java.util.Calendar;

public class Person {
    private final String name;
    private final String middleName;
    private final String familyName;
    private final int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    Calendar cal = Calendar.getInstance();

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printMiddleName() {
        System.out.println("Middle name: " + middleName);
    }

    public void printFamilyName() {
        System.out.println("Family name: " + familyName);
    }

    public void printAge() {
        System.out.println("Age: " + (cal.get(Calendar.YEAR) - age));
    }

    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName + " " + age;
    }
}
