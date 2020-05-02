package HexaTech.Model;

import HexaTech.Stanford.iStanford;
import HexaTech.entities.BDL;
import HexaTech.entities.DoubleToken;
import HexaTech.entities.Gherkin;

import java.util.List;

public class Model implements iModel{
    iStanford nlp;

    public Model (iStanford enelpi){
        nlp=enelpi;
    }
    @Override
    public BDL estrai(String text) {
        BDL bidiel=new BDL();
        //List<DoubleToken> result = nlp.extract(text);
        //this.addSost(result,bidiel);
        //this.addVerb(result,bidiel);
        //this.addPred(result,bidiel);
        return bidiel;
    }

    public void provaGherkin(String text){
        Gherkin gherk = nlp.extract(text);
    }

    public void addSost(List<DoubleToken> list, BDL bidiel){
        for(DoubleToken d: list){
            if(d.getToken().contains("NN"))
                bidiel.aggiungiSost(d.getLemma(),1);
        }
    }
    public void addVerb(List<DoubleToken> list, BDL bidiel){
        for(DoubleToken d: list){
            if(d.getToken().contains("VB"))
                bidiel.aggiungiVerb(d.getLemma(),1);
        }
    }
    public void addPred(List<DoubleToken> list, BDL bidiel){
        for(DoubleToken d: list){
            if(d.getToken().contains("obj"))
                bidiel.aggiungiPred(d.getLemma(),1);
        }
    }




}
