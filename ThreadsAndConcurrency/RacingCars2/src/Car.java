public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

    public Car(String name,double miles){
        this.miles = miles;
        this.odometer = 0;
        this.name = name;
        this.maxMiles = miles;
    }

    public void move(double miles){
        if (this.miles != 0) {
            this.miles = this.miles - miles;
            this.odometer = this.odometer + miles;
        }
    }

    public void charge() {
        this.miles = maxMiles;

    }


    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }

}


 /* TODO
Exact same methods and constructor as the Car in task 1*/

