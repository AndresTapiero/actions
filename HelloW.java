import os;

public class HelloW {
    
    public static void main(String[] args) {
        String name = os.getenv("USERNAME");
        System.out.println("Hola desde script " + name);
    }
}
