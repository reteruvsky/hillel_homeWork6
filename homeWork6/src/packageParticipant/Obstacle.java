package packageParticipant;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public abstract class Obstacle {
    private String name;
    private int length;
    private double height;

    public Obstacle(String name, int length) {
        setName(name);
        setLength(length);
    }

    public Obstacle(String name, double height) {
        setName(name);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void overcome(Participant participant);

    public static void action(ArrayList<Obstacle> obstacles) {
        obstacles.add(new Wall("Wall", 1.2));
        obstacles.add(new Racetrack("Racetrack", 450));
        obstacles.add((new Wall("Wall", 4.0)));
        obstacles.add(new Racetrack("Racetrack", 150));
        obstacles.add(new Wall("Wall", 2.1));
        obstacles.add(new Racetrack("Racetrack", 100));
    }
}

class Racetrack extends Obstacle {

    public Racetrack(String name, int length) {
        super(name, length);
    }

    @Override
    public void overcome(Participant participant) {
        System.out.println(participant.getName() + " пробежал беговую дорожку.");
    }
}

class Wall extends Obstacle {

    public Wall(String name, double height) {
        super(name, height);
    }

    @Override
    public void overcome(Participant participant) {
        System.out.println(participant.getName() + " перепрыгнул через стену.");
    }
}