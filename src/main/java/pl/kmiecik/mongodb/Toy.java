package pl.kmiecik.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.StringJoiner;

@Document
public class Toy {
    @Id
    private String id;
    private String name;
    private ToyType type;

    public Toy(String name, ToyType type) {
        this.name = name;
        this.type = type;
    }

    public Toy() {
    }

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

    public ToyType getType() {
        return type;
    }

    public void setType(ToyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Toy.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("type=" + type)
                .toString();
    }
}
