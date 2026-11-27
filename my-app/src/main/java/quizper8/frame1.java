package quizper8;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class frame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
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
	public frame1() {
	    setTitle("Aplikasi Kasir");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 600, 400);
	    setLocationRelativeTo(null);

	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(null);
	    contentPane.setBackground(new Color(230, 242, 255));
	    setContentPane(contentPane);

	    JLabel judul = new JLabel("APLIKASI KASIR");
	    judul.setFont(new Font("Arial", Font.BOLD, 28));
	    judul.setForeground(new Color(40, 90, 150));
	    judul.setBounds(175, 45, 300, 40);
	    contentPane.add(judul);

	    JLabel selamat = new JLabel("Selamat Datang!");
	    selamat.setBounds(225, 100, 200, 30);
	    contentPane.add(selamat);

	    JButton barang = new JButton("Data Barang");
	    barang.setBounds(190, 155, 200, 40);
	    barang.setBackground(new Color(75, 145, 210));
	    barang.setForeground(Color.BLACK);
	    contentPane.add(barang);

	    JButton transaksi = new JButton("Transaksi");
	    transaksi.setBounds(190, 210, 200, 40);
	    transaksi.setBackground(new Color(75, 145, 210));
	    transaksi.setForeground(Color.BLACK);
	    contentPane.add(transaksi);

	    JButton keluar = new JButton("Keluar");
	    keluar.setBounds(190, 265, 200, 40);
	    contentPane.add(keluar);
	}

}
