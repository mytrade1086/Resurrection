package practice.java;

class SuperHero {
	 public void protection(GrandFather_Avenger hero) {
	  hero.tool();
	 }
	}
	class GrandFather_Avenger {
	 public void tool() {
	  System.out.println("All Tools of Avengers");
	 }
	}
	class Child_Hulk extends GrandFather_Avenger {
	 public void tool() {
	  System.out.println("Size is tool for Hulk");
	 }
	}
	class Child_Strange extends GrandFather_Avenger {
	 public void tool() {
	  System.out.println("Time is tools for Dr.Strange");
	 }
	}
	class Child_TomCruise extends GrandFather_Avenger {
	 public void tool() {
	  System.out.println("Trust me !, I'm also super Hero, Didn't you watch 'MI rogue nation'");
	 }
	}
	public class TestDynamicDispatching {
	 public static void main(String[] args) {
	  SuperHero sh = new SuperHero();
	  
	  // Hulk characteristics
	  sh.protection(new Child_Hulk());
	  // Dr.Strange characteristics
	  sh.protection(new Child_Strange());
	  // Tom Cruise characteristics
	  sh.protection(new Child_TomCruise());
	  // Avenger characteristics
	  sh.protection(new GrandFather_Avenger());
	 }
	}