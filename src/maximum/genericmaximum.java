package maximum;

public class genericmaximum {
 public static <E extends Comparable<E>> E max (E[]ele)
 {
	 E m;
	 m=ele[0];
	 for(E e:ele)
	 {
		 if(e.compareTo(m)>0)
		 {
			 m=e;
		 }
	 
	}
	 return m;
 }
	
	public static void main(String[] args) {
		  Integer intarray[]= {0,45,12,78};
		  Double darray[]= {45.85,12.21,78.23,2.22};
		  String  strArray[]= {"sakthi","ram","hari","yogi"};
		 
		  Integer intmax;
		  Double dmax;
		  String smax;
		  intmax=genericmaximum.max(intarray);
		  dmax=genericmaximum.max(darray);
          smax=genericmaximum.max(strArray);
		  
		  System.out.println("maximum of integer   "+intmax);
		  System.out.println("maximum of double value   "+dmax);
		  System.out.println("max of string     " +smax);
		  
		  

	}

}
