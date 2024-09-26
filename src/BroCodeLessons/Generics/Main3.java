package BroCodeLessons.Generics;

public class Main3 {
    public static void main(String[] args){

        Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new Item();
        Tree tree = new Tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);
    }

    public static <Thing> void draw(Thing t){
        t.draw();
    }
}
