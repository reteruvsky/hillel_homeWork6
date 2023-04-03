package obstacle;

import participant.Participant;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxLength() > this.length) {
            participant.run(this);
        } else {
            System.out.println(participant.getName() + " is not running " + this.getName() + " on a length " + this.length + ". Ran " + participant.getMaxLength());
        }
    }

    public int getLength() {
        return length;
    }
}
