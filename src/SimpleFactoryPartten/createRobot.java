package SimpleFactoryPartten;
/*
�����Ʒ��  �������
 */
public class createRobot extends createPerson{
    @Override
    public void eat() {
        System.out.println("�����˲���Զ�����");
        super.eat();
    }

    @Override
    public void run() {
        System.out.println("�������ܵĿɿ���");
        super.run();
    }
}
