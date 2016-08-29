import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by andrewdmo on 8/17/16.
 */
public class Kata {

    //firstLastSix
    public static boolean firstLastSix(ArrayList<Integer> al) {
        if (al.size()<1) return false;
        int firstnum = al.get(0);
        int lastnum = al.get(al.size()-1);
        return ((firstnum == 6) || (lastnum == 6));
    }
    //sameFirstLast
    //looks like Clojure but it works
    public static boolean sameFirstLast(ArrayList<Integer> al) {
        if ((al.size()>=1) && (al.get(0))==(al.get(al.size()-1))) {
            return true; } {
            return false;
        }}
    //rotateLeft3
    //almost got working with more than 3 #s, not elegant but works
    public ArrayList<Integer> rotateLeft3(ArrayList<Integer> al) {
        int length = al.size();
        int idxpos = 0;
        for (int val = (al.get(idxpos)); idxpos<length; idxpos++, ) {
            this.val = val;



        }
//          int idxpos = 0;
//            int val0 = al.get(idxpos);
//            int val1 = al.get(idxpos+1);
//            int val2 = al.get(idxpos+2);
//            al.set(idxpos+2, val0);
//            al.set(idxpos, val1);
//            al.set(idxpos+1, val2);
//            return al;
        }



}
