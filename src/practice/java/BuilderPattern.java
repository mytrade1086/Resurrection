package practice.java;

public class BuilderPattern {
	
	// Change return type of each method as Class type
	// "this" always points to current/calling object. Returning the same to
	// have same reference
	public BuilderPattern M1()
	{
		System.out.println("M1");
		return this;
	}
	
	public BuilderPattern M2(String str)
	{
		System.out.println("Pass string is "+str);
		return this;
	}
	
	public BuilderPattern M3()
	{
		System.out.println("M3");
		return this;
	}
 
	public static void main(String[] args) {
		BuilderPattern nbp = new BuilderPattern();
		nbp.M1().M2("Amod").M3();
	}
}


//
//@Test public void
//lotto_resource_returns_200_with_expected_id_and_winners() {
// 
//    when().
//            get("/lotto/{id}", 5).
//    then().
//            statusCode(200).
//            body("lotto.lottoId", equalTo(5),
//                 "lotto.winners.winnerId", hasItems(23, 54));
// 
//}