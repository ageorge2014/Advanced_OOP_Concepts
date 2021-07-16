public class Racer implements Runnable {
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    public Racer(Car obj){
        this.c = obj;
    }
    /* TODO
Create a constructor that receives a Car object and initializes c.*/


    @Override
    public void run() {
        while (this.c.odometer < distance) {
            this.c.move(1);

            if ((this.c.miles) > 0) {
                c.charge();
            System.out.println("Charging" + c.name);
        } else {
                try {
                    Thread.sleep((long) c.maxMiles);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }

        }
        }

/* TODO

Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
}
