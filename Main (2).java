public class Main {
    public static void main(String[] args) {
        new Pet(5);
        new Cat(2);
    }
}

class Pet {
    public Pet(int age) {
        System.out.println("Pet");
    }
}

class Cat extends Pet {
    public Cat(int age) {
        super(age);
        System.out.print("Cat");
    }
}
