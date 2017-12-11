package jp.gr.java_conf.kmine27.springboot.sample.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TreeControllerTest {

    /** コンテキスト */
    @Autowired
    private WebApplicationContext context;

    /** MCVモック */
    private MockMvc mvc;

    /**
     * setup
     */
    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void testTree() throws Exception {
        mvc.perform(get("/tree"))
           .andExpect(status().isOk())
           .andExpect(content().string(
                   "Happy Merry X'mas !! \r\n" +
                   "　 ＋　　・　 ＋\r\n" + 
                   "　　　 ﾟ｡：｡ﾟ　　＋\r\n" + 
                   "＊ 　・‥☆‥・\r\n" + 
                   "　　＋ ｡ﾟｗﾟ｡　 ＊\r\n" + 
                   "　　　　从从　＋\r\n" + 
                   "　 ＊　从ﾟ*★　　 ＊\r\n" + 
                   "　　　ﾟ*★彡从\r\n" + 
                   "十　 ▲彡从ﾟ*★\r\n" + 
                   "　　彡从ﾟ*▲彡从　十\r\n" + 
                   "　 从ﾟ*★彡从ﾟ*▲\r\n" + 
                   "　ﾟ*◆彡从ﾟ*★彡从\r\n" + 
                   "`★彡从ﾟ*●彡从ﾟ*★\r\n" + 
                   "彡从ﾟ*★彡从ﾟ*▲彡从\r\n" + 
                   "　　　　||||\r\n" + 
                   "　　[巫巫巫巫巫]\r\n"
                   ))
        ;
    }
}
