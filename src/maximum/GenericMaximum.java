/****
 * developed by
 * @author MAHESH K
 */




package maximum;

public class GenericMaximum {

	public static	<E extends Comparable <E>>E max(E[] ele){
		E m;
		m=ele[0];
		for(E e:ele)
		{
		
			if(e.compareTo(m)>0) {
				m=e;
			}
			}
			return m;
	
	}
	public static void main (String []args) {
		Integer[]intArray= {1,2,3,4,5,56};
		Integer intMax;
		Double[]doubleArray={10.2,11.2,33.7,34.99};
		Double doubleMax;
		String[]stringArray= {"happy","joy","entertainment"};
		String stringMax;
		intMax=GenericMaximum.max(intArray);
		doubleMax=GenericMaximum.max(doubleArray);
		stringMax=GenericMaximum.max(stringArray);
		System.out.println("maximum of integer."+intMax);
		System.out.println("maximum of double."+doubleMax);
		System.out.println("maximum of string."+stringMax);
	}
}
