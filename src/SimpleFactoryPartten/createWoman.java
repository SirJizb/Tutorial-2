package SimpleFactoryPartten;
/*
�����Ʒ��  ��Ů��
 */
public class createWoman extends createPerson{
    @Override
    public void eat() {
        System.out.println("Ů�˳Զ���");
        super.eat();
    }
    @Override
    public void run() {
        System.out.println("Ů���ܲ�");
        super.run();
    }
}
