package potoki.second;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingTest {
    private long counter = 0;
    private Lock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try {
            ++counter;
        } finally {
            lock.unlock();
        }
    }
}
