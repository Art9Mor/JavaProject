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

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }


    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printMiddleName() {
        System.out.println("Middle name: " + middleName);
    }

    public void printFamilyName() {
        System.out.println("Family name: " + familyName);
    }

    public void countAge() {
        Calendar cal = Calendar.getInstance();

        System.out.println("Year: " + (cal.get(Calendar.YEAR) - age));
    }

    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName + " " + age;
    }
}
