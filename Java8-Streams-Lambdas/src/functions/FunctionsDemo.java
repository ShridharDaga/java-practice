package functions;

/**
 * Predicate == boolean test(T t);
 * Consumer == void accept(T t);
 * Supplier == T get();
 * Function == R apply(T t);
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsDemo {

    //Predicate
    Predicate<Student> isPass = (student) -> student.getMarks() > 40 ? true : false;
    public void testPredicate(Student s){
        if(isPass.test(s))
            System.out.println(s.getName() + " passed the exam");
        else
            System.out.println(s.getName() + " failed the exam");
    }

    //Consumer
    Consumer<Student> studInfo = (student)-> System.out.println(student.toString());
    public void testConsumer(Student s){
        studInfo.accept(s);
    }

    //Supplier
    Supplier<String[]> fruitsSupplier = () -> new String[]{"Apple", "Banana", "Mango"};
    public void testSupplier(){
        String [] fruits = fruitsSupplier.get();
        for(String s : fruits)
            System.out.println("Fruit : "+s);
    }

    //Functions
    Function<String,Student> createStudent = (s) -> new Student(s);
    public void testFunction(String studName){
        Student s = createStudent.apply(studName);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Student stud = new Student(85,"Shridhar",10);
        FunctionsDemo obj = new FunctionsDemo();
        obj.testPredicate(stud);
        obj.testConsumer(stud);
        obj.testSupplier();
        obj.testFunction("Joe");
    }
}
