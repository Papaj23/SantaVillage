public abstract class Villager {

    private String name;
    private String job;
    private String adress;

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getAdress() {
        return adress;
    }
}
