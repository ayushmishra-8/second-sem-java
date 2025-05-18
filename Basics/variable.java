public class variable{
    static int var=5;//static variable
    int var2=3; //instance variable
    public static void main(String [] arg){
        int localVar=8;
        System.out.println(localVar);
        System.out.println(variable.var);
        variable ref= new variable();
        System.out.println(ref.var2);

    }
}
