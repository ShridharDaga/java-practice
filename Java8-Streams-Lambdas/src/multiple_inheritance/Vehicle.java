package multiple_inheritance;

public interface Vehicle {
    default String model(int id){
        return "VEHICLE ENGINE";
    }
}
