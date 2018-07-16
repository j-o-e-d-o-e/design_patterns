package factory;

import java.util.LinkedList;

public abstract class FileSystemElement {
    String name;
    FileSystemContainer parent;

    // super constructor
    public FileSystemElement(String name) {
        this.name = name;
    }

    abstract public void moveTo(FileSystemContainer target);

    abstract public void delete();

    abstract void insert(FileSystemElement element, LinkedList<String> where);

    public String getName() {
        return name;
    }

    public FileSystemContainer getParent() {
        return parent;
    }

    protected void setParent(FileSystemContainer parent) {
        this.parent = parent;
    }
}