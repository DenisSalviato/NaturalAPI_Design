package HexaTech.Interactor;

public class AddGherkin implements AddGherkinInputPort{

    AddGherkinOutputPort addGherkin;

    public AddGherkin(AddGherkinOutputPort addGout){
        addGherkin=addGout;
    }
    @Override
    public void addFeature() {
        addGherkin.showAddGherkin("Ho fatto le cose con successo");
    }
}
