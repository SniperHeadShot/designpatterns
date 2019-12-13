package com.bat.proxy;

/**
 * @ClassName AbstractExpression
 * @Description 抽象表达式，声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 12:57
 **/
public abstract class AbstractExpression {

    public abstract void interpret(Context context);
}
