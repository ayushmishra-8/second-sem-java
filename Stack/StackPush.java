import java.util.Stack;
import java.util.concurrent.*;
import java.io.*;

public class StackPush {
    public static void main(String[]Arg){
    Stack stack1 = new Stack();
    Stack<String> stack2= new Stack<String>();
    stack1.push(4);
    stack1.push("Hello");
    stack1.push("Sunstone");
    stack1.push("Student");
    stack2.push("Java this");
    stack2.push("Side");

    System.out.println();
    System.out.println(stack1);
    System.out.println(stack2);
    System.out.println();

    }
}
