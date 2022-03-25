package com.leti2021_2.Commands.Units;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.UserData;

public class UnitSearch extends Command {

    public UnitSearch(UserData userData) {
        super(userData);
    }

    public void execute() {
        userData.currentUnit = UniversitiesMap.unitSearch(userData.unitCoords);
        if (userData.currentUnit == null)
            throw new IllegalArgumentException("The unit with the current coordinates does not exist.");
    }
}
