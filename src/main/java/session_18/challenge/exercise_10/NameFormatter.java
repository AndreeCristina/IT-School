package session_18.challenge.exercise_10;

import java.util.List;

@FunctionalInterface
public interface NameFormatter {

    List<String> formatNames(List<String> names);
}