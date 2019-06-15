package homeWork.myArrayList;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MyArrayListTest {
    @Test
    public void simpeUsage(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        assertEquals((Integer) 10, list.get(0));
        assertEquals(1, list.size());

        MyArrayList myList = new MyArrayList();

        myList.add(10);
        assertEquals(10, myList.get(0));
        assertEquals(1, myList.size());

        myList.add(11);
        assertEquals(11, myList.get(1));
        assertEquals(2, myList.size());
    }
    @Test
    public void overflow(){
        MyArrayList myList = new MyArrayList();

        for (int i = 0; i < 12; i++) {
            myList.add(10);
        }
        assertEquals(12, myList.size());
    }
    @Test
    public void testRemove(){
        MyArrayList myList = new MyArrayList();

        myList.add(1);
        myList.add(2);
        assertEquals(2, myList.size());
        myList.remove(1);
        assertEquals(1, myList.size());
    }

    @Test
    public void clean(){
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        assertEquals(3, myList.size());
        myList.clean();
        assertEquals(0, myList.size());
    }

    @Test
    public void addByIndex(){
        MyArrayList<Integer> myList = new MyArrayList();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(2,10);
        assertEquals(6, myList.size());
        assertEquals((Integer) 10, myList.get(2));
        assertEquals((Integer) 2, myList.get(3));

    }
}