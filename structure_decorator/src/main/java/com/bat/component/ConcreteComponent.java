package com.bat.component;

/**
 * @ClassName ConcreteComponent
 * @Description 定义一个具体的对象，可以给这个对象添加一些职责
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/24 9:45
 **/
public class ConcreteComponent extends Component{

    /**
     * @Param []
     * @Return void
     * @Author ZhengYu
     * @Description: 具体对象的方法，可以利用装饰器给此方法多加一些功能
     * @Date 2019/5/24
     */
    @Override
    public void operation() {
        System.out.println("具体对象的操作...");
    }
}
