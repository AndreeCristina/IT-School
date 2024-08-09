package session_19.challenge.exercise_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWord {
    //Create a stream from a text file and use stream operations to find and print the longest word in the file.

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Personal\\IT School\\src\\main\\java\\session_19\\challenge\\exercise_11\\textfile.txt";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            Optional<String> longestWord = lines
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .max(Comparator.comparingInt(String::length));

            longestWord.ifPresent(System.out::println);
        }
    }
}