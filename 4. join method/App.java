class App implements Runnable {
  @Override
  public void run() {
    Thread thread = Thread.currentThread();
    // true
    System.out.println("Thread: Run Method : " + thread.isAlive());
  }

  public static void main(String args[]) {
    Thread thread = new Thread(new App());
    // false
    System.out.println("Before start : " + thread.isAlive());
    thread.start();
    try {
      // this line will make sure that thread gets executed
      // and only after that, it will go to the next line
      thread.join();
    } catch (Exception e) {
    }
    // false
    System.out.println("After start : " + thread.isAlive());

  }
}