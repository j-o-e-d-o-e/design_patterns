package composite;

public abstract class FileSystemElement {
    String name;
    Folder parent;

    FileSystemElement(String name) {
        this.name = name;
    }

    public void moveTo(Folder target) {
        if (parent != null)
            parent.removeChild(this);
        target.addChild(this);
    }

    abstract public void delete();

    public String getName() {
        return name;
    }

    Folder getParent() {
        return parent;
    }

    void setParent(Folder parent) {
        this.parent = parent;
    }
}