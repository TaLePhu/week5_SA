package se.ktck.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItem{
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemItem child : children) {
            child.display(indent + "  ");
        }
    }
}
