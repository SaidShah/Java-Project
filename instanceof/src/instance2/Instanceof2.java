package instance2;

import java.util.ArrayList;

/**
 * @author potter
 *
 */
public class Instanceof2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Object> anyTy=new ArrayList<Object>();
        anyTy.add(new Integer(1));
        anyTy.add(new String("Jesus"));
        anyTy.add(new Double(12.88));
        anyTy.add(new Double(12.89));
        anyTy.add(new Double(12.84));
        anyTy.add(new Double(12.82));

        for (Object o : anyTy) {
            if(o instanceof String){
                System.out.println(o.toString() + " String");
            } else if(o instanceof Integer) {
                System.out.println(o.toString() + " Integer");   
            } else if(o instanceof Double) {
                System.out.println(o.toString() + " Double");
            }
        }
    }
}
