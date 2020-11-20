class A {
  public synchronized void add(int value) {
    Thread thread = Thread.currentThread();
    for (int i = 0; i < 3; i++) {
      System.out.println("Thread : " + thread.getName() + " : " + (i + value));
    }
  }
}

/**
 * App
 */
public class App extends Thread {
  A a = new A();

  @Override
  public void run() {
    a.add(100);
  }

  public static void main(String[] args) {
    App app = new App();
    // We are creating two thread instances using same object
    // so that there is no difference between them
    Thread t1 = new Thread(app);
    Thread t2 = new Thread(app);
    t1.setName("T1");
    t2.setName("T2");
    t1.start();
    t2.start();
  }
}