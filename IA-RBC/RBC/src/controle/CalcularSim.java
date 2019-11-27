package controle;

import DAO.DAO;
import model.Csimil;
import entidade.Caso;
import entidade.Peso;
import entidade.Valor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CalcularSim {

    private final ArrayList<Object> resultadoDoCalculo;
    private final ArrayList<Csimil> listaDosCalculos;
    private final DAO<Caso> daoCaso;
    private final DAO<Peso> daoPeso;
    private final DAO<Valor> daoValor;
    private final HashMap<String, Integer> pegaIndex;
    private final HashMap<Caso, String> pegaGet;
    private final ArrayList<String> atributos;
    private final ArrayList<String> atributosPadrao;

    public CalcularSim(ArrayList valor) {
        resultadoDoCalculo = valor;
        listaDosCalculos = new ArrayList<>();
        daoCaso = new DAO();
        daoPeso = new DAO();
        daoValor = new DAO();
        pegaIndex = new HashMap<>();
        pegaGet = new HashMap<>();
        atributos = new ArrayList<>();
        atributosPadrao = new ArrayList<>();
        preencheMap();
        preencheAtrDefault();
    }
    
    public void preencheAtrDefault() {
        atributosPadrao.add("date");
        atributosPadrao.add("plant-stand");
        atributosPadrao.add("precip");
        atributosPadrao.add("temp");
        atributosPadrao.add("hail");
        atributosPadrao.add("crop-hist");
        atributosPadrao.add("area-damaged");
        atributosPadrao.add("severity");
        atributosPadrao.add("seed-tmt");
        atributosPadrao.add("germination");
        atributosPadrao.add("plant-growth");
        atributosPadrao.add("leaves");
        atributosPadrao.add("leafspots-halo");
        atributosPadrao.add("leafspots-marg");
        atributosPadrao.add("leafspot-size");
        atributosPadrao.add("leaf-shread");
        atributosPadrao.add("leaf-malf");
        atributosPadrao.add("leaf-mild");
        atributosPadrao.add("stem");
        atributosPadrao.add("lodging");
        atributosPadrao.add("stem-cankers");
        atributosPadrao.add("canker-lesion");
        atributosPadrao.add("fruiting-bodies");
        atributosPadrao.add("external decay");
        atributosPadrao.add("mycelium");
        atributosPadrao.add("int-discolor");
        atributosPadrao.add("sclerotia");
        atributosPadrao.add("fruit-pods");
        atributosPadrao.add("fruit spots");
        atributosPadrao.add("seed");
        atributosPadrao.add("mold-growth");
        atributosPadrao.add("seed-discolor");
        atributosPadrao.add("seed-size");
        atributosPadrao.add("shriveling");
        atributosPadrao.add("roots");
    }


    public void calcularCasos() {
        Double calculoSimilaridade = 0.0;

        List<Caso> todosCasos = daoCaso.pegarTodos("Caso.findAll");
        List<Valor> todosValores = daoValor.pegarTodos("Valor.findAll");
        
        
        for (int i = 0; i < todosCasos.size(); ++i) {
            preencheAtributos(todosCasos.get(i));
            for(int j=0; j<atributosPadrao.size(); j++){
                calculoSimilaridade+=checaSimilaridade(todosValores, atributosPadrao.get(j),
                        resultadoDoCalculo.get(pegaIndex.get(atributosPadrao.get(j))).toString(), atributos.get(j));
            }
            atributos.clear();  
            //Após somar;
            calculoSimilaridade = calculoSimilaridade / 214;
            Csimil caso = new Csimil();
            caso.setCaso(todosCasos.get(i).getId());
            caso.setDoenca(todosCasos.get(i).getObjetivo());
            caso.setSimilaridade(calculoSimilaridade * 100);
            listaDosCalculos.add(caso);
            calculoSimilaridade = 0.0;
        }

    }
   
    
    public Double checaSimilaridade(List<Valor> todosValores, String caracteristica, String valorNovo, String valorCaso){
        Double similaridade = 0.0;
        
        for(Valor v : todosValores){
            if(v.getAtributo().equals(caracteristica)){
                if(v.getSimilaridade().equals("S")){
                    similaridade+=ehSimilar(caracteristica, valorNovo, valorCaso);
                    break;
                }
                else{
                    similaridade+=naoSimilar(caracteristica, valorNovo, valorCaso);
                    break;
                }
            }
        }
        
        return similaridade;
    }

    
    public void calcularSimilaridade() {
        calcularCasos();
    }
    public Double naoSimilar(String caracteristica, String valorNovo, String valorCaso) {
        Double simil = 0.0;
        if (!valorNovo.equals("Desconhecido")) {
            if (valorNovo.equals(valorCaso)) {
                int peso = getPeso(caracteristica);
                simil = (double) (1 * peso);
            }
        }
        return simil;
    }

    public Double ehSimilar(String caracteristica, String valorNovo, String valorCaso) {
        Double simil = 0.0;
        int peso = getPeso(caracteristica);
        simil += 1 - (calcularValorCaso(valorNovo, valorCaso, caracteristica) / (calcularValorMaxMin(caracteristica)));
        simil = simil * peso;
        return simil;
    }

    public Double calcularValorCaso(String valorNovo, String valor, String caracteristica) {
        Double valorN = 0.0;
        Double valorC = 0.0;
        if (!valorNovo.equals("Desconhecido")) {
            for (Valor v : daoValor.pegarTodos("Valor.findAll")) {
                if (v.getAtributo().equals(caracteristica)) {
                    if (v.getValorNome().equals(valorNovo)) {
                        valorN = Double.parseDouble(v.getValor());
                    }
                    if (v.getValorNome().equals(valor)) {
                        if (!v.getValorNome().equals("Desconhecido")) {
                            valorC = Double.parseDouble(v.getValor());
                        }
                    }
                }
            }
        }
        return Math.abs(valorN - valorC);
    }

    public Double calcularValorMaxMin(String caracteristica) {
        Double retorna = 0.0;
        for (Valor v : daoValor.pegarTodos("Valor.findAll")) {
            if (v.getAtributo().equals(caracteristica)) {
                if (!v.getValor().equals("?")) {
                    if (retorna < Double.parseDouble(v.getValor())) {
                        retorna = Double.parseDouble(v.getValor());
                    }
                }
            }
        }
        return retorna;
    }
    
    public void preencheMap() {
        pegaIndex.put("date", 3);
        pegaIndex.put("plant-stand", 22);
        pegaIndex.put("precip", 23);
        pegaIndex.put("temp", 34);
        pegaIndex.put("hail", 9);
        pegaIndex.put("crop-hist", 2);
        pegaIndex.put("area-damaged", 0);
        pegaIndex.put("severity", 30);
        pegaIndex.put("seed-tmt", 29);
        pegaIndex.put("germination", 8);
        pegaIndex.put("plant-growth", 21);
        pegaIndex.put("leaves", 17);
        pegaIndex.put("leafspots-halo", 14);
        pegaIndex.put("leafspots-marg", 16);
        pegaIndex.put("leafspot-size", 15);
        pegaIndex.put("leaf-shread", 13);
        pegaIndex.put("leaf-malf", 11);
        pegaIndex.put("leaf-mild", 12);
        pegaIndex.put("stem", 32);
        pegaIndex.put("lodging", 18);
        pegaIndex.put("stem-cankers", 33);
        pegaIndex.put("canker-lesion", 1);
        pegaIndex.put("fruiting-bodies", 6);
        pegaIndex.put("external decay", 4);
        pegaIndex.put("mycelium", 20);
        pegaIndex.put("int-discolor", 10);
        pegaIndex.put("sclerotia", 25);
        pegaIndex.put("fruit-pods", 7);
        pegaIndex.put("fruit spots", 5);
        pegaIndex.put("seed", 26);
        pegaIndex.put("mold-growth", 19);
        pegaIndex.put("seed-discolor", 27);
        pegaIndex.put("seed-size", 28);
        pegaIndex.put("shriveling", 31);
        pegaIndex.put("roots", 24);
    }

    public int getPeso(String caracteristica) {
        int retorna = -1;
        for (Peso p : daoPeso.pegarTodos("Peso.findAll")) {
            if (p.getAtributo().equals(caracteristica)) {
                retorna = p.getValor();
            }
        }
        return retorna;
    }

    
    public ArrayList<Csimil> getCasos() {
        Collections.sort(listaDosCalculos);
        return listaDosCalculos;
    }
    
    public void preencheAtributos(Caso c) {
        atributos.add(c.getMes()); //0
        atributos.add(c.getPlantStand());//1
        atributos.add(c.getPrecip());
        atributos.add(c.getTemperatura());
        atributos.add(c.getHail());
        atributos.add(c.getCropHist());
        atributos.add(c.getAreaDamaged());
        atributos.add(c.getSeverity());
        atributos.add(c.getSeedTmt());
        atributos.add(c.getGermination());
        atributos.add(c.getPlantGrowth());
        atributos.add(c.getLeaves());
        atributos.add(c.getLeafspotsHalo());
        atributos.add(c.getLeafspotsMarg());
        atributos.add(c.getLeafspotsSize());
        atributos.add(c.getLeafsportsShread());
        atributos.add(c.getLeafMalf());
        atributos.add(c.getLeafMild());
        atributos.add(c.getStem());
        atributos.add(c.getLodging());
        atributos.add(c.getStemCankers());
        atributos.add(c.getCankerLesion());
        atributos.add(c.getFruitingBodies());
        atributos.add(c.getExternalDecay());
        atributos.add(c.getMycelium());
        atributos.add(c.getIntDiscolor());
        atributos.add(c.getSclerotia());
        atributos.add(c.getFruitPods());
        atributos.add(c.getFruitSpots());
        atributos.add(c.getSeed());
        atributos.add(c.getMoldGrowth());
        atributos.add(c.getSeedDiscolor());
        atributos.add(c.getSeedSize());
        atributos.add(c.getShriveling());
        atributos.add(c.getRoots());
    }

}
