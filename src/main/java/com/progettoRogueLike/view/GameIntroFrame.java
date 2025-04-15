package com.progettoRogueLike.view;

import com.progettoRogueLike.controller.GameController;
import javax.swing.*;
import java.awt.*;

public class GameIntroFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JLabel confirmationLabel;
    private final GameController controller;


    public GameIntroFrame(GameController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // --- Welcome Panel ---
        JPanel welcomePanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Benvenuto nel Dungeon RogueLike!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        JButton nextButton = new JButton("Avanti");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel)); // Passa al prossimo pannello
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);
        welcomePanel.add(nextButton, BorderLayout.SOUTH);
        cardPanel.add(welcomePanel, "welcome");

        // --- Intro Panel ---
        JPanel introPanel = new JPanel(new BorderLayout());
        JLabel introLabel = new JLabel(
                "<html><center>In questo dungeon, affronterai sfide e scoprirai misteri.<br>"
                + "Preparati per un'avventura unica!</center></html>",
                SwingConstants.CENTER);
        introLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JButton continueButton = new JButton("Continua");
        continueButton.addActionListener(e -> cardLayout.next(cardPanel)); // Passa al pannello successivo
        introPanel.add(introLabel, BorderLayout.CENTER);
        introPanel.add(continueButton, BorderLayout.SOUTH);
        cardPanel.add(introPanel, "intro");

        // --- Hero Input Panel ---
        JPanel heroInputPanel = new JPanel(new BorderLayout());
        JLabel nameLabel = new JLabel("Inserisci il nome del tuo eroe:", SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel inputPanel = new JPanel();
        JTextField nameField = new JTextField(20);
        JButton confirmButton = new JButton("Conferma");
        confirmButton.addActionListener(e -> {
            String heroName = nameField.getText();
            if (!heroName.trim().isEmpty()) {
                // Memorizza il nome dell'eroe nel controller
                controller.setHeroName(heroName);
                confirmationLabel.setText("Ok " + heroName + ", attento a non morire!");
                // Passa alla schermata successiva o chiudi l'intro
                cardLayout.next(cardPanel);
            } else {
                JOptionPane.showMessageDialog(this, "Inserisci un nome valido!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        });
        inputPanel.add(nameField);
        inputPanel.add(confirmButton);

        heroInputPanel.add(nameLabel, BorderLayout.NORTH);
        heroInputPanel.add(inputPanel, BorderLayout.CENTER);
        cardPanel.add(heroInputPanel, "heroInput");

        // --- Confirmation Panel ---
        JPanel confirmationPanel = new JPanel(new BorderLayout());
        // La JLabel che verrà aggiornata con il nome dell'eroe
        confirmationLabel = new JLabel("", SwingConstants.CENTER);
        confirmationLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JButton startGameButton = new JButton("Inizia il Gioco");
        startGameButton.addActionListener(e -> {
            // Chiude l'intro e avvia la GameView tramite il controller
            this.dispose();
            controller.startGameView();
        });
        confirmationPanel.add(confirmationLabel, BorderLayout.CENTER);
        confirmationPanel.add(startGameButton, BorderLayout.SOUTH);
        cardPanel.add(confirmationPanel, "confirmation");

        // Aggiungi il cardPanel al frame
        this.getContentPane().add(cardPanel);
        this.setTitle("Introduzione");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
