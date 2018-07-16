package visitor;

import java.util.LinkedList;

abstract class FileSystemElement {
    String name;
    FileSystemContainer parent;

    // super constructor
    public FileSystemElement(String name) {
        this.name = name;
    }

    abstract public void moveTo(FileSystemContainer target);

    abstract public void delete();

    public abstract void insert(FileSystemElement element, LinkedList<String> where);

    public abstract boolean accept(FileSystemVisitor visitor); // visitor method

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