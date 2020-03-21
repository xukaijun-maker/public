package com.cn.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
	public static void main(String[] args) {

		File path = new File("C:\\Windows");

		String[] list;
		// if (args.length == 0)
		// list = path.list();
		// else
		list = path.list(new DirFilter("app"));

		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}
	}
}

class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File arg0, String arg1) {
		return pattern.matcher(arg1).matches();
	}

}
