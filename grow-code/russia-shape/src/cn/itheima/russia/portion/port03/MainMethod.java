package cn.itheima.russia.portion.port03;

public class MainMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Controller controller = new Controller(shapeFactory);
        controller.newGame();
    }
}
