/**
 * Created by andrewdmo on 8/17/16.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //firstLastSix
        System.out.println("\n\nfirstLastSix:\n");
        Kata fl6 = new Kata();
        ArrayList al = new ArrayList();
        al.clear();
        al.addAll(Arrays.asList(1, 2, 6));
        System.out.println("Kata.firstLastSix([1, 2, 6]) => \"" + fl6.firstLastSix(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(6, 1, 2, 3));
        System.out.println("Kata.firstLastSix([6, 1, 2, 3]) => \"" + fl6.firstLastSix(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(13, 6, 1, 2, 3));
        System.out.println("Kata.firstLastSix([13, 6, 1, 2, 3]) => \"" + fl6.firstLastSix(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(6, 1, 2, 7));
        System.out.println("Kata.firstLastSix([6, 1, 2, 7]) => \"" + fl6.firstLastSix(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5, 6, 1, 2, 7));
        System.out.println("Kata.firstLastSix([5, 6, 1, 2, 7]) => \"" + fl6.firstLastSix(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(6));
        System.out.println("Kata.firstLastSix([6]) => \"" + fl6.firstLastSix(al) + "\"");

        //sameFirstLast
        Kata sfl = new Kata();
        al.clear();
        System.out.println("\n\nsameFirstLast:\n");
        al.clear();
        al.addAll(Arrays.asList(1,2,3));
        System.out.println("Kata.sameFirstLast([1,2,3]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1,2,3,1));
        System.out.println("Kata.sameFirstLast([1,2,3,1]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1,2,1));
        System.out.println("Kata.sameFirstLast([1,2,1]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(2,1,3));
        System.out.println("Kata.sameFirstLast([2,1,3]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(8,2,8));
        System.out.println("Kata.sameFirstLast([8,2,8]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5,1,7,1,5));
        System.out.println("Kata.sameFirstLast([5,1,7,1,5]) => \"" + sfl.sameFirstLast(al) + "\"");

        //rotateLeft3
        Kata rl3 = new Kata();
        System.out.println("\n\nsameFirstLast:\n");
        al.clear();
        al.addAll(Arrays.asList(1,2,3));
        System.out.println("Kata.sameFirstLast([1,2,3]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5,11,9));
        System.out.println("Kata.sameFirstLast([1,2,3]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(7,0,0));
        System.out.println("Kata.sameFirstLast([1,2,3]) => \"" + rl3.rotateLeft3(al) + "\"");

//        rotateLeft3([1, 2, 3]) -> [2, 3, 1]
//        rotateLeft3([5, 11, 9]) -> [11, 9, 5]
//        rotateLeft3([7, 0, 0]) -> [0, 0, 7]

    }
}
