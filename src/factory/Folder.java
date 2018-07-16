package factory;

class Folder extends FileSystemContainer {
    public Folder(String name) {
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
        while (!children.isEmpty())
            children.get(0).delete();
        if (parent != null)
            parent.removeChild(this);
        System.out.println("Deleted folder: " + name);
    }
}