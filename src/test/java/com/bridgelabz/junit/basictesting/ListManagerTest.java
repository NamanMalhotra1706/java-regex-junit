package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.ListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.util.ArrayList;

public class ListManagerTest {
    private ListManager listManager;
    private ArrayList<Integer> list;

    @BeforeEach
    void setup(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void shouldAddElementToList(){
        listManager.addElement(list,3);
        Assertions.assertEquals(1,list.size());

        Assertions.assertTrue(list.contains(3));
    }


    @Test
    public void shouldRemoveElementToList(){
        listManager.addElement(list,3);
        Assertions.assertEquals(1,list.size());

        // only 1 element in list i.e) 3 at idx:0
        list.remove(0);
        Assertions.assertFalse(list.contains(3));
    }

    @Test
    public void shouldUpdateListSize(){
        listManager.addElement(list,3);
        Assertions.assertEquals(1,list.size());

        // only 1 element in list i.e) 3 at idx:0
        list.remove(0);
        Assertions.assertFalse(list.contains(3));

        listManager.addElement(list,3);
        listManager.addElement(list,4);
        listManager.addElement(list,5);

        listManager.removeElement(list,0);
        Assertions.assertFalse(list.contains(3));

        int listSize = listManager.getListSize(list);

        Assertions.assertEquals(2,listSize,"List size is not as expected");


    }
}
