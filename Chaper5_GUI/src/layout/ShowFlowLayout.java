package layout;

import javax.swing.*;
import java.awt.*;

public class ShowFlowLayout {
    public static void main( String args[] ) {
        JFrame win = new JFrame( "My First GUI Program" );
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        win.getContentPane().setLayout( new FlowLayout() );

        for ( int i = 0; i < 10; i++ ) {
            win.getContentPane().add(
                    new JButton( String.valueOf( i ) ) );
        }

        win.setVisible(true);
    }
}