package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObject;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.BeerStrategy;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.EasyTaskStrategy;
import com.leti2021_2.FieldObjects.Units.Unit;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class EasyTask extends TemporaryObject {
    private EasyTaskStrategy strategy = null;
    private final String description = "You are faced with a challenge. It was pretty easy to solve.";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void display() {
        System.out.print(colorize("t", BLACK_TEXT(), CYAN_BACK()));
    }

    @Override
    public TemporaryObjectType getType() {
        return TemporaryObjectType.EASYTASK;
    }

    @Override
    public void interactWithUnit(Unit unit) {
        if (strategy != null) {
            strategy.interactWithUnit(unit);
        } else
            throw new IllegalStateException("Easy Task Strategy is null.");
    }

    public void setStrategy(EasyTaskStrategy strategy) {
        this.strategy = strategy;
    }
}
