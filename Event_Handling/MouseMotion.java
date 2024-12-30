package Event_Handling;



    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotion extends JFrame implements MouseMotionListener {

    JLabel coordinatesLabel;

    public MouseMotion() {
        // Set up the frame
        setTitle("Bhavesh khose frame");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display coordinates
        coordinatesLabel = new JLabel("Move the mouse inside the window");
        coordinatesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(coordinatesLabel, BorderLayout.SOUTH);

        // Add MouseMotionListener to the frame
        addMouseMotionListener(this);

        setVisible(true);
    }

    // Implement the methods of MouseMotionListener
    @Override
    public void mouseMoved(MouseEvent e) {
        coordinatesLabel.setText("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        coordinatesLabel.setText("Mouse Dragged to: (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseMotion();
    }
}

