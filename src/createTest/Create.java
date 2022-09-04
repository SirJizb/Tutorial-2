package createTest;

import Factory.Nvwa;
import SimpleFactoryPartten.createPerson;

public class Create {
    public static void main(String[] args) {
        createPerson createPerson;
        createPerson = Nvwa.getPerson("M");
        createPerson.eat();
        createPerson = Nvwa.getPerson("w");
        createPerson.run();
        createPerson = Nvwa.getPerson("R");
        createPerson.run();
    }
}
