import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by andrewdmo on 8/17/16.
 */
public class Kata {

    static private int val;

    //firstLastSix
    public static boolean firstLastSix(ArrayList<Integer> al) {
        if (al.size() < 1) return false;
        int firstnum = al.get(0);
        int lastnum = al.get(al.size() - 1);
        return ((firstnum == 6) || (lastnum == 6));
    }

    //sameFirstLast
    //looks like Clojure but it works
    public static boolean sameFirstLast(ArrayList<Integer> al) {
        if ((al.size() >= 1) && (al.get(0)) == (al.get(al.size() - 1))) {
            return true;
        }
        {
            return false;
        }
    }

    //rotateLeft3
    //almost got working with more than 3 #s
    public static ArrayList<Integer> rotateLeft3(ArrayList<Integer> al) {
        al.add(al.remove(0));
        return al;
    }

    //reverse3
    public static ArrayList<Integer> reverse3(ArrayList<Integer> al) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = al.size() - 1; i < al.size() && i >= 0; i--) {
            temp.add(al.get(i));
        }
        return temp;
    }

    //sumFirstPenultimate
    public static int sumFirstPenultimate(ArrayList<Integer> al) {
        if (al.size() >= 2) {
            return al.get(0) + al.get(al.size() - 2);
        } else if (al.size() == 1) {
            return al.get(0);
        } else {
            return 0;
        }
    }
    //mapBully
    public static HashMap<String, String> mapBully(HashMap<String, String> bl) {
        if (bl.get("a")!=null) {
            bl.put("b", bl.get("a"));
            bl.put("a", "");
        }
        return bl;
    }

    //mapShare
    public static HashMap<String, String> mapShare(HashMap<String, String> al) {
        if (al.get("c")!=null) {
            al.remove("c");
        if (al.get("a")!=null){
            al.put("b", al.get("a"));
            }}
    return al;
    }

    //mapAB
    public static HashMap<String, String> mapAB(HashMap<String, String> al) {
        if (al.get("a")!=null && al.get("b")!=null) {
            al.put("ab", al.get("a")+al.get("b"));}
            return al;
        }

    //wordLength
    public static HashMap<String, Integer> wordLength(ArrayList<String> al) {
        HashMap<String, Integer> wL = new HashMap<>();

        for (String element : al) {
            wL.put(element, element.length());
        }

        return wL;
    }

    public static HashMap<String, ArrayList<String>> indexWords(ArrayList<String> al) {
        HashMap<String, ArrayList<String>> thisHash = new HashMap<>();

        if((al.size() > 0) && al.get(0)!="")
        {
            for (int i = 0; i < al.size(); i++) {

                ArrayList<String> iW = new ArrayList<>();

                char key = al.get(i).charAt(0);

                for (String value : al)
                {
                    if (value.length() <= 0) {
                    } else if (value.charAt(0) == key) {
                        iW.add(value);
                    }
                }
                thisHash.put("" + key, iW);
            }
        }

        return thisHash;
    }








}




