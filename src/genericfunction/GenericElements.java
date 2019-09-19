package genericfunction;

public class GenericElements {
	public static <T extends Comparable<T>>T max(T[] elements)
	{T m;
	m=elements[0];
	for(T e:elements)
	{if(e.compareTo(m)>0)
	{
		m=e;
	}
	}
	return m;
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
	     Integer intmax;
	     Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	     Double doublemax;
	     String[] StringArray= {"avinash","agnal","lokesh","gk"};
	     String StrArray;
	     intmax=GenericElements.max(intArray);
	     System.out.println("intmax="+intmax);
	     doublemax=GenericElements.max(doubleArray);
	     System.out.println("doublemax="+doublemax);
	     StrArray=GenericElements.max(StringArray);
	     System.out.println("StrArray="+StrArray);
	}}
	     

	

