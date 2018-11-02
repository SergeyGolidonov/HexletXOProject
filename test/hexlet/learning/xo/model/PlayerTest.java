package hexlet.learning.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void getName() {
        final String inputValue = "Serega";

        final String expectedVaue= inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedVaue, actualValue);
    }

    @Test
    public void getFigure() {
        final Figure inputValue = Figure.X;

        final Figure expectedVaue= inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedVaue, actualValue);
    }
}