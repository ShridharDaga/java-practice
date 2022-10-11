package multiple_inheritance;

public interface Engine {
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

