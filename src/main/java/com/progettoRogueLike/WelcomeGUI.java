package com.progettoRogueLike;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Font;

public class WelcomeGUI {

    public static void main(String[] args) {
        // La GUI deve essere creata ed eseguita nel thread apposito per le interfacce (event-dispatch thread)
        SwingUtilities.invokeLater(WelcomeGUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Creazione del container principale: JFrame
        JFrame frame = new JFrame("Benvenuto su RogueLike");

        // Impostazione della chiusura dell'applicazione quando viene chiusa la finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione di una JLabel per visualizzare il messaggio di benvenuto
        JLabel welcomeLabel = new JLabel("Benvenuto nel Dungeon RogueLike!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Aggiunta della JLabel al pannello principale del frame
        frame.getContentPane().add(welcomeLabel, BorderLayout.CENTER);

        // Impostazione delle dimensioni della finestra
        frame.setSize(400, 200);
        // Posizionamento della finestra al centro dello schermo
        frame.setLocationRelativeTo(null);
        // Rendi la finestra visibile
        frame.setVisible(true);
    }
}
