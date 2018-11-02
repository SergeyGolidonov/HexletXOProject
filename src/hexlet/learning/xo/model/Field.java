package hexlet.learning.xo.model;

import hexlet.learning.xo.model.exceptions.AlreadyOccupiedException;
import hexlet.learning.xo.model.exceptions.InvalidePointException;

import java.awt.*;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final int MINIMUM_COORDINATE = 0;

    private static final int MAXIMUM_COORDINATE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidePointException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointException,
                                                                        AlreadyOccupiedException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        if (field[point.x][point.y] != null) {
            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MINIMUM_COORDINATE && coordinate < MAXIMUM_COORDINATE;
    }

}
