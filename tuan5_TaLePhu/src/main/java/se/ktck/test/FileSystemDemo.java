package se.ktck.test;

import se.ktck.filesystem.Directory;
import se.ktck.filesystem.File;

public class FileSystemDemo {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");
        File file1 = new File("File1.txt", "Hello World");
        File file2 = new File("File2.txt", "Lorem Ipsum");

        folder1.add(file1);
        folder2.add(file2);
        root.add(folder1);
        root.add(folder2);

        root.display("");
    }
}
