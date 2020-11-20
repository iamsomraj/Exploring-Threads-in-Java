
class App extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      if (i == 2) {
        try {
          // Thread will wait for 5 seconds
          Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
      }
      System.out.println(" App Thread : " + i);
    }
    System.out.println(" App Thread : Finished Execution");
  }

  public static void main(String args[]) {
    App obj = new App();
    obj.start();
  }
}