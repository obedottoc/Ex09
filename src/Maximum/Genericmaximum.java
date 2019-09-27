/***
 * Devloped by Mari Bhagavathi.T
 * mari36mars@gmail.com
 */

package Maximum;

public class Genericmaximum {
	public static <E extends Comparable<E>> E max(E[] element) {
		E m;
		m=element[0];
		for(E e:element) {
			if(e.compareTo(m)>0) {
				m=e;
			}
		}
		return m;
	}

public static void main(String[]args) {
	Integer[] intArray= {1,2,3,5};
	Double[] doubleArray= {1.3,2.3,3.3,5.3};
	String[] stringArray = {"maari","yogi","raja","mohan"};
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
