public class findroatedstring {

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
         
        if(checkroatation(str1, str2)){
            System.out.println("right");

        }else{
            System.out.println("wrong");
        }
    }

    public  static boolean checkroatation(String str1, String str2) {

        if(str1.length()!=str2.length()){
            return false;
        }
        String temp = str1 + str2;
        return (temp.indexOf(str2)!=-1);


    }  

    
}
