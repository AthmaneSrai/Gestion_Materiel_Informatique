
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ProBook
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        menu_6 = new javax.swing.JLabel();
        menu_5 = new javax.swing.JLabel();
        menu_3 = new javax.swing.JLabel();
        menu_2 = new javax.swing.JLabel();
        menu_1 = new javax.swing.JLabel();
        menu_0 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        Homebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1083, 733));
        setPreferredSize(new java.awt.Dimension(1083, 733));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 735));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 735));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 735));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_06.png"))); // NOI18N
        menu_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_6.setMaximumSize(new java.awt.Dimension(117, 28));
        menu_6.setMinimumSize(new java.awt.Dimension(117, 28));
        menu_6.setPreferredSize(new java.awt.Dimension(117, 28));
        menu_6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_6MouseMoved(evt);
            }
        });
        menu_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_6MouseExited(evt);
            }
        });
        jPanel1.add(menu_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 342, 140, 40));

        menu_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_05.png"))); // NOI18N
        menu_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_5MouseMoved(evt);
            }
        });
        menu_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_5MouseExited(evt);
            }
        });
        jPanel1.add(menu_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 291, 160, 40));

        menu_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_03.png"))); // NOI18N
        menu_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_3.setPreferredSize(new java.awt.Dimension(117, 20));
        menu_3.setVerifyInputWhenFocusTarget(false);
        menu_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_3MouseMoved(evt);
            }
        });
        menu_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_3MouseExited(evt);
            }
        });
        jPanel1.add(menu_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 240, 130, 40));

        menu_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_02.png"))); // NOI18N
        menu_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_2.setPreferredSize(new java.awt.Dimension(117, 20));
        menu_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_2MouseMoved(evt);
            }
        });
        menu_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_2MouseExited(evt);
            }
        });
        jPanel1.add(menu_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 184, 120, 50));

        menu_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_01.png"))); // NOI18N
        menu_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_1MouseMoved(evt);
            }
        });
        menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_1MouseExited(evt);
            }
        });
        jPanel1.add(menu_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 143, 120, 40));

        menu_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu_00RG.png"))); // NOI18N
        menu_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_0.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_0MouseMoved(evt);
            }
        });
        menu_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_0MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_0MouseExited(evt);
            }
        });
        jPanel1.add(menu_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 96, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power.png"))); // NOI18N
        logout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logoutMouseMoved(evt);
            }
        });
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 400, 30, 30));

        Homebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home.png"))); // NOI18N
        jPanel1.add(Homebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_0MouseClicked

    private void menu_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_2MouseClicked
      // TODO add your handling code here:
      Materiel M = new Materiel();
      M.setVisible(true);
      M.setLocationRelativeTo(null);
      dispose();
    }//GEN-LAST:event_menu_2MouseClicked

    private void menu_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_3MouseClicked
        // TODO add your handling code here:
      Utilisateur U = new Utilisateur();
      U.setVisible(true);
      U.setLocationRelativeTo(null);
      dispose();
    }//GEN-LAST:event_menu_3MouseClicked

    private void menu_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_5MouseClicked
        // TODO add your handling code here:
        Recherche Re = new Recherche();
        Re.setVisible(true);
        Re.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_menu_5MouseClicked

    private void menu_0MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_0MouseMoved
     
        menu_0.setIcon(new ImageIcon(getClass().getResource("/icons/menu_00R.png")));
    }//GEN-LAST:event_menu_0MouseMoved

    private void menu_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_0MouseExited

         menu_0.setIcon(new ImageIcon(getClass().getResource("/icons/menu_00RG.png")));
    }//GEN-LAST:event_menu_0MouseExited

    private void menu_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_1MouseMoved

        menu_1.setIcon(new ImageIcon(getClass().getResource("/icons/menu_01G.png")));
    }//GEN-LAST:event_menu_1MouseMoved

    private void menu_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_1MouseExited

        menu_1.setIcon(new ImageIcon(getClass().getResource("/icons/menu_01.png")));
    }//GEN-LAST:event_menu_1MouseExited

    private void menu_2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_2MouseMoved
        menu_2.setIcon(new ImageIcon(getClass().getResource("/icons/menu_02G.png")));
    }//GEN-LAST:event_menu_2MouseMoved

    private void menu_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_2MouseExited
        menu_2.setIcon(new ImageIcon(getClass().getResource("/icons/menu_02.png")));
    }//GEN-LAST:event_menu_2MouseExited

    private void menu_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_3MouseMoved
        menu_3.setIcon(new ImageIcon(getClass().getResource("/icons/menu_03G.png")));
    }//GEN-LAST:event_menu_3MouseMoved

    private void menu_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_3MouseExited
        menu_3.setIcon(new ImageIcon(getClass().getResource("/icons/menu_03.png")));
    }//GEN-LAST:event_menu_3MouseExited

    private void menu_5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_5MouseMoved
        menu_5.setIcon(new ImageIcon(getClass().getResource("/icons/menu_05G.png")));
    }//GEN-LAST:event_menu_5MouseMoved

    private void menu_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_5MouseExited
        menu_5.setIcon(new ImageIcon(getClass().getResource("/icons/menu_05.png")));
    }//GEN-LAST:event_menu_5MouseExited

    private void menu_6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_6MouseMoved
        menu_6.setIcon(new ImageIcon(getClass().getResource("/icons/menu_06G.png")));
    }//GEN-LAST:event_menu_6MouseMoved

    private void menu_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_6MouseExited
        menu_6.setIcon(new ImageIcon(getClass().getResource("/icons/menu_06.png")));
    }//GEN-LAST:event_menu_6MouseExited

    private void menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_1MouseClicked
      Admine A = new Admine();
      A.setVisible(true);
      A.setLocationRelativeTo(null);
      dispose();
    }//GEN-LAST:event_menu_1MouseClicked

    private void logoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseMoved
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power-red.png")));
    }//GEN-LAST:event_logoutMouseMoved

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power.png")));
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
    int val=JOptionPane.showConfirmDialog(null, "Voulez-Vous Vraiment Quitter ?");
        if(val==1){

        }else if(val==0){   
        
        Login l = new Login();
       l.setVisible(true);
       l.setLocationRelativeTo(null);
       dispose();
       }
    }//GEN-LAST:event_logoutMouseClicked

    private void menu_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_6MouseClicked
        try {
            Desktop.getDesktop().open(new File("D:\\NetBeansProjects\\Gestion_Materiel\\src\\pdf\\Guide.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_6MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Home H = new Home();
        H.setVisible(true);
        H.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Homebg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menu_0;
    private javax.swing.JLabel menu_1;
    private javax.swing.JLabel menu_2;
    private javax.swing.JLabel menu_3;
    private javax.swing.JLabel menu_5;
    private javax.swing.JLabel menu_6;
    // End of variables declaration//GEN-END:variables
}