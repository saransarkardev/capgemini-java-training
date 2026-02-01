package stack;

public class TestStackArray {
	 public static void main(String[] args) {
         StackArray st = new StackArray(10);

         try {
             st.push(5);
             st.push(6);
             st.push(7);
         }
         catch (IllegalStateException e) {
             System.out.println("Push error: " + e.getMessage());
         }

         try{
             System.out.println("Top element: "+st.peek());
         }
         catch (IllegalStateException e) {
             System.out.println("Peek Error: " + e.getMessage());
         } 
         
         
         System.out.println(st.size());


         try {
             st.push(9);
             st.push(1);
         }
         catch (IllegalStateException e) {
             System.out.println("Push error: " + e.getMessage());
         }
         
         try {
             st.pop();
         }
         catch (IllegalStateException e) {
             System.out.println("Pop error: " + e.getMessage());
         }
         
         st.display();
         
 }
}
