import competitors.Cat;
import competitors.Competitor;
import competitors.Human;
import competitors.Robot;
import obstacles.Jump;
import obstacles.Obstacle;
import obstacles.Run;

import java.util.Random;

public class marathon {
    public static void main(String[] args) {


        Competitor[] competitors = {
            new Human("Dan", 500, 3),
            new Cat("Barsik", 400, 2),
            new Robot("R2D2", 800, 2)
        };

        Obstacle[] obstacles = {
                new Run(),
                new Jump()
        };

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isOnDistanse()){
                    break;
                }
                c.info();
            }
        }
    }
}
