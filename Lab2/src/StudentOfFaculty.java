import java.util.Date;

public class StudentOfFaculty extends Student {
    private static final int LOOP_COUNT = 10000;
    private static final int SLEEP_MILLIS = 10000;

    @Override
    public void outputMessage() {
        System.out.println("Now " + new Date() + " , do something pal!");
    }

    private static void pause() {
        try {
            Thread.sleep(SLEEP_MILLIS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Abiturient student = new StudentOfFaculty();
        for (int i = 0; i < LOOP_COUNT; i++) {
            pause();
            student.outputMessage();
        }
    }

}
