package com.progettoRogueLike.view;

import com.progettoRogueLike.controller.GameController;
import com.progettoRogueLike.enums.Direction;
import javax.swing.*;
import java.awt.*;

public class GameView {
    private final GameController controller;
    private JFrame frame;
    private JLabel messageLabel;

    public GameView(GameController controller) {
        this.controller = controller;
    }

    // Inizializza la GUI
    public void init() {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Dungeon Mistery");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Pannello principale con un messaggio
            messageLabel = new JLabel("Benvenuto Eroe..." +
                    "ti trovi all'ingresso del Dungeon... " +
                    "inizia a muoverti o morirai...", SwingConstants.CENTER);
            messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
            frame.getContentPane().add(messageLabel, BorderLayout.CENTER);

            // Bottone esempio per spostare l'eroe verso est
            JButton eastButton = new JButton("Muovi a Est");
            eastButton.addActionListener(e -> controller.moveHero(Direction.EAST));
            frame.getContentPane().add(eastButton, BorderLayout.SOUTH);

            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    // Metodo per aggiornare il messaggio nella GUI
    public void displayMessage(String message) {
        if (messageLabel != null) {
            messageLabel.setText(message);
        }
    }
}
