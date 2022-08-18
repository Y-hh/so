package file;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class fileio {
    public static void main(String[] args) {
        // File.separator;代表斜杠
       
        File file = new File("/home/yan/IdeaProjects/javaSE"); 
        //判断文件是否存在
        boolean exists = file.exists(); 
        System.out.println(exists);
        //创建一个新的文件
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //判断对象是否为文件
        boolean file2 = file.isFile();
        //判断对象是否为文件夹
        boolean directory = file.isDirectory();
        //删除文件,文件夹中必须删除所有文件
        file.delete();
        //列出文件夹中的所有文件名,输出的是数组
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        //列出文件夹中的所有文件，以对象返回
        File[] listFiles = file.listFiles();
        for (File f : listFiles) {
            System.out.println("---------------------");
            System.out.println(f.getName());//文件名字
            System.out.println(f.getAbsolutePath());//绝对路径
            System.out.println(f.getPath());//相对路径
            System.out.println(f.isHidden());//是否隐藏文件
            System.out.println(f.canRead());//是否可读
            System.out.println(f.lastModified());//文件最后修改时间
            Date time = new Date(f.lastModified()); 
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            System.out.println(df.format(time));
        }
        //创建文件夹
        File f1 = new File("/home/yan/IdeaProjects/javaSE/into");
        f1.mkdir();
        //重命名，移动
        f1.renameTo(new File("/home/yan/IdeaProjects/javaSE/dest"));
    }    
}
