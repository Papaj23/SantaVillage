public abstract class Reindeer extends Animal implements Sleigh{

    @Override
    public void eat() {
        super.eat();
        System.out.println("I ate some grass");
    }
}
