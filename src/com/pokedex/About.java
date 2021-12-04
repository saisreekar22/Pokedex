package com.pokedex;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.pokedex.db.DBConnection;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.*;
import java.util.concurrent.ExecutionException;

public class About extends JFrame{

    Image loading;


    public About() {
        loading = Toolkit.getDefaultToolkit().getImage("assets/oak.jpg");
		ImageIcon loadingIcon = new ImageIcon(loading);
		setSize(loadingIcon.getIconWidth(), loadingIcon.getIconHeight());
		setLocationRelativeTo(null);
		setVisible(true);
    }

    @Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(loading, 0, 0, this);
	}
}
