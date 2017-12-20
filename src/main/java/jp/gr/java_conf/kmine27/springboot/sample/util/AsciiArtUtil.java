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


    public String createSpringBootLogo() {
        return "\r\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC8@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC8@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@CCCCCCCCCCCCCCCCCCC@@@CCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@\r\n" +
                "@@@@@@@@@CCCCCCCCCCCCCCCCCCCC@@@@@CCCCCCCCCCCCCCCCCCCC@@@@@@@@@@\r\n" +
                "@@@@@@@@CCCCCCCCCCCC8@@@@CCCC@@@@@CCCC@@@@@CCCCCCCCCCCC@@@@@@@@@\r\n" +
                "@@@@@@@CCCCCCCCCCCC@@@@@@CCCC@@@@@CCCCC@@@@@@CCCCCCCCCCCC@@@@@@@\r\n" +
                "@@@@@@CCCCCCCCCCC@@@@@@CCCCCC@@@@@CCCCCCC@@@@@CCCCCCCCCCCC@@@@@@\r\n" +
                "@@@@@CCCCCCCCCCCO@@@@CCCCCCCC@@@@@CCCCCCCC@@@@@CCCCCCCCCCCC@@@@@\r\n" +
                "@@@OCCCCCCCCCCCC@@@@CCCCCCCCC@@@@@CCCCCCCCC8@@@@CCCCCCCCCCCC@@@@\r\n" +
                "@@@CCCCCCCCCCCC@@@@@CCCCCCCCC@@@@@CCCCCCCCCC@@@@CCCCCCCCCCCCC@@@\r\n" +
                "@@CCCCCCCCCCCCC@@@@@CCCCCCCCC@@@@@CCCCCCCCCC@@@@OCCCCCCCCCCCCC@@\r\n" +
                "@@CCCCCCCCCCCCC@@@@@CCCCCCCCCC@@@@CCCCCCCCCC@@@@CCCCCCCCCCCCCC@@\r\n" +
                "@@CCCCCCCCCCCCC@@@@@CCCCCCCCCCCCCCCCCCCCCCCC@@@@CCCCCCCCCCCCCC@@\r\n" +
                "@@@CCCCCCCCCCCCC@@@@8CCCCCCCCCCCCCCCCCCCCCC@@@@CCCCCCCCCCCCCC@@@\r\n" +
                "@@@@CCCCCCCCCCCCC@@@@@CCCCCCCCCCCCCCCCCCC@@@@@@CCCCCCCCCCCCO@@@@\r\n" +
                "@@@@@CCCCCCCCCCCCC@@@@@CCCCCCCCCCCCCCCCC@@@@@@CCCCCCCCCCCC@@@@@@\r\n" +
                "@@@@@@CCCCCCCCCCCCCC@@@@@@@CCCCCCCCCC@@@@@@@CCCCCCCCCCCCC8@@@@@@\r\n" +
                "@@@@@@@@CCCCCCCCCCCCCC@@@@@@@@@@@@@@@@@@@OCCCCCCCCCCCCCC@@@@@@@@\r\n" +
                "@@@@@@@@@CCCCCCCCCCCCCCCC@@@@@@@@@@@@@8CCCCCCCCCCCCCCCC@@@@@@@@@\r\n" +
                "@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC8@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@@@CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
                "\r\n";
    }

    public String createConcourseLogo() {
        return "\r\n" +
                "CCCOCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCOCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@CCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO@@@@@CCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCC8@8OCCCCCCCC@@@@@@@CCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCC@@8CCCCCCCCCCCCCCC@@@@@@@@CCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCC8@8CCCCCCCCCCCCCCCCC@@@@@@@@@@@OCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCC@@8CCCCCCCCC@CCCCCCCC@@@@@@@@CC@@@@8CCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCC@@@CCCCCC@@CCCCCCCCCCC@@@@@@@@@CCCC8@@@CCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCC@@OCCCC@@CCCCCCCCCCCCCO@@@@@@@O@@@CCCCO@@CCCCCCCCCC\r\n" +
                "CCCCCCCCCCCC@@OCCCC@@CCCCCCCCCCCCCC@@@@@@@CCCC@@@CCCC@@CCCCCCCCC\r\n" +
                "CCCCCCCCCCC@@@CCC@@@CCCCCCCCCCCCCCC@@@@@@CCCCCC8@@CCCC@@CCCCCCCC\r\n" +
                "CCCCCCCCCC8@@CCC@@@CCCCCCCCCCCCCCC@@@@@CCCCCCCCCO@CCCCO@CCCCCCCC\r\n" +
                "CCCCCCCCCC@@@CCC@@OCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC8@CCCC@@CCCCCCC\r\n" +
                "CCCCCCCCCC@@@@@@@@@@@@@@@OCCCC@@@@@@@CCCCCCCCCCCCC@CCCCO@CCCCCCC\r\n" +
                "CCCCC@@@@@@@@@@@@@@@@@@@@@@@CC@@@@@@@CCCCCCCCCCCCC@CCCCC@CCCCCCC\r\n" +
                "CCCC@@@@@@@@@@@@@@@@@@@@@@@@CC@@@@@@@CCCCCCCCCCCCC8CCCCCOCCCCCCC\r\n" +
                "CCCCCC@@@@@@@@@@@@@@@@8CCCCCCCCCCCCCCO@CCCCCCCCCCCCCCCC@CCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC8@@@@@CCCCCCCCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@OCCCCCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO@@@@@@@@CCCCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO@@@@@@@@@CCCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCC8CCCCCCCCCCCCCCC@@@@@@@@@CCCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCC@CCCCCCCC@@8CCCCCCC@@@@@@@@@@@@@CCCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCC@CCCCCCCCCCO@@@@@@@OCC@@@@@@@@@CCCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCO@@CCCCCCCCCCCCCCCC@@@@@@@@@@@CCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCC@@@@@@@@@@@@@@@@@@@C@@@@@@OCCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO8@@@8CCCCCCCCCC@@@@8CCCCCCCCCCCC\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\n" +
                "OCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCO\r\n" +
                "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\n" +
                "\r\n";
    }
}
