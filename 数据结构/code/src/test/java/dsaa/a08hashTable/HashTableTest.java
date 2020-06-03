package dsaa.a08hashTable;

import dsaa.a08hashTable.hash.HashTab;
import dsaa.a08hashTable.hash.Person;
import org.junit.Test;

public class HashTableTest {
    HashTab<Person> hashTab;

    @Test
    public void test() {
        hashTab = new HashTab<>(10);
        Person p = new Person("Tom", 18, "男");
        hashTab.put(22, p);
        hashTab.list();
    }

    @Test
    public void test2() {
        hashTab = new HashTab<>(10);
        Person p = new Person("Tom", 18, "男");
        hashTab.put(22, p);
        System.out.println(hashTab.get(22));
    }

    @Test
    public void test3() {
        hashTab = new HashTab<>(10);
        Person p = new Person("Tom", 18, "男");
        hashTab.put(22, p);
        System.out.println(hashTab.get(2));
    }
}
