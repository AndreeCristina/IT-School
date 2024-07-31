package session_17_equals_hashcode_generics.challenge.exercise_4;

public class SongTest {

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Houdini");
        song1.setArtist("Eminem");
        song1.setLength(296);

        Song song2 = new Song();
        song2.setTitle("Houdini");
        song2.setArtist("Eminem");
        song2.setLength(296);

        System.out.println("Are song1 and song2 equal? " + song1.equals(song2));
        System.out.println("hashCode for song1: " + song1.hashCode());
        System.out.println("hashCode for song2: " + song2.hashCode());
    }
}