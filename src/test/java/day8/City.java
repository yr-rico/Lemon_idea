package day8;

import java.util.List;

public class City {
    private String name;
    private List<Space> provinces;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", provinces=" + provinces +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Space> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Space> provinces) {
        this.provinces = provinces;
    }
}
