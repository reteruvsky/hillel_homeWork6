package packageParticipant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Participant> participants = new ArrayList<>();
        Participant.action(participants);

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Obstacle.action(obstacles);

        for (int i = 0; i < participants.size(); i++) {
            obstacles.get(i).overcome(participants.get(i));
        }

        System.out.println();

        Main.competition(participants, obstacles);
    }

    public static void competition(ArrayList<Participant> participants, ArrayList<Obstacle> obstacles) {
        for (int i = 0; i < participants.size(); i++) {

            for (int j = 0; j < obstacles.size(); j++) {
                if(obstacles.get(j).getName().equals("Wall") && obstacles.get(j).getHeight() < participants.get(i).getJumpHeight()) {
                    System.out.println("Участник " + participants.get(i).getName() +
                            " прошел препятствие " + obstacles.get(j).getName() +
                            " на дистанции " + obstacles.get(j).getHeight());
                } else if(obstacles.get(j).getName().equals("Wall")) {
                    System.out.println("Участник " + participants.get(i).getName() +
                            " не прошел препятствие " + obstacles.get(j).getName() +
                            " на дистанции " + obstacles.get(j).getHeight());
                    break;
                }

                if(obstacles.get(j).getName().equals("Racetrack") && obstacles.get(j).getLength() < participants.get(i).getRunLength()) {
                    System.out.println("Участник " + participants.get(i).getName() +
                            " прошел препятствие " + obstacles.get(j).getName() +
                            " на дистанции " + obstacles.get(j).getLength());
                } else if(obstacles.get(j).getName().equals("Racetrack")) {
                    System.out.println("Участник " + participants.get(i).getName() +
                            " не прошел препятствие " + obstacles.get(j).getName() +
                            " на дистанции " + obstacles.get(j).getLength());
                    break;
                }
            }
        }
    }
}
