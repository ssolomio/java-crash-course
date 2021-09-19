package Basic;

public class MakeNegative {

	  public static int mn(final int x) {
		    
		  if (x==0)
		      return 0;
		    
		    else if (x>0)
		      return -x;
		  
		    else
		      return x;    
		  }
		
	public static void main(String[] args) {
		System.out.println (mn(5));

	}

}