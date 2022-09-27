public class Car extends Transport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышки автомобиля");
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
