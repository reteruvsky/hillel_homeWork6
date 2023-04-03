package obstacle;

import participant.Participant;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public abstract void overcome(Participant participant);

    public String getName() {
        return name;
    }
}
