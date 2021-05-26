package threads;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static boolean stopAll(List<Worker> whoEver) {
        int counter = 0;
        while(counter < whoEver.size()) {
            whoEver.get(counter).stopWorking();
            counter++;
        }
        return true;
    }

    public static void main(String... args) {

        Workers.setMaxWorkers(10);
        Workers workers = new Workers();

        int publishersCount = 0;

        List<Worker> publishersList = new ArrayList<>();

        System.out.println("Starting Publishers...");
        while (publishersCount <= Workers.getMaxWorkers()) {
            publishersList.add(workers.getWorker("Publisher" + publishersCount));
            publishersList.get(publishersCount).startWorking();
            publishersCount++;
        }

        try {
            System.out.println("Wait for publishers to finish the job...");

            Thread.sleep(5000);

            //Notify all publishers to stop.
            Workers.KEEP_WORKING = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(stopAll(publishersList))
                System.out.println("All Done!");
        }

    }
}