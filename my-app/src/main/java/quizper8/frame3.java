package quizper8;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame3 frame = new frame3();
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
	public frame3() {
	    setTitle("Transaksi");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 600, 430);
	    setLocationRelativeTo(null);

	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(null);
	    contentPane.setBackground(new Color(230, 242, 255));
	    setContentPane(contentPane);

	    JLabel judul = new JLabel("TRANSAKSI");
	    judul.setFont(new Font("Arial", Font.BOLD, 24));
	    judul.setForeground(new Color(40, 90, 150));
	    judul.setBounds(220, 25, 200, 40);
	    contentPane.add(judul);

	    JLabel pembeli = new JLabel("Nama Pembeli");
	    pembeli.setBounds(80, 90, 120, 30);
	    contentPane.add(pembeli);

	    JTextField txtPembeli = new JTextField();
	    txtPembeli.setBounds(220, 90, 250, 30);
	    contentPane.add(txtPembeli);

	    JLabel barang = new JLabel("Nama Barang");
	    barang.setBounds(80, 140, 120, 30);
	    contentPane.add(barang);

	    JComboBox<String> cbBarang = new JComboBox<>(
	        new String[]{"Pilih Barang", "Buku", "Pensil", "Pulpen"}
	    );
	    cbBarang.setBounds(220, 140, 250, 30);
	    contentPane.add(cbBarang);

	    JLabel jumlah = new JLabel("Jumlah");
	    jumlah.setBounds(80, 190, 120, 30);
	    contentPane.add(jumlah);

	    JTextField txtJumlah = new JTextField();
	    txtJumlah.setBounds(220, 190, 250, 30);
	    contentPane.add(txtJumlah);

	    JLabel total = new JLabel("Total Harga");
	    total.setBounds(80, 240, 120, 30);
	    contentPane.add(total);

	    JTextField txtTotal = new JTextField();
	    txtTotal.setBounds(220, 240, 250, 30);
	    contentPane.add(txtTotal);

	    JButton hitung = new JButton("Hitung");
	    hitung.setBounds(220, 300, 110, 35);
	    hitung.setBackground(new Color(75, 145, 210));
	    hitung.setForeground(Color.BLACK);
	    hitung.setOpaque(true);
	    contentPane.add(hitung);

	    JButton kembali = new JButton("Kembali");
	    kembali.setBounds(350, 300, 110, 35);
	    kembali.setBackground(new Color(210, 225, 245));
	    kembali.setForeground(Color.BLACK);
	    contentPane.add(kembali);
	}

}
