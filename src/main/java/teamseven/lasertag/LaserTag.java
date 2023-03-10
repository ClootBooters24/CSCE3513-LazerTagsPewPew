/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamseven.lasertag;

/**
 *
 * @author dmr019
 * @author drstull
 */
public class LaserTag {
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen splashScreen = new SplashScreen();
        EntryTerminal entryTerminal = new EntryTerminal();
        PlayerAction playAction = new PlayerAction();

        // Database db = new Database();

        // db.openDatabase();
        // db.readRecords();
        // db.createRecord(9, "Paul", "Smith", "brug");
        // db.deleteRecord(9, "Paul", "Smith", "brug");
        // db.inTable(100);
        // db.closeDatabase();
        
        /* Create and display the form */
        // make splashScreen visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                splashScreen.setVisible(true);
            }
        });
        
        // display splash screen for 3 seconds
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
        }
        
        splashScreen.dispose();
        
        // make entryTerminal visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                entryTerminal.setVisible(true);
            }
        });

        try
        {
            Thread.sleep(300);
        }
        catch (InterruptedException e)
        {
        }


        while(entryTerminal.isVisibil)
        {
            //do nothing just let the player entry run
            System.out.print("");
        }

 
        entryTerminal.dispose();

        //before anything we need to run the count down timer which can be a seperate class.


        //we need to pass the array values to the actionScreen first though
        System.out.println("Red Team: " + entryTerminal.redTeamNameList);
        System.out.println("Green Team: " + entryTerminal.greenTeamNameList);
        //this is where we'll then run an instance of the player action screen once 
        //the F3 key is hit in the player entry screen.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                playAction.setVisible(true);
            }
        });
        //going to need to add functionality so that the screen closes after a certain set time or from an action listener
        //now for testing purposes just letting the screen run until closed by the (x) or run for 3 seconds

        // try
        // {
        //     Thread.sleep(3000);
        // }
        // catch (InterruptedException e)
        // {
        // }

        //playAction.dispose();

        //System.exit(0);        
    }
    
}
