/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lolog
 */
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PlayWithPC extends javax.swing.JFrame {
     int current_player=1;
     int cc ;
     String player1=null;
     String player2="PC";
     int ss;
     //JButton[] pileButtons;
     //pileButtons = new JButton[16];
        String[] buttonNames = {
            "r1", "r21", "r22", "r23", "r31", "r32", "r33", "r34",
            "r35", "r41", "r42", "r43", "r44", "r45", "r46", "r47"
        };
        JButton[] pileButtons = new JButton[buttonNames.length];
 
     //////////////////////constructor
    public PlayWithPC() {
         ss=0;
         cc=0;
        initComponents();
        gamerule();
   

    }
    //////////////////
 
     public void addsc(){
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
    private void gamerule(){
       getPlayersNames();
    
       
      
       
   
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
     
     public int SwitchPlayers(int currentPlayer) {
        String message=null;
        int next_player ;
        next_player = (currentPlayer == 1) ? 2 : 1;
        if (next_player==1)
                message = player1+"  Turns ";
        
              else
                  message = player2+"  Turns ";
        reserbuttons();
        playernamelabel.setText(message);
        return (next_player);
      }
    
    public int getplayer(){
        return current_player;
    }
   
    
     public void endturn() {
  
        if (cc ==3) {
       
       current_player = SwitchPlayers(current_player);
    }
         cc =0;
}
     
     public void getPlayersNames(){
        player1 = JOptionPane.showInputDialog("please enter the name of the player 1:");

  
          playernamelabel.setText(player1+" turns");
     
     }
    private int difficultyLevel = 0; // 0 for easy, 1 for medium, 2 for hard
       
    private int[] piles = {1,3,5,7};  // Initialize with the initial number of sticks in each pile
    private String[] currentPlayer=new String[2]; 
    int cp;
    int sum=16;
    public void decsum(){
        sum=sum-1;
    }
  
 
    MainPage m=new MainPage();
    public int alphabeta(){
        int x=0;
        
        return x;
    }
    public void checkpc(){
        Random random = new Random();
            for (int i = 0; i < buttonNames.length; i++) {
                pileButtons[i] = new JButton(buttonNames[i]);
}
            if(m.get_easymode()){  /* here in easy mode the pc check only one stick  */
               decsum(); 
               int i=0;
               
               if (pileButtons[i].isEnabled()) {
    pileButtons[i].setEnabled(false);
    i+=1;
// Disable the button
}
               // end turn 
current_player = SwitchPlayers(current_player);
    cc=0;
    setcount(cc);
    reserbuttons();  
        
            }//////////////////secound mode 
            else if(m.get_mediummode()){
                decsum(); 
                int a,b;
                a=1;
                b=0;
               while(a>b){
                   int i=0;
                     if (pileButtons[i].isEnabled()){
                      pileButtons[i].setEnabled(false);
                      i+=1;
                      if(i>a) a=i;
               }
               }
               
                  current_player = SwitchPlayers(current_player);
    cc=0;
    setcount(cc);
    reserbuttons();  
            }
            else if(m.get_hardmode()){
                decsum(); 
               int x = random.nextInt(3) + 1;
               for(int i=0;i<x;i++){
                      pileButtons[i].setEnabled(false);
               }
                   current_player = SwitchPlayers(current_player);
    cc=0;
    setcount(cc);
    reserbuttons(); 
            }
        
    }
   
     
     public void setsum(int sum){
         ss=sum;
     }
     
     public void setcount(int count){
         
         cc=count;
     }
     
     public int getsum(){
         
         return ss;
     }
     
     public int getcount(){
         
         return cc;
     }
       public void setplayer(int player){
         current_player=player;
     }
    
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        endturn = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        r21 = new javax.swing.JButton();
        r22 = new javax.swing.JButton();
        r23 = new javax.swing.JButton();
        r31 = new javax.swing.JButton();
        r32 = new javax.swing.JButton();
        r33 = new javax.swing.JButton();
        r34 = new javax.swing.JButton();
        r35 = new javax.swing.JButton();
        r47 = new javax.swing.JButton();
        r46 = new javax.swing.JButton();
        r45 = new javax.swing.JButton();
        r44 = new javax.swing.JButton();
        r43 = new javax.swing.JButton();
        r42 = new javax.swing.JButton();
        r41 = new javax.swing.JButton();
        playernamelabel = new javax.swing.JLabel();
        kk = new javax.swing.JLabel();
        jj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jButton18.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 51));
        jButton18.setText("BACK");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(40, 40, 90, 50);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIM'S GAME ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 440, 80);

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

        playernamelabel.setBackground(new java.awt.Color(255, 255, 255));
        playernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        playernamelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(playernamelabel);
        playernamelabel.setBounds(30, 160, 170, 40);

        kk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kk.setForeground(new java.awt.Color(255, 255, 255));
        kk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(kk);
        kk.setBounds(30, 200, 170, 40);

        jj.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jj.setForeground(new java.awt.Color(255, 255, 255));
        jj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jj);
        jj.setBounds(30, 240, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        MainPage m = new MainPage();
        m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void endturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endturnActionPerformed
    current_player = SwitchPlayers(current_player);
    cc=0;
    setcount(cc);
    reserbuttons();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_endturnActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
      int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
         
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                          String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
        else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0); 
    //this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void r21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r21ActionPerformed
