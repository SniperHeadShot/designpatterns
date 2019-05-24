package com.bat.decorator;

import com.bat.component.Component;

/**
 * @ClassName Decorator
 * @Description 装饰抽象类，从外类来扩展 Component 的功能，但对于 Component 来说，是无需知道 Decorator 的存在的
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/24 9:49
 **/
public abstract class Decorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
