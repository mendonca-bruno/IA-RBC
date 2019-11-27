package model;

public class Csimil implements Comparable<Csimil> {

    private Integer caso;
    private String doenca;
    private Double similaridade;

    public Csimil() {
    }

    public Integer getCaso() {
        return caso;
    }

    public void setCaso(Integer caso) {
        this.caso = caso;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public Double getSimilaridade() {
        return similaridade;
    }

    public void setSimilaridade(Double similaridade) {
        this.similaridade = similaridade;
    }

    @Override
    public int compareTo(Csimil o) {
        if (this.similaridade < o.getSimilaridade()) {
            return 1;
        }
        if (this.similaridade > o.getSimilaridade()) {
            return -1;
        }
        return 0;
    }

}
