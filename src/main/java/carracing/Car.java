package carracing;

import java.util.Random;

public class Car {

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private final String name;
    private int position = 0;

    public Car(final String name){
        if (StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름의 값이 없습니다.");
        }
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
    public void move(){
        if (getRandomNo() >= FORWARD_NUM){
            this.position++;
        }
    }
    public void move(MovingStrategy movingStrategy){
        if (movingStrategy.moveable()){
            this.position++;
        }
    }
    public void move(int randomNo){
        if (randomNo >= FORWARD_NUM){
            this.position++;
        }
    }

    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);

    }


}
