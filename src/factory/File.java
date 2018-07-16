package factory;

import java.util.LinkedList;

class File extends FileSystemElement {
    public File(String name) {
        super(name);
    }

    @Override
    public void moveTo(FileSystemContainer target) {
        if (parent != null)
            parent.removeChild(this);
        target.addChild(this);
    }

    @Override
    public void delete() {
        if (parent != null)
            parent.removeChild(this);
        System.out.println("Deleted file: " + name);
    }

    @Override
    public void insert(FileSystemElement element, LinkedList<String> where) {
        throw new Error("Files cannot contain elements!");
    }
}