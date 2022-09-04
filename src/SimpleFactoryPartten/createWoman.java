package SimpleFactoryPartten;
/*
具体产品类  造女人
 */
public class createWoman extends createPerson{
    @Override
    public void eat() {
        System.out.println("女人吃东西");
        super.eat();
    }
    @Override
    public void run() {
        System.out.println("女人跑步");
        super.run();
    }
}
