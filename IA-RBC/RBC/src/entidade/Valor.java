package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "valor")
@NamedQueries({
    @NamedQuery(name = "Valor.findAll", query = "SELECT v FROM Valor v"),
    @NamedQuery(name = "Valor.findById", query = "SELECT v FROM Valor v WHERE v.id = :id"),
    @NamedQuery(name = "Valor.findByAtributo", query = "SELECT v FROM Valor v WHERE v.atributo = :atributo"),
    @NamedQuery(name = "Valor.findByValor", query = "SELECT v FROM Valor v WHERE v.valor = :valor"),
    @NamedQuery(name = "Valor.findByValorNome", query = "SELECT v FROM Valor v WHERE v.valorNome = :valorNome"),
    @NamedQuery(name = "Valor.findBySimilaridade", query = "SELECT v FROM Valor v WHERE v.similaridade = :similaridade")})
public class Valor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "atributo")
    private String atributo;
    @Basic(optional = false)
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @Column(name = "valor_nome")
    private String valorNome;
    @Basic(optional = false)
    @Column(name = "similaridade")
    private String similaridade;

    public Valor() {
    }

    public Valor(Integer id) {
        this.id = id;
    }

    public Valor(Integer id, String atributo, String valor, String valorNome, String similaridade) {
        this.id = id;
        this.atributo = atributo;
        this.valor = valor;
        this.valorNome = valorNome;
        this.similaridade = similaridade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValorNome() {
        return valorNome;
    }

    public void setValorNome(String valorNome) {
        this.valorNome = valorNome;
    }

    public String getSimilaridade() {
        return similaridade;
    }

    public void setSimilaridade(String similaridade) {
        this.similaridade = similaridade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valor)) {
            return false;
        }
        Valor other = (Valor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Valor[ id=" + id + " ]";
    }

}
