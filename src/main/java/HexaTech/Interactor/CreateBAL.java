package HexaTech.Interactor;

public class CreateBAL implements CreateBALInputPort{
    CreateBALOutputPort createCreateOutput;

    public CreateBAL(CreateBALOutputPort createOut){
        createCreateOutput=createOut;
    }
    @Override
    public void createBussinessApplicationLanguage() {
        createCreateOutput.showCreateBAL("Ho fatto le cose con successo");
    }
}
