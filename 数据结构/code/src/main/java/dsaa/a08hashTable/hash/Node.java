package dsaa.a08hashTable.hash;

/**
 * 定义一个节点存放数据
 *
 * @param <V>
 */
class Node<V> {
    //存放key值
    private int key;
    //存放value值
    private V value;
    //下一个节点的值
    private Node next;

    public Node(int key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
