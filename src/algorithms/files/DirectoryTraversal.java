package algorithms.files;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class DirectoryTraversal {

	static TreeSet<File> files = new TreeSet<File>();

	static void extract(File f) {

		if (f.exists()) {

			if (f.isDirectory()) {
				files.add(f);
				File[] l = f.listFiles();
				for (int i = 0; i < l.length; i++) {
					extract(l[i]);
				}
			} else {
				files.add(f);
			}
		}
	}

	public static void main(String[] args) throws IOException {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter path to the directory you want to traverse");
		// Enter path where the directory you want to traverse is located
		String path = br.readLine();
		if (br != null) {
			br.close();
		}

		File file = new File(path);
		extract(file);
		// write the structure into a file
		FileOutputStream fout = new FileOutputStream("D:\\structure.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);

		try {
			for (File f : files) {

				String[] s = f.getAbsolutePath().toString().split("\\\\");

				byte newLine[] = System.getProperty("line.separator").getBytes();

				// here we are adding spaces to nest files according to the directory they
				// belong to
				// The deeper the files are nested in the directory tree the mare spacing we
				// apply
				for (int i = 0; i < s.length; i++) {
					byte b[] = "   ".getBytes();
					bout.write(b);
				}

				if (f.isDirectory()) {
					byte b[] = (".." + f.getAbsolutePath() + "\n").getBytes();
					bout.write(b);
					bout.write(newLine);
					continue;
				}
				byte b[] = (f.getAbsolutePath() + "\n").getBytes();
				bout.write(b);
				bout.write(newLine);
			}
			System.out.print("success!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bout.close();
		}
	}
}
