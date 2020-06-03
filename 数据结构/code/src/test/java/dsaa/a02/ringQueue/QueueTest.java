package dsaa.a02.ringQueue;
import static org.junit.Assert.*;

import org.junit.*;

public class QueueTest {
    Queue queue=new Queue(3);

    @Test
    public void testEmpty() {
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testEmpty2() {
        queue.enQueue(1);
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testEmpty3() {
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.deQueue();
        queue.enQueue(1);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testFull() {
        queue.enQueue(1);
        System.out.println(queue.isFull());
        assertFalse(queue.isFull());
    }

    @Test
    public void testFull2() {
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.deQueue();
        queue.enQueue(1);
        assertTrue(queue.isFull());
    }
}
