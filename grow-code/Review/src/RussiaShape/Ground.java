package RussiaShape;

/*
    每个方块都有自己的生命周期,当生命后期结束之后生成新的图形
 */
public class Ground {

    public void accept(Shape shape){
        System.out.println("方块++");
    }

    public void drawMe(){
        System.out.println("我是方块和");
    }
}
