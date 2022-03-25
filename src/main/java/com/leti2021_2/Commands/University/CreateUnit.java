package com.leti2021_2.Commands.University;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker;
import com.leti2021_2.UserData;

import static com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker.FactoryMaker.UnitQualification.JUNIOR;

public class CreateUnit extends Command {

    public CreateUnit(UserData userData) {
        super(userData);
    }

    public void execute() {
        var junFactory = UnitFactoryMaker.FactoryMaker.makeFactory(JUNIOR);
        switch (userData.newUnitType) {
            case PROGRAMMER -> userData.currentUniversity.createUnit(junFactory.createProgrammer());
            case TESTER -> userData.currentUniversity.createUnit(junFactory.createTester());
            case SUPPORTENGINEER -> userData.currentUniversity.createUnit(junFactory.createSupportEngineer());
        }
    }
}
