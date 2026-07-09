package layout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");

        // Create a panel with CardLayout
        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Create multiple panels (cards)
        JPanel card1 = createCard("Card 1", Color.RED);
        JPanel card2 = createCard("Card 2", Color.GREEN);
        JPanel card3 = createCard("Card 3", Color.BLUE);

        // Add cards to the cardPanel with unique names
        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");
        cardPanel.add(card3, "card3");

        // Create buttons to switch between cards
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        // Add action listeners to buttons
        prevButton.addActionListener(e -> cardLayout.previous(cardPanel));
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        // Create a panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add cardPanel and buttonPanel to the frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    // Utility method to create a card panel
    private static JPanel createCard(String text, Color color) {
        JPanel card = new JPanel();
        card.setBackground(color);
        card.add(new JLabel(text));
        return card;
    }
}
