package proxy;

import proxy.colleague.ColleagueOne;
import proxy.colleague.ColleagueTwo;
import proxy.mediator.ConcreteMediator;

/**
 * @ClassName MediatorTestMain
 * @Description 中介者模式 测试主类
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/22 23:15
 */
public class MediatorTestMain {
    public static void main(String[] args) {

        ConcreteMediator concreteMediator = new ConcreteMediator();

        ColleagueOne colleagueOne = new ColleagueOne(concreteMediator);
        ColleagueTwo colleagueTwo = new ColleagueTwo(concreteMediator);

        concreteMediator.setColleagueOne(colleagueOne);
        concreteMediator.setColleagueTwo(colleagueTwo);

        colleagueOne.send("how are you?");
        colleagueTwo.send("i'm fine,and you?");
    }
}
