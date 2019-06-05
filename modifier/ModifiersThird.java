/**
 * 继承ModifiersFirst看哪些修饰符方法可用
 */
/**
 * ModifiersThird
 */
public class ModifiersThird extends ModifiersFirst{

    public static void main(String[] args) {
        myStaticFunction();
        ModifiersThird mt = new ModifiersThird();
        mt.myDefaultFunction();
    }
}