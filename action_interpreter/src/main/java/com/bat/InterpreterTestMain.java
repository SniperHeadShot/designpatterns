package com.bat;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName InterpreterTestMain
 * @Description 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/31 12:47
 **/
public class InterpreterTestMain {
    public static void main(String[] args) {
        Context context = new Context();

        List<AbstractExpression> abstractExpressionList = new ArrayList<>();

        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new NonTerminalExpression());
        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : abstractExpressionList) {
            abstractExpression.interpret(context);
        }
    }
}
