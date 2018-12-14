/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ControladorCampo;
import Entidades.Campo;
import Entidades.Lote;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mercedes
 */
public class RegistrarCampo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCampo
     */
    private Campo unCampo;
    private ControladorCampo controladorCampo;

    public RegistrarCampo() {
        unCampo = new Campo();
        controladorCampo = new ControladorCampo();
        
        initComponents();
       ImageIcon img = new ImageIcon(this.getClass().getResource("/images/tractor_rojo1.png"));
       this.setIconImage(img.getImage());
        jLabel_superficie.setVisible(false);
        
       
    }

    private void mostrarLotes() {
        Lote unLote;
        ((DefaultTableModel) this.tablaLotes.getModel()).setRowCount(0);
        Iterator it = unCampo.getLotes().iterator();

        while (it.hasNext()) {
            Object[] fila = new Object[3];
            unLote = (Lote) it.next();
            fila[0] = unLote.getNumeroLote();
            fila[1] = unLote.getSuperficieLote();
           
            if(unLote.getTipoSueloLote()==1)
                 fila[2] = "I";
            if(unLote.getTipoSueloLote()==2)
                 fila[2] = "II";
            if(unLote.getTipoSueloLote()==3)
                 fila[2] = "III";
            if(unLote.getTipoSueloLote()==4)
                 fila[2] = "IV";
            if(unLote.getTipoSueloLote()==5)
                 fila[2] = "V";
            ((DefaultTableModel) tablaLotes.getModel()).addRow(fila);
        }
    }

    private void borrarValorLotes() {
        textNumeroLote.setText("");
        textSuperficieLote.setText("");
        comboTipoSuelo.setSelectedIndex(0);
    }

    private void borrarValores() {
        borrarValorLotes();
        textNombre.setText("");
        textSuperficieCampo.setText("");
        comboEstado.setSelectedIndex(0);
        ((DefaultTableModel) this.tablaLotes.getModel()).setRowCount(0);
        unCampo.setLotes(new HashSet(0)); 
        jLabel_superficie.setVisible(false);
    }

    private Boolean valoresLotesNoVacios(Lote lote) {
        Boolean error;
        int er=-1;
        if (lote.getNumeroLote()!= er && lote.getSuperficieLote()!= er)
            error = false;
        else
            error = true;
        return error;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textSuperficieCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNumeroLote = new javax.swing.JTextField();
        textSuperficieLote = new javax.swing.JTextField();
        comboTipoSuelo = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        botonAgregarLote = new javax.swing.JButton();
        botonEditarLote = new javax.swing.JButton();
        botonQuitarLote = new javax.swing.JButton();
        labelInformacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botonCancelar = new javax.swing.JButton();
        botonRegistrarCampo = new javax.swing.JButton();
        jLabel_superficie = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelInformacionLote = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Campo");
        setBackground(new java.awt.Color(0, 153, 0));
        setResizable(false);

        jLabel1.setText("Nombre del Campo:");

        textNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNombreFocusLost(evt);
            }
        });

        jLabel2.setText("Superficie:");

        textSuperficieCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSuperficieCampoKeyTyped(evt);
            }
        });

        jLabel3.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Creado", "Parcialmente Trabajado", "Completamente Trabajado", "En Desuso" }));
        comboEstado.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Lotes");

        jLabel5.setText("Número de lote:");

        jLabel6.setText("Superficie:");

        jLabel7.setText("Tipo de Suelo:");

        textNumeroLote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNumeroLoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNumeroLoteFocusLost(evt);
            }
        });
        textNumeroLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroLoteActionPerformed(evt);
            }
        });
        textNumeroLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNumeroLoteKeyTyped(evt);
            }
        });

        textSuperficieLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSuperficieLoteKeyTyped(evt);
            }
        });

        comboTipoSuelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V" }));

        jLabel8.setText("Tenga en cuenta que debe ingresar al menos 1 Lote.");

        tablaLotes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(255, 255, 255), null, new java.awt.Color(102, 102, 102)));
        tablaLotes.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        tablaLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número", "Superficie", "Tipo de Suelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLotes.setColumnSelectionAllowed(true);
        tablaLotes.setGridColor(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(tablaLotes);
        tablaLotes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaLotes.getColumnModel().getColumnCount() > 0) {
            tablaLotes.getColumnModel().getColumn(0).setResizable(false);
        }

        botonAgregarLote.setText("Agregar Lote");
        botonAgregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarLoteActionPerformed(evt);
            }
        });

        botonEditarLote.setText("Editar");
        botonEditarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarLoteActionPerformed(evt);
            }
        });

        botonQuitarLote.setText("Quitar");
        botonQuitarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarLoteActionPerformed(evt);
            }
        });

        labelInformacion.setForeground(new java.awt.Color(204, 0, 0));
        labelInformacion.setText("            ");

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonRegistrarCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        botonRegistrarCampo.setText("Registrar Campo");
        botonRegistrarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCampoActionPerformed(evt);
            }
        });

        jLabel_superficie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_superficie.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_superficie.setText("*");

        jLabel9.setText("ha.");

        labelInformacionLote.setForeground(new java.awt.Color(204, 0, 0));

        jLabel10.setText("ha.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelInformacionLote, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonAgregarLote)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(textSuperficieLote, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textNumeroLote, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboTipoSuelo, 0, 91, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(268, 268, 268)
                                        .addComponent(botonEditarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonQuitarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 18, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)))
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(48, 48, 48)
                                        .addComponent(textSuperficieCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_superficie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNombre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrarCampo)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInformacion))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textSuperficieCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_superficie)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(textNumeroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textSuperficieLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboTipoSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(botonAgregarLote)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEditarLote)
                            .addComponent(botonQuitarLote)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelInformacionLote, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonRegistrarCampo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarLoteActionPerformed
        // TODO add your handling code here:
        
        Lote lote = new Lote();
        System.out.println("valor de lote: "+textNumeroLote.getText().trim());
        if (textNumeroLote.getText().trim().equals(""))
            lote.setNumeroLote(-1);
        else
            lote.setNumeroLote(Integer.parseInt(this.textNumeroLote.getText().trim()));
        if (textSuperficieLote.getText().trim().equals(""))
            lote.setSuperficieLote(-1);
        else
            lote.setSuperficieLote(Double.parseDouble(this.textSuperficieLote.getText().trim()));
        lote.setTipoSueloLote(this.comboTipoSuelo.getSelectedIndex() + 1);
        lote.setCampo(unCampo);
        
     
        
        if (!valoresLotesNoVacios(lote)){
            unCampo.getLotes().add(lote);
            mostrarLotes();
            borrarValorLotes();
        }
        else
           JOptionPane.showMessageDialog(null,"No puede haber campos vacios para un lote","Imposible Registrar",JOptionPane.ERROR_MESSAGE); 
        
    }//GEN-LAST:event_botonAgregarLoteActionPerformed

    private void botonRegistrarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCampoActionPerformed
        // TODO add your handling code here:
        if(textSuperficieCampo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Deben llenarse campos obligatorios");
                jLabel_superficie.setVisible(true);                
        }
        else{
        unCampo.setNombreCampo(this.textNombre.getText());
        unCampo.setSuperficieCampo(Double.parseDouble(this.textSuperficieCampo.getText()));
        unCampo.setEstadoCampo((String) this.comboEstado.getSelectedItem());
        if (controladorCampo.validarCampo(unCampo)) {
            controladorCampo.registrarCampo(unCampo);
            borrarValores(); 
        }
    }
    }//GEN-LAST:event_botonRegistrarCampoActionPerformed

    private void textNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNombreFocusLost
        // Al perder el foco se controla que el usuario no deje vacio el campo nombre o 
        //que use nombres ya usados.
        String nombre = this.textNombre.getText().trim();
        if(nombre.isEmpty()){
             this.labelInformacion.setText("Debe ingresar un Nombre!");
             this.botonRegistrarCampo.setEnabled(false);
        }            
        if (controladorCampo.buscarCampoPorNombre(nombre)) {
            this.labelInformacion.setText("Este Nombre ya esta en uso!");
            this.botonRegistrarCampo.setEnabled(false);
        }

    }//GEN-LAST:event_textNombreFocusLost

   
    private void textNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNombreFocusGained
        // TODO add your handling code here:
        this.labelInformacion.setText("  ");
        this.botonRegistrarCampo.setEnabled(true);
    }//GEN-LAST:event_textNombreFocusGained

    private void botonEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarLoteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Funcionalidad no implementada");
    }//GEN-LAST:event_botonEditarLoteActionPerformed

    private void botonQuitarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarLoteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Funcionalidad no implementada");
    }//GEN-LAST:event_botonQuitarLoteActionPerformed

    private void textSuperficieCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSuperficieCampoKeyTyped
        // TODO add your handling code here:
        if (Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_textSuperficieCampoKeyTyped

    private void textNumeroLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumeroLoteKeyTyped
        // TODO add your handling code here:
        if (Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_textNumeroLoteKeyTyped

    private void textSuperficieLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSuperficieLoteKeyTyped
        // TODO add your handling code here:
        if (Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_textSuperficieLoteKeyTyped

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        borrarValores();
    }//GEN-LAST:event_botonCancelarActionPerformed

   
    
    private void textNumeroLoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNumeroLoteFocusLost
        // TODO add your handling code here:
        if(!this.textNumeroLote.getText().trim().isEmpty()){
            int numeroLoteBuscado = Integer.parseInt(this.textNumeroLote.getText().trim());
            Iterator it = unCampo.getLotes().iterator();
            while(it.hasNext()){
                if( ((Lote)it.next()).getNumeroLote() == numeroLoteBuscado ){
                    //JOptionPane.showMessageDialog(null,"Por favor ingrese un lote con la numeración correcta","Ya existe un Lote con la numeración dada",JOptionPane.ERROR_MESSAGE); 
                    this.labelInformacionLote.setText("Este número de Lote ya está en uso!");
                    //this.textNumeroLote.setText("");
                    break;
                }
            }
        }
        
    }//GEN-LAST:event_textNumeroLoteFocusLost

    private void textNumeroLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroLoteActionPerformed

    private void textNumeroLoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNumeroLoteFocusGained
        // TODO add your handling code here:
        this.labelInformacionLote.setText("");
    }//GEN-LAST:event_textNumeroLoteFocusGained

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarLote;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditarLote;
    private javax.swing.JButton botonQuitarLote;
    private javax.swing.JButton botonRegistrarCampo;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipoSuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_superficie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelInformacionLote;
    private javax.swing.JTable tablaLotes;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNumeroLote;
    private javax.swing.JTextField textSuperficieCampo;
    private javax.swing.JTextField textSuperficieLote;
    // End of variables declaration//GEN-END:variables
}