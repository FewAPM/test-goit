//
//
//public class MyHashMap<K, V> {
//    private Entry<K, V>[] buckets;
//    private int capacity; // 16
//
//    private int size = 0;
//
//    private double lf = 0.75;
//
//    public MyHashMap() {
//        this(16);
//    }
//
//    public MyHashMap(int capacity) {
//        this.capacity = capacity;
//        this.buckets = new Entry[this.capacity];
//    }
//
//    public void clear() {
//        buckets = new Entry[0];
//        size = 0;
//    }
//
//    public void put(K key, V value) {
//        if (buckets == null || buckets.length == 0) {
//            buckets = new Entry[capacity];
//        }
//        if (size == lf * capacity) { // якщо заповненність 0,75 то
//            // rehash
//            Entry<K, V>[] old = buckets; // зберігаємо наш старий масив в змінну
//
//            capacity *= 2;
//            size = 0;
//            buckets = new Entry[capacity]; // збільшимо розмір масиву на 2
//
//            for (Entry<K, V> e : old) {// копіюємо старий масив в новий (більший)
//                while (e != null) {
//                    put(e.key, e.value);
//                    e = e.next;
//                }
//            }
//        }
//        Entry<K, V> entry = new Entry<>(key, value, null);
//
//        int bucket = getHash(key) % getBucketSize();// обираємо бакет в який піде новий Ентрі
//
//        Entry<K, V> existing = buckets[bucket];
//        if (existing == null) {// якщо бакет пустий то добавляємо туди новий Ентрі
//            buckets[bucket] = entry;
//            size++;
//        } else {
//            // compare the keys see if key already exists
//            while (existing.next != null) {// йдемо циклом по елементах та шукаємо збіг. Окрім останнього елементу листа
//                if (existing.key.equals(key)) {
//                    existing.value = value;
//                    return;// якщо знайшли виходимо з блоку
//                }
//                existing = existing.next;
//            }
//
//            if (existing.key.equals(key)) { // випадок коли співпадіння в останнбому елемнті списку
//                existing.value = value;// міняємо значення
//            } else { // якщо співпадіння не було додаємо новий елемент в кінець списку
//                existing.next = entry;
//                size++;
//            }
//        }
//    }
//
//    public V get(K key) {
//        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()]; // вичисляємо бакет
//
//        while (bucket != null) {// перебираємо всі елемнти бакету
//            if (key == bucket.key) {
//                return bucket.value;
//            }
//            bucket = bucket.next;
//        }
//        return null;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    private int getBucketSize() {
//        return buckets.length;
//    }
//
//    private int getHash(K key) {
//        return key == null ? 0 : Math.abs(key.hashCode());
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Entry entry : buckets) {
//            sb.append("[");
//            while (entry != null) {
//                sb.append(entry);
//                if (entry.next != null) {
//                    sb.append(", ");
//                }
//                entry = entry.next;
//            }
//            sb.append("]");
//        }
//        return "{" + sb.toString() + "}";
//    }
//
//    static class Entry<K, V> {
//        final K key;
//        V value;
//        Entry<K, V> next;
//
//        public Entry(K key, V value, Entry<K, V> next) {
//            this.key = key;
//            this.value = value;
//            this.next = next;
//        }
//
//        public K getKey() {
//            return key;
//        }
//
//        public V getValue() {
//            return value;
//        }
//
//        public Entry<K, V> getNext() {
//            return next;
//        }
//
//        @Override
//        public String toString() {
//            return "{" + key + ", " + value + "}";
//        }
//
//    }
//
//    public void remove(K key) {
//        if (size == 0) {
//            System.out.println("The map is empty!");
//            return;
//        }
//
//        int bucket = getHash(key) % getBucketSize();// обираємо бакет в який піде новий Ентрі
//
//      Entry<K, V> existing = buckets[bucket];// existing стає першою нодою
//            // compare the keys see if key already exists
//           while (buckets[bucket].next != null) {// йдемо циклом по елементах та шукаємо збіг. Окрім останнього елементу листа
//               if (buckets[bucket].key.equals(key)) {
//                   buckets[bucket] = buckets[bucket].next;
//                   size--;
//                   return;// якщо знайшли виходимо з блоку
//               }
//               buckets[bucket] = buckets[bucket].next;
//           }
//           if (buckets[bucket].key.equals(key)) { // випадок коли співпадіння в останнбому елемнті списку
//               size--;
//               buckets[bucket] = null;
//           } else { // якщо співпадіння не було додаємо новий елемент в кінець списку
//               buckets[bucket] = existing;
//           }
//        }
//
//
//    }
//
//
//class MyMapTester{
//    public static void main(String[] args) {
//        MyHashMap <String, Integer> map = new MyHashMap<>();
//        System.out.println("map = " + map);
//        System.out.println("map.size() = " + map.size());
//        map.remove("MSI");
//        map.put("MSI", 100);
//        map.put("King", 100);
//        map.put("BLAKE", 10);
//
//        map.put("Den", 10000);
//        map.put("Mprgan", 10 );
//        map.put("abcd", 333 );
//        map.put("efghi", 10 );
//        map.put("opwx", 11 );
//        map.put("yz00", 11 );
//
//        System.out.println("map.size() = " + map.size());
//        System.out.println("map = " + map);
//        System.out.println("map.get(\"Den\") = " + map.get("Den"));
//
//        System.out.println("map.size() = " + map.size());
//
//        System.out.println("map.size() = " + map.size());
//        map.remove("MSI");
//        map.remove("King");
//        map.remove("BLAKE");
//        map.remove("Den");
//        map.remove("Mprgan");
//        map.remove("abcd");
//        map.remove("efghi");
//        map.remove("opwx");
//        map.remove("yz00");
//        map.put("1", 11 );
//        map.put("2", 11 );
//        map.put("3", 11 );
//        map.put("4", 11 );
//        map.put("5", 11 );
//        map.put("6", 11 );
//        map.put("7", 11 );
//        map.put("8", 11 );
//        map.put("9", 11 );
//        map.put("10", 11 );
//        map.put("MSI", 100);
//        map.put("King", 100);
//        map.put("BLAKE", 10);
//        map.put("Den", 10000);
//        map.put("Mprgan", 10 );
//        map.put("abcd", 333 );
//        map.put("efghi", 10 );
//        map.put("opwx", 11 );
//        map.put("yz00", 11 );
//        System.out.println("map = " + map);
//
//        System.out.println("map.size() = " + map.size());
//    }
//}