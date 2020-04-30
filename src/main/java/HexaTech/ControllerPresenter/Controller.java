package HexaTech.ControllerPresenter;

import HexaTech.Interactor.AddBDLInputPort;
import HexaTech.Interactor.AddGherkinInputPort;
import HexaTech.Interactor.CreateBALInputPort;

import java.io.IOException;


public class Controller {
    AddBDLInputPort addBdl;
    AddGherkinInputPort addGherkin;
    CreateBALInputPort createBAL;

    public Controller(AddBDLInputPort addB, AddGherkinInputPort addD, CreateBALInputPort crBAL){
        addBdl=addB;
        addGherkin=addD;
        createBAL=crBAL;
    }

    public void addBDLController() throws IOException {
        addBdl.addBussinessDomainLanguage();
    }

    public void addGherkinController() {
        addGherkin.addFeature();
    }

    public void createBAL() {
        createBAL.createBussinessApplicationLanguage();
    }
}
