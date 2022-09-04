package Factory;

import SimpleFactoryPartten.createMan;
import SimpleFactoryPartten.createPerson;
import SimpleFactoryPartten.createRobot;
import SimpleFactoryPartten.createWoman;
/*
工厂类
女娲造人
 */
public class Nvwa {
    public static createPerson getPerson(String parameter){
        createPerson createPerson = null;
        if (parameter.equalsIgnoreCase("M")){
            createPerson = new createMan();
        }else if (parameter.equalsIgnoreCase("W")){
            createPerson = new createWoman();
        }else{
            createPerson = new createRobot();
        }
        return createPerson;
    }
}
