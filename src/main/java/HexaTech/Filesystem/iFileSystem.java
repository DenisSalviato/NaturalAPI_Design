package HexaTech.Filesystem;

import java.io.IOException;

public interface iFileSystem{
    String importPath();
    String getContenutoFromPath(String path) throws IOException;
    void salvaDoc(String documento, String path) throws IOException;
    boolean esisteDoc(String document);
    boolean eliminaDoc(String doc);
}
