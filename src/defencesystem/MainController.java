package defencesystem;

public class MainController extends javax.swing.JFrame {
    
    private final DeffenceObservableInterface deffenceObservableInterface ;

    public MainController(DeffenceObservableInterface deffenceObservableInterface) {
        setTitle("Main Controller");
        this.deffenceObservableInterface = deffenceObservableInterface;
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        DeffenceObservable.setMc(this);
    }
    
    public void updateInbox(String recievedMsg){ 
       String oldMsg = recievedMsgTxtArea.getText();
       recievedMsgTxtArea.setText(oldMsg+"\n\n"+recievedMsg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areastatusCheckBox = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recievedMsgTxtArea = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        sendMsgTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        areastatusCheckBox.setBackground(new java.awt.Color(255, 255, 204));
        areastatusCheckBox.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        areastatusCheckBox.setForeground(new java.awt.Color(51, 0, 153));
        areastatusCheckBox.setText("Area Clear");
        areastatusCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        areastatusCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areastatusCheckBoxActionPerformed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(255, 255, 204));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Position");

        recievedMsgTxtArea.setBackground(new java.awt.Color(255, 204, 102));
        recievedMsgTxtArea.setColumns(20);
        recievedMsgTxtArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recievedMsgTxtArea.setRows(5);
        jScrollPane1.setViewportView(recievedMsgTxtArea);

        jComboBox1.setBackground(new java.awt.Color(255, 204, 153));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Helicopter", "Submarine", "Tank" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        sendMsgTextArea.setColumns(20);
        sendMsgTextArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendMsgTextArea.setRows(5);
        jScrollPane2.setViewportView(sendMsgTextArea);

        jLabel2.setText("Recieved Messages :");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 204));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 0));
        jCheckBox1.setText("Send Private Message");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Type Here :");

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16))
                            .addComponent(areastatusCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areastatusCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areastatusCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areastatusCheckBoxActionPerformed
        deffenceObservableInterface.areaClear(areastatusCheckBox.isSelected());
    }//GEN-LAST:event_areastatusCheckBoxActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        int position = jSlider1.getValue();
        deffenceObservableInterface.setPosition(position);  
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String msg = "  MainController    :    "+sendMsgTextArea.getText();
        if(jCheckBox1.isSelected()){
            //private Msg Body
            if(sendMsgTextArea.getText().trim().isEmpty()){
                
            }else{
              String oldMsg = recievedMsgTxtArea.getText();
              if(DeffenceObservable.getPrivateObserver().equalsIgnoreCase("Helicopter")){
                  DeffenceObservable.helicopter.privateMsg(msg);
                  recievedMsgTxtArea.setText(oldMsg+"\n\n"+"  Me                 :    "+sendMsgTextArea.getText().trim());
                  sendMsgTextArea.setText(""); 
              }else if(DeffenceObservable.getPrivateObserver().equalsIgnoreCase("Submarine")){
                  DeffenceObservable.submarine.privateMsg(msg);
                  recievedMsgTxtArea.setText(oldMsg+"\n\n"+"  Me                 :    "+sendMsgTextArea.getText().trim());
                  sendMsgTextArea.setText("");
              }else if(DeffenceObservable.getPrivateObserver().equalsIgnoreCase("Tank")){
                  DeffenceObservable.tank.privateMsg(msg);
                  recievedMsgTxtArea.setText(oldMsg+"\n\n"+"  Me                 :    "+sendMsgTextArea.getText().trim());
                  sendMsgTextArea.setText("");
              }
            }
        }else{
            //All messages
            if(sendMsgTextArea.getText().trim().isEmpty()){
            }else{
                String oldrecieve = recievedMsgTxtArea.getText();
                recievedMsgTxtArea.setText(oldrecieve+"\n\n"+"  Me                 :    "+sendMsgTextArea.getText().trim());
                sendMsgTextArea.setText("");
                deffenceObservableInterface.getMsgMain(msg); 
            }    
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jComboBox1.setEnabled(true);
            DeffenceObservable.setPrivateObserver("Helicopter");
        }else{
            jComboBox1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String privateObserver = (String)jComboBox1.getSelectedItem();
        DeffenceObservable.setPrivateObserver(privateObserver);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areastatusCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea recievedMsgTxtArea;
    private javax.swing.JTextArea sendMsgTextArea;
    // End of variables declaration//GEN-END:variables
}
