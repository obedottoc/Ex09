created by guru sai
package maximum;

public class Genericmaximum {
	public static <E extends Comparable<E>> E max(E[] element){
		E m;
		m=element[0];
		for(E e:element) {
			if(e.compareTo(m)>0) {
				m=e;
			}
		}
		return m;
		
	}

	public static void main(String[] args) {
		Integer[] intArray= {1,5,6,8};
		Double[] doubleArray= {2.8,5.3,6.8,9.5};
		String[] stringArray= {"yogi","maari","mohan","sarathi"};
		Integer intmax;
		Double doublemax;
		String stringmax;
		intmax=max(intArray);
		doublemax=max(doubleArray);
		stringmax=max(stringArray);
		System.out.println("The maximum from the given integer is"+intmax);
		System.out.println("The maximum from the given double is"+doublemax);
		System.out.println("The maximum from the given string is"+stringmax);

	}

}
