/*
 * developed by R.Nehareddy
 * EEE-B
 * 212217105049
 * 
 * 
 */
package maximum;

public class GenericMaximum {

	public static <E extends Comparable<E>> E Max(E[] ele)
	{ 
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
	
	public static void main(String[] args) {
		Integer[] intArray = { 6,4,8,9};
		Integer intMax;
		Double[] doubleArray = {1.1,6.4,8.9,3.0};
		Double doubleMax;
		String[] stringArray = {"neha","gowri","hari","rushi"};
		String strMax;
		intMax=GenericMaximum.Max(intArray);
		System.out.println("Integer Max="+intMax);
		strMax=GenericMaximum.Max(stringArray);
		System.out.println("String Max="+strMax);
		doubleMax=GenericMaximum.Max(doubleArray);
		System.out.println("Double Max="+doubleMax);
		
	}

}
