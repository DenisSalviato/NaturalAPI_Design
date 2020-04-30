package HexaTech.ControllerPresenter;
import HexaTech.Interactor.AddBDLOutputPort;
import HexaTech.Interactor.AddGherkinOutputPort;
import HexaTech.Interactor.CreateBALOutputPort;

public class Presenter extends Subject implements AddBDLOutputPort, AddGherkinOutputPort, CreateBALOutputPort {
    String s;

    public String getS() {
        return s;
    }

    @Override
    public void showAddBDL(String result) {
        s=result;
        notifysubme();
    }
    public void showAddGherkin(String result) {
        s=result;
        notifysubme();
    }
    public void showCreateBAL(String result){
        s=result;
        notifysubme();
    }
}
