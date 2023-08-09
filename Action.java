public class Action<T extends Animal> {
    // this is for Action class

    //added this comment :)))
    private T animal;

    public Action(T animal) {
        this.animal = animal;
    }

    public void printIdentification() {
        System.out.println("Name: " + animal.getName() + " / Age: " + animal.getAge());
    }

    public void playWithSameType(T animal) {
        System.out.println(this.animal.getName() + " is playing with " + animal.getName());
    }

    public void eating(String somethingToEat) {
        animal.eat(somethingToEat);
    }

    public void flying() {
        animal.fly();
    }

    //added this

}
