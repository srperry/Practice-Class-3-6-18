
public class Country {
String Country;
int Population;
int Area;

public Country(String Country2,int Population2,int Area2){
	Country=Country2;
	Population=Population2;
	Area=Area2;
	}
public static void ComparePop(Country pop1,Country pop2){
	if(pop1.Population>pop2.Population){
		System.out.println(pop1.Country+" has the largest population.");
	}
	else{
		System.out.println(pop2.Country+" has the larger population.");
	}
}

}