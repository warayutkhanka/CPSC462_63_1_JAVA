import java.util.*;
 
public class x {
 
    public static void main(String []args) {
 
     ArrayList<Integer> IntegerArrLst = new ArrayList<Integer>(); 

        IntegerArrLst.add(5);
        IntegerArrLst.add(10);
        IntegerArrLst.add(15);
        IntegerArrLst.add(20);
        IntegerArrLst.add(25);
 
        for (int IntgerArrItem : IntegerArrLst) 
        {
         System.out.println("The Integer item in ArrayList: " + IntgerArrItem);
        }
    }
}