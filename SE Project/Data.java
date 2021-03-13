package modules.modules;

import java.io.Serializable;

public class Data implements Serializable{
    Data (String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description; 
    }
    String name;
    String type;
    String description;
}
