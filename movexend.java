public class movexend {

    
    public static void movexinend(String str,int idx,int count,String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++) {   //end save x 
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        
        if(currchar=='x'){
            count++;
            movexinend(str, idx+1, count, newstr);
        }else{
            newstr += currchar;
            movexinend(str, idx+1, count, newstr);
        }

    }
    public static void main(String[] args) {

        String str ="axbcxxd";
        movexinend(str, 0, 0, "");
        return;
        
    }

}
