package assign2;

public class Sphere {
	
	int r;

	public Sphere(int radius) {
		r = radius;
	}
	
	public float getArea() {
		// Implicit conversion to float
		return (float)(4.0 * Math.PI * r * r); 
	}
	
	public float getVolume() {
		// Implict conversion to float
		return (float)(4.0 * Math.PI * r * r * r / 3.0);
	}
}
