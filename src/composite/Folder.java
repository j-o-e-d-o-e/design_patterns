package composite;


import java.util.LinkedList;
import java.util.List;

public class Folder extends FileSystemElement {
    private List<FileSystemElement> children = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void delete() {
        while (!children.isEmpty())
            children.get(0).delete(); // elements of children are either file or folder
        if (parent != null)
            parent.removeChild(this);
        System.out.println("Deleted folder: " + name);
    }

    void removeChild(FileSystemElement element) {
        children.remove(element);
        element.setParent(null);
    }

    void addChild(FileSystemElement element) {
        if (element.getParent() != null)
            throw new Error("Element '" + element.getName() + "' already has a parent");
        if (!children.contains(element)) {
            children.add(element);
            element.setParent(this);
        }
    }

    List<FileSystemElement> getChildren() {
        return children;
    }
}