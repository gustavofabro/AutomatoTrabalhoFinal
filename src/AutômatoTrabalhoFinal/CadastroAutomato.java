/**
 * Software para o cadastro de autômatos, conversão de AFND para AFD, 
 * e para reconhecer sentenças do autômato cadastrado pelo usuário.
 * @
 * 
 * Disciplina: Teoria dos Grafos
 * Professor(a): Christine Vieira
 * Aluno: Gustavo Fabro
 * 
 */

package AutômatoTrabalhoFinal;

import java.util.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class CadastroAutomato extends javax.swing.JFrame implements FocusListener {

    private final GerenciaAutomato gerenciaAF = new GerenciaAutomato();
    private final List<Transitions> transitions = new ArrayList<>();
    private List<String> estadosAux;
    private List<String> simbolosAux;
    
    private String[][] tabela;
    private List e;
    private List a;
        
    /**
     *
     */
    public CadastroAutomato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        EstadosLabel = new javax.swing.JLabel();
        estadosEntrada = new FormattedTextField("E");
        simboloLabel = new javax.swing.JLabel();
        simbolosEntrada = new FormattedTextField("A");
        estadoInicialLabel = new javax.swing.JLabel();
        selEstadoInicial = new javax.swing.JComboBox<>();
        estadosFinaisLabel = new javax.swing.JLabel();
        estadosFEntrada = new FormattedTextField("E");
        jPanelTransicao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTrans = new javax.swing.JList<>();
        tSelecEI = new javax.swing.JComboBox<>();
        tSelecS = new javax.swing.JComboBox<>();
        tSelecEF = new javax.swing.JComboBox<>();
        tEILabel = new javax.swing.JLabel();
        tEFLabel = new javax.swing.JLabel();
        tSimboloLabel = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelSent = new javax.swing.JLabel();
        sentEntrada = new javax.swing.JTextField();
        testarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gramaticaText = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        afdEstados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        afdSimbolos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        afdTrans = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Autômato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));

        EstadosLabel.setText("Estados");

        estadosEntrada.addFocusListener(this);
        estadosEntrada.setActionCommand("entrada");

        simboloLabel.setText("Símbolos");

        simbolosEntrada.addFocusListener(this);
        simbolosEntrada.setActionCommand("simbolos");

        estadoInicialLabel.setText("Estado Inicial");

        estadosFinaisLabel.setText("Estados Finais");

        jPanelTransicao.setBorder(javax.swing.BorderFactory.createTitledBorder("Transições"));

        listaTrans.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTransValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTrans);

        tEILabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tEILabel.setText("E.I");

        tEFLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tEFLabel.setText("E.F");

        tSimboloLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tSimboloLabel.setText("Símbolo");

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransicaoLayout = new javax.swing.GroupLayout(jPanelTransicao);
        jPanelTransicao.setLayout(jPanelTransicaoLayout);
        jPanelTransicaoLayout.setHorizontalGroup(
            jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTransicaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTransicaoLayout.createSequentialGroup()
                        .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tSelecEI, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tEILabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tSelecS, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tSimboloLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEFLabel)
                            .addComponent(tSelecEF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTransicaoLayout.setVerticalGroup(
            jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransicaoLayout.createSequentialGroup()
                .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEILabel)
                    .addComponent(tEFLabel)
                    .addComponent(tSimboloLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSelecEI, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSelecS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSelecEF, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelTransicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTransicaoLayout.createSequentialGroup()
                        .addComponent(btnCriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simbolosEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(estadosEntrada)
                            .addComponent(estadosFEntrada)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EstadosLabel)
                                    .addComponent(simboloLabel)
                                    .addComponent(estadoInicialLabel)
                                    .addComponent(selEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estadosFinaisLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EstadosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simboloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simbolosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadoInicialLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadosFinaisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadosFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Testar Sentença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        labelSent.setText("Sentença");

        testarButton.setText("Testar");
        testarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sentEntrada)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testarButton)
                            .addComponent(labelSent))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sentEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(testarButton)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gramática do AF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        gramaticaText.setEditable(false);
        gramaticaText.setColumns(20);
        gramaticaText.setRows(5);
        jScrollPane3.setViewportView(gramaticaText);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AFN Convertido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N

        jLabel1.setText("Estados");

        afdEstados.setEditable(false);

        jLabel2.setText("Símbolos");

        afdSimbolos.setEditable(false);

        jLabel3.setText("Transições");

        afdTrans.setColumns(20);
        afdTrans.setRows(5);
        jScrollPane4.setViewportView(afdTrans);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(afdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(afdSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afdEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afdSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (camposValidos()) {
            boolean isDeterministico = gerenciaAF.setTransitions((ArrayList) transitions, (ArrayList) estadosAux,
                    (ArrayList) simbolosAux, estadosFEntrada.getText().split(";"));
            
            this.e = gerenciaAF.getE();
            this.a = gerenciaAF.getA();
            this.tabela = gerenciaAF.getTabelaTransicao();

            if (!isDeterministico) {
                
                setAFConvertido();
                
                JOptionPane.showMessageDialog(this, "Autômato cadastrado "
                        + "e convertido para AFD com sucesso!");

            } else {
                JOptionPane.showMessageDialog(this, "Autômato cadastrado com sucesso!");
            }
            
            btnEditar.setEnabled(true); 
            estadosEntrada.setEnabled(false);
            simbolosEntrada.setEnabled(false); 
            gramaticaText.setText(gerenciaAF.getGramatica());
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void testarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarButtonActionPerformed
        if (gerenciaAF.testarSent(sentEntrada.getText(),
                selEstadoInicial.getSelectedItem().toString())) {

            JOptionPane.showMessageDialog(this, "Sentença reconhecida!",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(this, "Sentença não reconhecida!",
                    "Resultado", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_testarButtonActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        if (tSelecEI.getSelectedIndex() != -1
                && tSelecS.getSelectedIndex() != -1
                && tSelecEF.getSelectedIndex() != -1) {

            transitions.add(new Transitions(tSelecEI.getSelectedItem().toString(),
                    tSelecS.getSelectedItem().toString(),
                    tSelecEF.getSelectedItem().toString()));

            addTransitionsList(transitions);
        }

    }//GEN-LAST:event_btnCriarActionPerformed

    private void listaTransValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTransValueChanged
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_listaTransValueChanged

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (listaTrans.getSelectedIndex() != -1) {
            transitions.remove(listaTrans.getSelectedIndex());
        }

        //atualiza lista
        addTransitionsList(transitions);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        estadosEntrada.setEnabled(true);
        simbolosEntrada.setEnabled(true);
        transitions.clear();
        listaTrans.setListData(new String[0]); 
        gramaticaText.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     *
     */
    public void setAFConvertido() {
        
        afdEstados.setText("");
        afdSimbolos.setText("");
        afdTrans.setText("");

        for (int i = 0; i < e.size(); i++) {
            afdEstados.setText(afdEstados.getText() + e.get(i)
                    + (i != e.size() - 1 ? ", " : ""));
        }

        afdSimbolos.setText(afdSimbolos.getText() + "");
        for (int i = 0; i < a.size(); i++) {
            afdSimbolos.setText(afdSimbolos.getText() + a.get(i)
                    + (i != a.size() - 1 ? ", " : ""));
        }
    
        for (int i = 0; i < e.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (!tabela[i][j].equals("")) {
                    afdTrans.setText(afdTrans.getText()
                            + String.format("T(%s, %s) = %s\n",
                                    e.get(i), a.get(j), tabela[i][j]));
                }
            }
        }

    }

    private void addTransitionsList(List transitions) {
        listaTrans.setListData(new Vector(transitions));
    }

    public boolean camposValidos(){
        if(selEstadoInicial.getSelectedIndex() > -1
                && !estadosFEntrada.getText().trim().equals("")
                && listaTrans.getModel().getSize() > -1){
            return true;
        }
        
        return false;
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
            java.util.logging.Logger.getLogger(CadastroAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAutomato().setVisible(true);
            }
        });
    }
    
     @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        estadosAux = new ArrayList<>(Arrays.asList(estadosEntrada.getText().split(";")));
        simbolosAux = new ArrayList<>(Arrays.asList(simbolosEntrada.getText().split(";")));

        selEstadoInicial.removeAllItems();
        tSelecEI.removeAllItems();
        tSelecS.removeAllItems();
        tSelecEF.removeAllItems();

        for (int i = 0; i < estadosAux.size(); i++) {
            selEstadoInicial.addItem(estadosAux.get(i));
            tSelecEI.addItem(estadosAux.get(i));
            tSelecEF.addItem(estadosAux.get(i));
        }

        for (int j = 0; j < simbolosAux.size(); j++) {
            tSelecS.addItem(simbolosAux.get(j));
        }

        tSelecS.setSelectedIndex(-1);
       // selEstadoInicial.setSelectedIndex(-1);
        tSelecEI.setSelectedIndex(-1);
        tSelecEF.setSelectedIndex(-1);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstadosLabel;
    private javax.swing.JTextField afdEstados;
    private javax.swing.JTextField afdSimbolos;
    private javax.swing.JTextArea afdTrans;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel estadoInicialLabel;
    private javax.swing.JTextField estadosEntrada;
    private javax.swing.JTextField estadosFEntrada;
    private javax.swing.JLabel estadosFinaisLabel;
    private javax.swing.JTextArea gramaticaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelTransicao;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelSent;
    private javax.swing.JList<String> listaTrans;
    private javax.swing.JComboBox<String> selEstadoInicial;
    private javax.swing.JTextField sentEntrada;
    private javax.swing.JLabel simboloLabel;
    private javax.swing.JTextField simbolosEntrada;
    private javax.swing.JLabel tEFLabel;
    private javax.swing.JLabel tEILabel;
    private javax.swing.JComboBox<String> tSelecEF;
    private javax.swing.JComboBox<String> tSelecEI;
    private javax.swing.JComboBox<String> tSelecS;
    private javax.swing.JLabel tSimboloLabel;
    private javax.swing.JButton testarButton;
    // End of variables declaration//GEN-END:variables
}
