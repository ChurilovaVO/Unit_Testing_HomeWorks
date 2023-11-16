import hw.Car;
import hw.Motorcycle;
import hw.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp(){
        car = new Car("Dodge", "Ram", 2010);
        moto = new Motorcycle("Honda", "CF 542", 2015);
    }

    // 1. Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства;
    // (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    // 2. Проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testCarWithFourWheels(){
        assertEquals(4, car.getNumWheels());
    }

    // 3. Проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleWithTwoWheels(){
        assertEquals(2, moto.getNumWheels());

    }

    // 4. Проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarTestDrive(){
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    // 5. Проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotorcycleTestDrive(){
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    // 6. Проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
    // машина останавливается (speed = 0)
    @Test
    public void testCarParkAfterTestDrive(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    // 7. Проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0)
    @Test
    public void testMotorcycleParkAfterTestDrive(){
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

}
