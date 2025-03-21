package se.ktck.filesystem;

public class File extends FileSystemItem{

    private  String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}
