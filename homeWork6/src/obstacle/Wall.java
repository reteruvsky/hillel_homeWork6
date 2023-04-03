package obstacle;

import participant.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxHeight() <= this.height) {
            participant.jump(this);
        } else {
            System.out.println(participant.getName() + " is not jumping" + this.getName() + " on a height " + this.height + ". Jumped " + participant.getMaxHeight());
        }
    }

    public int getHeight() {
        return height;
    }
}
