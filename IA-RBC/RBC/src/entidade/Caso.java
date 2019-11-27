package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "caso")
@NamedQueries({
    @NamedQuery(name = "Caso.findAll", query = "SELECT c FROM Caso c"),
    @NamedQuery(name = "Caso.findById", query = "SELECT c FROM Caso c WHERE c.id = :id"),
    @NamedQuery(name = "Caso.findByObjetivo", query = "SELECT c FROM Caso c WHERE c.objetivo = :objetivo"),
    @NamedQuery(name = "Caso.findByAreaDamaged", query = "SELECT c FROM Caso c WHERE c.areaDamaged = :areaDamaged"),
    @NamedQuery(name = "Caso.findByCankerLesion", query = "SELECT c FROM Caso c WHERE c.cankerLesion = :cankerLesion"),
    @NamedQuery(name = "Caso.findByCropHist", query = "SELECT c FROM Caso c WHERE c.cropHist = :cropHist"),
    @NamedQuery(name = "Caso.findByMes", query = "SELECT c FROM Caso c WHERE c.mes = :mes"),
    @NamedQuery(name = "Caso.findByExternalDecay", query = "SELECT c FROM Caso c WHERE c.externalDecay = :externalDecay"),
    @NamedQuery(name = "Caso.findByFruitSpots", query = "SELECT c FROM Caso c WHERE c.fruitSpots = :fruitSpots"),
    @NamedQuery(name = "Caso.findByFruitingBodies", query = "SELECT c FROM Caso c WHERE c.fruitingBodies = :fruitingBodies"),
    @NamedQuery(name = "Caso.findByFruitPods", query = "SELECT c FROM Caso c WHERE c.fruitPods = :fruitPods"),
    @NamedQuery(name = "Caso.findByGermination", query = "SELECT c FROM Caso c WHERE c.germination = :germination"),
    @NamedQuery(name = "Caso.findByHail", query = "SELECT c FROM Caso c WHERE c.hail = :hail"),
    @NamedQuery(name = "Caso.findByIntDiscolor", query = "SELECT c FROM Caso c WHERE c.intDiscolor = :intDiscolor"),
    @NamedQuery(name = "Caso.findByLeafMalf", query = "SELECT c FROM Caso c WHERE c.leafMalf = :leafMalf"),
    @NamedQuery(name = "Caso.findByLeafMild", query = "SELECT c FROM Caso c WHERE c.leafMild = :leafMild"),
    @NamedQuery(name = "Caso.findByLeafsportsShread", query = "SELECT c FROM Caso c WHERE c.leafsportsShread = :leafsportsShread"),
    @NamedQuery(name = "Caso.findByLeafspotsHalo", query = "SELECT c FROM Caso c WHERE c.leafspotsHalo = :leafspotsHalo"),
    @NamedQuery(name = "Caso.findByLeafspotsSize", query = "SELECT c FROM Caso c WHERE c.leafspotsSize = :leafspotsSize"),
    @NamedQuery(name = "Caso.findByLeafspotsMarg", query = "SELECT c FROM Caso c WHERE c.leafspotsMarg = :leafspotsMarg"),
    @NamedQuery(name = "Caso.findByLeaves", query = "SELECT c FROM Caso c WHERE c.leaves = :leaves"),
    @NamedQuery(name = "Caso.findByLodging", query = "SELECT c FROM Caso c WHERE c.lodging = :lodging"),
    @NamedQuery(name = "Caso.findByMoldGrowth", query = "SELECT c FROM Caso c WHERE c.moldGrowth = :moldGrowth"),
    @NamedQuery(name = "Caso.findByMycelium", query = "SELECT c FROM Caso c WHERE c.mycelium = :mycelium"),
    @NamedQuery(name = "Caso.findByPlantGrowth", query = "SELECT c FROM Caso c WHERE c.plantGrowth = :plantGrowth"),
    @NamedQuery(name = "Caso.findByPlantStand", query = "SELECT c FROM Caso c WHERE c.plantStand = :plantStand"),
    @NamedQuery(name = "Caso.findByPrecip", query = "SELECT c FROM Caso c WHERE c.precip = :precip"),
    @NamedQuery(name = "Caso.findByRoots", query = "SELECT c FROM Caso c WHERE c.roots = :roots"),
    @NamedQuery(name = "Caso.findBySclerotia", query = "SELECT c FROM Caso c WHERE c.sclerotia = :sclerotia"),
    @NamedQuery(name = "Caso.findBySeed", query = "SELECT c FROM Caso c WHERE c.seed = :seed"),
    @NamedQuery(name = "Caso.findBySeedDiscolor", query = "SELECT c FROM Caso c WHERE c.seedDiscolor = :seedDiscolor"),
    @NamedQuery(name = "Caso.findBySeedSize", query = "SELECT c FROM Caso c WHERE c.seedSize = :seedSize"),
    @NamedQuery(name = "Caso.findBySeedTmt", query = "SELECT c FROM Caso c WHERE c.seedTmt = :seedTmt"),
    @NamedQuery(name = "Caso.findBySeverity", query = "SELECT c FROM Caso c WHERE c.severity = :severity"),
    @NamedQuery(name = "Caso.findByShriveling", query = "SELECT c FROM Caso c WHERE c.shriveling = :shriveling"),
    @NamedQuery(name = "Caso.findByStem", query = "SELECT c FROM Caso c WHERE c.stem = :stem"),
    @NamedQuery(name = "Caso.findByStemCankers", query = "SELECT c FROM Caso c WHERE c.stemCankers = :stemCankers"),
    @NamedQuery(name = "Caso.findByTemperatura", query = "SELECT c FROM Caso c WHERE c.temperatura = :temperatura")})
