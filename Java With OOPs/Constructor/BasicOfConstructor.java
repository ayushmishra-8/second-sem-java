class student{
    int id;
    int age;
    student(int id,int age){
        this.id=id;
        this.age=age;
        System.out.println("This is a Parametrized constructor");
    }
    student(){
        System.out.println("This is a deafault constructor.");
    }
}

public class BasicOfConstructor {
    public static void main(String[] args) {
        student obj=new student(78, 14);
        System.out.println();
        student obj2=new student();
    }
}

