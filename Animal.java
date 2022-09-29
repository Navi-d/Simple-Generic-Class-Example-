public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(String somethingToEat) {
        System.out.println(this.name + " is eating " + somethingToEat);
    }

    public void fly() {
        System.out.println(this.name + " is flying!");
    }

}
