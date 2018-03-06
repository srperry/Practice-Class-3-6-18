
public class CountryTest {

	public static void main(String[] args) {
		Country c1=new Country("USA",234557899,45688);
		Country c2=new Country("Russia",156774021,799623);
		System.out.println((c1.Country+"\n") + c1.Population+"\n" + c1.Area);
			c1.ComparePop(c1, c2);
	}

}
