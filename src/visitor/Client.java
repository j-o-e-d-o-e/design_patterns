package visitor;

public class Client {
    public static void main(String[] args) {
        Root root = new Root("root");

        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Folder folder1 = new Folder("folder1");
        root.addChild(folder1);
        Folder folder2 = new Folder("folder2");
        root.addChild(folder2);

        folder1.addChild(file1);
        folder1.addChild(file2);
        folder1.addChild(file3);

        folder1.removeChild(file2);
        folder1.moveTo(folder2);
        root.accept(new PrintVisitor());

        root.format();
    }
}