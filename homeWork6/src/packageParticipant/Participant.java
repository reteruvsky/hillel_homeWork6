package packageParticipant;

import java.util.ArrayList;

public abstract class Participant {
    private String name;
    private int runLength;
    private int jumpHeight;

    public Participant(String name, int runLength, int jumpHeight) {
        setName(name);
        setRunLength(runLength);
        setJumpHeight(jumpHeight);
    }

    public String getName() {
        return name;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }


    public void run() {
        System.out.println("Run!");
    }

    public void jump() {
        System.out.println("Jump!");
    }

    public static void action(ArrayList<Participant> participants) {
        participants.add(new Human("Human",120, 2));
        participants.add(new Cat("Cat",500, 2));
        participants.add(new Robot("Robot", 1000, 3));
    }
}

class Human extends Participant {

    public Human(String name, int runLength, int jumpHeight) {
        super(name, runLength, jumpHeight);
    }
}

class Cat extends Participant {

    public Cat(String name, int runLength, int jumpHeight) {
        super(name, runLength, jumpHeight);
    }
}

class Robot extends Participant {

    public Robot(String name, int runLength, int jumpHeight) {
        super(name, runLength, jumpHeight);
    }
}
