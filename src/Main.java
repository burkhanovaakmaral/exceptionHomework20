public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()){
            drive();
        }catch (RuntimeException ignore){
        }

    }
    private static void drive(){
        System.out.println("Машина журуп жатат");
    }

}