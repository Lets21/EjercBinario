import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjerBinariointer extends JFrame {
    private JButton btnInicio;
    private JPanel panelSearch;
    private JTextArea textArea1;

    String text = "";

    public EjerBinariointer() {

        setContentPane(panelSearch);

        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio();
            }
        });
    }

    private void inicio(){
        //Target
        int target1 = 21;
        int target2 = 98;
        int target3 = 465;
        int target4 = 3001;
        int target5 = 69685;
        int target6 = 845000;
        int target7 = 2000000;

        int[] a1 = createArray(10);
        int[] a2 = createArray(100);
        int[] a3 = createArray(1000);
        int[] a4 = createArray(10000);
        int[] a5 = createArray(100000);
        int[] a6 = createArray(1000000);
        int[] a7 = createArray(10000000);

        text += "------ Busqueda Lineal ------\n\n";

        bqLineal(a1, target1);
        bqLineal(a2, target2);
        bqLineal(a3, target3);
        bqLineal(a4, target4);
        bqLineal(a5, target5);
        bqLineal(a6, target6);
        bqLineal(a7, target7);

        text += "------Busqueda Binaria ------\n\n";

        bqBinaria(a1, target1);
        bqBinaria(a2, target2);
        bqBinaria(a3, target3);
        bqBinaria(a4, target4);
        bqBinaria(a5, target5);
        bqBinaria(a6, target6);
        bqBinaria(a7, target7);


        textArea1.setText(text);
        text = "";
    }

    private void bqBinaria(int[] a, int target){
        int res = -1;
        int izq = 0;
        int dere = a.length - 1;

        text += "--- Inicio de busqueda binaria en el arreglo " + a.length + " ---\n";

        long tiempoInicio = System.nanoTime();

        while (izq <= dere) {
            int media = (izq + dere) / 2;

            if (a[media] == target) {
                res = media;
                break;
            } else if (a[media] < target) {
                izq = media + 1;
            } else {
                dere = media - 1;
            }
        }

        long tiempoFinal = System.nanoTime();

        text += "\nTarget: " + target + "\n";

        text += "Tiempo: " + (tiempoFinal - tiempoInicio) + "ns\n";

        if(res != -1){
            text += "Posicion: " + res + "\n\n";
        }else{
            text += "No sepudo hallar el target\n\n";
        }
    }

    private void bqLineal(int[] a, int target){
        int res = -1;

        text += "--- Inicio de busqueda lineal en el arreglo " + a.length + " ---\n";

        long tiempoInicio = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            if(a[i] == target){
                res = i;
                break;
            }
        }

        long tiempoFinal = System.nanoTime();

        text += "\nTarget: " + target + "\n";

        text += "Tiempo: " + (tiempoFinal - tiempoInicio) + "ns\n";

        if(res != -1){
            text += "Posicion: " + res + "\n\n";
        }else{
            text += "No se hallo el target\n\n";
        }
    }

    private int[] createArray(int t) {
        int[] arreglo = new int[t];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
