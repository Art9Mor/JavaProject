public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Petrovich", "Sidorov", 58);
        person1.printName();
        person1.printAge();

        Person person2 = new Person("Vitalina", "Pavlovna", "Strogova", 24);
        person2.printName();
        person2.printAge();

    }
}