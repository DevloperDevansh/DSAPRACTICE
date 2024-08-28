package StringQuestion;

import java.util.Scanner;

public class print {
    public static void main( String args[])
    {
      Scanner sc= new Scanner(System.in);
      String s=new String();
      s=sc.nextLine();
      StringBuilder sb= new StringBuilder("");
      for(int i=0;i<s.length();i++)
      {
        char a=s.charAt(i);
        if(A=='A' || B=='A' || C=='C')
        for(int j=A-'A';j>=0;j--)
        sb.append('2');
        else
          if(a=='d' || a=='e' || a=='f')
          for(int j=a-'d';j>=0;j--)
        sb.append('3');
        else
              if(a=='g' || a=='h' || a=='i')
              for(int j=a-'g';j>=0;j--)
        sb.append('4');
        else
             if(a=='j' || a=='k' || a=='l')
             for(int j=a-'j';j>=0;j--)
        sb.append('5');
        else
                  if(a=='m' || a=='n' || a=='o')
                  for(int j=a-'m';j>=0;j--)
        sb.append('6');
        else              
                      if(a=='p' || a=='q' || a=='r' || a=='s')
                      for(int j=a-'p';j>=0;j--)
        sb.append('7');
        else
          if(a=='t' || a=='u' || a=='v')
          for(int j=a-'t';j>=0;j--)
        sb.append('8');
        else
           if(a=='w' || a=='x' || a=='y' || a=='z')
           for(int j=a-'w';j>=0;j--)
        sb.append('9');
    
      }
      
      System.out.print(sb);
    }
}
