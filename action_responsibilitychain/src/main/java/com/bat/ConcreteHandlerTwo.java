package com.bat;

/**
 * @ClassName ConcreteHandlerOne
 * @Description 具体处理者类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/18 16:18
 **/
public class ConcreteHandlerTwo extends Handler {

    private String position;

    public ConcreteHandlerTwo(String position) {
        this.position = position;
    }

    /**
     * @Param [request]
     * @Return void
     * @Author ZhengYu
     * @Description: 处理逻辑
     * @Date 2019/5/18
     */
    @Override
    public void handleRequest(int request) {
        if (request > 10) {
            System.out.println(position + "deal handler!,请求参数为：" + request);
        } else {
            if (successor == null) {
                throw new RuntimeException(position + " 未设置上一级处理对象");
            }
            successor.handleRequest(request);
        }
    }
}
