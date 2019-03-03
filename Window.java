import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    double s = 0;

    public Window() {

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 1024, 800);
        getContentPane().setLayout(null);

        myLabel("Здравствуйте!",300,49,50,450,50);
        myLabel("Данная программа может угадать вашу дату рождения",50,119,30,1000,50);
        myLabel("1. Умножьте число дня своего рождения на два.",50,189,30,1000,50);
        myLabel("2. Прибавьте к полученному числу 5.",50,259,30,1000,50);
        myLabel("3. Умножьте полученный результат на 50.",50,329,30,1000,50);
        myLabel("4. Прибавьте номер месяца в котором вы родились.",50,399,30,1000,50);

        JLabel label = new JLabel();
        label.setFont(new Font("Verdana", Font.ITALIC, 25));
        label.setBounds(50, 509, 1000, 50);
        label.setText("Введите полученное число сюда --->.");
        add(label);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(650, 520, 160, 50);
        add(jTextField);

        JButton Button = new JButton();
        Button.setBounds(355, 620, 260, 50);
        Button.setFont(new Font("Verdana", Font.ITALIC, 20));
        Button.setText("Старт");
        add(Button);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = Double.parseDouble(jTextField.getText());
                s -= 250;
                s /= 100;
                label.setText("Дата вашего рождения ---> " + s);
            }
        });


        setVisible(true);
    }

    public void myLabel(String text, int x, int y, int sizeText, int width, int heigth) {


        JLabel label = new JLabel();
        label.setFont(new Font("Verdana", Font.ITALIC, sizeText));
        label.setBounds(x, y, width, heigth);
        label.setText(text);
        add(label);
    }
}
