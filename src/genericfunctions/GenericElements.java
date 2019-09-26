package genericfunctions;

public class GenericElements {
	public static <T extends Comparable<T>> T max(T []elements){
		T m;
		m=elements[0];
		for(T e:elements) {
			if(e.compareTo(m)>0) {
				m=e;
				
			}
		}
		return m;
	}

	public static void main(String[] args) {
		 Integer[] intArray = { 1, 2, 3, 4, 5 };
		 Integer intMax;
	     Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	     Double  doublemax;
	     String[]strArray= {"apple","orange","mango"};
	     String strMax;
	     intMax=GenericElements.max(intArray);
	     System.out.println("Integer Max="+intMax);
	     doublemax=GenericElements.max(doubleArray);
	     System.out.println("Double Max="+doublemax);
	     strMax=GenericElements.max(strArray);
	     System.out.println("String Max="+strMax);
	
	     
	     
	     

	     
	     
	}

}
