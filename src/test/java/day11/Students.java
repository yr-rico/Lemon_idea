package day11;

public class Students {
    private String name;
    private String password;
    private String sex;
    private String type;

    public Students() {
    }

    public Students(String name, String password, String sex, String type) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
