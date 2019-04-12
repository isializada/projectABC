
//https://www.jeejava.com/creating-custom-hashmap-in-java/

class Entry<K,V> {
    K key;
    V value;
    Entry<K,V> next;

    public Entry(K key, V value, Entry<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

class MyHashMap<K,V> {

    private int initialCapacity = 16;

    private Entry<K,V>[] entryTable;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        entryTable = new Entry[initialCapacity];
    }

    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        initialCapacity = capacity;
        entryTable = new Entry[initialCapacity];
    }

    public void put(K key, V value){
        if (key == null) {
            throw new RuntimeException("null key is not allowed");
        }

        int hashValue = convertToHash(key);

        Entry<K,V> entry = new Entry<K,V>(key, value, null);

        if (entryTable[hashValue] == null) {
            entryTable[hashValue] = entry;
        } else {// if found then put the value in a linked list
            Entry<K, V> previous = null;
            Entry<K, V> current = entryTable[hashValue];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        entry.next = current.next;
                        entryTable[hashValue] = entry;
                    } else {
                        entry.next = current.next;
                        previous.next = entry;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = entry;
        }

    }

    public V get(K key){
        if (key == null) {
            return null;
        }
        // hash value of the key
        int hashValue = convertToHash(key);
        if (entryTable[hashValue] == null) {
            return null;
        } else {
            Entry<K, V> temp = entryTable[hashValue];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    private int convertToHash(K key){
        return Math.abs(key.hashCode()) % initialCapacity;
    }
}

