/*
Interface A has 4 methods
Class subB want to implement only one method testa. Hence now we will have to mark subB as Abstract

Same goes for SubC

MultilevelAbstractionLastClass has all the implementations(some of its own and some due to inheritance
hence it is not Abstract
*/



package practice.java;
interface A{
	public void testa();
	public void testb();
	public void testc();
	public void testd();
}
abstract class SubB implements A {
	public void testa() {
		System.out.println("test-a");
	}
}
abstract class SubC extends SubB{
	public void testb() {
		System.out.println("test-b");
	}
}
public class MultilevelAbstractionLastClass extends SubC{
	public void testc() {
		System.out.println("test-c");
	}
	public void testd() {
		System.out.println("test-d");
	}
	public static void main(String[] args) {
		// create object to class SubD
		MultilevelAbstractionLastClass lastclassObj = new MultilevelAbstractionLastClass();
		lastclassObj.testa();
		lastclassObj.testb();
		lastclassObj.testc();
		lastclassObj.testd();
	}
}