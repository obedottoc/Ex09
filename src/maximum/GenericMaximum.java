package maximum;

public class GenericMaximum {

	public static <E extends Comparable<E>> E max(E[] ele) {
		E m;
				m=ele[0];
				for(E e:ele) {
						if(e.compareTo(m)>0)
						{
							m=e;
						}
				}
					
				return m;
}

public static void main(String[] arg) {
	 Integer[] intArray = {11,22,33,44,55};
	  Double[] doubleArray = { 11.0, 22.5, 33.0, 44.5, 55.0 };
	  String[] strArray= {"HELLO","WORLD","BYE"};
	  
	 Integer intMax;
	 Double doubleMax;
     String strMax;
     
     
     intMax=max(intArray);
     doubleMax=max(doubleArray);
     strMax=max(strArray);
     
     System.out.println("Intger Max="+intMax);
     System.out.println("Double Max="+doubleMax);
     System.out.println("String Max="+strMax);
     
     
     
}
	
}