public class Caso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "objetivo")
    private String objetivo;
    @Basic(optional = false)
    @Column(name = "area_damaged")
    private String areaDamaged;
    @Basic(optional = false)
    @Column(name = "canker_lesion")
    private String cankerLesion;
    @Basic(optional = false)
    @Column(name = "crop_hist")
    private String cropHist;
    @Basic(optional = false)
    @Column(name = "mes")
    private String mes;
    @Basic(optional = false)
    @Column(name = "external_decay")
    private String externalDecay;
    @Basic(optional = false)
    @Column(name = "fruit_spots")
    private String fruitSpots;
    @Basic(optional = false)
    @Column(name = "fruiting_bodies")
    private String fruitingBodies;
    @Basic(optional = false)
    @Column(name = "fruit_pods")
    private String fruitPods;
    @Basic(optional = false)
    @Column(name = "germination")
    private String germination;
    @Basic(optional = false)
    @Column(name = "hail")
    private String hail;
    @Basic(optional = false)
    @Column(name = "int_discolor")
    private String intDiscolor;
    @Basic(optional = false)
    @Column(name = "leaf_malf")
    private String leafMalf;
    @Basic(optional = false)
    @Column(name = "leaf_mild")
    private String leafMild;
    @Basic(optional = false)
    @Column(name = "leafsports_shread")
    private String leafsportsShread;
    @Basic(optional = false)
    @Column(name = "leafspots_halo")
    private String leafspotsHalo;
    @Basic(optional = false)
    @Column(name = "leafspots_size")
    private String leafspotsSize;
    @Basic(optional = false)
    @Column(name = "leafspots_marg")
    private String leafspotsMarg;
    @Basic(optional = false)
    @Column(name = "leaves")
    private String leaves;
    @Basic(optional = false)
    @Column(name = "lodging")
    private String lodging;
    @Basic(optional = false)
    @Column(name = "mold_growth")
    private String moldGrowth;
    @Basic(optional = false)
    @Column(name = "mycelium")
    private String mycelium;
    @Basic(optional = false)
    @Column(name = "plant_growth")
    private String plantGrowth;
    @Basic(optional = false)
    @Column(name = "plant_stand")
    private String plantStand;
    @Basic(optional = false)
    @Column(name = "precip")
    private String precip;
    @Basic(optional = false)
    @Column(name = "roots")
    private String roots;
    @Basic(optional = false)
    @Column(name = "sclerotia")
    private String sclerotia;
    @Basic(optional = false)
    @Column(name = "seed")
    private String seed;
    @Basic(optional = false)
    @Column(name = "seed_discolor")
    private String seedDiscolor;
    @Basic(optional = false)
    @Column(name = "seed_size")
    private String seedSize;
    @Basic(optional = false)
    @Column(name = "seed_tmt")
    private String seedTmt;
    @Basic(optional = false)
    @Column(name = "severity")
    private String severity;
    @Basic(optional = false)
    @Column(name = "shriveling")
    private String shriveling;
    @Basic(optional = false)
    @Column(name = "stem")
    private String stem;
    @Basic(optional = false)
    @Column(name = "stem_cankers")
    private String stemCankers;
    @Basic(optional = false)
    @Column(name = "temperatura")
    private String temperatura;

    public Caso() {
    }

    public Caso(Integer id) {
        this.id = id;
    }

    public Caso(Integer id, String objetivo, String areaDamaged, String cankerLesion, String cropHist, String mes, String externalDecay, String fruitSpots, String fruitingBodies, String fruitPods, String germination, String hail, String intDiscolor, String leafMalf, String leafMild, String leafsportsShread, String leafspotsHalo, String leafspotsSize, String leafspotsMarg, String leaves, String lodging, String moldGrowth, String mycelium, String plantGrowth, String plantStand, String precip, String roots, String sclerotia, String seed, String seedDiscolor, String seedSize, String seedTmt, String severity, String shriveling, String stem, String stemCankers, String temperatura) {
        this.id = id;
        this.objetivo = objetivo;
        this.areaDamaged = areaDamaged;
        this.cankerLesion = cankerLesion;
        this.cropHist = cropHist;
        this.mes = mes;
        this.externalDecay = externalDecay;
        this.fruitSpots = fruitSpots;
        this.fruitingBodies = fruitingBodies;
        this.fruitPods = fruitPods;
        this.germination = germination;
        this.hail = hail;
        this.intDiscolor = intDiscolor;
        this.leafMalf = leafMalf;
        this.leafMild = leafMild;
        this.leafsportsShread = leafsportsShread;
        this.leafspotsHalo = leafspotsHalo;
        this.leafspotsSize = leafspotsSize;
        this.leafspotsMarg = leafspotsMarg;
        this.leaves = leaves;
        this.lodging = lodging;
        this.moldGrowth = moldGrowth;
        this.mycelium = mycelium;
        this.plantGrowth = plantGrowth;
        this.plantStand = plantStand;
        this.precip = precip;
        this.roots = roots;
        this.sclerotia = sclerotia;
        this.seed = seed;
        this.seedDiscolor = seedDiscolor;
        this.seedSize = seedSize;
        this.seedTmt = seedTmt;
        this.severity = severity;
        this.shriveling = shriveling;
        this.stem = stem;
        this.stemCankers = stemCankers;
        this.temperatura = temperatura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getAreaDamaged() {
        return areaDamaged;
    }

    public void setAreaDamaged(String areaDamaged) {
        this.areaDamaged = areaDamaged;
    }

    public String getCankerLesion() {
        return cankerLesion;
    }

    public void setCankerLesion(String cankerLesion) {
        this.cankerLesion = cankerLesion;
    }

    public String getCropHist() {
        return cropHist;
    }

    public void setCropHist(String cropHist) {
        this.cropHist = cropHist;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getExternalDecay() {
        return externalDecay;
    }

    public void setExternalDecay(String externalDecay) {
        this.externalDecay = externalDecay;
    }

    public String getFruitSpots() {
        return fruitSpots;
    }

    public void setFruitSpots(String fruitSpots) {
        this.fruitSpots = fruitSpots;
    }

    public String getFruitingBodies() {
        return fruitingBodies;
    }

    public void setFruitingBodies(String fruitingBodies) {
        this.fruitingBodies = fruitingBodies;
    }

    public String getFruitPods() {
        return fruitPods;
    }

    public void setFruitPods(String fruitPods) {
        this.fruitPods = fruitPods;
    }

    public String getGermination() {
        return germination;
    }

    public void setGermination(String germination) {
        this.germination = germination;
    }

    public String getHail() {
        return hail;
    }

    public void setHail(String hail) {
        this.hail = hail;
    }

    public String getIntDiscolor() {
        return intDiscolor;
    }

    public void setIntDiscolor(String intDiscolor) {
        this.intDiscolor = intDiscolor;
    }

    public String getLeafMalf() {
        return leafMalf;
    }

    public void setLeafMalf(String leafMalf) {
        this.leafMalf = leafMalf;
    }

    public String getLeafMild() {
        return leafMild;
    }

    public void setLeafMild(String leafMild) {
        this.leafMild = leafMild;
    }

    public String getLeafsportsShread() {
        return leafsportsShread;
    }

    public void setLeafsportsShread(String leafsportsShread) {
        this.leafsportsShread = leafsportsShread;
    }

    public String getLeafspotsHalo() {
        return leafspotsHalo;
    }

    public void setLeafspotsHalo(String leafspotsHalo) {
        this.leafspotsHalo = leafspotsHalo;
    }

    public String getLeafspotsSize() {
        return leafspotsSize;
    }

    public void setLeafspotsSize(String leafspotsSize) {
        this.leafspotsSize = leafspotsSize;
    }

    public String getLeafspotsMarg() {
        return leafspotsMarg;
    }

    public void setLeafspotsMarg(String leafspotsMarg) {
        this.leafspotsMarg = leafspotsMarg;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public String getLodging() {
        return lodging;
    }

    public void setLodging(String lodging) {
        this.lodging = lodging;
    }

    public String getMoldGrowth() {
        return moldGrowth;
    }

    public void setMoldGrowth(String moldGrowth) {
        this.moldGrowth = moldGrowth;
    }

    public String getMycelium() {
        return mycelium;
    }

    public void setMycelium(String mycelium) {
        this.mycelium = mycelium;
    }

    public String getPlantGrowth() {
        return plantGrowth;
    }

    public void setPlantGrowth(String plantGrowth) {
        this.plantGrowth = plantGrowth;
    }

    public String getPlantStand() {
        return plantStand;
    }

    public void setPlantStand(String plantStand) {
        this.plantStand = plantStand;
    }

    public String getPrecip() {
        return precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getRoots() {
        return roots;
    }

    public void setRoots(String roots) {
        this.roots = roots;
    }

    public String getSclerotia() {
        return sclerotia;
    }

    public void setSclerotia(String sclerotia) {
        this.sclerotia = sclerotia;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getSeedDiscolor() {
        return seedDiscolor;
    }

    public void setSeedDiscolor(String seedDiscolor) {
        this.seedDiscolor = seedDiscolor;
    }

    public String getSeedSize() {
        return seedSize;
    }

    public void setSeedSize(String seedSize) {
        this.seedSize = seedSize;
    }

    public String getSeedTmt() {
        return seedTmt;
    }

    public void setSeedTmt(String seedTmt) {
        this.seedTmt = seedTmt;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getShriveling() {
        return shriveling;
    }

    public void setShriveling(String shriveling) {
        this.shriveling = shriveling;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getStemCankers() {
        return stemCankers;
    }

    public void setStemCankers(String stemCankers) {
        this.stemCankers = stemCankers;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
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
        if (!(object instanceof Caso)) {
            return false;
        }
        Caso other = (Caso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Caso[ id=" + id + " ]";
    }
    
}
