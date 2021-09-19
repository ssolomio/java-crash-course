package Basic;

public class CuboidVolume {

	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
	    double volume = length * width * height;
	    return volume;
	}
	public static void main(String[] args) {
		System.out.println(getVolumeOfCuboid(4.2, 3.5, 2.3));

	}

}
