package Basic;

public class SecretMessage {
	  public static String greet(String name) {
	    String s = String.format ("Hello, %s!", name);
	    
	    if(name.equals("Johnny")){
	      return "Hello, my love!";
	    }
	    else{
	      return s;
	    }
	  }
	  public static void main (String[]args) {
		  System.out.println (greet("Johnny"));
		  
	  }
	}