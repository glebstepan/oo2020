package com.company.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    Store storeTest1 = new Store("Store test1", 12, 20);

    @Test
    public void test1(){
        assertTrue(storeTest1.isOpened(13));
    }

    @Test
    public void test2(){
        assertFalse(storeTest1.isOpened(11));
    }

    @Test
    public void test3(){
        assertFalse(storeTest1.isOpened(21));
    }

    @Test
    public void test4(){
        storeTest1.goToStore();
        storeTest1.goToStore();
        storeTest1.goToStore();
        assertEquals(3, storeTest1.getNumberOfVisits());
    }


}
