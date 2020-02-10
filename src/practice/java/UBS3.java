package practice.java;

public class UBS3 {
	int x = 10;
	public void assing(int x) {
		x = x;
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		new UBS3().assing(100); // *****10 note that

	}

}
