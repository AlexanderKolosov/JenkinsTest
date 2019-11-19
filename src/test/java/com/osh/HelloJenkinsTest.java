package com.osh;

import org.junit.Assert;
import org.junit.Test;

public class HelloJenkinsTest {

    @Test
    public void greetingTest() {
        Assert.assertEquals("Hello Jenkins user!", HelloJenkins.greeting());
    }
}