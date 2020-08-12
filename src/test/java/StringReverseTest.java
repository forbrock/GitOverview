import org.example.stringreverse.StringReverse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTest {
    private static Stream<Arguments> dataSet() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Привет как дела?", "?алед как тевирП"),
                Arguments.of("   ", "   "),
                Arguments.of("o_O   ", "   O_o"),
                Arguments.of("", ""));
    }

    @DisplayName("Test XOR reverse method")
    @ParameterizedTest
    @MethodSource("dataSet")
    void testReverseXOR(String act, String exp) {
        StringReverse solution = new StringReverse();
        String actual = solution.reverseXOR(act);
        String expected = exp;
        assertEquals(expected, actual);
    }
}
