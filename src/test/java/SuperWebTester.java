import net.sourceforge.jwebunit.junit.JWebUnit;
import net.sourceforge.jwebunit.junit.WebTester;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * 模拟对山东青岛政务网进行访问
 * 主要是这种老式的网站多会用到tr td 标签 考试可能会考 table标签的断言语句
**note: http://qdzwfw.sd.gov.cn
 *
 * qd/icity/serviceDept-info
*/
public class SuperWebTester {
    /**
    **note: 这里摈弃使用静态方法，面向对象调用，selenium的风格也是如此。
    */
    private WebTester webTester;
    private String baseUrl= "http://qdzwfw.sd.gov.cn";
    private String serviceUrl="qd/icity/serviceDept-info";
    @Before
    public void setUp(){

        webTester = new WebTester();
        webTester.setBaseUrl(baseUrl);
    }

    @Test
    public void test001(){
        /**
        **note: 断言前可以打开浏览器的f12 调试 查看元素来练习断言
        */

        webTester.beginAt(serviceUrl);

        /**
        **note:待验证的组件
         *  <button type="submit" class="btn btn-danger btn-sm no-bordered btn-block f16"
         * id="project-btn-search">搜 索</button>
        */
        //分析二者的区别 前面的是根据id来寻找判断
        webTester.assertButtonPresent("project-btn-search");
        webTester.assertButtonPresentWithText("搜 索");
    }
    @Test
    public void test002(){
        /**
         **note: 断言前可以打开浏览器的f12 调试 查看元素来练习断言
         */

        webTester.beginAt(serviceUrl);

        /**
         **note:待验证的组件
         *  <button type="submit" class="btn btn-danger btn-sm no-bordered btn-block f16"
         * id="project-btn-search">搜 索</button>
         */
        //此处失败测试不通过 并没有叫search的按钮
        webTester.assertButtonPresentWithText("search");
    }
    private String projectUrl = "/qd/icity/project";

}
