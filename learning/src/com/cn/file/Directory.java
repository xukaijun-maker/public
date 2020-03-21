package com.cn.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {
	public static File[] local(File file, String regex) {
		return file.listFiles(new FilenameFilter() {
			Pattern pattern = Pattern.compile(regex);

			@Override
			public boolean accept(File arg0, String arg1) {
				return pattern.matcher(arg1).matches();
			}
		});
	}

	public static File[] local(String path, String regex) {
		return local(new File(path), regex);
	}

	public static File[] local(File file) {
		return file.listFiles();
	}

	public static File[] local(String path) {
		return local(new File(path));
	}

	public static class TreeInfo implements Iterable<File> {

		List<File> files = new ArrayList<>();
		List<File> fileDirs = new ArrayList<>();

		@Override
		public Iterator<File> iterator() {
			return files.iterator();
		}

		void addAll(TreeInfo info) {
			files.addAll(info.files);
			fileDirs.addAll(info.fileDirs);
		}
	}

	static TreeInfo recurseDirs(File startDir, String regex) {
		TreeInfo info = new TreeInfo();
		for (File file : startDir.listFiles()) {
			if (file.isDirectory()) {// 遍历的是文件夹
				info.fileDirs.add(file);// 储存文件夹
				info.addAll(recurseDirs(file, regex));
			} else {
				if (file.getName().matches(regex)) {
					info.files.add(file);
				}
			}
		}
		return info;
	}

	public static TreeInfo walk(String startpath, String regex) {

		return walk(new File(startpath), regex);
	}

	public static TreeInfo walk(File file, String regex) {
		return recurseDirs(file, regex);
	}
	
	public static TreeInfo walk(String startpath){
		return recurseDirs(new File(startpath), ".*");  
	}
}
