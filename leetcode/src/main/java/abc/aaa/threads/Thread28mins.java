package abc.aaa.threads;

//https://www.youtube.com/watch?v=AfVbJDr-8ic

/*185 . What is the need for threads in Java?
186 . How do you create a thread?
187 . How do you create a thread by extending thread class?
188 . How do you create a thread by implementing runnable interface?
189 . How do you run a thread in Java?
190 . What are the different states of a thread?
191 . What is priority of a thread? How do you change the priority of a thread?
192 . What is executorservice?
193 . Can you give an example for executorservice?
194 . Explain different ways of creating executor services .
195 . How do you check whether an executionservice task executed successfully?
196 . What is callable? How do you execute a callable from executionservice?
197 . What is synchronization of threads?
198 . Can you give an example of a synchronized block?
199 . Can a static method be synchronized?
200 . What is the use of join method in threads?
201 . Describe a few other important methods in threads?
202 . What is a deadlock?
203 . What are the important methods in Java for inter-thread communication?
204 . What is the use of wait method?
205 . What is the use of notify method?
206 . What is the use of notifyall method?
207 . Can you write a synchronized program with wait and notify methods?
		*/
class Calculator extends Thread {
	long sum;
	public void run() {
		synchronized(this) {
			for(int i=0; i < 1000;i++) {
				sum += i;
			}
			notify();
		}
	}	
}

public class Thread28mins {
	
	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();
		//if below block is commented 0 will be printed, wait and notify communicate that way
		synchronized(thread){			
			try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(thread.sum);

	}

}
