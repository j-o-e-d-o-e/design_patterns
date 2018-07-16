package factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    private static Root root;

    @Before
    public void setUp() {
        root = (Root) Factory.createNewElement("r");
    }

    @Test
    public void newFileTest() {
        //given
        File f1 = new File("f1");
        f1.setParent(root);

        //when
        File f1Return = (File) Factory.createNewElement("r|.f1");

        //then
        assertEquals(f1.getParent(), f1Return.getParent());
        assertEquals(f1.getName(), f1Return.getName());
    }

    @Test
    public void newFolderTest() {
        //given
        Folder d1 = new Folder("d1");
        d1.setParent(root);

        //when
        Folder d1Return = (Folder) Factory.createNewElement("r|d1");

        //then
        assertEquals(d1.getParent(), d1Return.getParent());
    }

    @Test
    public void newSubfolderTest() {
        //given
        Folder d1 = new Folder("d1");
        d1.setParent(root);
        Folder d1_1 = new Folder("d1_1");
        d1_1.setParent(d1);

        //when
        Folder d1_1Return = (Folder) Factory.createNewElement("r|d1|d1_1");

        //then
        assertEquals(d1_1.getName(), d1_1Return.getName());
    }
}