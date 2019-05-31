package com.bat;

/**
 * @ClassName NonTerminalExpression
 * @Description 非终结符表达式,实现与文法中的非终结符相关联的解释操作
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 13:01
 **/
public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
