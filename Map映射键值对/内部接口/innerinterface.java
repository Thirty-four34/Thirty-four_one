package �ڲ��ӿ�;
/*
�ڲ��ӿ�
    1��ʵ���࣬ʵ���ⲿ�ӿڣ�������ڲ��ӿ�?
    2��ʵ���࣬�ܷ�ֱ��ʵ���ڲ��ӿڣ�������ⲿ�ӿ�?
    3.ʵ������һ���ڲ��࣬�ܲ���ʵ���ⲿ���ڲ��ӿ���?
 */
interface outer{//�ⲿ�ӿ�
    void out();
    interface inner{//�ڲ��ӿ�
        void in();
    }
}
//ʵ���࣬ʵ���ⲿ�ӿڣ�������ڲ��ӿ�? ����
class out implements outer{
    @Override
    public void out() {
    }
}

//ʵ���࣬�ܷ�ֱ��ʵ���ڲ��ӿڣ�������ⲿ�ӿ�?  �����ԣ��ڲ��ӿ������ⲿ�ӿڵľ�̬���ԣ��������ⲿ����
class innerDemo implements outer.inner {
    @Override
    public void in() {
    }
}

//ʵ������һ���ڲ��࣬�ܲ���ʵ�����ڲ��ӿ���?  ����
class outterImpl  {
    class inner1 implements outer.inner{
        @Override
        public void in() {}
    }
    //�����ڲ��ӿڵ�ʵ����
    public outer.inner show() {//�˷�����������Ϊ��̬����Ϊ����ֵ��һ���Ǿ�̬
        return new inner1();
    }
}
public class innerinterface {
    public static void main(String[] args) {
        outterImpl out =new outterImpl();
        outer.inner oi = out.show();
    }
}
