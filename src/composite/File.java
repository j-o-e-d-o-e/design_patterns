package composite;

class File extends FileSystemElement {
    public File(String name) {
        super(name);
    }

    @Override
    public void moveTo(Folder target) {
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
}