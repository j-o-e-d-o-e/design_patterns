package visitor;

class Root extends FileSystemContainer {
    Root(String name) {
        super(name);
    }

    @Override
    public void moveTo(FileSystemContainer target) {
        throw new Error("Root elements cannot be moved");
    }

    @Override
    public void delete() {
        throw new Error("Root elements cannot be removed");
    }

    void format() {
        while (!children.isEmpty())
            children.get(0).delete();
    }
}
