//created by M.uday kanth,eee-b,212217105037
package maximum;
public class  GenericMaximum{

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
     intMax=GenericMaximum.Max(intArray);
     System.out.println("Intger Max="+intMax);
     doubleMax=GenericMaximum.Max(doubleArray);
     System.out.println("Double Max="+doubleMax);
     strMax=GenericMaximum.Max(strArray);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}
