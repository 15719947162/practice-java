/**
 * JAVA文件的编写必须有一个类，并且类名必须与文件名相同，在这个类中必须有一个main函数，
 * 当java程序执行顺序
 * 1. 会先找到与文件名相同的类(无论写在哪里)
 * 2. 执行里面的main函数（主入口）
 */

public class App { 
    // public访问修饰符 static关键字 voild返回类型 main方法名 String[]string类 args字符串数组
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    static void dataType() {
        byte a = 15;
        short b = 1000;
        int c = 100;
        long d = 420395;
        float e = 0.34f;
        double f = 0.3333;
        boolean g = true;
        char h = 'A';
        
    }
}
