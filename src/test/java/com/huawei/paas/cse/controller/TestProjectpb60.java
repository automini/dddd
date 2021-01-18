package com.huawei.paas.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectpb60 {

        Projectpb60Delegate projectpb60Delegate = new Projectpb60Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectpb60Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}