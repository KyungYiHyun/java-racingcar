package carracing;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;


    @Override
    public boolean moveable() {
        return getRandomNo() >= FORWARD_NUM;


    }

    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);

    }
}
