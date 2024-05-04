
public class Race {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        int carNumber = car1.randNum.nextInt(13) + 1;
        System.out.println(car1.getFuelAmount());
        carNumber = car2.randNum.nextInt(13) + 1;
        System.out.println(car2.getFuelAmount())
    }
}

