public class javaprogram {

   String name; //intsnace variable
   String address;

   public void name(){
    System.out.println("Ayush srivatsvaa");
   }
   public void address(){
    System.out.println("Mankapur");
   }
    
    static int c = 25;

  

    public static void main(String[] args) {
        javaprogram instance = new javaprogram();
        int a = 50;// local variable
        instance.name();
        instance.address();
        System.out.println("local variable :" +a);
        System.out.println("static variable:" +c); 
    }


}