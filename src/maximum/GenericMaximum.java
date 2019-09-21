package maximum;
  public class GenericMaximum {
	 public static <E extends Comparable<E>> E max (E[] element)
	    { E m;
	      m=element[0];
	      for(E e:element)
	      {
	          if(e.compareTo(m)>0)
	              m=e;
	      }
	       
	      return m;
	    }

	public static void main(String[] args) {
		Integer[] intArray= {10,49,56,78,55};
		Integer intMax;
		Double[] doubleArray= {5.9,7.65,2.46,3.42,4.47};
		Double doubleMax;
		String[] strArray= {"hari","surya","dharma","sumanth"};
		String strMax;
		intMax=max(intArray);
		System.out.println("Maximum of given integer:"+intMax);
		doubleMax=max(doubleArray);
		System.out.println("Maximum of given double:"+doubleMax);
		strMax=max(strArray);
		System.out.println("Maximum of given string:"+strMax);
		


	}

}