
package defencesystem;

public class Helicopter extends javax.swing.JFrame implements DeffenceObserver {
    
    private int position;
    
    
    
    public Helicopter(){
        initComponents();
        setTitle("Helicopter");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        DeffenceObservable.setHeli(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areaStatusLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTxtarea = new javax.swing.JTextArea();
        msgTxtField = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        missileBtn = new javax.swing.JButton();
        shootBtn = new javax.swing.JButton();
        laserBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        areaStatusLbl.setBackground(new java.awt.Color(204, 255, 204));
        areaStatusLbl.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        areaStatusLbl.setForeground(new java.awt.Color(0, 0, 204));
        areaStatusLbl.setText("Area Not Cleared");
        areaStatusLbl.setPreferredSize(new java.awt.Dimension(145, 22));

        contentTxtarea.setEditable(false);
        contentTxtarea.setBackground(new java.awt.Color(224, 224, 250));
        contentTxtarea.setColumns(20);
        contentTxtarea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contentTxtarea.setRows(5);
        jScrollPane1.setViewportView(contentTxtarea);

        msgTxtField.setBackground(new java.awt.Color(211, 211, 229));
        msgTxtField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        sendBtn.setBackground(new java.awt.Color(51, 0, 204));
        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        missileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        missileBtn.setForeground(new java.awt.Color(0, 102, 153));
        missileBtn.setText("Missile Operation");
        missileBtn.setEnabled(false);

        shootBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shootBtn.setForeground(new java.awt.Color(0, 102, 153));
        shootBtn.setText("Shoot");
        shootBtn.setEnabled(false);

        laserBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        laserBtn.setForeground(new java.awt.Color(0, 102, 153));
        laserBtn.setText("Laser Operation");
        laserBtn.setEnabled(false);
        laserBtn.setPreferredSize(new java.awt.Dimension(123, 23));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 153));
        jCheckBox1.setText("Position");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(laserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(missileBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(missileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        String heliMsg = "  Helicopter     :    "+msgTxtField.getText().trim();
        String oldInbox = contentTxtarea.getText();
        if(msgTxtField.getText().trim().isEmpty()){
            
        }else{
            DeffenceObservable.setPersonalMsg(heliMsg);
            DeffenceObservable.mainController.updateInbox(heliMsg);
            contentTxtarea.setText(oldInbox+"\n\n"+"  Me                         :    "+msgTxtField.getText());
            msgTxtField.setText("");
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaStatusLbl;
    private javax.swing.JTextArea contentTxtarea;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laserBtn;
    private javax.swing.JButton missileBtn;
    private javax.swing.JTextField msgTxtField;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton shootBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClearLbl(boolean clearStatus) {
        if(clearStatus){
            areaStatusLbl.setText("Area Cleared");
        }else{
            areaStatusLbl.setText("Area Not Cleared");
        }
    }

    @Override
    public void updateButtons() {
        if(jCheckBox1.isSelected()){
            if(position > 60){
                laserBtn.setEnabled(true);
            }else if(position >40){
                missileBtn.setEnabled(true);
            }else if(position>15){
                shootBtn.setEnabled(true);
            }
            
            if(position<15){
                laserBtn.setEnabled(false);
                shootBtn.setEnabled(false);
                missileBtn.setEnabled(false);
                
            }else if(position<40){
                missileBtn.setEnabled(true);
                shootBtn.setEnabled(false);
                laserBtn.setEnabled(false);
            }else if(position <60){
                laserBtn.setEnabled(false);
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
            }

        }  
    }

    @Override
    public void update(int position) {
        this.position = position;
        updateButtons();
    }

    @Override
    public void getMsgMain(String msg) {
        String oldMsg = contentTxtarea.getText();
        contentTxtarea.setText(oldMsg+"\n\n"+msg);
    }

    @Override
    public void privateMsg(String msg) {
        String oldMsg = contentTxtarea.getText();
        contentTxtarea.setText(oldMsg+"\n\n"+msg); 
    }
}
