/***
* EXPERIMENT-09
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package maximum;

public class GenericMaximum {
	
	public static <E extends Comparable<E>> E max(E[]ele)
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
		Integer []intArray= {25,84,13,44,65};
		Integer intMax;
		Double []doubleArray= {5.1,8.2,11.3,21.4};
		Double DoubleMax;
		String []strArray= {"HELLO","WORLD","YEP"};
		String strMax;
		
	
        intMax=GenericMaximum.max(intArray);
        DoubleMax=GenericMaximum.max(doubleArray);
        strMax=GenericMaximum.max(strArray);
        System.out.println("maximum of integer:"+intMax);
        System.out.println("maximum of double value:"+DoubleMax);
        System.out.println("max of string:"+strMax);



		
		
		
		
	}

}
