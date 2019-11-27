package view;

import DAO.DAO;
import entidade.Valor;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class ncas extends javax.swing.JFrame {

    List<JComboBox> combosBoxes;

    public ncas() {
        initComponents();
        //setIcon();
        initComboBoxes();
        preencherJComboBox();
    }

    public ncas(ArrayList valor) {
        initComponents();
        initComboBoxes();
        preencherJComboBox();
        setJcomboBox(valor);
    }

    public void initComboBoxes() {
        combosBoxes = new ArrayList<>();
        combosBoxes.add(jComboBox_AreaDamaged);
        combosBoxes.add(jComboBox_CankerLesion);
        combosBoxes.add(jComboBox_CropHist);
        combosBoxes.add(jComboBox_Date);
        combosBoxes.add(jComboBox_ExternalDecay);
        combosBoxes.add(jComboBox_FruitSpots);
        combosBoxes.add(jComboBox_FruitingBodies);
        combosBoxes.add(jComboBox_FruitPods);
        combosBoxes.add(jComboBox_Germination);
        combosBoxes.add(jComboBox_Hail);
        combosBoxes.add(jComboBox_IntDiscolor);
        combosBoxes.add(jComboBox_LeafMalf);
        combosBoxes.add(jComboBox_LeafMild);
        combosBoxes.add(jComboBox_LeafShread);
        combosBoxes.add(jComboBox_LeafspotsHalo);
        combosBoxes.add(jComboBox_LeafspotSize);
        combosBoxes.add(jComboBox_LeafspotsMarg);
        combosBoxes.add(jComboBox_Leaves);
        combosBoxes.add(jComboBox_Lodging);
        combosBoxes.add(jComboBox_MoldGrowth);
        combosBoxes.add(jComboBox_Mycelium);
        combosBoxes.add(jComboBox_PlantGrowth);
        combosBoxes.add(jComboBox_PlantStand);
        combosBoxes.add(jComboBox_Precip);
        combosBoxes.add(jComboBox_Roots);
        combosBoxes.add(jComboBox_Sclerotia);
        combosBoxes.add(jComboBox_Seed);
        combosBoxes.add(jComboBox_SeedDiscolor);
        combosBoxes.add(jComboBox_SeedSize);
        combosBoxes.add(jComboBox_SeedTmt);
        combosBoxes.add(jComboBox_Severity);
        combosBoxes.add(jComboBox_Shriveling);
        combosBoxes.add(jComboBox_Stem);
        combosBoxes.add(jComboBox_StemCankers);
        combosBoxes.add(jComboBox_Temp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_Principal = new javax.swing.JTabbedPane();
        jPanel_Principal_1 = new javax.swing.JPanel();
        jLabel_AreaDamaged = new javax.swing.JLabel();
        jComboBox_AreaDamaged = new javax.swing.JComboBox<>();
        jLabel_CankerLesion = new javax.swing.JLabel();
        jComboBox_CankerLesion = new javax.swing.JComboBox<>();
        jLabel_CropHist = new javax.swing.JLabel();
        jComboBox_CropHist = new javax.swing.JComboBox<>();
        jLabel_Date = new javax.swing.JLabel();
        jComboBox_Date = new javax.swing.JComboBox<>();
        jLabel_ExternalDecay = new javax.swing.JLabel();
        jComboBox_ExternalDecay = new javax.swing.JComboBox<>();
        jLabel_FruitSpots = new javax.swing.JLabel();
        jComboBox_FruitSpots = new javax.swing.JComboBox<>();
        jLabel_FruitingBodies = new javax.swing.JLabel();
        jComboBox_FruitingBodies = new javax.swing.JComboBox<>();
        jComboBox_LeafMalf = new javax.swing.JComboBox<>();
        jLabel_LeafMild = new javax.swing.JLabel();
        jLabel_FruitPods = new javax.swing.JLabel();
        jComboBox_LeafMild = new javax.swing.JComboBox<>();
        jComboBox_FruitPods = new javax.swing.JComboBox<>();
        jLabel_LeafShread = new javax.swing.JLabel();
        jLabel_Germination = new javax.swing.JLabel();
        jComboBox_LeafShread = new javax.swing.JComboBox<>();
        jComboBox_Germination = new javax.swing.JComboBox<>();
        jLabel_Hail = new javax.swing.JLabel();
        jComboBox_Hail = new javax.swing.JComboBox<>();
        jLabel_IntDiscolor = new javax.swing.JLabel();
        jComboBox_IntDiscolor = new javax.swing.JComboBox<>();
        jLabel_LeafMalf = new javax.swing.JLabel();
        jComboBox_Leaves = new javax.swing.JComboBox<>();
        jComboBox_Mycelium = new javax.swing.JComboBox<>();
        jLabel_MoldGrowth = new javax.swing.JLabel();
        jLabel_LeafspotsMarg = new javax.swing.JLabel();
        jLabel_LeafspotSize = new javax.swing.JLabel();
        jComboBox_MoldGrowth = new javax.swing.JComboBox<>();
        jLabel_Mycelium = new javax.swing.JLabel();
        jLabel_Lodging = new javax.swing.JLabel();
        jComboBox_LeafspotsMarg = new javax.swing.JComboBox<>();
        jComboBox_LeafspotSize = new javax.swing.JComboBox<>();
        jLabel_LeafspotsHalo = new javax.swing.JLabel();
        jComboBox_LeafspotsHalo = new javax.swing.JComboBox<>();
        jLabel_Leaves = new javax.swing.JLabel();
        jComboBox_Lodging = new javax.swing.JComboBox<>();
        jPanel_Principal_4 = new javax.swing.JPanel();
        jLabel_PlantGrowth = new javax.swing.JLabel();
        jComboBox_PlantGrowth = new javax.swing.JComboBox<>();
        jLabel_PlantStand = new javax.swing.JLabel();
        jComboBox_PlantStand = new javax.swing.JComboBox<>();
        jLabel_Precip = new javax.swing.JLabel();
        jComboBox_Precip = new javax.swing.JComboBox<>();
        jLabel_Roots = new javax.swing.JLabel();
        jComboBox_Roots = new javax.swing.JComboBox<>();
        jLabel_Sclerotia = new javax.swing.JLabel();
        jComboBox_Sclerotia = new javax.swing.JComboBox<>();
        jLabel_Seed = new javax.swing.JLabel();
        jComboBox_Seed = new javax.swing.JComboBox<>();
        jLabel_SeedDiscolor = new javax.swing.JLabel();
        jComboBox_SeedDiscolor = new javax.swing.JComboBox<>();
        jComboBox_Temp = new javax.swing.JComboBox<>();
        jLabel_Temp = new javax.swing.JLabel();
        jLabel_StemCankers = new javax.swing.JLabel();
        jComboBox_StemCankers = new javax.swing.JComboBox<>();
        jComboBox_Stem = new javax.swing.JComboBox<>();
        jLabel_Stem = new javax.swing.JLabel();
        jLabel_Shriveling = new javax.swing.JLabel();
        jComboBox_Shriveling = new javax.swing.JComboBox<>();
        jComboBox_Severity = new javax.swing.JComboBox<>();
        jLabel_Severity = new javax.swing.JLabel();
        jLabel_SeedTmt = new javax.swing.JLabel();
        jComboBox_SeedTmt = new javax.swing.JComboBox<>();
        jComboBox_SeedSize = new javax.swing.JComboBox<>();
        jLabel_SeedSize = new javax.swing.JLabel();
        btn_prox = new javax.swing.JButton();
        btn_prox1 = new javax.swing.JButton();
        btn_prox2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setResizable(false);

        jTabbedPane_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel_Principal_1.setToolTipText("");
        jPanel_Principal_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Principal_1.setPreferredSize(new java.awt.Dimension(300, 370));

        jLabel_AreaDamaged.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_AreaDamaged.setText("Area-Damaged:");
        jLabel_AreaDamaged.setToolTipText("");

        jComboBox_AreaDamaged.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_AreaDamaged.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox_AreaDamaged.setPreferredSize(new java.awt.Dimension(238, 28));
        jComboBox_AreaDamaged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AreaDamagedActionPerformed(evt);
            }
        });

        jLabel_CankerLesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_CankerLesion.setText("Canker-Lesion:");
        jLabel_CankerLesion.setToolTipText("");

        jComboBox_CankerLesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_CankerLesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox_CankerLesion.setPreferredSize(new java.awt.Dimension(238, 28));

        jLabel_CropHist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_CropHist.setText("Crop-Hist:");
        jLabel_CropHist.setToolTipText("");

        jComboBox_CropHist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_CropHist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Date.setText("Date:");
        jLabel_Date.setToolTipText("");

        jComboBox_Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Date.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DateActionPerformed(evt);
            }
        });

        jLabel_ExternalDecay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_ExternalDecay.setText("External Decay:");
        jLabel_ExternalDecay.setToolTipText("");

        jComboBox_ExternalDecay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_ExternalDecay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_FruitSpots.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_FruitSpots.setText("Fruit Spots:");
        jLabel_FruitSpots.setToolTipText("");

        jComboBox_FruitSpots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_FruitSpots.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_FruitingBodies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_FruitingBodies.setText("Fruiting-Bodies:");
        jLabel_FruitingBodies.setToolTipText("");

        jComboBox_FruitingBodies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_FruitingBodies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_LeafMalf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafMalf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_LeafMild.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafMild.setText("Leaf-Mild:");
        jLabel_LeafMild.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_FruitPods.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_FruitPods.setText("Fruit-Pods:");
        jLabel_FruitPods.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_LeafMild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafMild.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_FruitPods.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_FruitPods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_LeafShread.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafShread.setText("Leaf-Shread:");
        jLabel_LeafShread.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_Germination.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Germination.setText("Germination:");
        jLabel_Germination.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_LeafShread.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafShread.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_Germination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Germination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Hail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Hail.setText("Hail:");
        jLabel_Hail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_Hail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Hail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_IntDiscolor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_IntDiscolor.setText("Int-Discolor:");
        jLabel_IntDiscolor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_IntDiscolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_IntDiscolor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_LeafMalf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafMalf.setText("Leaf-Malf:");
        jLabel_LeafMalf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox_Leaves.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Leaves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_Mycelium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Mycelium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_MoldGrowth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_MoldGrowth.setText("Mold-Growth:");

        jLabel_LeafspotsMarg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafspotsMarg.setText("Leafspots-Marg:");

        jLabel_LeafspotSize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafspotSize.setText("Leafspot-Size:");

        jComboBox_MoldGrowth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_MoldGrowth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Mycelium.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Mycelium.setText("Mycelium:");

        jLabel_Lodging.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Lodging.setText("Lodging:");

        jComboBox_LeafspotsMarg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafspotsMarg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_LeafspotSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafspotSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_LeafspotsHalo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_LeafspotsHalo.setText("Leafspots-Halo:");

        jComboBox_LeafspotsHalo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_LeafspotsHalo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Leaves.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Leaves.setText("Leaves:");

        jComboBox_Lodging.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Lodging.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_Principal_1Layout = new javax.swing.GroupLayout(jPanel_Principal_1);
        jPanel_Principal_1.setLayout(jPanel_Principal_1Layout);
        jPanel_Principal_1Layout.setHorizontalGroup(
            jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Principal_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CropHist, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_CankerLesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Date, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_ExternalDecay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_FruitSpots, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_FruitingBodies, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_AreaDamaged, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_FruitSpots, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_ExternalDecay, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Date, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_CropHist, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_CankerLesion, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jComboBox_AreaDamaged, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                    .addComponent(jComboBox_FruitingBodies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_LeafShread)
                    .addComponent(jLabel_LeafMild)
                    .addComponent(jLabel_LeafMalf)
                    .addComponent(jLabel_IntDiscolor)
                    .addComponent(jLabel_Hail)
                    .addComponent(jLabel_Germination)
                    .addComponent(jLabel_FruitPods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_Germination, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Hail, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_IntDiscolor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafMalf, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafMild, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafShread, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_FruitPods, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Mycelium)
                    .addComponent(jLabel_MoldGrowth)
                    .addComponent(jLabel_Lodging)
                    .addComponent(jLabel_Leaves)
                    .addComponent(jLabel_LeafspotsMarg)
                    .addComponent(jLabel_LeafspotSize)
                    .addComponent(jLabel_LeafspotsHalo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_MoldGrowth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Lodging, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Leaves, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafspotsMarg, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafspotSize, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_LeafspotsHalo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Mycelium, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_Principal_1Layout.setVerticalGroup(
            jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Principal_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Principal_1Layout.createSequentialGroup()
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_FruitPods, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_FruitPods))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Germination)
                            .addComponent(jComboBox_Germination, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Hail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Hail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_IntDiscolor)
                            .addComponent(jComboBox_IntDiscolor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LeafMalf)
                            .addComponent(jComboBox_LeafMalf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LeafMild)
                            .addComponent(jComboBox_LeafMild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_LeafShread, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_LeafShread)))
                    .addGroup(jPanel_Principal_1Layout.createSequentialGroup()
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_AreaDamaged)
                            .addComponent(jComboBox_AreaDamaged, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_CankerLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CankerLesion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_CropHist)
                            .addComponent(jComboBox_CropHist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Date))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ExternalDecay)
                            .addComponent(jComboBox_ExternalDecay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_FruitSpots)
                            .addComponent(jComboBox_FruitSpots, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_FruitingBodies)
                            .addComponent(jComboBox_FruitingBodies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_Principal_1Layout.createSequentialGroup()
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_LeafspotsHalo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_LeafspotsHalo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LeafspotSize)
                            .addComponent(jComboBox_LeafspotSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LeafspotsMarg)
                            .addComponent(jComboBox_LeafspotsMarg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Leaves)
                            .addComponent(jComboBox_Leaves, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Lodging)
                            .addComponent(jComboBox_Lodging, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MoldGrowth)
                            .addComponent(jComboBox_MoldGrowth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Mycelium)
                            .addComponent(jComboBox_Mycelium, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane_Principal.addTab("Página 1", jPanel_Principal_1);

        jPanel_Principal_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_PlantGrowth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_PlantGrowth.setText("Plant-Growth:");

        jComboBox_PlantGrowth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_PlantGrowth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_PlantStand.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_PlantStand.setText("Plant-Stand:");

        jComboBox_PlantStand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_PlantStand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Precip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Precip.setText("Precip:");

        jComboBox_Precip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Precip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Roots.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Roots.setText("Roots:");

        jComboBox_Roots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Roots.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Sclerotia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Sclerotia.setText("Sclerotia:");

        jComboBox_Sclerotia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Sclerotia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Seed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Seed.setText("Seed:");

        jComboBox_Seed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Seed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_SeedDiscolor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_SeedDiscolor.setText("Seed-Discolor:");

        jComboBox_SeedDiscolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_SeedDiscolor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_Temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Temp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Temp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Temp.setText("Temp:");

        jLabel_StemCankers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_StemCankers.setText("Stem-Cankers:");

        jComboBox_StemCankers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_StemCankers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_Stem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Stem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Stem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Stem.setText("Stem:");

        jLabel_Shriveling.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Shriveling.setText("Shriveling:");

        jComboBox_Shriveling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Shriveling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_Severity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_Severity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_Severity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Severity.setText("Severity:");

        jLabel_SeedTmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_SeedTmt.setText("Seed-Tmt:");

        jComboBox_SeedTmt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_SeedTmt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox_SeedSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBox_SeedSize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_SeedSize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_SeedSize.setText("Seed-Size:");

        javax.swing.GroupLayout jPanel_Principal_4Layout = new javax.swing.GroupLayout(jPanel_Principal_4);
        jPanel_Principal_4.setLayout(jPanel_Principal_4Layout);
        jPanel_Principal_4Layout.setHorizontalGroup(
            jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Principal_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_SeedDiscolor)
                    .addComponent(jLabel_Seed)
                    .addComponent(jLabel_Sclerotia)
                    .addComponent(jLabel_Roots)
                    .addComponent(jLabel_Precip)
                    .addComponent(jLabel_PlantStand)
                    .addComponent(jLabel_PlantGrowth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_Seed, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Sclerotia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Roots, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Precip, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_PlantStand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_PlantGrowth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_SeedDiscolor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_SeedTmt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_SeedSize, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Severity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Shriveling, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Stem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_StemCankers, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Temp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox_StemCankers, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Stem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Shriveling, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Severity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_SeedTmt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_SeedSize, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Temp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel_Principal_4Layout.setVerticalGroup(
            jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Principal_4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Principal_4Layout.createSequentialGroup()
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_SeedSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_SeedSize))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_SeedTmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_SeedTmt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Severity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Severity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Shriveling, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Shriveling))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Stem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Stem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_StemCankers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_StemCankers))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Temp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Temp)))
                    .addGroup(jPanel_Principal_4Layout.createSequentialGroup()
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_PlantGrowth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PlantGrowth))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_PlantStand)
                            .addComponent(jComboBox_PlantStand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Precip)
                            .addComponent(jComboBox_Precip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Roots)
                            .addComponent(jComboBox_Roots, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Sclerotia)
                            .addComponent(jComboBox_Sclerotia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Seed)
                            .addComponent(jComboBox_Seed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_Principal_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_SeedDiscolor)
                            .addComponent(jComboBox_SeedDiscolor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jTabbedPane_Principal.addTab("Página 2", jPanel_Principal_4);

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

        btn_prox1.setBackground(new java.awt.Color(255, 255, 255));
        btn_prox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_prox1.setText("Random");
        btn_prox1.setActionCommand("btn_prox");
        btn_prox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prox1ActionPerformed(evt);
            }
        });

        btn_prox2.setBackground(new java.awt.Color(255, 255, 255));
        btn_prox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_prox2.setText("Caso31");
        btn_prox2.setActionCommand("btn_prox");
        btn_prox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btn_prox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_prox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_prox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prox)
                    .addComponent(btn_prox1)
                    .addComponent(btn_prox2)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_proxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proxActionPerformed

        if (verificarJComboBox_Pag_Um()) {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Preencha todos os itens!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (verificarJComboBox_Pag_Dois()) {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Preencha todos os itens!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (verificarJComboBox_Pag_Tres()) {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Preencha todos os itens!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (verificarJComboBox_Pag_Quatro()) {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Preencha todos os itens!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (verificarJComboBox_Pag_Cinco()) {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Preencha todos os itens!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cprob t_caso = new cprob(getJComboBox());
            t_caso.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_proxActionPerformed

    private void jComboBox_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DateActionPerformed

    private void jComboBox_AreaDamagedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AreaDamagedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AreaDamagedActionPerformed

    private void btn_prox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prox1ActionPerformed
        Random r = new Random();
        for (JComboBox cb : combosBoxes) {
            float val = (float) cb.getItemCount() - 2;
            int index = Math.round(val * r.nextFloat()) + 1;
            cb.setSelectedIndex(index);
        }

    }//GEN-LAST:event_btn_prox1ActionPerformed

    private void btn_prox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prox2ActionPerformed
        jComboBox_AreaDamaged.setSelectedIndex(3);
        jComboBox_CankerLesion.setSelectedIndex(4);
        jComboBox_CropHist.setSelectedIndex(3);
        jComboBox_Date.setSelectedIndex(2);
        jComboBox_ExternalDecay.setSelectedIndex(3);
        jComboBox_FruitSpots.setSelectedIndex(6);
        jComboBox_FruitingBodies.setSelectedIndex(2);
        jComboBox_FruitPods.setSelectedIndex(5);
        jComboBox_Germination.setSelectedIndex(2);
        jComboBox_Hail.setSelectedIndex(3);
        jComboBox_IntDiscolor.setSelectedIndex(2);
        jComboBox_LeafMalf.setSelectedIndex(2);
        jComboBox_LeafMild.setSelectedIndex(2);
        jComboBox_LeafShread.setSelectedIndex(2);
        jComboBox_LeafspotsHalo.setSelectedIndex(2);
        jComboBox_LeafspotSize.setSelectedIndex(4);//4
        jComboBox_LeafspotsMarg.setSelectedIndex(4);
        jComboBox_Leaves.setSelectedIndex(2);
        jComboBox_Lodging.setSelectedIndex(2);
        jComboBox_MoldGrowth.setSelectedIndex(2);
        jComboBox_Mycelium.setSelectedIndex(2);
        jComboBox_PlantStand.setSelectedIndex(3);
        jComboBox_PlantGrowth.setSelectedIndex(3);//
        jComboBox_Precip.setSelectedIndex(4);//4
        jComboBox_Roots.setSelectedIndex(2);
        jComboBox_Sclerotia.setSelectedIndex(2);
        jComboBox_Seed.setSelectedIndex(2);
        jComboBox_SeedDiscolor.setSelectedIndex(2);
        jComboBox_SeedSize.setSelectedIndex(2);
        jComboBox_SeedTmt.setSelectedIndex(2);
        jComboBox_Severity.setSelectedIndex(3);
        jComboBox_Shriveling.setSelectedIndex(2);
        jComboBox_Stem.setSelectedIndex(3);
        jComboBox_StemCankers.setSelectedIndex(3);
        jComboBox_Temp.setSelectedIndex(3);

    }//GEN-LAST:event_btn_prox2ActionPerformed

    private ArrayList getJComboBox() {
        ArrayList<Object> retorna = new ArrayList<>();
        retorna.add(jComboBox_AreaDamaged.getSelectedItem());
        retorna.add(jComboBox_CankerLesion.getSelectedItem());
        retorna.add(jComboBox_CropHist.getSelectedItem());
        retorna.add(jComboBox_Date.getSelectedItem());
        retorna.add(jComboBox_ExternalDecay.getSelectedItem());
        retorna.add(jComboBox_FruitSpots.getSelectedItem());
        retorna.add(jComboBox_FruitingBodies.getSelectedItem());
        retorna.add(jComboBox_FruitPods.getSelectedItem());
        retorna.add(jComboBox_Germination.getSelectedItem());
        retorna.add(jComboBox_Hail.getSelectedItem());
        retorna.add(jComboBox_IntDiscolor.getSelectedItem());
        retorna.add(jComboBox_LeafMalf.getSelectedItem());
        retorna.add(jComboBox_LeafMild.getSelectedItem());
        retorna.add(jComboBox_LeafShread.getSelectedItem());
        retorna.add(jComboBox_LeafspotsHalo.getSelectedItem());
        retorna.add(jComboBox_LeafspotSize.getSelectedItem());
        retorna.add(jComboBox_LeafspotsMarg.getSelectedItem());
        retorna.add(jComboBox_Leaves.getSelectedItem());
        retorna.add(jComboBox_Lodging.getSelectedItem());
        retorna.add(jComboBox_MoldGrowth.getSelectedItem());
        retorna.add(jComboBox_Mycelium.getSelectedItem());
        retorna.add(jComboBox_PlantGrowth.getSelectedItem());
        retorna.add(jComboBox_PlantStand.getSelectedItem());
        retorna.add(jComboBox_Precip.getSelectedItem());
        retorna.add(jComboBox_Roots.getSelectedItem());
        retorna.add(jComboBox_Sclerotia.getSelectedItem());
        retorna.add(jComboBox_Seed.getSelectedItem());
        retorna.add(jComboBox_SeedDiscolor.getSelectedItem());
        retorna.add(jComboBox_SeedSize.getSelectedItem());
        retorna.add(jComboBox_SeedTmt.getSelectedItem());
        retorna.add(jComboBox_Severity.getSelectedItem());
        retorna.add(jComboBox_Shriveling.getSelectedItem());
        retorna.add(jComboBox_Stem.getSelectedItem());
        retorna.add(jComboBox_StemCankers.getSelectedItem());
        retorna.add(jComboBox_Temp.getSelectedItem());
        return retorna;
    }

    private boolean verificarJComboBox_Pag_Um() {
        if (jComboBox_AreaDamaged.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_CankerLesion.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_CropHist.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Date.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_ExternalDecay.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_FruitSpots.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_FruitingBodies.getSelectedIndex() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarJComboBox_Pag_Dois() {
        if (jComboBox_FruitPods.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Germination.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Hail.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_IntDiscolor.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_LeafMalf.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_LeafMild.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_LeafShread.getSelectedIndex() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarJComboBox_Pag_Tres() {
        if (jComboBox_LeafspotsHalo.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_LeafspotSize.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_LeafspotsMarg.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Leaves.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Lodging.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_MoldGrowth.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Mycelium.getSelectedIndex() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarJComboBox_Pag_Quatro() {
        if (jComboBox_PlantGrowth.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_PlantStand.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Precip.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Roots.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Sclerotia.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Seed.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_SeedDiscolor.getSelectedIndex() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarJComboBox_Pag_Cinco() {
        if (jComboBox_SeedSize.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_SeedTmt.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Severity.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Shriveling.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Stem.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_StemCankers.getSelectedIndex() == 0) {
            return true;
        } else if (jComboBox_Temp.getSelectedIndex() == 0) {
            return true;
        } else {
            return false;
        }

    }

    private void setJcomboBox(ArrayList valor) {
        for (int i = 0; i < valor.size(); i++) {
            switch (i + 1) {
                case 1:
                    jComboBox_AreaDamaged.setSelectedItem(valor.get(i));
                    jComboBox_AreaDamaged.updateUI();
                    break;

                case 2:
                    jComboBox_CankerLesion.setSelectedItem(valor.get(i));
                    jComboBox_AreaDamaged.updateUI();
                    break;

                case 3:
                    jComboBox_CropHist.setSelectedItem(valor.get(i));
                    jComboBox_CropHist.updateUI();
                    break;

                case 4:
                    jComboBox_Date.setSelectedItem(valor.get(i));
                    jComboBox_Date.updateUI();
                    break;

                case 5:
                    jComboBox_ExternalDecay.setSelectedItem(valor.get(i));
                    jComboBox_ExternalDecay.updateUI();
                    break;

                case 6:
                    jComboBox_FruitSpots.setSelectedItem(valor.get(i));
                    jComboBox_FruitSpots.updateUI();
                    break;

                case 7:
                    jComboBox_FruitingBodies.setSelectedItem(valor.get(i));
                    jComboBox_FruitingBodies.updateUI();
                    break;

                case 8:
                    jComboBox_FruitPods.setSelectedItem(valor.get(i));
                    jComboBox_FruitPods.updateUI();
                    break;

                case 9:
                    jComboBox_Germination.setSelectedItem(valor.get(i));
                    jComboBox_Germination.updateUI();
                    break;

                case 10:
                    jComboBox_Hail.setSelectedItem(valor.get(i));
                    jComboBox_Hail.updateUI();
                    break;

                case 11:
                    jComboBox_IntDiscolor.setSelectedItem(valor.get(i));
                    jComboBox_IntDiscolor.updateUI();
                    break;

                case 12:
                    jComboBox_LeafMalf.setSelectedItem(valor.get(i));
                    jComboBox_LeafMalf.updateUI();
                    break;

                case 13:
                    jComboBox_LeafMild.setSelectedItem(valor.get(i));
                    jComboBox_LeafMild.updateUI();
                    break;

                case 14:
                    jComboBox_LeafShread.setSelectedItem(valor.get(i));
                    jComboBox_LeafShread.updateUI();
                    break;

                case 15:
                    jComboBox_LeafspotsHalo.setSelectedItem(valor.get(i));
                    jComboBox_LeafspotsHalo.updateUI();
                    break;

                case 16:
                    jComboBox_LeafspotSize.setSelectedItem(valor.get(i));
                    jComboBox_LeafspotSize.updateUI();
                    break;

                case 17:
                    jComboBox_LeafspotsMarg.setSelectedItem(valor.get(i));
                    jComboBox_LeafspotsMarg.updateUI();
                    break;

                case 18:
                    jComboBox_Leaves.setSelectedItem(valor.get(i));
                    jComboBox_Leaves.updateUI();
                    break;

                case 19:
                    jComboBox_Lodging.setSelectedItem(valor.get(i));
                    jComboBox_Lodging.updateUI();
                    break;

                case 20:
                    jComboBox_MoldGrowth.setSelectedItem(valor.get(i));
                    jComboBox_MoldGrowth.updateUI();
                    break;

                case 21:
                    jComboBox_Mycelium.setSelectedItem(valor.get(i));
                    jComboBox_Mycelium.updateUI();
                    break;

                case 22:
                    jComboBox_PlantGrowth.setSelectedItem(valor.get(i));
                    jComboBox_PlantGrowth.updateUI();
                    break;

                case 23:
                    jComboBox_PlantStand.setSelectedItem(valor.get(i));
                    jComboBox_PlantStand.updateUI();
                    break;

                case 24:
                    jComboBox_Precip.setSelectedItem(valor.get(i));
                    jComboBox_Precip.updateUI();
                    break;

                case 25:
                    jComboBox_Roots.setSelectedItem(valor.get(i));
                    jComboBox_Roots.updateUI();
                    break;

                case 26:
                    jComboBox_Sclerotia.setSelectedItem(valor.get(i));
                    jComboBox_Sclerotia.updateUI();
                    break;

                case 27:
                    jComboBox_Seed.setSelectedItem(valor.get(i));
                    jComboBox_Seed.updateUI();
                    break;

                case 28:
                    jComboBox_SeedDiscolor.setSelectedItem(valor.get(i));
                    jComboBox_SeedDiscolor.updateUI();
                    break;

                case 29:
                    jComboBox_SeedSize.setSelectedItem(valor.get(i));
                    jComboBox_SeedSize.updateUI();
                    break;

                case 30:
                    jComboBox_SeedTmt.setSelectedItem(valor.get(i));
                    jComboBox_SeedTmt.updateUI();
                    break;

                case 31:
                    jComboBox_Severity.setSelectedItem(valor.get(i));
                    jComboBox_Severity.updateUI();
                    break;

                case 32:
                    jComboBox_Shriveling.setSelectedItem(valor.get(i));
                    jComboBox_Shriveling.updateUI();
                    break;

                case 33:
                    jComboBox_Stem.setSelectedItem(valor.get(i));
                    jComboBox_Stem.updateUI();
                    break;

                case 34:
                    jComboBox_StemCankers.setSelectedItem(valor.get(i));
                    jComboBox_StemCankers.updateUI();
                    break;

                case 35:
                    jComboBox_Temp.setSelectedItem(valor.get(i));
                    jComboBox_Temp.updateUI();
                    break;
            }

        }
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
            java.util.logging.Logger.getLogger(ncas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ncas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ncas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ncas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ncas().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Soja.png")));
    }

    private void preencherJComboBox() {
        DAO<Valor> bd_valor = new DAO();
        for (Valor v : bd_valor.pegarTodos("Valor.findAll")) {
            if (v.getAtributo().equals("area-damaged")) {
                jComboBox_AreaDamaged.addItem(v.getValorNome());
                jComboBox_AreaDamaged.updateUI();
            } else if (v.getAtributo().equals("canker-lesion")) {
                jComboBox_CankerLesion.addItem(v.getValorNome());
                jComboBox_AreaDamaged.updateUI();
            } else if (v.getAtributo().equals("crop-hist")) {
                jComboBox_CropHist.addItem(v.getValorNome());
                jComboBox_CropHist.updateUI();
            } else if (v.getAtributo().equals("date")) {
                jComboBox_Date.addItem(v.getValorNome());
                jComboBox_Date.updateUI();
            } else if (v.getAtributo().equals("external decay")) {
                jComboBox_ExternalDecay.addItem(v.getValorNome());
                jComboBox_ExternalDecay.updateUI();
            } else if (v.getAtributo().equals("fruit spots")) {
                jComboBox_FruitSpots.addItem(v.getValorNome());
                jComboBox_FruitSpots.updateUI();
            } else if (v.getAtributo().equals("fruiting-bodies")) {
                jComboBox_FruitingBodies.addItem(v.getValorNome());
                jComboBox_FruitingBodies.updateUI();
            } else if (v.getAtributo().equals("fruit-pods")) {
                jComboBox_FruitPods.addItem(v.getValorNome());
                jComboBox_FruitPods.updateUI();
            } else if (v.getAtributo().equals("germination")) {
                jComboBox_Germination.addItem(v.getValorNome());
                jComboBox_Germination.updateUI();
            } else if (v.getAtributo().equals("hail")) {
                jComboBox_Hail.addItem(v.getValorNome());
                jComboBox_Hail.updateUI();
            } else if (v.getAtributo().equals("int-discolor")) {
                jComboBox_IntDiscolor.addItem(v.getValorNome());
                jComboBox_IntDiscolor.updateUI();
            } else if (v.getAtributo().equals("leaf-malf")) {
                jComboBox_LeafMalf.addItem(v.getValorNome());
                jComboBox_LeafMalf.updateUI();
            } else if (v.getAtributo().equals("leaf-mild")) {
                jComboBox_LeafMild.addItem(v.getValorNome());
                jComboBox_LeafMild.updateUI();
            } else if (v.getAtributo().equals("leaf-shread")) {
                jComboBox_LeafShread.addItem(v.getValorNome());
                jComboBox_LeafShread.updateUI();
            } else if (v.getAtributo().equals("leafspots-halo")) {
                jComboBox_LeafspotsHalo.addItem(v.getValorNome());
                jComboBox_LeafspotsHalo.updateUI();
            } else if (v.getAtributo().equals("leafspot-size")) {
                jComboBox_LeafspotSize.addItem(v.getValorNome());
                jComboBox_LeafspotSize.updateUI();
            } else if (v.getAtributo().equals("leafspots-marg")) {
                jComboBox_LeafspotsMarg.addItem(v.getValorNome());
                jComboBox_LeafspotsMarg.updateUI();
            } else if (v.getAtributo().equals("leaves")) {
                jComboBox_Leaves.addItem(v.getValorNome());
                jComboBox_Leaves.updateUI();
            } else if (v.getAtributo().equals("lodging")) {
                jComboBox_Lodging.addItem(v.getValorNome());
                jComboBox_Lodging.updateUI();
            } else if (v.getAtributo().equals("mold-growth")) {
                jComboBox_MoldGrowth.addItem(v.getValorNome());
                jComboBox_MoldGrowth.updateUI();
            } else if (v.getAtributo().equals("mycelium")) {
                jComboBox_Mycelium.addItem(v.getValorNome());
                jComboBox_Mycelium.updateUI();
            } else if (v.getAtributo().equals("plant-growth")) {
                jComboBox_PlantGrowth.addItem(v.getValorNome());
                jComboBox_PlantGrowth.updateUI();
            } else if (v.getAtributo().equals("plant-stand")) {
                jComboBox_PlantStand.addItem(v.getValorNome());
                jComboBox_PlantStand.updateUI();
            } else if (v.getAtributo().equals("precip")) {
                jComboBox_Precip.addItem(v.getValorNome());
                jComboBox_Precip.updateUI();
            } else if (v.getAtributo().equals("roots")) {
                jComboBox_Roots.addItem(v.getValorNome());
                jComboBox_Roots.updateUI();
            } else if (v.getAtributo().equals("sclerotia")) {
                jComboBox_Sclerotia.addItem(v.getValorNome());
                jComboBox_Sclerotia.updateUI();
            } else if (v.getAtributo().equals("seed")) {
                jComboBox_Seed.addItem(v.getValorNome());
                jComboBox_Seed.updateUI();
            } else if (v.getAtributo().equals("seed-discolor")) {
                jComboBox_SeedDiscolor.addItem(v.getValorNome());
                jComboBox_SeedDiscolor.updateUI();
            } else if (v.getAtributo().equals("seed-size")) {
                jComboBox_SeedSize.addItem(v.getValorNome());
                jComboBox_SeedSize.updateUI();
            } else if (v.getAtributo().equals("seed-tmt")) {
                jComboBox_SeedTmt.addItem(v.getValorNome());
                jComboBox_SeedTmt.updateUI();
            } else if (v.getAtributo().equals("severity")) {
                jComboBox_Severity.addItem(v.getValorNome());
                jComboBox_Severity.updateUI();
            } else if (v.getAtributo().equals("shriveling")) {
                jComboBox_Shriveling.addItem(v.getValorNome());
                jComboBox_Shriveling.updateUI();
            } else if (v.getAtributo().equals("stem")) {
                jComboBox_Stem.addItem(v.getValorNome());
                jComboBox_Stem.updateUI();
            } else if (v.getAtributo().equals("stem-cankers")) {
                jComboBox_StemCankers.addItem(v.getValorNome());
                jComboBox_StemCankers.updateUI();
            } else if (v.getAtributo().equals("temp")) {
                jComboBox_Temp.addItem(v.getValorNome());
                jComboBox_Temp.updateUI();
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_prox;
    private javax.swing.JButton btn_prox1;
    private javax.swing.JButton btn_prox2;
    private javax.swing.JComboBox<String> jComboBox_AreaDamaged;
    private javax.swing.JComboBox<String> jComboBox_CankerLesion;
    private javax.swing.JComboBox<String> jComboBox_CropHist;
    private javax.swing.JComboBox<String> jComboBox_Date;
    private javax.swing.JComboBox<String> jComboBox_ExternalDecay;
    private javax.swing.JComboBox<String> jComboBox_FruitPods;
    private javax.swing.JComboBox<String> jComboBox_FruitSpots;
    private javax.swing.JComboBox<String> jComboBox_FruitingBodies;
    private javax.swing.JComboBox<String> jComboBox_Germination;
    private javax.swing.JComboBox<String> jComboBox_Hail;
    private javax.swing.JComboBox<String> jComboBox_IntDiscolor;
    private javax.swing.JComboBox<String> jComboBox_LeafMalf;
    private javax.swing.JComboBox<String> jComboBox_LeafMild;
    private javax.swing.JComboBox<String> jComboBox_LeafShread;
    private javax.swing.JComboBox<String> jComboBox_LeafspotSize;
    private javax.swing.JComboBox<String> jComboBox_LeafspotsHalo;
    private javax.swing.JComboBox<String> jComboBox_LeafspotsMarg;
    private javax.swing.JComboBox<String> jComboBox_Leaves;
    private javax.swing.JComboBox<String> jComboBox_Lodging;
    private javax.swing.JComboBox<String> jComboBox_MoldGrowth;
    private javax.swing.JComboBox<String> jComboBox_Mycelium;
    private javax.swing.JComboBox<String> jComboBox_PlantGrowth;
    private javax.swing.JComboBox<String> jComboBox_PlantStand;
    private javax.swing.JComboBox<String> jComboBox_Precip;
    private javax.swing.JComboBox<String> jComboBox_Roots;
    private javax.swing.JComboBox<String> jComboBox_Sclerotia;
    private javax.swing.JComboBox<String> jComboBox_Seed;
    private javax.swing.JComboBox<String> jComboBox_SeedDiscolor;
    private javax.swing.JComboBox<String> jComboBox_SeedSize;
    private javax.swing.JComboBox<String> jComboBox_SeedTmt;
    private javax.swing.JComboBox<String> jComboBox_Severity;
    private javax.swing.JComboBox<String> jComboBox_Shriveling;
    private javax.swing.JComboBox<String> jComboBox_Stem;
    private javax.swing.JComboBox<String> jComboBox_StemCankers;
    private javax.swing.JComboBox<String> jComboBox_Temp;
    private javax.swing.JLabel jLabel_AreaDamaged;
    private javax.swing.JLabel jLabel_CankerLesion;
    private javax.swing.JLabel jLabel_CropHist;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_ExternalDecay;
    private javax.swing.JLabel jLabel_FruitPods;
    private javax.swing.JLabel jLabel_FruitSpots;
    private javax.swing.JLabel jLabel_FruitingBodies;
    private javax.swing.JLabel jLabel_Germination;
    private javax.swing.JLabel jLabel_Hail;
    private javax.swing.JLabel jLabel_IntDiscolor;
    private javax.swing.JLabel jLabel_LeafMalf;
    private javax.swing.JLabel jLabel_LeafMild;
    private javax.swing.JLabel jLabel_LeafShread;
    private javax.swing.JLabel jLabel_LeafspotSize;
    private javax.swing.JLabel jLabel_LeafspotsHalo;
    private javax.swing.JLabel jLabel_LeafspotsMarg;
    private javax.swing.JLabel jLabel_Leaves;
    private javax.swing.JLabel jLabel_Lodging;
    private javax.swing.JLabel jLabel_MoldGrowth;
    private javax.swing.JLabel jLabel_Mycelium;
    private javax.swing.JLabel jLabel_PlantGrowth;
    private javax.swing.JLabel jLabel_PlantStand;
    private javax.swing.JLabel jLabel_Precip;
    private javax.swing.JLabel jLabel_Roots;
    private javax.swing.JLabel jLabel_Sclerotia;
    private javax.swing.JLabel jLabel_Seed;
    private javax.swing.JLabel jLabel_SeedDiscolor;
    private javax.swing.JLabel jLabel_SeedSize;
    private javax.swing.JLabel jLabel_SeedTmt;
    private javax.swing.JLabel jLabel_Severity;
    private javax.swing.JLabel jLabel_Shriveling;
    private javax.swing.JLabel jLabel_Stem;
    private javax.swing.JLabel jLabel_StemCankers;
    private javax.swing.JLabel jLabel_Temp;
    private javax.swing.JPanel jPanel_Principal_1;
    private javax.swing.JPanel jPanel_Principal_4;
    private javax.swing.JTabbedPane jTabbedPane_Principal;
    // End of variables declaration//GEN-END:variables

}
