/***
 * pavan kalyan reddy
 * npkr.nvrr@outlook.com
 */
package Maximum;

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
        Integer[] intArray= {-1,2,3,4,5};
        Integer intMax;
        Double[] doubleArray= {1.1,2.2,3.3,4.4};
        Double doubleMax;
        String[] strArray= {"India","Australia","Germany","Britain","World","Zimbabwe"};
        String strMax;
        intMax=max(intArray);
        System.out.println("Max integer: "+intMax);
        doubleMax=max(doubleArray);
        System.out.println("Max double: "+doubleMax);
        strMax=max(strArray);
        System.out.println("Max string: "+strMax);
    }
}