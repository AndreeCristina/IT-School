package session_18.challenge.exercise_9;

import java.util.List;

@FunctionalInterface
public interface OddNumberFilter {

    List<Integer> filter(List<Integer> inputList);
}