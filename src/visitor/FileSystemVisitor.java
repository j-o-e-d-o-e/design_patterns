package visitor;

abstract class FileSystemVisitor {
    public abstract boolean visitContainer(FileSystemContainer container);

    public abstract boolean visitPostContainer(FileSystemContainer container);

    public abstract void visitFile(File file);

    public abstract boolean visitPostFile(File file);
}
