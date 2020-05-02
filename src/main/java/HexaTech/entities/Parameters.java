package HexaTech.entities;

public class Parameters {
    String description="Param.description";
    String name="Param.name";
    String type="Param.type";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  "\"name\":" + "\"" + name + "\"," +
                "\"in\": \"query\"," + "\"description\":" + "\"" + description + "\"," + "\n"+
                "\"schema\": {\n"+ "\"type\":" + "\"" + type + "\"" + "}\n"+ "\"required\": \"true\"";
    }
}
