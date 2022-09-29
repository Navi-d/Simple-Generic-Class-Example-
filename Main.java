public class Main {
    public static void main(String[] args) {
        Cat luna = new Cat("Luna", 2);
        Cat milo = new Cat("Milo", 2);
        Dog max = new Dog("Max", 2);
        Action<Cat> action = new Action<>(luna);
        Action<Dog> action2 = new Action<>(max);

        action.printIdentification();
        action.playWithSameType(milo);
        action.eating("sth");
        action2.eating("sth");
    }
}
