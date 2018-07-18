package factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(composite.Client.class.getName());

    public static void main(String[] args) {
        Root root = (Root) Factory.createNewElement("r"); //root
        Folder d1 = (Folder) Factory.createNewElement("r|d1"); //root|folder
        Folder d2 = (Folder) Factory.createNewElement("r|d2"); //root|folder
        File f1 = (File) Factory.createNewElement("r|d1|.f1"); //root|folder|file
        File f2 = (File) Factory.createNewElement("r|d2|.f2"); //root|folder|folder|file
        File f3 = (File) Factory.createNewElement("r|d3|d3_1|.f3"); //root|folder|folder|file

        f3.moveTo(d1); // d1 -> f3
        f1.moveTo(d2); // d2 -> f1
        f2.moveTo((FileSystemContainer) root.children.stream() //d3 -> d3_1, f1
                .filter(child -> child.getName().equals("d3"))
                .findFirst().orElse(null));

        print(root, "");
        LOGGER.log(Level.INFO, "{0} main-elements and {1} sub-elements in root", new Object[]{root.children.size(),
                root.children.stream().filter(child -> child instanceof FileSystemContainer)
                        .mapToLong(child -> ((FileSystemContainer) child).children.size()).sum()});
        root.format();
    }

    private static void print(FileSystemElement e, String tabs) {
        if (e instanceof Root) {
            ((Root) e).children.forEach(child -> print(child, ""));
        } else if (e instanceof FileSystemContainer) {
            System.out.println(tabs + e.getName());
            ((FileSystemContainer) e).children.forEach(child -> print(child, tabs + "\t"));
        } else if (e instanceof File) {
            System.out.println(tabs + e.getName());
        }
    }
}