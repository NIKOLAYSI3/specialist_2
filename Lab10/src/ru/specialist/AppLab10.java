package ru.specialist;

import static java.lang.System.out;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class AppLab10 {
	
	
	public static final String dir1 =
			".." + File.separator;

	
	
	public static void main(String[] args) throws IOException {
		// Lab №10
		
		File d1 = new File(dir1);
		out.println(d1.getCanonicalPath());
				
		
		File[] files = d1.listFiles(
				(File pathname) -> pathname.isFile()); 	//	папки
				 	
				//(File pathname) -> pathname.isFile());		// файлы
		
		for(File file : files) {
			out.printf("File name: %-25s \t date|time: %tD %tT\n",file.getName(), file.lastModified(), file.lastModified());
		}
		

	}

}
