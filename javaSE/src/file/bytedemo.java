package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 输出流：OutputStream 对文件的输出流用子类FileOutputStream
 * 输入流：InputStream 对文件的输入流用子类FileInputStream
 */
public class bytedemo {
    public static void main(String[] args) {
        // out();
        in();
    }
    private static void out(){
        //先确认要操作的文件
        File f = new File("/home/yan/IdeaProjects/javaSE/test.txt");
        try {
            //append=true为添加，没有则会替换文件中内容
            OutputStream out = new FileOutputStream(f,true);
            //\r为换行，设置要输入的文字
            String info = "my fuck your is father!\r";
            //默认输入的为byte
            out.write(info.getBytes());
            //结束后关闭io
            out.close();
            System.out.println("success");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * input方法
     */
    private static void in(){
        File f1 = new File("/home/yan/IdeaProjects/javaSE/test.txt");
        try {
            InputStream in = new FileInputStream(f1);

            byte[] bytes = new byte[1024*10];//单位是字节
            //设置一个可变字符串
            StringBuilder buf = new StringBuilder();
            int len = -1;//每次读取的长度
            while ((len=in.read(bytes))!=-1) {
                buf.append(new String(bytes));
            }
            //等效方法？
            // while ((len=in.read(bytes))!=-1) {
            //     String str = new String(bytes);
            //     System.out.println(str);
            // }
            System.out.println(buf);
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
} 
