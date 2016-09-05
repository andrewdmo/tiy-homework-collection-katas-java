/**
 * Created by andrewdmo on 8/17/16.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
        al.addAll(Arrays.asList(1, 2, 3));
        System.out.println("Kata.sameFirstLast([1,2,3]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1, 2, 3, 1));
        System.out.println("Kata.sameFirstLast([1,2,3,1]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1, 2, 1));
        System.out.println("Kata.sameFirstLast([1,2,1]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(2, 1, 3));
        System.out.println("Kata.sameFirstLast([2,1,3]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(8, 2, 8));
        System.out.println("Kata.sameFirstLast([8,2,8]) => \"" + sfl.sameFirstLast(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5, 1, 7, 1, 5));
        System.out.println("Kata.sameFirstLast([5,1,7,1,5]) => \"" + sfl.sameFirstLast(al) + "\"");

        //rotateLeft3
        Kata rl3 = new Kata();
        System.out.println("\n\nrotateLeft3:\n");
        al.clear();
        al.addAll(Arrays.asList(1, 2, 3));
        System.out.println("Kata.rotateLeft3([1,2,3]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5, 11, 9));
        System.out.println("Kata.rotateLeft3([5,11,9]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(7, 0, 0));
        System.out.println("Kata.rotateLeft3([7,0,0]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(7, 4, 7));
        System.out.println("Kata.rotateLeft3([7,4,7]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1, 8, 7));
        System.out.println("Kata.rotateLeft3([1,8,7]) => \"" + rl3.rotateLeft3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(0, 0, 1));
        System.out.println("Kata.rotateLeft3([0,0,1]) => \"" + rl3.rotateLeft3(al) + "\"");

        //Reverse 3
        Kata rv3 = new Kata();
        System.out.println("\n\nReverse3:\n");
        al.clear();
        al.addAll(Arrays.asList(1, 2, 3));
        System.out.println("Kata.reverse3([1,2,3]) => \"" + rv3.reverse3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(5, 11, 9));
        System.out.println("Kata.reverse3([5,11,9]) => \"" + rv3.reverse3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(7, 0, 0));
        System.out.println("Kata.reverse3([7,0,0]) => \"" + rv3.reverse3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(7, 4, 7));
        System.out.println("Kata.reverse3([7,4,7]) => \"" + rv3.reverse3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1, 8, 7));
        System.out.println("Kata.reverse3([1,8,7]) => \"" + rv3.reverse3(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(0, 0, 1));
        System.out.println("Kata.reverse3([0,0,1]) => \"" + rv3.reverse3(al) + "\"");

        //sumFirstPenultimate
        Kata sfp = new Kata();
        System.out.println("\n\nsumFirstPenultimate:\n");
        al.clear();
        al.addAll(Arrays.asList(1, 2, 3));
        System.out.println("Kata.sumFirstPenultimate([1,2,3]) => \"" + sfp.sumFirstPenultimate(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1,1));
        System.out.println("Kata.sumFirstPenultimate([5,11,9]) => \"" + sfp.sumFirstPenultimate(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1,1,1,1));
        System.out.println("Kata.sumFirstPenultimate([7,0,0]) => \"" + sfp.sumFirstPenultimate(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1,2,3,4));
        System.out.println("Kata.sumFirstPenultimate([7,4,7]) => \"" + sfp.sumFirstPenultimate(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(1, 8, 7));
        System.out.println("Kata.sumFirstPenultimate([1,8,7]) => \"" + sfp.sumFirstPenultimate(al) + "\"");
        al.clear();
        al.addAll(Arrays.asList(0, 0, 1));
        System.out.println("Kata.sumFirstPenultimate([0,0,1]) => \"" + sfp.sumFirstPenultimate(al) + "\"");


        //mapBully
        //Kata kB = new Kata();
        System.out.println("\n\nmapBully:\n");
        HashMap<String, String> mB = new HashMap<>();
        //HashMap<String, String> kB = new HashMap<>();
        mB.put("b", "dirt");
        mB.put("a", "candy");
        String cB = mB.toString();
        HashMap kB = Kata.mapBully(mB);
        System.out.printf("Kata.mapBully(%s) => %s", cB, kB);

        mB.clear();
        kB.clear();
        mB.put("b", "carrot");
        mB.put("c", "meh");
        mB.put("a", "candy");
        cB = mB.toString();
        kB = Kata.mapBully(mB);
        System.out.printf("\nKata.mapBully(%s) => %s\n", cB, kB);

        //mapShare
        System.out.println("\n\nmapShare:\n");
        HashMap<String, String> mS = new HashMap<>();
        mS.put("b", "bbb");
        mS.put("c", "ccc");
        mS.put("a", "aaa");
        String cS = mS.toString();
        HashMap kS = Kata.mapShare(mS);
        System.out.printf("Kata.mapShare(%s) => %s\n", cS, kS);

        mS.clear();
        kS.clear();
        mS.put("b", "xyz");
        mS.put("c", "ccc");
        cS = mS.toString();
        kS = Kata.mapShare(mS);
        System.out.printf("Kata.mapShare(%s) => %s\n", cS, kS);

        mS.clear();
        kS.clear();
        mS.put("d", "hi");
        mS.put("c", "meh");
        mS.put("a", "aaa");
        cS = mS.toString();
        kS = Kata.mapShare(mS);
        System.out.printf("Kata.mapShare(%s) => %s\n", cS, kS);

        //mapAB
        System.out.println("\n\nmapAB:\n");
        HashMap<String, String> mA = new HashMap<>();
        mA.put("b", "There");
        mA.put("a", "Hi");
        String cA = mA.toString();
        HashMap kA = Kata.mapAB(mA);
        System.out.printf("Kata.mapAB(%s) => %s\n", cA, kA);

        mA.clear();
        kA.clear();
        mA.put("a", "Hi");
        cA = mA.toString();
        kA = Kata.mapAB(mA);
        System.out.printf("Kata.mapAB(%s) => %s\n", cA, kA);

        mA.clear();
        kA.clear();
        mA.put("b", "There");
        cA = mA.toString();
        kA = Kata.mapAB(mA);
        System.out.printf("Kata.mapAB(%s) => %s\n", cA, kA);


        //wordLength
        System.out.println("\n\nwordLength:\n");
        ArrayList<String> wL = new ArrayList();
        wL.add("a");
        wL.add("bb");
        wL.add("a");
        wL.add("bb");
        String cW = wL.toString();
        HashMap kL = Kata.wordLength(wL);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, kL);

        wL.clear();
        wL.add("this");
        wL.add("and");
        wL.add("that");
        wL.add("and");
        cW = wL.toString();
        kL = Kata.wordLength(wL);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, kL);

        wL.clear();
        wL.add("code");
        wL.add("code");
        wL.add("code");
        wL.add("bug");
        cW = wL.toString();
        kL = Kata.wordLength(wL);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, kL);


        //indexWords
        System.out.println("\n\nindexWords:\n");
        ArrayList<String> iW = new ArrayList();
        iW.add("aardvark");
        iW.add("apple");
        iW.add("zamboni");
        iW.add("phone");
        cW = iW.toString();
        HashMap<String, ArrayList<String>> iL = Kata.indexWords(iW);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, iL);

        iL.clear();
        iW.clear();
        iW.add("boo");
        iW.add("ya");
        iW.add("yo");
        iW.add("B");
        cW = iW.toString();
        iL = Kata.indexWords(iW);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, iL);

        iL.clear();
        iW.clear();
        iW.add("sunny");
        iW.add("day");
        iW.add("still");
        iW.add("so");
        iW.add("dreary");
        cW = iW.toString();
        iL = Kata.indexWords(iW);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, iL);

        iL.clear();
        iW.clear();
        iW.add("voluminous ");
        iW.add("victory");
        iW.add("very");
        iW.add("vague");
        cW = iW.toString();
        iL = Kata.indexWords(iW);
        System.out.printf("Kata.wordLength(%s) => %s\n", cW, iL);

System.out.println("\nLa Fin!");
    }
}