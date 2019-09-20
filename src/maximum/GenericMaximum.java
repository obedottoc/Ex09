/*****
 * Generic Maximum 
 * developed by
 * sandhiya.
 * sandhiyasandhiya123@gmail.com
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
	public static void main(String[]args) {
		Integer[] IntArray= {2,4,6,8};
		Integer intMax;
		Double[] DoubleArray= {1.5,2.5,3.5,4.5,5.5};
		Double doubleMax;
		String[] strArray= {"Arumugam","Sarguna","Sandhiya"};
		String strMax;
		
		intMax=GenericMaximum.Max(IntArray);
		System.out.println("Integer Max="+intMax);
	    doubleMax=GenericMaximum.Max(DoubleArray);
		System.out.println("Double Max="+doubleMax);
		strMax=GenericMaximum.Max(strArray);
		System.out.println("String Max="+strMax);
		
		
		
		
		
			
		

	

	}

}
