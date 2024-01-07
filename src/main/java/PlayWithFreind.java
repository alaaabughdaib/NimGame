
import javax.swing.JOptionPane;


public class PlayWithFreind extends javax.swing.JFrame {

   
     int current_player=1;
    
     String player1=null;
     String player2=null;
     int ss=0;
   
   // int cc =0;
 
 /*    public void addsc(){
         ss= ss+1;
         cc=cc+1;
         
     }
    
     public boolean checkifend(){
         boolean s = false;
         if (ss==15) { 
             
            
         }
         else
             s=false;
        addsc();
        return s;
        
    }
    
    
    
    
  
   
    
     public void endturn() {
  
        if (cc ==3) {
       
       current_player = SwitchPlayers(current_player);
    }
         cc =0;
}
    
     private void gamerule(){
       getPlayersNames();
    
       
      
       
   
     }
    */
      public int SwitchPlayers(int currentPlayer) {
        String message=null;
        int next_player ;
        next_player = (currentPlayer == 1) ? 2 : 1;
        if (next_player==1)
                message = player1+"  Turns ";
        
              else
                  message = player2+"  Turns ";
        reserbuttons();
        ll.setText(message);
        return (next_player);
      }
      
      
       public int getplayer(){
        return current_player;
    }
     public void getPlayersNames(){
        player1 = JOptionPane.showInputDialog("please enter the name of the player 1:");
        player2 = JOptionPane.showInputDialog("please enter the name of the player 2:");
  
          ll.setText(player1+" turns");
     
     }
    
     
    
     
     public void setsum(int sum){
         ss=sum;
     }
     
    // public void setcount(int count){
         
      //   cc=count;
     //}
     
     public int getsum(){
         
         return ss;
     }
     
    // public int getcount(){
         
      //   return cc;
    // }
     
     
    

     public void setplayer(int player){
         current_player=player;
     }
    
    
     public void reserbuttons(){
    
        r1.setEnabled(true);
        r21.setEnabled(true);
        r22.setEnabled(true);
        r23.setEnabled(true);
        r31.setEnabled(true);
        r32.setEnabled(true);
        r33.setEnabled(true);
        r34.setEnabled(true);
        r35.setEnabled(true);
        r41.setEnabled(true);
        r42.setEnabled(true);
        r43.setEnabled(true);
        r44.setEnabled(true);
        r45.setEnabled(true);
        r46.setEnabled(true);
        r47.setEnabled(true);
    }    
   
     public PlayWithFreind() {
         
         initComponents();
        getPlayersNames();
       
      
       
   
    }

    
    
    
    
    
    
    
    
    
    //
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JButton();
        r21 = new javax.swing.JButton();
        r22 = new javax.swing.JButton();
        r23 = new javax.swing.JButton();
        r31 = new javax.swing.JButton();
        r32 = new javax.swing.JButton();
        r33 = new javax.swing.JButton();
        r34 = new javax.swing.JButton();
        r35 = new javax.swing.JButton();
        endturn = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        r47 = new javax.swing.JButton();
        r46 = new javax.swing.JButton();
        r45 = new javax.swing.JButton();
        r44 = new javax.swing.JButton();
        r43 = new javax.swing.JButton();
        r42 = new javax.swing.JButton();
        r41 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        kk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 51));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(40, 40, 70, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIM'S GAME ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 440, 80);

        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(300, 120, 20, 70);

        r21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r21ActionPerformed(evt);
            }
        });
        jPanel1.add(r21);
        r21.setBounds(260, 200, 20, 70);

        r22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r22ActionPerformed(evt);
            }
        });
        jPanel1.add(r22);
        r22.setBounds(300, 200, 20, 70);

        r23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r23ActionPerformed(evt);
            }
        });
        jPanel1.add(r23);
        r23.setBounds(340, 200, 20, 70);

        r31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r31ActionPerformed(evt);
            }
        });
        jPanel1.add(r31);
        r31.setBounds(220, 280, 20, 70);

        r32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r32ActionPerformed(evt);
            }
        });
        jPanel1.add(r32);
        r32.setBounds(260, 280, 20, 70);

        r33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r33ActionPerformed(evt);
            }
        });
        jPanel1.add(r33);
        r33.setBounds(300, 280, 20, 70);

        r34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r34ActionPerformed(evt);
            }
        });
        jPanel1.add(r34);
        r34.setBounds(340, 280, 20, 70);

        r35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r35ActionPerformed(evt);
            }
        });
        jPanel1.add(r35);
        r35.setBounds(380, 280, 20, 70);

        endturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endturn.setForeground(new java.awt.Color(0, 0, 51));
        endturn.setText("END TURN");
        endturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endturnActionPerformed(evt);
            }
        });
        jPanel1.add(endturn);
        endturn.setBounds(490, 250, 120, 27);

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 51));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(520, 400, 72, 27);

        r47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r47ActionPerformed(evt);
            }
        });
        jPanel1.add(r47);
        r47.setBounds(420, 360, 20, 70);

        r46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r46ActionPerformed(evt);
            }
        });
        jPanel1.add(r46);
        r46.setBounds(380, 360, 20, 70);

        r45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r45ActionPerformed(evt);
            }
        });
        jPanel1.add(r45);
        r45.setBounds(340, 360, 20, 70);

        r44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r44ActionPerformed(evt);
            }
        });
        jPanel1.add(r44);
        r44.setBounds(300, 360, 20, 70);

        r43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r43ActionPerformed(evt);
            }
        });
        jPanel1.add(r43);
        r43.setBounds(260, 360, 20, 70);

        r42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r42ActionPerformed(evt);
            }
        });
        jPanel1.add(r42);
        r42.setBounds(220, 360, 20, 70);

        r41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r41ActionPerformed(evt);
            }
        });
        jPanel1.add(r41);
        r41.setBounds(180, 360, 20, 70);

        ll.setBackground(new java.awt.Color(255, 255, 255));
        ll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ll.setForeground(new java.awt.Color(255, 255, 255));
        ll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(ll);
        ll.setBounds(30, 160, 170, 40);

        kk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kk.setForeground(new java.awt.Color(255, 255, 255));
        kk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(kk);
        kk.setBounds(30, 200, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        MainPage m = new MainPage();
        m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
     int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r1.setVisible(false);
    
    
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
    
  
// TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void endturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endturnActionPerformed
    current_player = SwitchPlayers(current_player);
    reserbuttons();

// TODO add your handling code here:
    }//GEN-LAST:event_endturnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0); 
    //this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void r22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r22ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}        r22.setVisible(false);
    r1.setEnabled(false);

    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
         // TODO add your handling code here:
    }//GEN-LAST:event_r22ActionPerformed

    private void r21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r21ActionPerformed
          int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r21.setVisible(false);
    
    r1.setEnabled(false);

    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
    
       // TODO add your handling code here:
    }//GEN-LAST:event_r21ActionPerformed

    private void r23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r23ActionPerformed
    int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r23.setVisible(false);
    
    r1.setEnabled(false);

    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
         // TODO add your handling code here:
    }//GEN-LAST:event_r23ActionPerformed

    private void r31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r31ActionPerformed
    int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r31.setVisible(false);
    
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
r1.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
    
    // TODO add your handling code here:
    }//GEN-LAST:event_r31ActionPerformed

    private void r32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r32ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r32.setVisible(false);
   r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
