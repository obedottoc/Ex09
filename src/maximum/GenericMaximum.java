/*****
 * Developed by pagadala mahesh
 * 
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
		Integer[]intArray= {2,3,5,8};
		Integer intMax;
		Double[]doubleArray={56.4,87.9,45.8};
		Double doubleMax;
		String[]stringArray= {"movies","dog","monkey"};
		String stringMax;
		intMax=GenericMaximum.max(intArray);
		doubleMax=GenericMaximum.max(doubleArray);
		stringMax=GenericMaximum.max(stringArray);
		System.out.println("maximum of integer."+intMax);
		System.out.println("maximum of double."+doubleMax);
		System.out.println("maximum of string."+stringMax);
	}
}
