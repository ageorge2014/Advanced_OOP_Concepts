public interface Diagnosable {
    double getTemperature();
    default boolean hasFever(){return this.getTemperature()>100.4;}
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
    void setSystolic(int s);
    void setDiastolic(int d);
}
