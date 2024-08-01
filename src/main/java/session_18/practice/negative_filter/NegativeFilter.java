package session_18.practice.negative_filter;

import java.util.List;

@FunctionalInterface
public interface NegativeFilter {

    List<Integer> filter(List<Integer> numbers);
}