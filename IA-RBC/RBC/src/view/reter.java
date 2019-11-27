package view;

import DAO.DAO;
import model.Csimil;
import entidade.Caso;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class reter extends javax.swing.JFrame {

    private final ArrayList<Object> combadoValor;
    private final ArrayList<Csimil> casoSimil;
    private final Caso casoProblema;

    public reter(ArrayList caso, ArrayList valor, Caso casoproblema) {
        initComponents();
        //setIcon();
        combadoValor = valor;
        casoSimil = caso;
        casoProblema = casoproblema;
        preencherList(valor);
        preencherListCaso(casoproblema);
        jTextField_Doenca.setText(casoProblema.getObjetivo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Principal = new javax.swing.JPanel();
        jScrollPane_CasoProblema = new javax.swing.JScrollPane();
        jList_CasoProblema = new javax.swing.JList<>();
        jScrollPane_CasoSelecionado = new javax.swing.JScrollPane();
        jList_CasoSelecionado = new javax.swing.JList<>();
        jLabel_CasoProblema = new javax.swing.JLabel();
        jLabel_CasoSelecionado = new javax.swing.JLabel();
        jTextField_Doenca = new javax.swing.JTextField();
        jLabel_Doenca = new javax.swing.JLabel();
        btn_ant = new javax.swing.JButton();
        btn_reter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane_CasoProblema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jList_CasoProblema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList_CasoProblema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList_CasoProblema.setVisibleRowCount(7);
        jScrollPane_CasoProblema.setViewportView(jList_CasoProblema);

        jScrollPane_CasoSelecionado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jList_CasoSelecionado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList_CasoSelecionado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList_CasoSelecionado.setVisibleRowCount(7);
        jScrollPane_CasoSelecionado.setViewportView(jList_CasoSelecionado);

        jLabel_CasoProblema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_CasoProblema.setText("Caso Problema:");

        jLabel_CasoSelecionado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_CasoSelecionado.setText("Caso Selecionado:");

        jTextField_Doenca.setEditable(false);
        jTextField_Doenca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Doenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DoencaActionPerformed(evt);
            }
        });

        jLabel_Doenca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Doenca.setText("Doença:");

        javax.swing.GroupLayout jPanel_PrincipalLayout = new javax.swing.GroupLayout(jPanel_Principal);
        jPanel_Principal.setLayout(jPanel_PrincipalLayout);
        jPanel_PrincipalLayout.setHorizontalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane_CasoProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel_CasoProblema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane_CasoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel_CasoSelecionado)
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Doenca)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        jPanel_PrincipalLayout.setVerticalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Doenca)
                    .addComponent(jTextField_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel_CasoSelecionado)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_CasoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel_CasoProblema)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_CasoProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

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

        btn_reter.setBackground(new java.awt.Color(255, 255, 255));
        btn_reter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reter.setText("Reter");
        btn_reter.setActionCommand("btn_reter");
        btn_reter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btn_ant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_reter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reter)
                    .addComponent(btn_ant))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_antActionPerformed
        cprob caso = new cprob(casoSimil, combadoValor);
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_antActionPerformed

    private void jTextField_DoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DoencaActionPerformed

    private void btn_reterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reterActionPerformed
        DAO<Caso> bd_caso = new DAO();
        Caso c = new Caso();
        c.setObjetivo(casoProblema.getObjetivo());
        c.setAreaDamaged(combadoValor.get(0).toString());
        c.setCankerLesion(combadoValor.get(1).toString());
        c.setCropHist(combadoValor.get(2).toString());
        c.setMes(combadoValor.get(3).toString());
        c.setExternalDecay(combadoValor.get(4).toString());
        c.setFruitSpots(combadoValor.get(5).toString());
        c.setFruitingBodies(combadoValor.get(6).toString());
        c.setFruitPods(combadoValor.get(7).toString());
        c.setGermination(combadoValor.get(8).toString());
        c.setHail(combadoValor.get(9).toString());
        c.setIntDiscolor(combadoValor.get(10).toString());
        c.setLeafMalf(combadoValor.get(11).toString());
        c.setLeafMild(combadoValor.get(12).toString());
        c.setLeafsportsShread(combadoValor.get(13).toString());
        c.setLeafspotsHalo(combadoValor.get(14).toString());
        c.setLeafspotsSize(combadoValor.get(15).toString());
        c.setLeafspotsMarg(combadoValor.get(16).toString());
        c.setLeaves(combadoValor.get(17).toString());
        c.setLodging(combadoValor.get(18).toString());
        c.setMoldGrowth(combadoValor.get(19).toString());
        c.setMycelium(combadoValor.get(20).toString());
        c.setPlantGrowth(combadoValor.get(21).toString());
        c.setPlantStand(combadoValor.get(22).toString());
        c.setPrecip(combadoValor.get(23).toString());
        c.setRoots(combadoValor.get(24).toString());
        c.setSclerotia(combadoValor.get(25).toString());
        c.setSeed(combadoValor.get(26).toString());
        c.setSeedDiscolor(combadoValor.get(27).toString());
        c.setSeedSize(combadoValor.get(28).toString());
        c.setSeedTmt(combadoValor.get(29).toString());
        c.setSeverity(combadoValor.get(30).toString());
        c.setShriveling(combadoValor.get(31).toString());
        c.setStem(combadoValor.get(32).toString());
        c.setStemCankers(combadoValor.get(33).toString());
        c.setTemperatura(combadoValor.get(34).toString());
        bd_caso.salvar(c);
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Doença salva com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        ncas novo = new ncas();
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_reterActionPerformed

    private void preencherListCaso(Caso c) {
        DefaultListModel model = new DefaultListModel();

        model.addElement("Area-Damaged: " + c.getAreaDamaged());

        model.addElement("Canker-Lesion: " + c.getCankerLesion());

        model.addElement("Crop-Hist: " + c.getCropHist());

        model.addElement("Date: " + c.getMes());

        model.addElement("External Decay: " + c.getExternalDecay());

        model.addElement("Fruit Spots: " + c.getFruitSpots());

        model.addElement("Fruiting-Bodies: " + c.getFruitingBodies());

        model.addElement("Fruit-Pods: " + c.getFruitPods());

        model.addElement("Germination: " + c.getGermination());

        model.addElement("Hail: " + c.getHail());

        model.addElement("Int-Discolor: " + c.getIntDiscolor());

        model.addElement("Leaf-Malf: " + c.getLeafMalf());

        model.addElement("Leaf-Mild: " + c.getLeafMild());

        model.addElement("Leaf-Shread: " + c.getLeafsportsShread());

        model.addElement("Leafspots-Halo: " + c.getLeafspotsHalo());

        model.addElement("Leafspot-Size: " + c.getLeafspotsSize());

        model.addElement("Leafspots-Marg: " + c.getLeafspotsMarg());

        model.addElement("Leaves: " + c.getLeaves());

        model.addElement("Lodging: " + c.getLodging());

        model.addElement("Mold-Growth: " + c.getMoldGrowth());

        model.addElement("Mycelium: " + c.getMycelium());

        model.addElement("Plant-Growth: " + c.getPlantGrowth());

        model.addElement("Plant-Stand: " + c.getPlantStand());

        model.addElement("Precip: " + c.getPrecip());

        model.addElement("Roots: " + c.getRoots());

        model.addElement("Sclerotia: " + c.getSclerotia());

        model.addElement("Seed: " + c.getSeed());

        model.addElement("Seed-Discolor: " + c.getSeedDiscolor());

        model.addElement("Seed-Size: " + c.getSeedSize());

        model.addElement("Seed-Tmt: " + c.getSeedTmt());

        model.addElement("Severity: " + c.getSeverity());

        model.addElement("Shriveling: " + c.getShriveling());

        model.addElement("Stem: " + c.getStem());

        model.addElement("Stem-Cankers: " + c.getStemCankers());

        model.addElement("Temp: " + c.getTemperatura());

        jList_CasoSelecionado.setModel(model);
    }

    private void preencherList(ArrayList jComboBoxValor) {
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
        jList_CasoProblema.setModel(model);
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
            java.util.logging.Logger.getLogger(reter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reter.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_reter;
    private javax.swing.JLabel jLabel_CasoProblema;
    private javax.swing.JLabel jLabel_CasoSelecionado;
    private javax.swing.JLabel jLabel_Doenca;
    private javax.swing.JList<String> jList_CasoProblema;
    private javax.swing.JList<String> jList_CasoSelecionado;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JScrollPane jScrollPane_CasoProblema;
    private javax.swing.JScrollPane jScrollPane_CasoSelecionado;
    private javax.swing.JTextField jTextField_Doenca;
    // End of variables declaration//GEN-END:variables
}
