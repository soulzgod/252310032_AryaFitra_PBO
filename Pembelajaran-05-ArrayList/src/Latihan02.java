import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixC = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            matrixB.add(new ArrayList<>());
            matrixC.add(new ArrayList<>());
        }

        inputMatrix(matrixA, "A");
        inputMatrix(matrixB, "B");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = 0;
                for (int k = 0; k < 2; k++) {
                    sum += matrixA.get(i).get(k) * matrixB.get(k).get(j);
                }
                matrixC.get(i).add(sum);
            }
        }

        String output = "Matrix A:\n" + fmt(matrixA) + "\n\n" +
                        "Matrix B:\n" + fmt(matrixB) + "\n\n" +
                        "Matrix C (A * B):\n" + fmt(matrixC);
                        
        JOptionPane.showMessageDialog(null, output, "Hasil Perkalian Matrix", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void inputMatrix(ArrayList<ArrayList<Integer>> m, String name) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String val = JOptionPane.showInputDialog(null, "Masukkan nilai Matrix " + name + " [" + i + "][" + j + "]:");
                m.get(i).add(Integer.parseInt(val));
            }
        }
    }

    private static String fmt(ArrayList<ArrayList<Integer>> m) {
        return m.get(0).get(0) + "\t\t" + m.get(0).get(1) + "\n" + 
               m.get(1).get(0) + "\t\t" + m.get(1).get(1);
    }
}