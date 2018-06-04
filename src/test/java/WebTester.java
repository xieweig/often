import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;



/**
**note: jar包依赖参考pom文件，jwebunit如今用的人不多了。貌似也停止了维护。所以难免有些小坑需要踩踩。
 * 添加完jwebunit jar包后也许还需要完善日志系统 slf4j-simple
 * 最重要的貌似还要加上 xalan  xerces 包来辅助解析xml java.lang.NoClassDefFoundError: org/apache/xml/utils/PrefixResolver
 * 不然都会报错，考虑到考试需要，请试着操作。
 * jwebunit 主要是提供了许多断言语句方便测试工程师，考试内容为断言语句的英文理解与测试场景是否吻合
 *
 * 至于骨灰级用代码操作浏览器的同学和爬虫工程师 强烈推荐 java or python + selenium + 浏览器的driver插件
 * 这套组合是现在最流行的
 * 浏览器例如Chrome 或者 Firefox 其中Firefox 开源，限制少
*/
public class WebTester {


    @Before
    public void setUp(){
        /**
         **note: 只有如此不行，需要明确协议 "www.chinaso.com"  加上 http or https
         */
        setBaseUrl("https://news.baidu.com/");
    }
    @Test
    public void  test01(){

        beginAt("guoji");
        /**
        **note: 注意中英文编码问题
        */
       assertTitleEquals("百度新闻——全球最大的中文新闻平台");
    }

}
