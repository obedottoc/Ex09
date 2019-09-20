/****
 *to create a program on generics
 * @author rositha V
 *rosithav1@gmail.com
 */
 package Maximum;
 
 
 
public class GenericMaximum {
	
	public static <E extends Comparable <E>>E max(E[] ele) {
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
public static void main(String[] arg){
	
	
	 Integer[] intArray = {11,22,33,44,55};
	 
	Integer intMax;
	 
    Double[] doubleArray = { 11.1, 22.2, 33.3, 44.4, 55.5 };
    Double doubleMax;
    String[] strArray= {"cow", "dog","elephant"};
    String strMax;
    intMax=GenericMaximum.max(intArray);
    System.out.println("Integer Max="+intMax);
    doubleMax=GenericMaximum.max(doubleArray);
    System.out.println("Double Max="+doubleMax);
    strMax=GenericMaximum.max(strArray);
    System.out.println("String Max="+strMax);
}
}
