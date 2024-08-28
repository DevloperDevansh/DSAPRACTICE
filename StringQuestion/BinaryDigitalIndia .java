class Employee 
{
  int empId;
  String empName;
  char empGender;
  String empDept;
  String empEmail;
  double empSalary;
  static String empManager;
   
   static String empCEO = "Mayawati";
  

  Employee(int empId,String empName, char empGender,String empDept, String empEmail,double empSalary){
	  this.empId = empId;
	  this.empName = empName;
	  this.empGender = empGender;
	  this.empDept = empDept;
      this.empEmail = empEmail;
      this.empSalary = empSalary;

  }

    static void change1(String Manager){
        empManager = Manager; // First static block
    }

	

 
 

   // Custom method to display employee info
    void displayEmployeeInfo() {
        System.out.println("\t\tEmployee ID        : " + empId);
        System.out.println("\t\tEmployee Name      : " + empName);
        System.out.println("\t\tEmployee Gender    : " + empGender);
        System.out.println("\t\tEmployee Department: " + empDept);
        System.out.println("\t\tEmployee Email     : " + empEmail);
        System.out.println("\t\tEmployee Salary    : " + empSalary);
        System.out.println("\t\tEmploye Manager    : " + empManager); 
        System.out.println();
    }


}

class BinaryDigitalIndia 
{
	public static void main(String[] args) 
	{  	
       
	    
		Employee.change1("D.K.Boss");
       
		System.out.println("**********************************************************");
        System.out.println("Company Name      : BINARY DIGITAL INDIA PVT LTD");
        System.out.println("Company CEO       : " + Employee.empCEO);
        System.out.println("Company Location  : New Delhi");
        System.out.println("**********************************************************");

		Employee emp1= new Employee(101,"Ayush Srivastava",'M',"Testing","srivastavayush223@gmail.com",9000.0);
        emp1.displayEmployeeInfo();


	    Employee.change1("malini Awastii");
		Employee emp2 = new Employee(102, "Devansh Kashyap",'M',"Development", "devanshkashyap@gmail.com", 75000.00);
		emp2.displayEmployeeInfo();
	

	}
}
