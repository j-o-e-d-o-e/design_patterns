package visitor;

class PrintVisitor extends FileSystemVisitor {
    private int indentationLevel = 0;

    @Override
    public boolean visitContainer(FileSystemContainer container) {
        printIndentation();
        System.out.println(container.getName());
        indentationLevel++;
        return true;
    }

    @Override
    public boolean visitPostContainer(FileSystemContainer container) {
        indentationLevel--;
        return true;
    }

    @Override
    public void visitFile(File file) {
        printIndentation();
        System.out.println(file.getName());
    }

    @Override
    public boolean visitPostFile(File file) {
        return true;
    }

    private void printIndentation() {
        for (int i = 0; i < indentationLevel; i++)
            System.out.print(" ");
    }
}