package defencesystem;

public class Submarine extends javax.swing.JFrame implements DeffenceObserver {
    
    private int position;

    public Submarine() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Submarine");
        setResizable(false);
        setVisible(true);
        DeffenceObservable.setSub(this);
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
        sonarBtn = new javax.swing.JButton();
        tomahawkBtn = new javax.swing.JButton();
        tridentBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        areaStatusLbl.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        areaStatusLbl.setForeground(new java.awt.Color(0, 102, 153));
        areaStatusLbl.setText("Area Not Cleared");

        contentTxtArea.setEditable(false);
        contentTxtArea.setBackground(new java.awt.Color(224, 250, 250));
        contentTxtArea.setColumns(20);
        contentTxtArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contentTxtArea.setRows(5);
        jScrollPane1.setViewportView(contentTxtArea);

        msgTxtField.setBackground(new java.awt.Color(161, 246, 246));
        msgTxtField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msgTxtField.setForeground(new java.awt.Color(28, 76, 80));

        sendBtn.setBackground(new java.awt.Color(0, 102, 102));
        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        shootBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shootBtn.setForeground(new java.awt.Color(0, 102, 102));
        shootBtn.setText("Shoot");
        shootBtn.setEnabled(false);

        sonarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sonarBtn.setForeground(new java.awt.Color(0, 102, 102));
        sonarBtn.setText("Sonar Operation");
        sonarBtn.setEnabled(false);

        tomahawkBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tomahawkBtn.setForeground(new java.awt.Color(0, 102, 102));
        tomahawkBtn.setText("Tomahawk Missile");
        tomahawkBtn.setEnabled(false);

        tridentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tridentBtn.setForeground(new java.awt.Color(0, 102, 102));
        tridentBtn.setText("Trident - 2 Missile");
        tridentBtn.setEnabled(false);

        jCheckBox1.setBackground(new java.awt.Color(204, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 51, 102));
        jCheckBox1.setText("Position");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tomahawkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sonarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tridentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(areaStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sonarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomahawkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tridentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        String subMsg = "  Submarine    :    "+msgTxtField.getText().trim();
        String oldInbox = contentTxtArea.getText();
        if(msgTxtField.getText().trim().isEmpty()){
            
        }else{
            DeffenceObservable.setPersonalMsg(subMsg);
            DeffenceObservable.mainController.updateInbox(subMsg);
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
    private javax.swing.JTextField msgTxtField;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton shootBtn;
    private javax.swing.JButton sonarBtn;
    private javax.swing.JButton tomahawkBtn;
    private javax.swing.JButton tridentBtn;
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
            if(position >80){
                tridentBtn.setEnabled(true);
                tomahawkBtn.setEnabled(true);
                sonarBtn.setEnabled(true);
                shootBtn.setEnabled(true);
            }else if(position >50){
                sonarBtn.setEnabled(true);
                shootBtn.setEnabled(true);
            }else if(position >20){
                shootBtn.setEnabled(true);
            }
            
            if(position<20){
                tridentBtn.setEnabled(false);
                tomahawkBtn.setEnabled(false);
                shootBtn.setEnabled(false);
                sonarBtn.setEnabled(false);
            }else if(position<50){
                shootBtn.setEnabled(true);
                sonarBtn.setEnabled(false);
                tomahawkBtn.setEnabled(false);
                tridentBtn.setEnabled(false);
            }else if(position<80){
                shootBtn.setEnabled(true);
                sonarBtn.setEnabled(true);
                tomahawkBtn.setEnabled(false);
                tridentBtn.setEnabled(false);
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
