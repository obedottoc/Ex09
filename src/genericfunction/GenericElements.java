//**developed by HARIHARAN**//
package genericfunction;

public class GenericElements {

	public static <T extends Comparable<T>>T Max (T[] elements) {
		T m;
		m=elements[0];
		for(T e:elements)
		{if(e.compareTo(m)>0);
		{
			m=e;
		}
	}
		return m;
}

public static void main(String[] arg) {
	 Integer[] intArray = {11,22,33,44,55};
	 Integer intMax;
     Double[] doubleArray = { 11.0, 22.5, 33.0, 44.5, 55.0 };
     Double doubleMax;
     String[] strArray= {"aa","bb","cc","dd","ee"};
     String strMax;
     intMax=GenericElements.Max(intArray);
     System.out.println("Intger Max="+intMax);
     doubleMax=GenericElements.Max(doubleArray);
     System.out.println("Double Max="+doubleMax);
     strMax=GenericElements.Max(strArray);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}


