package composite;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

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
        LOGGER.log(Level.INFO, "processing {0} elements in folder1", folder1.children.size());

        folder1.removeChild(file2);
        folder1.moveTo(folder2);

        folder2.children.forEach(e -> System.out.println(e.getName()));
        LOGGER.log(Level.INFO, "processing {0} elements in folder2", folder2.children.size());

        folder2.delete();
    }
}