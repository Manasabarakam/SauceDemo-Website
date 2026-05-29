package org.step;

import org.base.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends baseclass {
    
    @Before
    public void beforestate() {
        loadDriver();
    }
    
    @After
    public void afterstate() {
        close();
    }
}