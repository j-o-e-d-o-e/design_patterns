package factory;

import java.util.Arrays;
import java.util.LinkedList;

class Factory {
    private static Root root;

    // factory
    static FileSystemElement createNewElement(String path) {
        LinkedList<String> where = new LinkedList<>(Arrays.asList(path.split("\\|"))); //alternatively, [|] as regex
        if (where.size() == 1) { // create new root
            root = new Root(where.getFirst());
            return root;
        } else {
            where.removeFirst();
            FileSystemElement element;
            if (path.contains(".")) // create new file
                element = new File(where.getLast().substring(1));
            else // create new folder
                element = new Folder(where.getLast());
            where.removeLast();
            root.insert(element, where);
            return element;
        }
    }
}