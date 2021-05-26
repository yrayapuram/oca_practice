package threads;

public class Workers {
    private static int MAX_WORKERS = 0;
    public static boolean KEEP_WORKING =true;

    public static void setMaxWorkers(int maxWorkers) {
        Workers.MAX_WORKERS = maxWorkers;
    }

    public static int getMaxWorkers() {
        return MAX_WORKERS;
    }

    public Worker getWorker(String name) {
        if(name.startsWith("Publisher")) {
            return new Publisher(name);
        }
        if(name.startsWith("Subscriber")) {
            return new Subscriber(name);
        }
        return null;
    }
}
