
package praktikum3;

import javax.swing.JOptionPane;

public class messagedialog {

    public static void main(String[] args) {

        JOptionPane jop = new JOptionPane();

        // Menampilkan pesan
        // jop.showMessageDialog(null, "hello", "pesan penting", jop.WARNING_MESSAGE);

        // Memasukkan nama
        // String nama = jop.showInputDialog(null, "Masukan nama anda : ");
        // jop.showMessageDialog(null, nama);

        int confirm = jop.showConfirmDialog(
            null,
            "apakah ini kelas pbo?",
            "konfirmasi",
            jop.YES_NO_OPTION
        );

        if (confirm == 1) {
            jop.showMessageDialog(null, "anda pilih no");
        } else {
            jop.showMessageDialog(null, "anda pilih yes");
        }
    }
}
```
