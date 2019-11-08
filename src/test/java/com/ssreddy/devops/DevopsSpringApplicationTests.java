package com.ssreddy.devops;

import com.ssreddy.devops.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsSpringApplication.class)
@WebAppConfiguration
public class DevopsSpringApplicationTests {

    /*@Test
    void contextLoads() {
    }*/

    @Autowired
    public I18NService i18NService;

    @Test
    public void testI18N() {

        String expectedResult = "Bootstrap starter template";
        String messageId = "index.main.callout";
        String actual = i18NService.getMessage(messageId);
        Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);

    }

}
