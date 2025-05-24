
    class parent {
        void display() {
            System.out.println("This is parent class");
        }

    }

     class child extends parent {
        void show() {
            System.out.println("This is child class");
        }
    }
    public class BasicOfInheritance {

    public static void main(String[] args) {
        child obj= new child();
        obj.display();
        System.out.println();
        obj.show();
    }
}
//done