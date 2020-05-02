package HexaTech.entities;

import com.google.gson.Gson;

import java.util.List;

public class BALjSon {
    String intro="BAL.intro";
    List<MethodOfBAL> methods;

   /* public BALjSon(String casino, List<MethodOfBAL> meth) {

    }*/

    public String getIntro() {
        return intro;
    }
    public List<MethodOfBAL> getMethods() {
        return methods;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setMethods(List<MethodOfBAL> methods) {
        this.methods = methods;
    }

    public String BALToJson(){
        Gson gsonSost=new Gson();
        return gsonSost.toJson(this);
    }

    public String toString(){
        String toRit="{\n" +
                "  \"openapi\": \"3.0.0\",\n" +
                "  \"info\": {\n" +
                "    \"title\": null,\n" +
                "    \"version\": \"1.0\"\n" +
                "  },\n" +
                "  \"servers\": [\n" +
                "    {\n" +
                "      \"url\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"paths\": {";
        for(MethodOfBAL method: this.methods){
            toRit+=method.toString();
        }
        toRit+="}";
        return toRit;
    }


}
