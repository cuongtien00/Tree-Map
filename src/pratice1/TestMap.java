package pratice1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Cuong",21);
        hashMap.put("Long",30);
        hashMap.put("Huyen",19);
        hashMap.put("Dung",20);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Cuong",30);
        linkedHashMap.put("Long",31);
        linkedHashMap.put("Huyen",29);
        linkedHashMap.put("Dung",29);

        System.out.println("Tuoi cua Cuong la " + linkedHashMap.get("Cuong"));
    }
}
