public class Strrev {

    public static void main(String[] args) {
        String str = "abbcd";
        stringrev(str,str.length()-1);
        
    }

    public static void stringrev(String str,int idx){
       if(idx==0){
        System.out.println(str.charAt(idx));
        return;
       }

        System.out.print(str.charAt(idx));
        stringrev(str, idx-1);
    }
    
}
