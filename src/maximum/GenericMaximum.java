package maximum;

public class GenericMaximum {
	public static <E extends Comparable<E>> E max (E[]ele)
	{
		E m;
		m=ele[0];
		for(E e:ele)
		{
		if(e.compareTo(m)>0)	
		{
			m=e;}
		}return m;
	}	
	public static void main(String[]args) {
	Integer intarray[]= {5,10,7,1};
	Integer intMax;
	Double doublearray[]= {6.5,5.2,3.8,4.3};
	Double doubleMax;
	String Stringarray[]= {"aharish","vijay","ajith","johncena"};
	String stringMax;
	intMax=max(intarray);
	System.out.println("max integer:"+intMax);
	doubleMax=max(doublearray);
	System.out.println("max double:"+doubleMax);
    stringMax=max(Stringarray);
    System.out.println("max string:"+stringMax);

}
}
                                                                                                                                        