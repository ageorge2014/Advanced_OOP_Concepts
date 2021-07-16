public class Racer implements Runnable {
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    public Racer(Car obj) {
        this.c = obj;
    }
    /* TODO
Create a constructor that receives a Car object and initializes c.*/


    @Override
    public void run() {
        while (this.c.odometer < distance) {
            if ((this.c.miles) == 0) {
                try{
                    c.charge();
                    Thread.sleep((long)this.c.miles);
                    System.out.println("Charging" + c.name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.c.move(1);
        }
    }

/* TODO

Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
}
