package HexaTech.entities;

public class toReturn {
    String response="toRet.res";
    String description="toRet.des";
    String type="toRet.type";


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  "\"" + response + "\"" +":{" + "\n" +
                "\"description\":" + "\"" + description + "\"," + "\n"+
                "\"schema\": {\n"+ "\"type\":" + "\"" + type + "\"" + "}\n }";
    }


}
