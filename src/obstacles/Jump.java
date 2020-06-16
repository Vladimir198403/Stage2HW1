package obstacles;

import competitors.Competitor;

import java.util.Random;

public class Jump extends Obstacle {
    int height;
    int random = new Random().nextInt(3);

    public Jump() {
        height = random;
    }

    @Override
    public void doIt(Competitor c) {
        c.jump(height);
    }
}
