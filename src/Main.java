import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EjerBusquedas b = new EjerBusquedas();
        b.setTitle("Search GPT");
        //Especificar el tamanio del JFrame
        b.setSize(1000, 1000);
        //Tener visible el Browse
        b.setVisible(true);
        //Cierre de la ventana JFrame
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}