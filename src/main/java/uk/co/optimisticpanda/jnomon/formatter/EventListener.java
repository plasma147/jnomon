package uk.co.optimisticpanda.jnomon.formatter;

import java.io.PrintStream;
import java.time.Duration;

import uk.co.optimisticpanda.jnomon.Utils.Colour;

public interface EventListener {
    
    default void onBeforeAll() {
        printer().println();
    }
    
    default void onLineStart(Colour colour, Duration sinceProcessStart, Duration sinceLastStart, String line) {
        // NO-OP
    }

    default void onUpdate(Colour colour, Duration sinceProcessStart, Duration sinceLastStart) {
        // NO-OP
    }

    default void onLineEnd(Duration sinceProcessStart, Duration sinceLastStart, String lastLine) {
        // NO-OP
    }

    default void onFinally(Duration sinceProcessStart, Duration sinceLastStart) {
        // NO-OP
    }
    
    default PrintStream printer() {
        return System.out;
    }
}
