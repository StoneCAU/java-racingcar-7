package racingcar.domain;

import java.util.List;

public class CarFactory {
    public static List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(Car::new)
                .toList();
    }
}
