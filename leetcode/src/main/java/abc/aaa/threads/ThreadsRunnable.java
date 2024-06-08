package abc.aaa.threads;

//Defining first thread with task
//The task of this thread is to print the numbers from 0 to 1000 times
class Thread3 implements Runnable
{
  @Override
  public void run()
  {
      for(int i = 0; i <= 1000; i++)
      {
          System.out.println(i);
      }
  }
}

//Defining second thread with task
//The task of this thread is to print the numbers from 1001 to 2000
class Thread4 implements Runnable
{
  @Override
  public void run()
  {
      for(int i = 1001; i<= 2000; i++)
      {
          System.out.println(i);
      }
  }
}

public class ThreadsRunnable
{
  //Main Thread
  public static void main(String[] args)
  {
      //Creating first thread
      Thread3 t1 = new Thread3();
      Thread thread1 = new Thread(t1);
      thread1.start();
      
      //Creating second thread
      Thread4 t2 = new Thread4();
      Thread thread2 = new Thread(t2);
      thread2.start();
  }
}