import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JButton seno;
    private JButton coseno;
    private JButton tangente;
    private JButton potencia;
    private JButton raiz;
    private JButton lognat;
    private JButton logbase10;
    private JButton factorial;
    private JButton arcoseno;
    private JButton arccoseno;
    private JButton Arctangente;
    private JTextField num1;
    private JTextField num2;
    private JTextField resultado;
    private JButton borrar;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    public Calculadora() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                double valor2 = Integer.parseInt(num2.getText());
                double res = valor1+valor2;
                resultado.setText(String.valueOf(res));
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                double valor2 = Integer.parseInt(num2.getText());
                double res = valor1-valor2;
                resultado.setText(String.valueOf(res));
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                double valor2 = Integer.parseInt(num2.getText());
                double res = valor1*valor2;
                resultado.setText(String.valueOf(res));
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                double valor2 = Integer.parseInt(num2.getText());
                double res = valor1/valor2;
                if (valor2==0){
                    resultado.setText("No es posible dividir entre 0");
                }else {
                    resultado.setText(String.valueOf(res));
                }
            }
        });
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para la función seno");
                double val1 = Math.toRadians(valor1);
                double res=Math.sin(val1);
                resultado.setText(String.valueOf(res));
            }
        });
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para la función coseno");
                double val1 = Math.toRadians(valor1);
                double res=Math.cos(val1*100.0)/100.0;
                resultado.setText(String.valueOf(res));
            }
        });
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para la función tangente");
                if (valor1 % 180 == 90) {
                    resultado.setText("Indefinido");
                } else {
                    double val1 = Math.toRadians(valor1);
                    double res = Math.tan(val1);
                    resultado.setText(String.valueOf(res));
                }
            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                double valor2 = Integer.parseInt(num2.getText());
                double res = Math.pow(valor1,valor2);
                resultado.setText(String.valueOf(valor1 + " elevado a " + valor2 + " es " + res));
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para la raíz cuadrada");
                if(valor1<0){
                    resultado.setText("No es posible calcular la raíz de un número negativo");
                }else {
                    double res = Math.sqrt(valor1);
                    resultado.setText(String.valueOf(res));
                }
            }
        });
        lognat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para el logaritmo");
                if (valor1<=0){
                    resultado.setText("No es posible calcular el logaritmo de un numero menor o igual que 0");
                }else {
                    double res = Math.log(valor1);
                    resultado.setText(String.valueOf(res));
                }
            }
        });
        logbase10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para la raíz cuadrada");
                if (valor1<=0){
                    resultado.setText("No es posible calcular el logaritmo con base 10 de un numero menor o igual que 0");
                }else {
                    double res = Math.log10(valor1);
                    resultado.setText(String.valueOf(res));
                }
            }
        });
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Integer.parseInt(num1.getText());
                num2.setText("No tomado en cuenta para el factorial");
                int respuesta = 1;
                for (int i = 1; i <= valor1; i++) {
                    respuesta *= i;
                }
                resultado.setText(String.valueOf(respuesta));
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
                resultado.setText("");
            }
        });
        arcoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(num1.getText());
                    double valor2 = Double.parseDouble(num2.getText());
                    double resSuma = valor1 + valor2;
                    if (resSuma >= -1 && resSuma <= 1){
                        double resArcoseno = Math.toDegrees(Math.asin(resSuma));
                        resultado.setText(String.valueOf(resArcoseno));
                    }else {
                        resultado.setText("La suma entre valor 1 y 2 debe ser en un rango entre (-1 y 1) ");
                    }
                }catch (Exception i){
                    JOptionPane.showMessageDialog(null,"La suma entre valor 1 y 2 debe ser en un rango entre (-1 y 1) ");
                }
            }
        });
        arccoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(num1.getText());
                double valor2 = Double.parseDouble(num2.getText());
                double resSuma = valor1 + valor2;

                double resArcoseno = Math.toDegrees(Math.cos(resSuma));
                resultado.setText(String.valueOf(resArcoseno));
            }
        });
        Arctangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(num1.getText());
                double valor2 = Double.parseDouble(num2.getText());
                double resSuma = valor1 + valor2;
                double resArcoseno = Math.toDegrees(Math.atan(resSuma));
                resultado.setText(String.valueOf(resArcoseno));
            }
        });
    }

    public void Inicio(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,600);
        setVisible(true);
        add(panel1);
    }
}
