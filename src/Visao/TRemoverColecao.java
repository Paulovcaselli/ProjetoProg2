package Visao;

import Dados.Usuario;

/**
 *
 * @author paulo
 */
public class TRemoverColecao extends javax.swing.JFrame {

        static Usuario usuario;
        
    public TRemoverColecao(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jComboBoxColecaoManga.removeAllItems();
        jComboBoxColecaoManga.addItem("Selecione a coleção de Mangás:");
        jComboBoxVolumeManga.removeAllItems();
        jComboBoxVolumeManga.addItem("Selecione o volume do mangá:");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExcluirManga = new javax.swing.JButton();
        jComboBoxVolumeManga = new javax.swing.JComboBox<>();
        jButtonExcluirCol = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jComboBoxColecaoManga = new javax.swing.JComboBox<>();
        jLabelRemoverColecao = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remover Colecoes");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonExcluirManga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirManga.setText("Excluir Mangá");
        getContentPane().add(jButtonExcluirManga);
        jButtonExcluirManga.setBounds(290, 140, 120, 27);

        jComboBoxVolumeManga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxVolumeManga);
        jComboBoxVolumeManga.setBounds(20, 140, 215, 27);

        jButtonExcluirCol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirCol.setText("Excluir Coleção");
        getContentPane().add(jButtonExcluirCol);
        jButtonExcluirCol.setBounds(290, 90, 120, 27);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(270, 230, 90, 23);

        jComboBoxColecaoManga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxColecaoManga);
        jComboBoxColecaoManga.setBounds(20, 90, 215, 27);

        jLabelRemoverColecao.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelRemoverColecao.setText("Remover");
        getContentPane().add(jLabelRemoverColecao);
        jLabelRemoverColecao.setBounds(20, 20, 130, 57);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo1.png"))); // NOI18N
        Fundo.setText("jLabel1");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 602, 300);

        setSize(new java.awt.Dimension(602, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TUsuario tela = new TUsuario(usuario);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarMouseClicked

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TRemoverColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRemoverColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRemoverColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRemoverColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRemoverColecao(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonExcluirCol;
    private javax.swing.JButton jButtonExcluirManga;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxColecaoManga;
    private javax.swing.JComboBox<String> jComboBoxVolumeManga;
    private javax.swing.JLabel jLabelRemoverColecao;
    // End of variables declaration//GEN-END:variables
}
