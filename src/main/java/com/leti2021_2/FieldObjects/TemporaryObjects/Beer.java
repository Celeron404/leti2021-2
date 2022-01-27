package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.BeerStrategy;
import com.leti2021_2.FieldObjects.TemporaryObject;
import com.leti2021_2.FieldObjects.Units.Unit;

import java.util.MissingResourceException;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class Beer extends TemporaryObject {
    private BeerStrategy strategy = null;
    @Override
    public String getDescription() {
        return "Wow! You found the beer!";
    }

    @Override
    public void display() {
        System.out.print(colorize("B", BLACK_TEXT(), CYAN_BACK()));
    }

    @Override
    public TemporaryObjectType getType() {
        return TemporaryObjectType.BEER;
    }

    @Override
    public void interactWithUnit(Unit unit) {
        if (strategy != null) {
            strategy.interactWithUnit(unit);
        } else
            throw new IllegalStateException("Beer Strategy is null.");
    }

    public void setStrategy(BeerStrategy strategy) {
        this.strategy = strategy;
    }
}
