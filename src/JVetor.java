/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isael
 */
public class JVetor extends javax.swing.JFrame {

    /**
     * Creates new form JVetor
     */
    public JVetor() {
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

        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        labelVetor = new javax.swing.JLabel();
        btnOrdemCresc = new javax.swing.JButton();
        btnOrdDecr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMaior = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        qtdParImpar = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAdd.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnAdd.setText("Adic.");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnDel.setText("Del.");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setText("Valor");

        txtValor.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txtValor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        labelVetor.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        labelVetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVetor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnOrdemCresc.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnOrdemCresc.setText("Ordem Cres.");
        btnOrdemCresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemCrescActionPerformed(evt);
            }
        });

        btnOrdDecr.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnOrdDecr.setText("Ordem Decr.");
        btnOrdDecr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdDecrActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Manipulando Vetores");

        btnMaior.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnMaior.setText("Maior");
        btnMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnMenor.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnMenor.setText("Menor");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });

        qtdParImpar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        qtdParImpar.setText("Qtd Pares e Ímpares");
        qtdParImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdParImparActionPerformed(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 11)); // NOI18N
        btnSoma.setText("Soma");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdemCresc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSoma))
                            .addComponent(labelVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qtdParImpar)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdemCresc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdDecr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtdParImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(labelVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int [] numero = new int[4];
    int topo = 0, aux = 0, maior = 0, soma = 0;
    
    public void adicionarValor(int valor){
         for (int i=0; i<=numero.length;i++){
            if(numero[i] == 0){
                numero[i]= valor;
                topo++;           
                soma += numero[i];
                txtValor.setText("");//limpa o campo de texto depois de adicionado um valor               
                break;
            }
        }
    }
    public void deletarValor(int valor){
         for (int i = 0;i<topo;i++){
             if (numero[i] == valor){
                 numero[i] = 0;                 
                 break;
             }
             if (numero[i] == 0 && numero[i+1] !=0){
                aux = numero[i];
                numero[i] = numero[i+1];
                numero[i+1] = aux;
             }
             txtValor.setText("");
         }
    }
    public void exibirValor(){
        String vetorFinal = "";
        for (int i=0;i<numero.length;i++){            
            vetorFinal += numero[i] + " ";
          }        
        labelVetor.setText(vetorFinal);        
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int valor = Integer.parseInt(txtValor.getText());
        adicionarValor(valor); 
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
       int valor = Integer.parseInt(txtValor.getText());
        deletarValor(valor);   
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnOrdemCrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemCrescActionPerformed
        int aux2;  
        String ordemCresc="";
        for (int i = 0;i<numero.length;i++){
               for (int j = 0;j<numero.length;j++){
                   if(numero[j]>numero[i]){
                       aux2 = numero[i];
                       numero[i] = numero[j];                       
                       numero[j] = aux2;
                   } 
               }               
            }       
        for(int i=0;i<numero.length;i++){
            ordemCresc += numero[i]+" " ;
            //System.out.println(numero[i]);
        }
        labelVetor.setText(ordemCresc);
    }//GEN-LAST:event_btnOrdemCrescActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        exibirValor();
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       labelVetor.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiorActionPerformed
       String maiorValor = " ";
        for (int i = 0;i<numero.length;i++){
           if(numero[i]>maior){
               maior = numero[i];              
           }
       }      
       maiorValor = Integer.toString(maior);
       labelVetor.setText(maiorValor);
    }//GEN-LAST:event_btnMaiorActionPerformed

    private void btnOrdDecrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdDecrActionPerformed
        // TODO add your handling code here:
        //String descending = "" ;
        int aux3;
        String ordDecresc = "";
        for (int i = 0;i<numero.length;i++){
               for (int j = 0;j<numero.length;j++){
                   if(numero[j]<numero[i]){
                       aux3 = numero[i];
                       numero[i] = numero[j];                       
                       numero[j] = aux3;
                   } 
               }
        }
         for(int i=0;i<numero.length;i++){            
            ordDecresc += numero[i] +" ";
        }
         labelVetor.setText(ordDecresc);
        
    }//GEN-LAST:event_btnOrdDecrActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        String menorValor = " ";
       int menor = numero[0];
        for (int i = 0; i<numero.length;i++){           
              if (numero[i]< menor){
               menor = numero[i];           
           }
            
        }
        menorValor = Integer.toString(menor);
        labelVetor.setText(menorValor);
    }//GEN-LAST:event_btnMenorActionPerformed

    private void qtdParImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdParImparActionPerformed
        int par = 0,impar=0;
        String qtdPar = "", qtdImpar = "" ;
        for (int i=0; i<numero.length;i++){
            if (numero[i]%2 ==0){
                par += 1;
            }else{
                impar += 1;
            }
        }
        qtdPar = Integer.toString(par);
        qtdImpar = Integer.toString(impar);
        labelVetor.setText("Pares: "+qtdPar+" | Ímpares: "+qtdImpar);
    }//GEN-LAST:event_qtdParImparActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        String somaValores = Integer.toString(soma);
        labelVetor.setText(somaValores);
    }//GEN-LAST:event_btnSomaActionPerformed

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
            java.util.logging.Logger.getLogger(JVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMaior;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnOrdDecr;
    private javax.swing.JButton btnOrdemCresc;
    private javax.swing.JButton btnSoma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelVetor;
    private javax.swing.JButton qtdParImpar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
