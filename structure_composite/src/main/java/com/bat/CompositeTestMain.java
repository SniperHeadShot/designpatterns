package com.bat;

/**
 * @ClassName CompositeTestMain
 * @Description 将对象组合成树形结构以表示 部分-整体 的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性
 * @Author ZhengYu
 * @Version: 1.0
 * @Create: 2019/5/30 9:16
 **/
public class CompositeTestMain {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));

        Composite compositeX = new Composite("Composite X");
        root.add(new Leaf("leaf X_A"));
        root.add(new Leaf("leaf X_B"));

        root.add(compositeX);

        Composite compositeX_X = new Composite("Composite X_X");
        root.add(new Leaf("leaf X_X_A"));
        root.add(new Leaf("leaf X_X_B"));

        compositeX.add(compositeX_X);

        root.add(new Leaf("leaf C"));
        Leaf leaf_d = new Leaf("leaf D");
        root.add(leaf_d);
        root.remove(leaf_d);

        root.display(1);
    }
}
