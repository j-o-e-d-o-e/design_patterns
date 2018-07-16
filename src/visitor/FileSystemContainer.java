package visitor;

import java.util.LinkedList;
import java.util.List;

abstract class FileSystemContainer extends FileSystemElement {
    List<FileSystemElement> children = new LinkedList<>();

    FileSystemContainer(String name) {
        super(name);
    }

    @SuppressWarnings("Duplicates")
    @Override
    public void insert(FileSystemElement element, LinkedList<String> where) {
        if (where.isEmpty()) { // if the path is empty, insert the element here
            children.add(element);
            element.setParent(this);
            return;
        } else { // if some path is left, try to step into the next element
            for (FileSystemElement child : children) {
                if (child.getName().equals(where.getFirst())) {
                    where.removeFirst();
                    child.insert(element, where);
                    return;
                }
            }
        } // if no element has been found, create a new folder and then retry to insert the element
        Folder folder = new Folder(where.getFirst());
        folder.setParent(this);
        children.add(folder);
        insert(element, where);
    }

    @Override
    public boolean accept(FileSystemVisitor visitor) { //visitor method
        if (visitor.visitContainer(this))
            for (FileSystemElement child : children)
                if (child.accept(visitor))
                    return true;
        return !visitor.visitPostContainer(this);
    }

    @SuppressWarnings("Duplicates")
    void addChild(FileSystemElement element) {
        if (element instanceof Root)
            throw new Error("Root elements not as part of containers allowed");
        else if (element.getParent() != null)
            throw new Error("Element '" + element.getName() + "' already has a parent");
        else if (!children.contains(element)) {
            children.add(element);
            element.setParent(this);
        }
    }

    void removeChild(FileSystemElement element) {
        children.remove(element);
        element.setParent(null);
    }
}