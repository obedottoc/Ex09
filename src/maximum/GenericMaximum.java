package maximum;
public class  GenericMaximum{

	public static <E extends Comparable<E>> E max(E[] element){
		
		E m;
		m=element[0];
		for(E e:element) {
			if(e.compareTo(m)>0) {
			m=e;
		}
	}
		return m;
}

public static void main(String[] arg) {
	
	 Integer[] intArray = {12,13,7,27,2};
	 Integer intMax;
     Double[] doubleArray = { 12.0, 3.5, 4.0, 4.5, 7.0 };
     Double doubleMax;
     String[] strArray= {"aa","bb","cc","dd","ee"};
     String strMax;
     intMax=max(intArray);
     System.out.println("Intger Max="+intMax);
     doubleMax=max(doubleArray);
     System.out.println("Double Max="+doubleMax);
     strMax=max(strArray);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}
