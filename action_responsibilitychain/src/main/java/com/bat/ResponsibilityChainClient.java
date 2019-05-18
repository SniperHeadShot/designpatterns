package com.bat;

/**
 * @ClassName ResponsibilityChainClient
 * @Description 责任链模式测试客户端
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/18 16:22
 **/
public class ResponsibilityChainClient {
    public static void main(String[] args) {
        Handler handlerOne = new ConcreteHandlerOne("经理"); //一级处理人
        Handler handlerTwo = new ConcreteHandlerTwo("主管"); //二级处理人
        handlerOne.setSuccessor(handlerTwo); //设置下一级处理对象

        handlerOne.handleRequest(8); //符合ConcreteHandlerOne条件
        handlerOne.handleRequest(18); //符合ConcreteHandlerTwo条件
    }
}
