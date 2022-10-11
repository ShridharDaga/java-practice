package multiple_inheritance;

public class Car implements Engine, Vehicle{
    public String model(int id){
        return Vehicle.super.model(id);
//        return Engine.super.model(id);
    }
}
