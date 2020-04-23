package Adapater02;

//https://www.cnblogs.com/liuling/archive/2013/04/12/adapter.html  对象适配器参看


public class CatAdapter extends Robot {
    public Cat cat; //维持一个对适配者对象的引用，将被适配者导入
    public CatAdapter(Cat cat){
        this.cat = cat;
    }

    @Override
    public void cry() {
        System.out.println("=======:");
        cat.miao();
    }

    @Override
    public void move() {
        System.out.println("======:");
        cat.run();
    }
}
