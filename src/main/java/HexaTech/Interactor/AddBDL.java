package HexaTech.Interactor;

public class AddBDL implements AddBDLInputPort {

    AddBDLOutputPort addBDLout;

    public AddBDL(AddBDLOutputPort Addout){
        addBDLout=Addout;
    }
    @Override
    public void addBussinessDomainLanguage() {

        addBDLout.showAddBDL("Ho fatto le cose con successo");
    }
}
