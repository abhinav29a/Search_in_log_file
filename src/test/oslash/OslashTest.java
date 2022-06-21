package test.oslash;

import main.oslash.Oslash;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class OslashTest {

    @Test
    public void findMatchedWords_successful_test() throws IOException {
        String expected = "Test";
        Oslash oslash = new Oslash();
        String[] args = new String[2];
        File file = new File("resources/test.txt");
        args[1] = "webserver";
        args[0] = file.getPath();
        Assertions.assertDoesNotThrow(()->oslash.findMatches(args));
    }
}
