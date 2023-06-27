public abstract class Person {

    private int age;
    private String name;
    private String sex;
    private double weight;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSex(String sex){

        this.sex = sex;
    }

    public void setWeight(double weight){

        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }
}
