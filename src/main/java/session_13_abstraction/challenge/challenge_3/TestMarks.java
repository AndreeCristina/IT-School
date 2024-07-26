package session_13_abstraction.challenge.challenge_3;

public class TestMarks {

    public static void main(String[] args) {
        StudentA studentA = new StudentA(71, 54, 89);
        StudentB studentB = new StudentB(100, 86, 97, 76);

        System.out.println("StudentA percentage is: " + studentA.getPercentage() + " %");
        System.out.println("StudentB percentage is: " + studentB.getPercentage() + " %");
    }
}