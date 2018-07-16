package visitor;

class Folder extends FileSystemContainer {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void moveTo(FileSystemContainer target) {
        parent.removeChild(this);
        target.addChild(this);
    }

    @Override
    public void delete() {
        while (!children.isEmpty())
            children.get(0).delete();

        parent.removeChild(this);
        System.out.println("Deleted folder: " + name);
    }
}