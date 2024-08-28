class votingapplication {


    public  void vote(int age){
        if(age>18){
           System.out.println("You are eligible for vote");
        }else{
            System.out.println("Sorry!!You are not Eligible For vote");
        }
    }

    public static void main(String[] args) {

        int age =19;
        votingapplication ob = new votingapplication();

        ob.vote(age);

    }
    
}
