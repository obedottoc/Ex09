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
        Integer[] intArray= {10,7,4,3};
        Integer intMax;
        Double[] doubleArray= {5.3,2.7,3.4,4.8};
        Double doubleMax;
        String[] strArray= {"plumbum","rectifier","diode","germanium"};
        String strMax;
        intMax=max(intArray);
        System.out.println("Max integer: "+intMax);
        doubleMax=max(doubleArray);
        System.out.println("Max double: "+doubleMax);
        strMax=max(strArray);
        System.out.println("Max string: "+strMax);
    }
}



