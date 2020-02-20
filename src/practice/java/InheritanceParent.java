package practice.java;

public class InheritanceParent {

	public String parentName;
	public int parentAge;

	public InheritanceParent(String parentName) {
		this.parentName = parentName;

		System.out.println("Passed to Constructor " + parentName);
	}

	public InheritanceParent(int parentAge) {
		this.parentAge = parentAge;

		System.out.println("Passed to Constructor " + parentAge);
	}

	public InheritanceParent(double d) {
		// TODO Auto-generated constructor stub
	}

	public void parentmethodone() {
		System.out.println("public method in Parent ");
	}

	private void parentprivate() {

		System.out.println("Private method in Parent ");
	}

	public void start() {

		System.out.println("Start method in Parent ");
	}

	public void stop() {

		System.out.println("stop method in Parent ");
	}

}
