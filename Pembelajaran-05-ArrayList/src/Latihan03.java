import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan03 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> dataDosen = new ArrayList<>();
        
        ArrayList<String> row1 = new ArrayList<>();
        row1.add("Septian Cahyadi");
        row1.add("Dramaga cantik residance II, Bogor");
        row1.add("+62 899-9506-210");
        dataDosen.add(row1);
        
        ArrayList<String> row2 = new ArrayList<>();
        row2.add("Isnan Mulia");
        row2.add("Jl.Manunggal, Bogor");
        row2.add("+62 819-3208-0875");
        dataDosen.add(row2);
        
        ArrayList<String> row3 = new ArrayList<>();
        row3.add("Edi Nurachmand");
        row3.add("Taman Cimanggu Permai, Bogor");
        row3.add("+62 856-9380-0384");
        dataDosen.add(row3);
        
        String output = "=== DATA DOSEN ===\n";
        for (int i = 0; i < dataDosen.size(); i++) {
            output += "Dosen " + (i+1) + ":\n";
            output += "Nama Lengkap: " + dataDosen.get(i).get(0) + "\n";
            output += "Alamat: " + dataDosen.get(i).get(1) + "\n";
            output += "No Telp: " + dataDosen.get(i).get(2) + "\n";
            output += "------------------\n";
        }
        
        JOptionPane.showMessageDialog(null, output, "Data Dosen", JOptionPane.INFORMATION_MESSAGE);
    }
}