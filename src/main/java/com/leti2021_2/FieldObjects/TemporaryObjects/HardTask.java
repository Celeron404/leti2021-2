package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObject;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.BeerStrategy;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.EasyTaskStrategy;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.HardTaskStrategy;
import com.leti2021_2.FieldObjects.Units.Unit;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class HardTask extends TemporaryObject {
    private HardTaskStrategy strategy = null;
    private final String description = "You are faced with a daunting task. It took a lot of effort to complete it!";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void display() {
        System.out.print(colorize("T", BLACK_TEXT(), CYAN_BACK()));
    }

    @Override
    public TemporaryObjectType getTemporaryObjectType() {
        return TemporaryObjectType.HARDTASK;
    }

    @Override
    public void interactWithUnit(Unit unit) {
        if (strategy != null) {
            strategy.interactWithUnit(unit);
        } else
            throw new IllegalStateException("Hard Task Strategy is null.");
    }

    public void setStrategy(HardTaskStrategy strategy) {
        this.strategy = strategy;
    }
}
