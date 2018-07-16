package composite;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");

        folder1.addChild(file1);
        folder1.addChild(file2);
        folder1.addChild(file3);

        folder1.children.forEach(e -> System.out.println(e.getName()));

        folder1.removeChild(file2);
        folder1.moveTo(folder2);

        folder2.children.forEach(e -> System.out.println(e.getName()));

        folder2.delete();
    }
}