package carracing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private int tryNo;

    public RacingGame(List<Car> cars, int tryNo) {
        this.cars = cars;
        this.tryNo = tryNo;
    }

    private static List<Car> initCars(String carNames){
        if (StringUtils.isBlank(carNames)){
            throw new IllegalArgumentException("자동차 이름의 값이 없습니다.");
        }

        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (Car car : cars) {
            cars.add(car);
        }
        return cars;
    }

    public void race(){
        this.tryNo--;
        moveCars();
    }

    private void moveCars(){
        for (Car car : cars) {
            car.move();
        }
    }
    private void moveCars2(){
        for (Car car : cars) {
            car.move(new RandomMovingStrategy());
        }
    }

    public boolean racing(){return this.tryNo > 0;}

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
