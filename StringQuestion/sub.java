package StringQuestion;

public class sub {

    public static void main(String[] args) {
        String number = "1234";
        char digit = '4';
        String result = removeDigit(number,digit);
       System.out.println(result+" ");

    }
    public static String removeDigit(String number, char digit) {
        for(int i=0;i<number.length()-1;i++)
        if(number.charAt(i)==digit && number.charAt(i+1)>digit)
        return number.substring(0,i) + number.substring(i+1);
        for(int i=number.length()-1;i>=0;i--)
        if(number.charAt(i)==digit)
        return number.substring(0,i)+number.substring(i+1);
        return "";
    }
    
}
