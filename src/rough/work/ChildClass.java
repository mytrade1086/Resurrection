package rough.work;

public class ChildClass extends ParentClass{
	
	String studentName;
	int studentID;
	
		public ChildClass(String studentName, int studentID) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
	}
		

	public ChildClass() {
			
		}


	public void getStudentDetails() {	
		System.out.println(studentName +" "+studentID);
	
	}
	
	
	
	public static void main(String[] args) {
		
		ChildClass c=new ChildClass("sumit",101);
		c.getStudentDetails();
		ParentClass p=new ParentClass();
		
		System.out.println(p.colleageName+" "+p.colleageCode);
		ParentClass p1=new  ChildClass("neha",102);
		System.out.println(p1.count);

		
		
		
	}
	
	

}
