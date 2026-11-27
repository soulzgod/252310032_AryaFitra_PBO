package quizper8;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class frame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
	    setTitle("Data Barang");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 600, 400);
	    setLocationRelativeTo(null);

	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(null);
	    contentPane.setBackground(new Color(230, 242, 255));
	    setContentPane(contentPane);

	    JLabel judul = new JLabel("DATA BARANG");
	    judul.setFont(new Font("Arial", Font.BOLD, 24));
	    judul.setForeground(new Color(40, 90, 150));
	    judul.setBounds(190, 30, 250, 40);
	    contentPane.add(judul);

	    JLabel nama = new JLabel("Nama Barang");
	    nama.setBounds(90, 110, 120, 30);
	    contentPane.add(nama);

	    JTextField txtNama = new JTextField();
	    txtNama.setBounds(220, 110, 250, 30);
	    contentPane.add(txtNama);

	    JLabel harga = new JLabel("Harga Barang");
	    harga.setBounds(90, 165, 120, 30);
	    contentPane.add(harga);

	    JTextField txtHarga = new JTextField();
	    txtHarga.setBounds(220, 165, 250, 30);
	    contentPane.add(txtHarga);

	    JLabel stok = new JLabel("Stok Barang");
	    stok.setBounds(90, 220, 120, 30);
	    contentPane.add(stok);

	    JTextField txtStok = new JTextField();
	    txtStok.setBounds(220, 220, 250, 30);
	    contentPane.add(txtStok);

	    JButton simpan = new JButton("Simpan");
	    simpan.setBounds(220, 285, 110, 35);
	    simpan.setBackground(new Color(75, 145, 210));
	    simpan.setForeground(Color.BLACK);
	    simpan.setOpaque(true);
	    contentPane.add(simpan);

	    JButton kembali = new JButton("Kembali");
	    kembali.setBounds(350, 285, 110, 35);
	    kembali.setBackground(new Color(210, 225, 245));
	    kembali.setForeground(Color.BLACK);
	    contentPane.add(kembali);
	}

}
