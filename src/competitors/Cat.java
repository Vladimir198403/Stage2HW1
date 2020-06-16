package competitors;

public class Cat implements Competitor {
    String name;

    int maxRunDist;
    int maxJumpHeight;

    boolean onDistance;

    public Cat(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDist){
            System.out.printf("Кот %s успешно пробежал дистанцию %d метров\n", name, dist);
        } else {
            System.out.printf("Кот %s не смог пробежать дистанцию %d метров\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int dist) {
        if (dist <= maxJumpHeight){
            System.out.printf("Кот %s успешно перепрыгнул препятствие высотой %d метров\n", name, dist);
        } else {
            System.out.printf("Кот %s не смог перепрыгнуть препятствие высотой %d метров\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistanse() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }
}
