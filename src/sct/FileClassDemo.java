package sct;

import java.io.File;
import java.util.Arrays;

public class FileClassDemo {
	public static void main(String[] args) {
        String path = File.separator + "Apps" + File.separator + "test" + File.separator;
//		File file = new File(path + "word.doc");
		File file = new File(path);
		File[] files = file.listFiles();
		
//		if (file.exists()) {
//			System.out.println("File exist!");
//		}
        System.out.println(Arrays.asList(new File(path).listFiles()));
        System.out.println(Arrays.asList(files));
        if(file.isDirectory()){
			for (File f : files) {
                if (f.exists()){
                    System.out.println("Absolute Path: " + f.getPath() + "; Path: " + f.getPath() + "; Name: " + f.getName());
                    if (f.canRead()) System.out.println("Can read: " + f.getName());
                    if (f.canWrite()) System.out.println("Can write: " + f.getName());
                    if (f.canExecute()) System.out.println("Can execute: " + f.getName());
                    System.out.println(f.lastModified());
                    System.out.println(f.getTotalSpace());
                    System.out.println(f.renameTo(new File(path + "word.doc")));
//                    if (f.)
                }
			}
		}
	}

	public String getString(){
        return "";
    }
}
