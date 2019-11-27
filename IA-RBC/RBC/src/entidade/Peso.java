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
@Table(name = "peso")
@NamedQueries({
    @NamedQuery(name = "Peso.findAll", query = "SELECT p FROM Peso p"),
    @NamedQuery(name = "Peso.findById", query = "SELECT p FROM Peso p WHERE p.id = :id"),
    @NamedQuery(name = "Peso.findByAtributo", query = "SELECT p FROM Peso p WHERE p.atributo = :atributo"),
    @NamedQuery(name = "Peso.findByValor", query = "SELECT p FROM Peso p WHERE p.valor = :valor")})
public class Peso implements Serializable {

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
    private int valor;

    public Peso() {
    }

    public Peso(Integer id) {
        this.id = id;
    }

    public Peso(Integer id, String atributo, int valor) {
        this.id = id;
        this.atributo = atributo;
        this.valor = valor;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
        if (!(object instanceof Peso)) {
            return false;
        }
        Peso other = (Peso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Peso[ id=" + id + " ]";
    }

}
