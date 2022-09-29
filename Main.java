public class Main {
    public static void main(String[] args) {
        Cat luna = new Cat("Luna", 2);
        Cat milo = new Cat("Milo", 2);
        Dog max = new Dog("Max", 2);
        Action<Cat> lunaCat = new Action<>(luna);
        Action<Dog> maxDog = new Action<>(max);

        lunaCat.printIdentification();
        lunaCat.playWithSameType(milo);
        // can not use lunaCat.playWithSameType(max) because they are not the same type
        lunaCat.eating("sth");
        maxDog.eating("sth");
    }
}
