/*created by kaathikeyan
 * email:gk81299@gmail.com
 */
package generics;

public class MaxGenerics {

			public static <E extends Comparable<E>>E Max (E[] elements) {
				E m;
				m=elements[0];
				for(E e:elements)
				{if(e.compareTo(m)>0);
				{
					m=e;
				}
			}
				return m;
		}

		public static void main(String[] arg) {
			 Integer[] intArray = {12,78,7,67,32};
			 Integer intMax;
		     Double[] doubleArray = { 12.0, 23.5, 34.0, 4.5, 7.0 };
		     Double doubleMax;
		     String[] strArray= {"aa","bb","cc","dd","ee"};
		     String strMax;
		     intMax=MaxGenerics.Max(intArray);
		     System.out.println("Intger Max="+intMax);
		     doubleMax=MaxGenerics.Max(doubleArray);
		     System.out.println("Double Max="+doubleMax);
		     strMax=MaxGenerics.Max(strArray);
		     System.out.println("String Max="+strMax);
		     	}
}
