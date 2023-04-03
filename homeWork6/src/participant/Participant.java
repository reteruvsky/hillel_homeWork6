package participant;

import obstacle.Obstacle;
import obstacle.Treadmill;
import obstacle.Wall;

public abstract class Participant {
    private String name;
    private int maxLength;
    private int maxHeight;

    public Participant(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public abstract void run(Treadmill treadmill);

    public abstract void jump(Wall wall);
}
