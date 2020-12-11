
public class FindingMarksRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String grade= "D";
        switch (grade) {
        
        case "A":
     	     System.out.println("marks is between 85-100");	 
   	       break;
   	       
        case "B":
    	     System.out.println("marks is between 70-85");	 
  	       break;

        case "C":
    	     System.out.println("marks is between 55-70");	 
  	       break;

        case "D":
    	     System.out.println("marks is between 35-55");	 
  	       break;

   	    default: System.out.println("Entered grade is not correct. please enter proper grade");	 

        }
	}

}
