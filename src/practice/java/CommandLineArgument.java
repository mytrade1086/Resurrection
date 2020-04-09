package practice.java;

public class CommandLineArgument {

	//1. Either got to command line and type  java CommandLineArgument "sumit" "neha"
	//or go to run configuration/argument/program  "sumit" "neha"
	
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
//		sumit
//		neha

	}

}
