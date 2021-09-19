package Basic;

public class AgeRange {

	public static int getMin(int age){
	      if(age <= 14) {
	        return (int) Math.floor(age - 0.10 * age);
	      } else {
	        return (age / 2) + 7;
	      }
	    }
	    public  static int getMax(int age){
	      if(age <= 14) {
	        return (int) Math.floor(age + 0.10 * age);
	      } else {
	        return (age - 7) * 2;
	      }         
	    }
	  public static String datingRange(int age) {
	    if(age > 100 || age < 1) return "";
	    return String.valueOf(getMin(age)) + "-" + String.valueOf(getMax(age));
	    
	  }
	  
	public static void main(String[] args) {
		System.out.println (datingRange(32));

	}

}