r1.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
  // TODO add your handling code here:
    }//GEN-LAST:event_r32ActionPerformed

    private void r33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r33ActionPerformed
     int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r33.setVisible(false);
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
r1.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
      // TODO add your handling code here:
    }//GEN-LAST:event_r33ActionPerformed

    private void r34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r34ActionPerformed
    int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r34.setVisible(false);
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
r1.setEnabled(false);

    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
     // TODO add your handling code here:
    }//GEN-LAST:event_r34ActionPerformed

    private void r35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r35ActionPerformed
     int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r35.setVisible(false);
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    r1.setEnabled(false);


    r41.setEnabled(false);
    r42.setEnabled(false);
    r43.setEnabled(false);
    r44.setEnabled(false);
    r45.setEnabled(false);
    r46.setEnabled(false);
    r47.setEnabled(false);
  
       // TODO add your handling code here:
    }//GEN-LAST:event_r35ActionPerformed

    private void r41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r41ActionPerformed
    int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r41.setVisible(false);
    
    r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
    
      // TODO add your handling code here:
    }//GEN-LAST:event_r41ActionPerformed

    private void r42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r42ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r42.setVisible(false);
        r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
    
    // TODO add your handling code here:
    }//GEN-LAST:event_r42ActionPerformed

    private void r43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r43ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
        r43.setVisible(false);

    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_r43ActionPerformed

    private void r44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r44ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
       r44.setVisible(false);

    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_r44ActionPerformed

    private void r45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r45ActionPerformed
    int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
        r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
        r45.setVisible(false);

    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_r45ActionPerformed

    private void r46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r46ActionPerformed
   int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
                         r46.setVisible(false);
        r21.setEnabled(false);
    r22.setEnabled(false);
    r23.setEnabled(false);
    
    r31.setEnabled(false);
    r32.setEnabled(false);
    r33.setEnabled(false);
    r34.setEnabled(false);
    r35.setEnabled(false);

    r1.setEnabled(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_r46ActionPerformed

    private void r47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r47ActionPerformed
      int next_player = 1 ;
     int currentPlayer=getplayer();
        
        int sum= getsum();
       
         
                       
                          sum = sum+1;
                         if (sum==15)
                             if (currentPlayer==1)
                              JOptionPane.showMessageDialog(null, player1+"lose");
                             else JOptionPane.showMessageDialog(null, player2+"lose");
                         else 
                         {
                            
                       
                       
                         setsum(sum);
                         if (current_player==1)
                         ll.setText(player1 +" turns");
                         else ll.setText(player2 +" turns");
                         kk.setText("total moves :"+sum);
                        
                         
                         setplayer(next_player);}
r47.setVisible(false);
r46.setEnabled(true);
r45.setEnabled(true);
r44.setEnabled(true);
r43.setEnabled(true);
r42.setEnabled(true);
r41.setEnabled(true);
r31.setEnabled(false);
r32.setEnabled(false);
r33.setEnabled(false);
r34.setEnabled(false);
r35.setEnabled(false);
r21.setEnabled(false);
r22.setEnabled(false);
r23.setEnabled(false);
r1.setEnabled(false);
        
    }//GEN-LAST:event_r47ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayWithFreind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayWithFreind().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endturn;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kk;
    private javax.swing.JLabel ll;
    private javax.swing.JButton r1;
    private javax.swing.JButton r21;
    private javax.swing.JButton r22;
    private javax.swing.JButton r23;
    private javax.swing.JButton r31;
    private javax.swing.JButton r32;
    private javax.swing.JButton r33;
    private javax.swing.JButton r34;
    private javax.swing.JButton r35;
    private javax.swing.JButton r41;
    private javax.swing.JButton r42;
    private javax.swing.JButton r43;
    private javax.swing.JButton r44;
    private javax.swing.JButton r45;
    private javax.swing.JButton r46;
    private javax.swing.JButton r47;
    // End of variables declaration//GEN-END:variables
}
