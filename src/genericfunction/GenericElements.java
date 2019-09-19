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
	 Integer[] intArray = { 1, 2, 3, 4, 5 };
	 Integer intMax;
     Double[] doubleArray = { 1.0, 1.5, 2.0, 2.5, 3.0 };
     Double doubleMax;
     String[] strArray= {"Apple","Sony","MI","Honor","Vivo"};
     String strMax;
     intMax=GenericElements.Max(intArray);
     System.out.println("Intger Max="+intMax);
     doubleMax=GenericElements.Max(doubleArray);
     System.out.println("Double Max="+doubleMax);
     strMax=GenericElements.Max(strArray);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}


