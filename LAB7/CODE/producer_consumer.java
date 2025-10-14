package Lab007;
class Buffer {
    int data;            // item produced
    boolean hasData = false;  // flag to check if data is available

    // Producer adds data
    synchronized void produce(int value) {
        while (hasData) { // wait if data not yet consumed
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // tell consumer to consume
    }

    // Consumer takes data
    synchronized void consume() {
        while (!hasData) { // wait if no data to consume
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // tell producer to produce again
    }
}

// Producer thread
class Producer extends Thread {
    Buffer b;
    Producer(Buffer b) { this.b = b; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.produce(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    Buffer b;
    Consumer(Buffer b) { this.b = b; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.consume();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class producer_consumer {
	 public static void main(String[] args) {
	        Buffer b = new Buffer();
	        new Producer(b).start();
	        new Consumer(b).start();
	    }

}
  