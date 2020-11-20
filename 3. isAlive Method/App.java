class App extends Thread {

  @Override
  public void run() {
    // isAlive tells if the thread has started execution
    System.out.println("App Thread : Executing : " + isAlive());
  }

  public static void main(String args[]) {
    App app = new App();
    System.out.println("Before start : App Thread : Main : " + app.isAlive());
    app.start();
    System.out.println("After start : App Thread : Main : " + app.isAlive());
  }
}