package HexaTech.Model;

import HexaTech.entities.BDL;

public interface iModel {
    BDL estrai(String text);
    void provaGherkin(String text);
}
