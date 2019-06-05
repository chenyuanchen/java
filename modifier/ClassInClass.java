/**
 * 类中类的用法
 */
/**
 * ClassInClass
 */
public class ClassInClass {

    public static void main(String[] args) {
        System.out.println("ClassInClass main.");
        ClassInClass cic = new ClassInClass();
        ClassInClass.InnerClassInClass icic = cic.new InnerClassInClass();
        icic.function();
    }

    /**
     * InnerClassInClass
     */
    public class InnerClassInClass {
        void function(){
            System.out.println("InnerClassInClass");
        }
    }
}