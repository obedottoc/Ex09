package maximum;

public class GenericMaximum {

	public static  <E extends Comparable <E>>E max(E[] ele) {
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
	public static void main(String[]args) {
		Integer[] intArray= {5,44,89,45};
		Integer intMax;
		Double[] doubleArray= {10.2,85.5,25.8,85.4};
		Double doubleMax;
		String[] stringArray= {"food","yummy","chicken"};
		String stringMax;
		intMax=GenericMaximum.max(intArray);
		doubleMax=GenericMaximum.max(doubleArray);
		stringMax=GenericMaximum.max(stringArray);
		System.out.println("Maximum of integer:"+intMax);
		System.out.println("Maximum of double:"+doubleMax);
		System.out.println("Maximum of String:"+stringMax);
		
	
		// TODO Auto-generated method stub

	}

}
