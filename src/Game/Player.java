package Game;

public class Player {

    private String sex;
    private String name;

    @Override
    public String toString() {
        return "\nГравець" + sex.toUpperCase() + " " + name.toUpperCase();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
