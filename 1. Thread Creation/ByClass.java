
// @desc: class extends Thread class
// @note: multiple inheritance is not possible
class ByClass extends Thread {

  public void run() {
    System.out.println("Here, we are using Thread Class");
    System.out.println("Thread gets executed");
  }

  public static void main(String args[]) {
    ByClass byClass = new ByClass();
    byClass.start();
  }
}