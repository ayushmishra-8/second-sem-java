interface a{
    public void run();
}

interface b{
    public void run();
}
class c implements a,b{
    public void run(){
        System.out.println("C class method run without ambiguity");
    }
}

public class TwoInterface {
    public static void main(String[] args) {
        a obj=new c();
        obj.run();
    }
}
//done

