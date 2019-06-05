/**
 * 调用ModifiersFirst类中的各方法，测试修饰符
 */
/**
 * ModifiersSecond
 */
public class ModifiersSecond {

    public static void main(String[] args) {
        ModifiersFirst mf = new ModifiersFirst();
        mf.myDefaultFunction();
        mf.myPublicFunction();
        mf.myProtectedFunction();
        //mf.myPrivateFunction();  无法发现myPrivateFunction方法，说明private只在本类中可以访问。
        ModifiersFirst.myStaticFunction(); //静态方法直接调用，不用通过对象。
    }
}