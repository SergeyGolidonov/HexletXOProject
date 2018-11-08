package hexlet.learning.xo.controllers;

import hexlet.learning.xo.model.Field;
import hexlet.learning.xo.model.Figure;
import hexlet.learning.xo.model.exceptions.AlreadyOccupiedException;
import hexlet.learning.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Figure figure,
                            final Point point) throws InvalidPointException,
                                                      AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
