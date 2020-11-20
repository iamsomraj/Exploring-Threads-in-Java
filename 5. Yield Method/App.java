
class A extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      if (i == 1) {
        // as priority of a is less than priority of B
        // then the control will pass from A to B
        Thread.yield();
      }
      System.out.println("A : " + i);
    }
  }
}

class B extends Thread {
  @Override
  public void run() {
    for (int j = 0; j < 5; j++) {
      System.out.println("B : " + j);
    }
  }
}

class App {
  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    a.setPriority(5);
    b.setPriority(10);
    a.start();
    b.start();
  }
}