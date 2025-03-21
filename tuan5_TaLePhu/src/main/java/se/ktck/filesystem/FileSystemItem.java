package se.ktck.filesystem;

abstract class FileSystemItem {
    protected String name;

    public FileSystemItem(String name) {
        this.name = name;
    }

    public abstract void display(String indent);
}
