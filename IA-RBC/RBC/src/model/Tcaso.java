package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Tcaso extends AbstractTableModel {

    private ArrayList<Csimil> lista;
    private final String[] colunas;

    public Tcaso(ArrayList caso) {
        colunas = new String[]{"Caso", "Doença", "Similaridade"};
        lista = caso;
    }

    public Csimil selecionarCaso(int rownIndex) {
        return lista.get(rownIndex);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.get(rowIndex).getCaso();

            case 1:
                return lista.get(rowIndex).getDoenca();

            case 2:
                return String.format("%.2f", lista.get(rowIndex).getSimilaridade()) + "%";

            default:
                return lista.get(rowIndex);

        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
