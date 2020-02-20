package practice.java;

class UBS {

	static int count = 100;
	public void icr() {
    count++;
	}

	public static void main(String[] args) {

		// #UBS 1
		UBS u = new UBS();
		u.icr();
		UBS u2 = new UBS();

		System.out.println(count);

		// #UBS2
		String str = "StudyTonight";
        str.concat(".com");
		str = str.toUpperCase();
		str.replace("TONIGHT", "today");
		System.out.println(str);
		
//		101
//		STUDYTONIGHT

	}
}



