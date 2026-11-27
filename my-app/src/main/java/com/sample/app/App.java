package com.sample.app;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
	
	public App() {
		setTitle("Login Form");
		setSize(400, 350);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);;
		
		GenerateUI(this);
		
		setVisible(true);
	}
	
	private	 void GenerateUI(App frame) {
		
		//panel utama
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		frame.setContentPane(mainPanel);
		
		//oanel untuk form
		JPanel paneli = new JPanel();
		paneli.setLayout(null);
		paneli.setBackground(Color.WHITE);
		
	}
	
	public static void main(String[] args) {
		new App();
		
	}
}