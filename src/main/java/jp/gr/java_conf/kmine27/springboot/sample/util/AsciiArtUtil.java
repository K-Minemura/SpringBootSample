package jp.gr.java_conf.kmine27.springboot.sample.util;

import org.springframework.stereotype.Component;

@Component
public class AsciiArtUtil {

    public String createTree() {
        return createTree("Happy Merry X'mas !! \r\n");
    }

    public String createTree(String message) {
        return message +
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
                "　　[巫巫巫巫巫]\r\n" + 
                "";
    }
}
