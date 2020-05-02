package HexaTech.entities;

import java.util.List;

public class MethodOfBAL {
    String nome="Method.nome";
    String description="Method.description";
    String tags="Method.tags";
    List<toReturn> toRet;
    List<Parameters> param;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<toReturn> getToRet() {
        return toRet;
    }

    public void setToRet(List<toReturn> toRet) {
        this.toRet = toRet;
    }

    public List<Parameters> getParam() {
        return param;
    }

    public void setParam(List<Parameters> param) {
        this.param = param;
    }
    public String toString(){
        String toReturnString= "\"" + "/" + nome + "\"" + ":{"+"\n" + "\"get\":{"
                + "\"" + "description" + "\":" + "\"" + description + "\"" + "\n"
                +  "\"" + "tags" +  "\":" + "\"" + tags + "\"" + "\n" + "\"parameters\":{";
        for(Parameters parametersIterator: param){
            toReturnString+="\n"+ parametersIterator.toString();
        }

        toReturnString+="}"+ "\n"+ "\"responses\":{";
        for(toReturn toReturnIterator: toRet){
            toReturnString+="\n"+ toReturnIterator.toString();
        }
        toReturnString+="}}";
        return toReturnString;
    }
}
