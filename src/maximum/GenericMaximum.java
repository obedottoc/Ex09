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
		Integer []intArray= {1,2,3,4,5};
		Integer intMax;
		Double []doubleArray= {1.1,1.2,1.3,1.4};
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
