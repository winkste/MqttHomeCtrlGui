/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyToggleButton extends JButton {
    private Color pressedColor = Color.GREEN;
    private Color rolloverColor = Color.RED;
    private Color normalColor = Color.BLUE;

    public MyToggleButton (String text) {
        super(text);
        setBorderPainted(false);
        setFocusPainted(false);

        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(normalColor);
        setForeground(Color.WHITE);
        setFont(new Font("Tahoma", Font.BOLD, 12));
        setText(text);

        addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                if (getModel().isPressed()) {
                    setBackground(pressedColor);
                } else if (getModel().isRollover()) {
                    setBackground(rolloverColor);
                } else {
                    setBackground(normalColor);
                }
            }

        });
    }
}