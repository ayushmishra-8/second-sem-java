interface animal {
    public void eat();
}

class dog implements animal {
    public void eat() {
        System.out.println("Dog eats chicken");
    }
}

class cat implements animal {
    public void eat() {
        System.out.println("Cat drink milk");
    }
}

public class BasicOfInterface {
    public static void main(String[] args) {
        animal obj = new dog();

        animal obj2 = new cat();
        obj.eat();
        System.out.println();
        obj2.eat();


    }
}
//done