package obstacle;

import participant.Cat;
import participant.Human;
import participant.Participant;
import participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Cat", 500, 3),
                new Robot("Robot", 1000, 5),
                new Human("Human", 300, 2)};

        Obstacle[] obstacles = {
                new Treadmill("First Treadmill", 700),
                new Treadmill("Second Treadmill", 400),
                new Treadmill("Third Treadmill", 100),
                new Wall("First Wall", 1),
                new Wall("Second Wall", 3),
                new Wall("Third Wall", 4)};

        new Main().competition(obstacles, participants);
    }

    public void competition(Obstacle[] obstacles, Participant[] participants) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.getClass() == Treadmill.class) {
                    obstacle.overcome(participant);
                } else {
                    obstacle.overcome(participant);
                }
            }
        }
    }
}
