package exception_handling;

public class MultipleCatch {
	
	public static void main(String[]args){
        System.out.println("Program Started");
        
        
        try {
        	  System.out.println(100/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
        	 String s = null;
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        try {
        	  System.out.println(s.length());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        // one try block, multiple catch block. The most parent class exception should be at the last on the catch block.
        try{
            
            System.out.println(100/0);
            String s = null;
            System.out.println(s.length());

            int[] arr = new int[2];
            System.out.println(arr[5]);
            
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program Ended");

    }
}
