package HexaTech.Interactor;

import HexaTech.Model.iModel;
import HexaTech.Repo.iRepo;
import HexaTech.entities.BALjSon;
import HexaTech.entities.MethodOfBAL;
import HexaTech.entities.Parameters;
import HexaTech.entities.toReturn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddGherkin implements AddGherkinInputPort{

    AddGherkinOutputPort addGherkin;
    iRepo repo;
    iModel model;

    public AddGherkin(AddGherkinOutputPort addGout, iRepo rep, iModel mod){
        addGherkin=addGout;
        repo=rep;
        model=mod;
    }

    @Override
    public void addFeature() throws IOException {
        String temp=repo.getGherkinFromContentPath();
        model.provaGherkin(temp);
        toReturn toret=new toReturn();
        List<MethodOfBAL> meth=new ArrayList<>();
        for(int i=0;i<3;++i) {
            List<toReturn> list = new ArrayList<>();
            list.add(toret);
            list.add(toret);
            list.add(toret);
            Parameters param = new Parameters();
            List<Parameters> listP = new ArrayList<>();
            listP.add(param);
            listP.add(param);
            listP.add(param);
            MethodOfBAL method = new MethodOfBAL();
            method.setToRet(list);
            method.setParam(listP);
            meth.add(method);
        }
        BALjSon Bal=new BALjSon();
        Bal.setMethods(meth);
        System.out.println(Bal.toString());
        repo.saveBALinJSon(Bal);

        addGherkin.showAddGherkin("Ho fatto le cose con successo");
    }
}
