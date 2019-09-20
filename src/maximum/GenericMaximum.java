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
		// TODO Auto-generated method stub
		
		Integer[] intArray= {1,2,3,4,5,6,7};
		Double[] doubleArray= {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		String[] strArray= {"Mahendra","Singh","Dhoni","Sachin","Tendulkar"};
		
		Integer intMax;
		Double doubleMax;
		String strMax;
		
		intMax=max(intArray);
		doubleMax=max(doubleArray);
		strMax=max(strArray);
		
		System.out.println("Max Integer:"+intMax);
		System.out.println("Max Double:"+doubleMax);
		System.out.println("Max String:"+strMax);	
		}

}
