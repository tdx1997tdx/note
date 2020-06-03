package dsaa.a08hashTable.hash;

public class HashTab<V> {
    //定义数组的大小
    private int size;
    //定义链表数组
    private NodeLinkedList[] nodeLinkedList;

    public HashTab(int size) {
        this.size = size;
        this.nodeLinkedList = new NodeLinkedList[size];
        for (int i = 0; i < size; i++) {
            nodeLinkedList[i] = new NodeLinkedList<V>();
        }
    }

    public void list() {
        for (int i = 0; i < size; i++) {
            System.out.println("第" + i + "个链表");
            nodeLinkedList[i].list();
        }
    }

    //定义一个散列函数
    private int hashFunction(int key) {
        return key % size;
    }

    public void put(int key, V value) {
        int i = hashFunction(key);
        nodeLinkedList[i].add(key, value);
    }

    public V get(int key) {
        int i = hashFunction(key);
        return (V) nodeLinkedList[i].get(key);
    }
}