package com.cn.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList3 {
	public static void main(String[] args) {
		File file = new File(".");
		String list[];
		if (args.length == 0)
			list = file.list();
		else
			list = file.list(new FilenameFilter() {
				Pattern pattern = Pattern.compile(args[0]);
				@Override
				public boolean accept(File arg0, String arg1) {
					return pattern.matcher(arg1).matches();
				}
			});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}

	}
}
