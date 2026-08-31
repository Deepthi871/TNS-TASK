package Hireracialinheritance;

class animal {
    String name;
    void eat() {
        System.out.println(name + " eating");
    }
}

class dog extends animal {
    void bark() {
        System.out.println(name + "is barking");
    }
}

class cat extends animal {
    void meow() {
        System.out.println(name + "is meowing");
    }
}

public class Hieracial {
    public static void main(String[] args) {
        dog d = new dog();
        d.name = "Tommy";
        d.eat();
        d.bark();
        System.out.println();
        cat c = new cat();
        c.name = "kitty";
        c.eat();
        c.meow();
    }
}