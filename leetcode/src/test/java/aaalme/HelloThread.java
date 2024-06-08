package aaalme;

public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from thread!");
    }
    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start();
    }
}