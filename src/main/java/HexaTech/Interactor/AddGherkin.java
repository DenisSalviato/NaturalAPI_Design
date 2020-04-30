package HexaTech.Interactor;

import HexaTech.Repo.iRepo;

public class AddGherkin implements AddGherkinInputPort{

    AddGherkinOutputPort addGherkin;
    iRepo repo;

    public AddGherkin(AddGherkinOutputPort addGout, iRepo rep){
        addGherkin=addGout;
        repo=rep;
    }

    @Override
    public void addFeature() {
        addGherkin.showAddGherkin("Ho fatto le cose con successo");
    }
}
