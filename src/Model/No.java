
package Model;

public class No {
    private No esq;
    private No dir;
    private String prato;

    public No() {
    }
    
    public No(String prato) {
        this.esq = esq;
        this.dir = dir;
        this.prato = prato;
    }
    
    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
    
}
