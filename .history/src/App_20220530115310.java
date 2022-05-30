/**
 * JAVA文件的编写必须有一个类，并且类名必须与文件名相同，在这个类中必须有一个main函数，
 * 当java程序执行顺序
 * 1. 会先找到与文件名相同的类(无论写在哪里)
 * 2. 执行里面的main函数（主入口）
*/

/**
 * 类的声明要有可见性修饰符，修饰符包括
 * 1. public(可以在类、方法、数据源前使用public修饰符，表示他们可以被任何其他类访问。可以应用在类或类成员上)
 * 2. protected(允许子类访问父类中的数据域或方法，但不允许非子类访问这些数据域和方法。)
 * 3. private(限定方法和数据域只能在自己的类中访问。只能应用在类成员上)
 * 4. 默认修饰符
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}



