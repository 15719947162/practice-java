/**
 * JAVA文件的编写必须有一个类，并且类名必须与文件名相同，在这个类中必须有一个main函数，
 * 当java程序执行顺序
 * 1. 会先找到与文件名相同的类(无论写在哪里)
 * 2. 执行里面的main函数（主入口）
 * 
 * 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
 * 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass
 * 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写(驼峰命名法)。
 * 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）
 * 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。
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
