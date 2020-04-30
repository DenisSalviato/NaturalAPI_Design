package HexaTech.client;

import HexaTech.ControllerPresenter.Controller;
import HexaTech.ControllerPresenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class CLI implements myObserver{
    Controller controller;
    Presenter presenter;

    public CLI(Controller c, Presenter p){
        controller=c;
        presenter=p;
        presenter.addobss(this);
    }
    /*public void existsBackUp() throws IOException {
    System.out.println("Ci sono dei documenti in memoria. Vuoi mantenerli? (s/n)");
    Scanner scan = new Scanner(System.in);
    String risp = scan.nextLine();
        System.out.println(risp);
            if (risp.equalsIgnoreCase("s")) {
                controller.restoreDocController();
            }
            else if (risp.equalsIgnoreCase("n")){
                controller.deleteDocController(".\\temp.txt");
            }
            else existsBackUp();
}*/
    public void useCase() throws IOException {
        String temp;
        while (true) {
            System.out.println("Casi d'uso: \n 1: Aggiungi BDL \n 2: Aggiungi Scenari Gherkin \n 3: Estrai BAL \n 4: Esci");
            Scanner scan = new Scanner(System.in);
            temp = scan.nextLine();
            switch (temp) {
                case ("1"):
                    controller.addBDLController();
                    break;
                case ("2"):
                    controller.addGherkinController();
                    break;
                case ("3"):
                    controller.createBAL();
                    break;
                case ("4"):
                    System.out.println("Esci");
                    System.exit(0);

            }
        }
    }

    @Override
    public void notifyme() {
        System.out.println(presenter.getS());
    }
}
