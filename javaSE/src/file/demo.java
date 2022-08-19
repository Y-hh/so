package file;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        findFile(new File("/home/yan/Documents"), ".pdf");
    }
    private static void findFile(File file,String ext){
        if(file==null)return;
        if(file.isDirectory()){//如果是目录
            File[] files = file.listFiles();//list全部的文件
            if (files!=null) {
                for (File f : files) {
                    findFile(f, ext);//递归调用
                }
            }
        }else{
            String name = file.getName().toLowerCase();
            if (name.endsWith(ext)) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
