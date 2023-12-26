package 内部接口;
/*
内部接口
    1。实现类，实现外部接口，不理会内部接口?
    2·实现类，能否直接实现内部接口，不理会外部接口?
    3.实现类是一个内部类，能不能实现外部和内部接口呢?
 */
interface outer{//外部接口
    void out();
    interface inner{//内部接口
        void in();
    }
}
//实现类，实现外部接口，不理会内部接口? 可以
class out implements outer{
    @Override
    public void out() {
    }
}

//实现类，能否直接实现内部接口，不理会外部接口?  不可以，内部接口类似外部接口的静态属性，必须由外部调用
class innerDemo implements outer.inner {
    @Override
    public void in() {
    }
}

//实现类是一个内部类，能不能实现外内部接口呢?  可以
class outterImpl  {
    class inner1 implements outer.inner{
        @Override
        public void in() {}
    }
    //返回内部接口的实现类
    public outer.inner show() {//此方法不能设置为静态，因为返回值是一个非静态
        return new inner1();
    }
}
public class innerinterface {
    public static void main(String[] args) {
        outterImpl out =new outterImpl();
        outer.inner oi = out.show();
    }
}
