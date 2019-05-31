package com.bat;

/**
 * @ClassName TerminalExpression
 * @Description 终结符表达式,实现与文法中的终结符相关联的解释操作
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 12:59
 **/
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
