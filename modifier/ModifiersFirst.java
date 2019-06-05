/**
 * 验证修饰符作用效果。
 * 理论依据：
 * public - 本类中，同包中，子类中，其他类中，均可访问。
 * protected - 本类中，同包中，子类中，可以访问，其他类中不能访问。
 * default - 本类中，同包中，可以访问，子类中及其他类中不能访问。
 * private - 本类中，可以访问，同包中，子类中及其他类中均不能访问。
 * static - 
 * final - 
 * abstract - 
 */
/**
 * ModifiersFirst
 * 一个类文件中，只能有一个public类，例如此处的ModifiersFirst.java文件，以及其中的ModifiersFirst类。
 */
public class ModifiersFirst {

    public static void main(String[] args) {
        System.out.println("ModifiersFirst main");
        //非静态方法，必须通过对象调用。
        ModifiersFirst mf = new ModifiersFirst(); 
        mf.myDefaultFunction();
        mf.myPublicFunction();
        mf.myPrivateFunction();
        mf.myProtectedFunction();

        ModifiersFirst.myStaticFunction(); //static修饰的方法，不用创建对象，可以直接通过类名调用。
    }

    void myDefaultFunction(){
        System.out.println("ModifiersFirst - myDefaultFunction");
    }

    public void myPublicFunction() {
        System.out.println("ModifiersFirst - myPublicFunction");
    }

    private void myPrivateFunction() {
        System.out.println("ModifiersFirst - myPrivateFunction");
    }

    protected void myProtectedFunction() {
        System.out.println("ModifiersFirst - myProtectedFunction");
    }

    static void myStaticFunction(){
        System.out.println("ModifiersFirst - myStaticFunction");
    }
}