package models;

public class Board {
    private String id;
    private String name;
    // Конструктори
    public Board() {}
    public Board(String name) {
        this.name = name;
    }
    // Гетери та сетери
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
