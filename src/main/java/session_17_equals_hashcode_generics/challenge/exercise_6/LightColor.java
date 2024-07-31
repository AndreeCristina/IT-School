package session_17_equals_hashcode_generics.challenge.exercise_6;

public enum LightColor {

    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String description;
    private final int duration;

    LightColor(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}