package SimpleFactoryPartten;
/*
�����Ʒ��  ������
 */
public class createMan extends createPerson{
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("���˳Զ���");
        super.eat();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.println("�����ܲ�");
    }
}
