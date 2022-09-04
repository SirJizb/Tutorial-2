package SimpleFactoryPartten;
/*
具体产品类  造男人
 */
public class createMan extends createPerson{
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("男人吃东西");
        super.eat();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.println("男人跑步");
    }
}
