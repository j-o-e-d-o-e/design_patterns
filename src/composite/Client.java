package composite;

import java.util.logging.Logger;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        FileSystemElement file1 = new File("file1");
        FileSystemElement file2 = new File("file2");
        FileSystemElement file3 = new File("file3");

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");

        folder1.addChild(file1);
        folder1.addChild(file2);
        folder1.addChild(file3);
        folder1.addChild(folder3);

        System.out.println("Children of folder1: ");
        folder1.getChildren().forEach(child -> System.out.println(child.getName()));
//        LOGGER.log(Level.INFO, "processing {0} elements in folder1", folder1.children.size());

        file1.delete();
        folder3.delete();
        folder1.moveTo(folder2);

        System.out.println("Children of folder2: ");
        folder2.getChildren().forEach(child -> System.out.println(child.getName()));
//        LOGGER.log(Level.INFO, "processing {0} elements in folder2", folder2.children.size());

        folder2.delete();
    }
}