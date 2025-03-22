package carracing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {


    @Test
    public void 이동(){
        Car car = new Car("pobi");
        car.move(()->true);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 정지(){
        Car car = new Car("pobi");
        car.move(new MovingStrategy() {
            @Override
            public boolean moveable() {
                return false;
            }
        });
        assertThat(car.getPosition()).isEqualTo(0);
    }

}
