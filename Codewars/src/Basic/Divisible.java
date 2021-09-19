package Basic;

public class Divisible {
	public static boolean isDivisible(int wallLength, int pixelSize) {
		return wallLength % pixelSize == 0;
	}

	public static void main(String[] args) {
		System.out.println(isDivisible (100, 10));

	}

}
