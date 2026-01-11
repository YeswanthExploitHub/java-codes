import java.util.*;

public class RBTTree {
    public static void main(String[] args){

    TreeSet<Integer> set = new TreeSet<>();
    set.add(20);
    set.add(10);
    set.add(11);
    System.out.println(set);
    List<Integer> list = new ArrayList<>(set); 
    System.out.println(list.get(0));
    }
}
