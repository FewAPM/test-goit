import java.util.*;

public class Main {


    static int size = 0;
    static int indexFor(int h, int length) {
        return h & (length-1);
    }
    static final int DEFAULT_INITIAL_CAPACITY= 1 << 4;

   static int hash(String s){
        return s.hashCode();
    }
    static int arrLength = 16;
    static int hash;
    static void add(String [] arr, String name){
        hash = name.hashCode();
        if (arr[Math.abs(hash % (arrLength))] == null) {
            arr[Math.abs(hash % (arrLength))] = name;// create newNode
        }
        else {
//            порівяння елементів
//            (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
        }
       size++;
    }
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Yarik", 100);
        System.out.println("map = " + map);
        map.put("Yarik", 777);
        System.out.println("map.get(\"Huy\") = " + map.get("Huy"));
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());
        map.clear();
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());
        map.put("Den", 10000);
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());

//        System.out.println("hash(\"Yarik\") = " + hash("Yarik"));
//        System.out.println("hash(\"Marina\") = " + hash("Marina"));
//        String [] arr = new String[arrLength];
//        add(arr, "Yarik");
//        add(arr, "Marina");
//        add(arr, "Marina2");
//        add(arr, "Mark");
//        add(arr, "Tanya");
//        add(arr, "abc");
//        add(arr, "dfg");
//        add(arr, "klm");
//        add(arr, "nop");
//        add(arr, "wzy");
//        add(arr, "z");
//
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        System.out.println(2306996%16);    HashMap <String, Integer> map = new HashMap<>();


//        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
//        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
//        passportsAndNames.put(8082771, "Дональд Джон Трамп");
//        passportsAndNames.put(666333, "Starenkyi Yaroslav Volodymyrovych");
//        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");//повторный ключ
//        for (Map.Entry entry : passportsAndNames.entrySet()) {
//            System.out.println("entry = " + entry);
//        }
//
//        for (Integer entry : passportsAndNames.keySet()) {
//            System.out.println("entry = " + entry);
//        }
//        for (String entry : passportsAndNames.values()) {
//            System.out.println("entry = " + entry);
//        }

    }

}