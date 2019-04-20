/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Monopolyboard extends javax.swing.JPanel {

    /**
     * Creates new form Monopolyboard
     */
    public Monopolyboard() {
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

        PanelBoard = new javax.swing.JPanel();
        PanelGameEvent = new javax.swing.JScrollPane();
        GameEvent = new javax.swing.JTextArea();
        MapMonopoli = new javax.swing.JLabel();
        CommandPanel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        TickTime = new javax.swing.JTextField();
        CurrentPlayer = new javax.swing.JTextField();

        GameEvent.setColumns(20);
        GameEvent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GameEvent.setRows(5);
        GameEvent.setText("Status Permainan:");
        GameEvent.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                GameEventVetoableChange(evt);
            }
        });
        PanelGameEvent.setViewportView(GameEvent);

        MapMonopoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MapMonopoli.PNG"))); // NOI18N
        MapMonopoli.setText("jLabel1");

        CommandPanel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CommandPanel.setText("Command: ");
        CommandPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommandPanelActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Player1:\nPosition:\nProperty:");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Player2:\nPosition:\nProperty:");
        jScrollPane2.setViewportView(jTextArea2);

        TickTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TickTime.setText("Timer:");
        TickTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TickTimeActionPerformed(evt);
            }
        });

        CurrentPlayer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CurrentPlayer.setText("Current Player:");

        javax.swing.GroupLayout PanelBoardLayout = new javax.swing.GroupLayout(PanelBoard);
        PanelBoard.setLayout(PanelBoardLayout);
        PanelBoardLayout.setHorizontalGroup(
            PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBoardLayout.createSequentialGroup()
                .addGroup(PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CommandPanel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBoardLayout.createSequentialGroup()
                        .addGroup(PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(TickTime)
                            .addComponent(CurrentPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MapMonopoli, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelGameEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 184, Short.MAX_VALUE))
        );
        PanelBoardLayout.setVerticalGroup(
            PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBoardLayout.createSequentialGroup()
                .addGroup(PanelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBoardLayout.createSequentialGroup()
                        .addComponent(MapMonopoli, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelGameEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBoardLayout.createSequentialGroup()
                        .addComponent(TickTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CommandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CommandPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommandPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommandPanelActionPerformed

    private void GameEventVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_GameEventVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_GameEventVetoableChange

    private void TickTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TickTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TickTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CommandPanel;
    private javax.swing.JTextField CurrentPlayer;
    private javax.swing.JTextArea GameEvent;
    private javax.swing.JLabel MapMonopoli;
    private javax.swing.JPanel PanelBoard;
    private javax.swing.JScrollPane PanelGameEvent;
    private javax.swing.JTextField TickTime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}