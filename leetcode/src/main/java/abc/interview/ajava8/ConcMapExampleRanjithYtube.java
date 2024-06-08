package abc.interview.ajava8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcMapExampleRanjithYtube {

	//https://www.youtube.com/watch?v=APL28XpFP0c - 31.39 min	
	static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();
	
	static void processOrders() {
		for(String city: orders.keySet()) {
			for(int i=0; i <50; i++) {
				orders.get(city).getAndIncrement();
			}
		}
	}	
	public static void main(String[] args) throws InterruptedException {
		orders.put("Bombay", new AtomicLong());
		orders.put("London", new AtomicLong());
		orders.put("NY", new AtomicLong());
		orders.put("China", new AtomicLong());
		
		ExecutorService service = Executors.newFixedThreadPool(2);		
		service.submit(ConcMapExampleRanjithYtube::processOrders);
		service.submit(ConcMapExampleRanjithYtube::processOrders);		
		service.awaitTermination(1, TimeUnit.SECONDS);
		service.shutdown();		
		System.out.println(orders);
	}

}
