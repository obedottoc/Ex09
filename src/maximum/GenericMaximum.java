/*generic concept
 * developed by 
 * suriya kumar
 * 212217105057*/package maximum;
public class GenericMaximum {

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
	 Integer[] intArray = {2,7,6,21,40};
	 Integer intMax;
     Double[] doubleArray = { 1.0,50.0,100.5,20.4,46.21};
     Double doubleMax;
     String[] strArray= {"suri","vox","problem","eee","subject"};
     String strMax;
     intMax=GenericMaximum.Max(intArray);
     System.out.println("Intger Max="+intMax);
     doubleMax=GenericMaximum.Max(doubleArray);
     System.out.println("Double Max="+doubleMax);
     strMax=GenericMaximum.Max(strArray);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}
