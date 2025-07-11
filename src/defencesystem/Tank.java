package defencesystem;

public class Tank extends javax.swing.JFrame implements DeffenceObserver{
    private int position;

    public Tank() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Tank");
        setResizable(false);
        DeffenceObservable.setTank(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areaStatusLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTxtArea = new javax.swing.JTextArea();
        msgTxtField = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        shootBtn = new javax.swing.JButton();
        missileBtn = new javax.swing.JButton();
        redarBtn = new javax.swing.JButton();
        rotateShootBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        areaStatusLbl.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        areaStatusLbl.setForeground(new java.awt.Color(0, 102, 102));
        areaStatusLbl.setText("Area Not Cleared");

        contentTxtArea.setEditable(false);
        contentTxtArea.setBackground(new java.awt.Color(0, 255, 153));
        contentTxtArea.setColumns(20);
        contentTxtArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contentTxtArea.setRows(5);
        jScrollPane1.setViewportView(contentTxtArea);

        msgTxtField.setBackground(new java.awt.Color(102, 255, 153));
        msgTxtField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msgTxtField.setForeground(new java.awt.Color(1, 80, 41));

        sendBtn.setBackground(new java.awt.Color(0, 102, 51));
        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        shootBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shootBtn.setForeground(new java.awt.Color(0, 102, 51));
        shootBtn.setText("Shoot");
        shootBtn.setEnabled(false);

        missileBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        missileBtn.setForeground(new java.awt.Color(0, 102, 51));
        missileBtn.setText("Missile Operation");
        missileBtn.setEnabled(false);

        redarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redarBtn.setForeground(new java.awt.Color(0, 102, 51));
        redarBtn.setText("Redar Operation");
        redarBtn.setEnabled(false);

        rotateShootBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotateShootBtn.setForeground(new java.awt.Color(0, 102, 51));
        rotateShootBtn.setText("Rotate Shooting");
        rotateShootBtn.setEnabled(false);

        jCheckBox1.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 102));
        jCheckBox1.setText("Position");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(redarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(missileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rotateShootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(106, 106, 106)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(missileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotateShootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        String tankMsg = "  Tank              :    "+msgTxtField.getText().trim();
        String oldInbox = contentTxtArea.getText();
        if(msgTxtField.getText().trim().isEmpty()){
            
        }else{
            DeffenceObservable.setPersonalMsg(tankMsg);
            DeffenceObservable.mainController.updateInbox(tankMsg);
            contentTxtArea.setText(oldInbox+"\n\n"+"  Me                         :    "+msgTxtField.getText());
            msgTxtField.setText("");
        }
    }//GEN-LAST:event_sendBtnActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaStatusLbl;
    private javax.swing.JTextArea contentTxtArea;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton missileBtn;
    private javax.swing.JTextField msgTxtField;
    private javax.swing.JButton redarBtn;
    private javax.swing.JButton rotateShootBtn;
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
    public void update(int position) {
        this.position = position;
        updateButtons();
    }

    @Override
    public void updateButtons() {
        if(jCheckBox1.isSelected()){
            if(position >90){
                shootBtn.setEnabled(true);
                redarBtn.setEnabled(true);
                rotateShootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
            }else if(position > 80){
                redarBtn.setEnabled(true);
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
            }else if(position >50){
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
            }else if(position >30){
                shootBtn.setEnabled(true);
            }
            
            if(position < 30){
                shootBtn.setEnabled(false);
                redarBtn.setEnabled(false);
                rotateShootBtn.setEnabled(false);
                missileBtn.setEnabled(false);
            }else if(position < 50){
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(false);
                rotateShootBtn.setEnabled(false);
                redarBtn.setEnabled(false);
            }else if(position < 80){
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
                rotateShootBtn.setEnabled(false);
                redarBtn.setEnabled(false);
            }else if(position <90){
                rotateShootBtn.setEnabled(false);
                missileBtn.setEnabled(true);
                redarBtn.setEnabled(true);
                shootBtn.setEnabled(true);
            }
        }
        
    }

    @Override
    public void getMsgMain(String msg) {
        String oldMsg = contentTxtArea.getText();
        contentTxtArea.setText(oldMsg+"\n\n"+msg);
    }

    @Override
    public void privateMsg(String msg) {
        String oldMsg = contentTxtArea.getText();
        contentTxtArea.setText(oldMsg+"\n\n"+msg);
    }
}
