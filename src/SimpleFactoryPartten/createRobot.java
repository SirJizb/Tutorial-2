package SimpleFactoryPartten;
/*
具体产品类  造机器人
 */
public class createRobot extends createPerson{
    @Override
    public void eat() {
        System.out.println("机器人不会吃东西啊");
        super.eat();
    }

    @Override
    public void run() {
        System.out.println("机器人跑的可快了");
        super.run();
    }
}
