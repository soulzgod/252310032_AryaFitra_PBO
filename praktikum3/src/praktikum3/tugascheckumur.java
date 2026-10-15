package praktikum3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class tugascheckumur {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		jop.showMessageDialog(null, "check umur");
		String input =jop.showInputDialog(null, "masukan umur anda: "); 
			int umur = Integer.parseInt(input);
		
		if(umur>=18) {
			jop.showMessageDialog(null, "anda sudah cukup umur");
		}
		else {
			jop.showMessageDialog(null, "anda belum cukup umur");
		}
			}
		}

