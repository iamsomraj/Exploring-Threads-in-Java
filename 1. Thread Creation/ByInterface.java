
// @desc: We are using interface
// @note: multiple inheritance is possible
public class ByInterface implements Runnable {

  public void run() {
    System.out.println("Here, we are using the Runnable interface");
    System.out.println("Thread : Executing");
  }

  public static void main(String[] args) {
    ByInterface byInterface = new ByInterface();
    // Creating the instance of the thread class
    // in the instance, we will pass the object
    // with this object of the thread class
    // we get the access of the start method
    Thread thread = new Thread(byInterface);
    thread.start();
  }
}
