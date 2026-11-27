import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan01 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            matrixB.add(new ArrayList<>());
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog(
                    null, "Masukkan nilai Matrix A [" + i + "][" + j + "]:", 
                    "Input Matrix A", JOptionPane.QUESTION_MESSAGE);
                matrixA.get(i).add(Integer.parseInt(val));
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog(
                    null, "Masukkan nilai Matrix B [" + i + "][" + j + "]:", 
                    "Input Matrix B", JOptionPane.QUESTION_MESSAGE);
                matrixB.get(i).add(Integer.parseInt(val));
            }
        }

        String output = "Matrix A:\n" + formatMatrix(matrixA) + "\n\nMatrix B:\n" + formatMatrix(matrixB);
        JOptionPane.showMessageDialog(null, output, "Input Matrix", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String formatMatrix(ArrayList<ArrayList<Integer>> m) {
        return m.get(0).get(0) + "\t\t" + m.get(0).get(1) + "\n" + 
               m.get(1).get(0) + "\t\t" + m.get(1).get(1);
    }
}