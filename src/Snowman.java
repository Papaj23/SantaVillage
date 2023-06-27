public class Snowman extends Villager implements Creature {

    private String carol;
    private String joke;

    public String singCarol(String carol){
        this.carol = carol;
        return carol;
    }

    public String saidJoke(String joke){
        this.joke = joke;
        return joke;
    }


    @Override
    public boolean setAlive() {
        return true;
    }

    @Override
    public boolean speakHumanLanguage() {
        return true;
    }
}
