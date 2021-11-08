package quizjava;
/**
 *
 * @author vitor
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
    
        Answers resposta = new Answers();	
        //Atributos
        private String[] questions = resposta.getQuestions();
        private String[] options = resposta.getOptions();
                
	private char guess;
	private char answer;
	private int index;
	private int correct_guesses =0;
	private int total_questions = questions.length;
	private int result;
	private int seconds=15;
               
        JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
                }
        });	
        //Classe construtor
	public Quiz() {
                
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(0,80,0));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(new Color(0,80,0));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("new tahoma",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(0,0,0));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Bahnschrift SemiBold",Font.BOLD,25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("Impact",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("Impact",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("Impact",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("Impact",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125,100,500,100);
		answer_labelA.setBackground(new Color(0,0,0));
		answer_labelA.setForeground(new Color(0,255,0));
		answer_labelA.setFont(new Font("Century Gothic",Font.PLAIN,35));
		
		answer_labelB.setBounds(125,200,500,100);
		answer_labelB.setBackground(new Color(0,0,0));
		answer_labelB.setForeground(new Color(0,255,0));
		answer_labelB.setFont(new Font("Century Gothic",Font.PLAIN,35));
		
		answer_labelC.setBounds(125,300,500,100);
		answer_labelC.setBackground(new Color(0,0,0));
		answer_labelC.setForeground(new Color(0,255,0));
		answer_labelC.setFont(new Font("Century Gothic",Font.PLAIN,35));
		
		answer_labelD.setBounds(125,400,500,100);
		answer_labelD.setBackground(new Color(0,0,0));
		answer_labelD.setForeground(new Color(0,255,0));
		answer_labelD.setFont(new Font("Century Gothic",Font.PLAIN,35));
		
		seconds_left.setBounds(535,510,100,100);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Impact",Font.BOLD,60));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		time_label.setBounds(535,475,100,25);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(255,0,0));
		time_label.setFont(new Font("Impact",Font.PLAIN,16));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Relógio -> ");
		
		number_right.setBounds(225,225,200,100);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,255,0));
		number_right.setFont(new Font("arial black",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("arial",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
                
                frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
	}
        
        //Classe para ir para a proxima questão
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
		}
		else {
                        resposta.setIndex(index);
                        resposta.organizar();
                        options = resposta.getOptions();
                        resposta.organizarAnswers();
			textfield.setText("Questão "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[0]);
			answer_labelB.setText(options[1]);
			answer_labelC.setText(options[2]);
			answer_labelD.setText(options[3]);
			timer.start();
		}
	}        
        //Classe que faz os eventos dos botões
	@Override
	public void actionPerformed(ActionEvent e) {
		
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			guess = resposta.getAnswers();
			if(e.getSource()==buttonA) {
				answer= 'A';
				if(answer == guess) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == guess) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == guess) {
					correct_guesses++;
				}
			}
			if(e.getSource()==buttonD) {
				answer= 'D';
				if(answer == guess) {
					correct_guesses++;
				}
			}
			displayAnswer();
	}        
        //Classe que recebe se a resposta esta certa e exibe na tela do jogo
	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(resposta.getAnswers() != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(resposta.getAnswers() != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(resposta.getAnswers() != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(resposta.getAnswers() != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				answer = ' ';
				seconds=15;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}        
        //Classe que exibe o resultado em porcentagem de acertos das questões
	public void results(){
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTS!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		frame.add(number_right);
		frame.add(percentage);		
	}                
}
