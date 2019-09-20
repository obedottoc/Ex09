/*
* program to find the maximum value from the given type of elements using a generic function.
* Developed by Monica
* monicarajavel26@gmail.com
*/
package genericfunction;
public class GenericElement {
	public static <T extends Comparable<T>> T max (T[]element)
	{ T m;
	m=element[0];
	for(T e:element)
	{
		if(e.compareTo(m)>0)
		m=e;
	}
	return m;
	}
	
	public static void main(String[]args) {
		Integer[] intArray= {1,5,9,19,30};
		Integer intMax;
		Double[] doubleArray= {3.6,7.9,5.5,8.9};
		Double doubleMax;
		String[] strArray= {"Welcome","Yellow","Umbrella","Monica"};
        String strMax;
        intMax=max(intArray);
        System.out.println("Max integer; "+intMax);
        doubleMax=max(doubleArray);
        System.out.println("Max double: "+doubleMax);
        strMax=max(strArray);
        System.out.println("Max string: "+strMax);
    }

		
		
	}


