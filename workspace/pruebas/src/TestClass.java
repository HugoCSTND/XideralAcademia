//What is the effect of compiling and running the code shown in exhibit?

public class TestClass{

		   public static void main(String args[]){
		      boolean b = false;
		      int i = 1;
		      do{
		         i++ ;
		      } while (b = !b);
		      System.out.println( i );
		   }
		}