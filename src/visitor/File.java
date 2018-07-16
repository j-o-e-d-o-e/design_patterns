package visitor;

import java.util.LinkedList;

class File extends FileSystemElement {

    public File(String name) {
        super(name);
    }

    @Override
    public void moveTo(FileSystemContainer target) {
        parent.removeChild(this);
        target.addChild(this);
    }

    @Override
    public void delete() {
        parent.removeChild(this);
        System.out.println("Deleted file: " + name);
    }

    @Override
    public void insert(FileSystemElement element, LinkedList<String> where) {
        throw new Error("Files cannot contain elements!");
    }

    @Override
    public boolean accept(FileSystemVisitor visitor) {
        visitor.visitFile(this);
        return !visitor.visitPostFile(this);
    }
}