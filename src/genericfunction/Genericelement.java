/**
 * To create generic function
 * @author harsha vardhan reddy
 * reddyharsha298@gmail.com
 */
package genericfunction;

public class Genericelement {
    public static <T extends Comparable<T>> T max (T[] element)
    { T m;
      m=element[0];
      for(T e:element)
      {
             if(e.compareTo(m)>0)
                m=e;
      }
       
         return m;
    }

    public static void main(String[] args) {
        Integer[] intArray= {1,2,3,4,5};
        Integer intMax;
        Double[] doubleArray= {1.1,2.2,3.3,4.4};
        Double doubleMax;
        String[] strArray= {"Apple","Orange","Banana","Welcome"};
        String strMax;
        intMax=max(intArray);
        System.out.println("MAX integer: "+intMax);
        doubleMax=max(doubleArray);
        System.out.println("MAX double: "+doubleMax);
        strMax=max(strArray);
        System.out.println("MAX string: "+strMax);
    }
}