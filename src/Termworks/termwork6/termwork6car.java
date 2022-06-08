package termwork6;
abstract class car {
    String carname;
    String chassisnum;
    String modelName;
    public void startCar(){};
    public void operateSteering(){};

}
class reference extends car{
    @Override
    public void startCar() {
        super.startCar();
    }

    @Override
    public void operateSteering() {
        super.operateSteering();
    }
}
public class termwork6car {
}
