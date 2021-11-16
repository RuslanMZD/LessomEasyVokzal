package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Root {
    private String name;

    private List<People> listPeolpe = new ArrayList<>();

    public Root(String name, List<People> listPeolpe) {
        this.name = name;
        this.listPeolpe = listPeolpe;
    }

    public Root() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getListPeolpe() {
        return listPeolpe;
    }

    public void setListPeolpe(List<People> listPeolpe) {
        this.listPeolpe = listPeolpe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(name, root.name) && Objects.equals(listPeolpe, root.listPeolpe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listPeolpe);
    }


    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", listPeolpe=" + listPeolpe +
                '}';
    }
}
