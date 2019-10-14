package demo8;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
    AtomicInteger i = new AtomicInteger(0);

    public void add() {
        i.incrementAndGet();
    }
}
