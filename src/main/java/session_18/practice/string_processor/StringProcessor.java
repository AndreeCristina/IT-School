package session_18.practice.string_processor;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor anThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));
    }
}