package Lesson_8.Counter;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class CounterExample extends JFrame {

    private int value; // значение счетчика
    private int step = 1; // шаг значения

    public CounterExample(int initValue) {
        setBounds(800, 150, 300, 200);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true); // поверх всех окон

        Font font = new Font("Arial", Font.HANGING_BASELINE, 40);
        JLabel valueView = new JLabel(String.valueOf(value)); // создание лейбла со значением
        valueView.setHorizontalAlignment(SwingConstants.CENTER);// выравнивание лейбла по оси х
        valueView.setFont(font); // установка шрифта
        add(valueView, BorderLayout.CENTER);// добавили лейбл и компановщик

        value = initValue; // значение счетчика в метод
        refreshCounterLabel(valueView); // обнуление результат счетчика

        JButton decrementButton = new JButton("<");// созданик кнопки
        add(decrementButton, BorderLayout.LINE_START);
        decrementButton.setFont(font);

        JButton incrementButton = new JButton(">");// созданик кнопки
        add(incrementButton, BorderLayout.LINE_END);
        incrementButton.setFont(font);

        NumberFormat longFormat = NumberFormat.getIntegerInstance();// форматирование чисел

        NumberFormatter numberFormatter = new NumberFormatter(longFormat);
        numberFormatter.setAllowsInvalid(false); // форматирование по умолчанию

        JFormattedTextField stepField = new JFormattedTextField(numberFormatter); //создание поля с форматированием
        stepField.setHorizontalAlignment(SwingConstants.CENTER);// выравнивание по оси х
        stepField.addKeyListener(new KeyAdapter() {//слушатель для кнопки step

            @Override
            public void keyReleased(KeyEvent e) {
                step = Integer.parseInt(stepField.getText());
            }
        });
        add(stepField, BorderLayout.SOUTH);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value - step;
                refreshCounterLabel(valueView);
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = step + value;
                refreshCounterLabel(valueView);
            }
        });

        JButton clearButton = new JButton("reset");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                step = 1;
                value = 0;
                stepField.setValue(step);
                refreshCounterLabel(valueView);
            }
        });
        add(clearButton, BorderLayout.NORTH);

        setVisible(true);
    }

    private void refreshCounterLabel(JLabel valueView) {
        valueView.setText(String.valueOf(value));
    }


    public static void main(String[] args) {
        new CounterExample(0);
    }
}

