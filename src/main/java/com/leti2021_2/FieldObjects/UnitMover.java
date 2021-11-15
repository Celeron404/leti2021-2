package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.PlayingField;
import com.leti2021_2.TemporaryObjects;

public class UnitMover {
    public void move(Unit unit, Coords unitCoords, Direction direction, int numberOfSteps) {

        Coords directionCoords = stepCoords(unitCoords, direction);

        // проверить все Map на наличие препятствий
        boolean do

        // учесть модификаторы движения от ландшафта

        // передвинуть в нужном направлении

        // отрисовать c учётом всех Map


    }

    // proxy
    interface DoStep {
        void doStep(Unit unit, Coords unitCoords, Direction direction);
    }

    class DoStepper implements DoStep {
        @Override
        public void doStep(Unit unit, Coords unitCoords, Direction direction) {
            Coords targetCoords = stepCoords(unitCoords, direction);
            if (PlayingField.getObject(targetCoords).isPassable()) {



            } else
                System.out.println(PlayingField.getObject(targetCoords).getDescription());
        }
    }

    class DoStepperWithDelay implements DoStep {
        @Override
        public void doStep(Unit unit, Coords unitCoords, Direction direction) {

            //...
            var doStepper = new DoStepper();
            doStepper.doStep(unit, unitCoords, direction);
        }
    }


    private Coords stepCoords(Coords currentCoords, Direction direction) {
        var targetCoords = new Coords(currentCoords.getX(), currentCoords.getY());
        switch (direction) {
            case UP:
                targetCoords.setY(currentCoords.getY() + 1);
                return targetCoords;
            case DOWN:
                targetCoords.setY(currentCoords.getY() - 1);
                return targetCoords;
            case LEFT:
                targetCoords.setX(currentCoords.getX() - 1);
                return targetCoords;
            case RIGHT:
                targetCoords.setX(currentCoords.getX() + 1);
                return targetCoords;
        }
        return null;
    }
}
