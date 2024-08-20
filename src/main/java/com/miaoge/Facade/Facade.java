package com.miaoge.Facade;

import com.miaoge.Facade.SubSystem.SubSystemOne;
import com.miaoge.Facade.SubSystem.SubSystemThree;
import com.miaoge.Facade.SubSystem.SubSystemTwo;

public class Facade {
    private final SubSystemOne subSystemOne = new SubSystemOne();
    private final SubSystemTwo subSystemTwo = new SubSystemTwo();
    private final SubSystemThree subSystemThree = new SubSystemThree();

    public void execute() {
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
