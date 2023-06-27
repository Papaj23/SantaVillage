public class GingerBreadMan extends Villager implements Creature {

    private String story;

    public String tellVillageStory(String story){
        this.story = story;
        return story;
    }

    public void protectFactory(){

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
