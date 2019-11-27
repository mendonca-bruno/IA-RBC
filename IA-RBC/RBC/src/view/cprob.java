package view;

import DAO.DAO;
import model.Csimil;
import model.Tcaso;
import controle.CalcularSim;
import entidade.Caso;
import entidade.Valor;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;

public class cprob extends javax.swing.JFrame {

    private final ArrayList<Object> jComboBoxValor;
    private CalcularSim cal_simil;
    private ArrayList<Csimil> casos;
    private Tcaso table;

    public cprob(ArrayList valor) {
        initComponents();
        //setIcon();
        jComboBoxValor = valor;
        preencherList();
        cal_simil = new CalcularSim(valor);
        cal_simil.calcularSimilaridade();
        casos = cal_simil.getCasos();
        preencherTabela(casos);
    }

    public cprob(ArrayList caso, ArrayList valor) {
        initComponents();
        //setIcon();
        jComboBoxValor = valor;
        preencherList();
        preencherTabela(caso);
        casos = caso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Principal = new javax.swing.JPanel();
        jScrollPane_Table = new javax.swing.JScrollPane();
        jTable_Principal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_prox = new javax.swing.JButton();
        btn_ant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable_Principal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_Principal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Caso", "Doença", "Similaridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_Principal.getTableHeader().setReorderingAllowed(false);
        jScrollPane_Table.setViewportView(jTable_Principal);
        if (jTable_Principal.getColumnModel().getColumnCount() > 0) {
            jTable_Principal.getColumnModel().getColumn(0).setResizable(false);
            jTable_Principal.getColumnModel().getColumn(1).setResizable(false);
            jTable_Principal.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Casos similares encontrados:");

        btn_prox.setBackground(new java.awt.Color(255, 255, 255));
        btn_prox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_prox.setText("Próximo");
        btn_prox.setActionCommand("btn_prox");
        btn_prox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proxActionPerformed(evt);
            }
        });

        btn_ant.setBackground(new java.awt.Color(255, 255, 255));
        btn_ant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ant.setText("Anterior");
        btn_ant.setActionCommand("btn_ant");
        btn_ant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_antActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PrincipalLayout = new javax.swing.GroupLayout(jPanel_Principal);
        jPanel_Principal.setLayout(jPanel_PrincipalLayout);
        jPanel_PrincipalLayout.setHorizontalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_prox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel_PrincipalLayout.setVerticalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prox)
                    .addComponent(btn_ant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_antActionPerformed
        ncas t_caso = new ncas(jComboBoxValor);
        t_caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_antActionPerformed

    private void btn_proxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proxActionPerformed
        if (jTable_Principal.getSelectedRowCount() != 0 && jTable_Principal.getSelectedRow() != -1) {
            
            for (int i = 0; i < jTable_Principal.getRowCount()-1; ++i) {
                Csimil casoSimli = table.selecionarCaso(i);

                if (casoSimli.getSimilaridade() == 100.00) {
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "O caso escolhido é 100% igual, não pode ser retido na base!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            Csimil casoSimli = table.selecionarCaso(jTable_Principal.getSelectedRow());
            Caso casoproblema = pegarCaso(casoSimli.getCaso());
            reter reter = new reter(casos, jComboBoxValor, casoproblema);
            reter.setVisible(true);
            this.dispose();
            //JOptionPane.showMessageDialog(null, "Caso adicionado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Você precisa selecionar um caso!", "Informação", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_proxActionPerformed

    private Caso pegarCaso(int id) {
        DAO<Caso> bd_caso = new DAO(Caso.class);
        return bd_caso.pegarId(id);
    }

    private void preencherTabela(ArrayList caso) {
        table = new Tcaso(caso);
        jTable_Principal.setModel(table);
    }

    private void preencherList() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < 35; i++) {
            switch (i) {
                case 0:
                    model.addElement("Area-Damaged: " + jComboBoxValor.get(i));
                    break;

                case 1:
                    model.addElement("Canker-Lesion: " + jComboBoxValor.get(i));
                    break;

                case 2:
                    model.addElement("Crop-Hist: " + jComboBoxValor.get(i));
                    break;

                case 3:
                    model.addElement("Date: " + jComboBoxValor.get(i));
                    break;

                case 4:
                    model.addElement("External Decay: " + jComboBoxValor.get(i));
                    break;

                case 5:
                    model.addElement("Fruit Spots: " + jComboBoxValor.get(i));
                    break;

                case 6:
                    model.addElement("Fruiting-Bodies: " + jComboBoxValor.get(i));
                    break;

                case 7:
                    model.addElement("Fruit-Pods: " + jComboBoxValor.get(i));
                    break;

                case 8:
                    model.addElement("Germination: " + jComboBoxValor.get(i));
                    break;

                case 9:
                    model.addElement("Hail: " + jComboBoxValor.get(i));
                    break;

                case 10:
                    model.addElement("Int-Discolor: " + jComboBoxValor.get(i));
                    break;

                case 11:
                    model.addElement("Leaf-Malf: " + jComboBoxValor.get(i));
                    break;

                case 12:
                    model.addElement("Leaf-Mild: " + jComboBoxValor.get(i));
                    break;

                case 13:
                    model.addElement("Leaf-Shread: " + jComboBoxValor.get(i));
                    break;

                case 14:
                    model.addElement("Leafspots-Halo: " + jComboBoxValor.get(i));
                    break;

                case 15:
                    model.addElement("Leafspot-Size: " + jComboBoxValor.get(i));
                    break;

                case 16:
                    model.addElement("Leafspots-Marg: " + jComboBoxValor.get(i));
                    break;

                case 17:
                    model.addElement("Leaves: " + jComboBoxValor.get(i));
                    break;

                case 18:
                    model.addElement("Lodging: " + jComboBoxValor.get(i));
                    break;

                case 19:
                    model.addElement("Mold-Growth: " + jComboBoxValor.get(i));
                    break;

                case 20:
                    model.addElement("Mycelium: " + jComboBoxValor.get(i));
                    break;

                case 21:
                    model.addElement("Plant-Growth: " + jComboBoxValor.get(i));
                    break;

                case 22:
                    model.addElement("Plant-Stand: " + jComboBoxValor.get(i));
                    break;

                case 23:
                    model.addElement("Precip: " + jComboBoxValor.get(i));
                    break;

                case 24:
                    model.addElement("Roots: " + jComboBoxValor.get(i));
                    break;

                case 25:
                    model.addElement("Sclerotia: " + jComboBoxValor.get(i));
                    break;

                case 26:
                    model.addElement("Seed: " + jComboBoxValor.get(i));
                    break;

                case 27:
                    model.addElement("Seed-Discolor: " + jComboBoxValor.get(i));
                    break;

                case 28:
                    model.addElement("Seed-Size: " + jComboBoxValor.get(i));
                    break;

                case 29:
                    model.addElement("Seed-Tmt: " + jComboBoxValor.get(i));
                    break;

                case 30:
                    model.addElement("Severity: " + jComboBoxValor.get(i));
                    break;

                case 31:
                    model.addElement("Shriveling: " + jComboBoxValor.get(i));
                    break;

                case 32:
                    model.addElement("Stem: " + jComboBoxValor.get(i));
                    break;

                case 33:
                    model.addElement("Stem-Cankers: " + jComboBoxValor.get(i));
                    break;

                case 34:
                    model.addElement("Temp: " + jComboBoxValor.get(i));
                    break;

            }
        }
        //jList_Valor.setModel(model);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Soja.png")));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cprob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cprob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cprob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cprob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ant;
    private javax.swing.JButton btn_prox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JScrollPane jScrollPane_Table;
    private javax.swing.JTable jTable_Principal;
    // End of variables declaration//GEN-END:variables
}
