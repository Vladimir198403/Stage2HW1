package obstacles;

import competitors.Competitor;

import java.util.Random;

public class Run extends Obstacle{

    int dist;
    int random = new Random().nextInt(1000);

    public Run(int dist) {
        this.dist = dist;
    }

    public Run(){//сделаем русскую рулетку. Каждый раз при компиляции программы будет создаваться новая длинна дистанции  и высота препятствия
        dist = random;
    }

    @Override
    public void doIt(Competitor c) {
    c.run(dist);
    }
}
