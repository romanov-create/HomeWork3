package HomeWork3.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
            for (int i = 0; i <= 10; i++) {
                treeMap.put(i, "val_" + i);
            }
        for(Map.Entry test:treeMap.entrySet()){
            System.out.println(test.getKey()+" "+test.getValue());
        }
        System.out.println(treeMap.remove(5) + " = value deleted");
        System.out.println("descendingMap: "+ treeMap.descendingMap());
        System.out.println("headMap: "+ treeMap.headMap(7,true));
        System.out.println("tailMap: "+ treeMap.tailMap(7,false));
        System.out.println("subMap: "+ treeMap.subMap(3, false, 8, true));
        System.out.println("headMap: "+ treeMap.headMap(2));
        System.out.println("tailMap: "+ treeMap.tailMap(5));
        System.out.println("subMap: "+ treeMap.subMap(1, 5));
        System.out.println("firstKey: "+ treeMap.firstKey());
        System.out.println("lastKey: "+ treeMap.lastKey());
        System.out.println("ceilingKey: "+ treeMap.ceilingKey(3));
        System.out.println("floorKey: "+ treeMap.floorKey(5));
        System.out.println("lowerKey: "+ treeMap.lowerKey(8));
        System.out.println("higherKey: "+ treeMap.higherKey(7));
    }
}

