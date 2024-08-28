public class javaclass {

    int a = 5,b=6;
    int c = a +b;
    public void sum(){
        System.out.println("Instance variable ="+c);
    }

    static int d = 20;
    

    public static void main(String[] args) {
        javaclass instance = new javaclass();
        int local = 4;
        instance.sum();
        System.out.println("local variable="+local);
        System.out.println("static variable="+d);

    }
    
}
