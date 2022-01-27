package com.leti2021_2.FieldObjects.TemporaryObjectsStrategies;

import com.leti2021_2.FieldObjects.TemporaryObject;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.Units.SupportEngineer;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.Units.UnitType;

public class TemporaryObjectStrategySetter {
    public void set(UnitType unitType, TemporaryObject object) {
        TemporaryObject.TemporaryObjectType objectType = object.getType();
        switch (objectType) {
            case BEER -> {
                switch (unitType) {
                    case PROGRAMMER -> ((Beer) object).setStrategy(new ProgrammerBeerStrategy());
                    case SUPPORTENGINEER -> ((Beer) object).setStrategy(new SupportEngineerBeerStrategy());
                    case TESTER -> ((Beer) object).setStrategy(new TesterBeerStrategy());
                }
            }
            case EASYTASK -> {
                switch (unitType) {
                    case PROGRAMMER -> ((EasyTask) object).setStrategy(new ProgrammerEasyTaskStrategy());
                    case SUPPORTENGINEER -> ((EasyTask) object).setStrategy(new SupportEngineerEasyTaskStrategy());
                    case TESTER -> ((EasyTask) object).setStrategy(new TesterEasyTaskStrategy());
                }
            }
            case HARDTASK -> {
                switch (unitType) {
                    case PROGRAMMER -> ((HardTask) object).setStrategy(new ProgrammerHardTaskStrategy());
                    case SUPPORTENGINEER -> ((HardTask) object).setStrategy(new SupportEngineerHardTaskStrategy());
                    case TESTER -> ((HardTask) object).setStrategy(new TesterHardTaskStrategy());
                }
            }
        }
    }
}
