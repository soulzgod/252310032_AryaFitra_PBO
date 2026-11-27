package com.sample.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class pertemuan8 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pertemuan8 frame = new pertemuan8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pertemuan8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem New = new JMenuItem("New File");
		mnNewMenu.add(New);
		
		JMenuItem Open = new JMenuItem("Open File");
		mnNewMenu.add(Open);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);

		New.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			JFileChooser fileChooser = new JFileChooser();
			int isChoosen = fileChooser.showSaveDialog(null);
			
			if(isChoosen == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				try {
					if (file.createNewFile()) {
						System.out.println("File dibuat : " + file);
					} else {
						System.out.println("File sudah ada : " + file);
					}
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}else {
			System.out.println("Tidak ada file yang dipilih");
			}
			
				
			}
		});
	}
}