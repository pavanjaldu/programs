import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        System.out.println(" fruits are " + getStream().collect(Collectors.toList()));
        
        List<String> filterdList = getStream().filter(name -> name.contains("fruit")).collect(Collectors.toList());
        filterdList.forEach(name -> System.out.println(" fruit contains "+name));
    }
    public static Stream<String> getStream(){
        Stream<String> fruitStream = Stream.of("jackfruit", "apple", "dragon fruit", "mango");
        
        return fruitStream;
    }
    
}