int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
     String playerName = playernamelabel.getText();   
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                         if (sum==15)
                              
                                JOptionPane.showMessageDialog(null, playerName + " lose");

                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    r47.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_r21ActionPerformed

    private void r22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r22ActionPerformed
         int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                         String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
                         setplayer(next_player);}
        r22.setVisible(false);
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

    private void r23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r23ActionPerformed
      int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                         String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r23ActionPerformed

    private void r31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r31ActionPerformed
      int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                     String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
  
    }//GEN-LAST:event_r31ActionPerformed

    private void r32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r32ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                      String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r32ActionPerformed

    private void r33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r33ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                    String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r33ActionPerformed

    private void r34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r34ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                      String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r34ActionPerformed

    private void r35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r35ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
              else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r35ActionPerformed

    private void r41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r41ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                    String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r41ActionPerformed

    private void r42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r42ActionPerformed
    int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                       String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r42ActionPerformed

    private void r43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r43ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                       String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
           else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
    }//GEN-LAST:event_r43ActionPerformed

    private void r44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r44ActionPerformed
    int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                  String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
            // TODO add your han  // TODO add your handling code here:
    }//GEN-LAST:event_r44ActionPerformed

    private void r45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r45ActionPerformed
   int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                         String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
            // TODO add your // TODO add your handling code here:
    }//GEN-LAST:event_r45ActionPerformed

    private void r46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r46ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                     String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
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
            // TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_r46ActionPerformed

    private void r47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r47ActionPerformed
     int next_player = 0 ;
     int currentPlayer=getplayer();
        String message = null;
        
        
        int sum= getsum();
        int count=getcount();
         
                         count = count+1;
                          sum = sum+1;
                     String playerName = playernamelabel.getText(); 
                         if (sum==15)
                              JOptionPane.showMessageDialog(null, playerName + " lose");
                         else 
                         {
                            
                         if (count==3){
                            next_player = (currentPlayer == 1) ? 2 : 1; 
                            count=0;
                            JOptionPane.showMessageDialog(null, message);
                            
                            
        if (next_player==1)
                message = player1+"  Turns ";
        
            else{
                checkpc();
                  message = player2+"  Turns ";
                             
        } 
                             
                              
                         }
                         setcount(count);
                         setsum(sum);
                         playernamelabel.setText(+current_player+ " turns");
                         kk.setText("total moves :"+sum);
                         jj.setText("current turns :"+count);
                         
                         setplayer(next_player);}
r47.setVisible(false);
r46.setEnabled(false);
r45.setEnabled(false);
r44.setEnabled(false);
r43.setEnabled(false);
r42.setEnabled(false);
r41.setEnabled(false);
        
            // TODO add your handling code here:    // TODO add your handling code here:
    }//GEN-LAST:event_r47ActionPerformed

 
    
    /////////////////////
    ///////////////////////
    ///////////////////////
    ///////////////////////
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
            java.util.logging.Logger.getLogger(PlayWithPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayWithPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayWithPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayWithPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new PlayWithPC().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endturn;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jj;
    private javax.swing.JLabel kk;
    private javax.swing.JLabel playernamelabel;
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
