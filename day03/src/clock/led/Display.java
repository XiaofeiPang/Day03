package clock.led;

public class Display {
    private int value = 0;
    private int limit = 0;
    private static int step = 10;//static标识的成员变量被称为类成员，它可以被任何对象访问和改变，类可直接使用

    //static标识的方法称为类方法，它只能被类方法调用，不能被普通的成员方法调用
    public static void fun() {
        step++;

    }

    public int getValue() {
        return value;
    }

    public Display(int limit) {
        this.limit = limit;

    }

    public void increase() {
        value++;
        if (value == limit)
            value = 0;
    }

    public static void main(String[] args) {
        Display n = new Display(24);
        Display.step++;//通过类直接使用
        fun();//类函数直接调用类函数
        Display.fun();//类直接调用
        n.fun();//任何对象都可以调用
        System.out.println(n.step);//任何对象都可以调用

        /*for(;;){
            n.increase();
            System.out.println(n.getValue());
        }*/
    }
}
//总结：任何类成员.方法都不属于任何一个具体对象的，而是属于大家的