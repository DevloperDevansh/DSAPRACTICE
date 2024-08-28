package StringQuestion;

public class removeconsecutive {
    

    public static void main(String[] args) {
        String str = "aaba";
        String result = removeconse(str);
        System.out.println(result);
    }

    public static String removeconse(String str) {
       char ch[] = str.toCharArray();
       char prev = '\0';

       StringBuilder sb = new StringBuilder();

       for(int i=0;i<ch.length;i++){
          if(ch[i]!=prev){
            prev = ch[i];
            sb.append(prev);
          }
       }
       return sb.toString();

    }
}
