package threads;

//not so popular way of creating a thread, extends Thread.
public class Publisher extends Thread implements Worker {

    public Publisher(String name) {
        this.setName(name);
    }

    public void run() {
        try {
            while (Workers.KEEP_WORKING) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(this.getName() + " closed");
        }
    }

    @Override
    public void stopWorking() {
        int counter = 0;
        while (this.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(counter > 5)
                this.interrupt();
            counter++;
        }
    }

    @Override
    public void startWorking() {
        this.start();
    }
}