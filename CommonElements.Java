/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;


public class Main {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> commonElements = new ArrayList<>();

        for (int num : list1) {
            //map.put(num, map.getOrDefault(num, 0) + 1);
            map.put(num, 1);
        }

        for (int num : list2) {
            if (map.containsKey(num) && map.get(num) != null) {
                commonElements.add(num);
                //map.put(num, map.get(num) - 1);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);
    }
}

