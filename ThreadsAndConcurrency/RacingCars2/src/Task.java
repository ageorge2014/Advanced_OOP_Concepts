import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {

    static ExecutorService service = null;
    public static void main(String[] args) {

        Car c1 = new Car("Kona", 250);
        Car c2 = new Car("Ioniq", 220);

        Runnable racer1 = new Racer(c1);
        Runnable racer2 = new Racer(c2);


        initExecutorService();
        try {
            service = Executors.newFixedThreadPool(3);
            service.submit(racer1);
            service.submit(racer2);
        } finally {
            if (service != null) service.shutdown();
        }
       /* TODO
Implement the initExecutorService method. This has to initialize service to a new FixedThreadPool with a minimum of 3 threads */
    }

    private static void initExecutorService() {
    }
}