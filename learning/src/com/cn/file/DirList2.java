package com.cn.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
	public static FilenameFilter filter(String regex) {
		Pattern pattern = Pattern.compile(regex);
		return new FilenameFilter() {
			@Override
			public boolean accept(File arg0, String arg1) {
				return pattern.matcher(arg1).matches();
			}
		};
	}

	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
		if (args.length == 0)
			list = file.list();
		else
			list = file.list(filter(args[0]));
		
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
