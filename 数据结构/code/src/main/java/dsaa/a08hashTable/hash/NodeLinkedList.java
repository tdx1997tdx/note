package dsaa.a08hashTable.hash;

/**
 * 链表类
 *
 * @param <V>
 */
class NodeLinkedList<V> {
    private Node head;

    public NodeLinkedList() {
        head = null;
    }

    public void add(int key, V value) {
        Node node = new Node<V>(key, value);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        //判断是否进入if语句
        boolean isEnter = false;
        while (temp.getNext() != null) {
            //检查当前id是否重复
            if (temp.getKey() == key) {
                //如果重复，直接覆盖
                temp.setValue(value);
                isEnter = true;
                break;
            }
            temp = temp.getNext();
        }
        if (!isEnter) {
            temp.setNext(node);
        }

    }

    public V get(int key) {
        Node temp = head;
        while (temp != null) {
            //是否找到
            if (temp.getKey() == key) {
                //如果找到直接返回
                return (V) temp.getValue();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void list() {
        Node temp = head;
        while (temp != null) {
            System.out.print("key:" + temp.getKey() + ",value:" + temp.getValue() + "==>");
            temp = temp.getNext();
        }
        System.out.println();
    }

}



