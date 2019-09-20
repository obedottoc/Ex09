package Maximum;

public class GenericMaximum {
	public static <E extends Comparable<E>>E Max(E[] elements) {
		E m;
		m=elements[0];
		for(E e:elements) {
			if(e.compareTo(m)>0) {
				m=e;
			}
		}
		return m;	
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,5,8,12,45,14};
		Double[] doubleArray= {0.1,0.9,3.0,5.3,2.7,19.4,8.000000};
		String[] stringArray= {"mano","mohan","mari"};
		Integer intMax;
		Double doubleMax;
		String stringMax;
		intMax=Max(intArray);
		doubleMax=Max(doubleArray);
		stringMax=Max(stringArray);
		System.out.println(" the maximum from the given input is"+intMax);
		System.out.println(" the maximum from the given input is"+doubleMax);
		System.out.println(" the maximum from the given input is"+stringMax);
		
	}
}
