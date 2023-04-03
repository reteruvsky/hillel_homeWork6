package participant;

import obstacle.Obstacle;
import obstacle.Treadmill;
import obstacle.Wall;

public class Robot extends Participant {
    public Robot(String name, int maxLength, int maxHeight) {
        super(name, maxLength, maxHeight);
    }

    @Override
    public void run(Treadmill treadmill) {
        System.out.println(this.getName() + " is running " + treadmill.getName() + " on a distance " + treadmill.getLength());
    }

    @Override
    public void jump(Wall wall) {
        System.out.println(this.getName() + " is jumping" + wall.getName() + " on a height " + wall.getHeight());
    }
}
