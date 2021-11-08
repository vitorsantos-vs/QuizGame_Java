package quizjava;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author vitor
 */
//Classe responsavel pela resposta certa da cade questão 
public class Answers extends Options{
    private String[] options;
    private char answers;
    public Answers(){
        organizarAnswers();
    }
    private char[] aux = { 'A','B','C','D'};
    
    //Neste método vc organiza as respostas de acordo com as opções corretas
    public void organizarAnswers(){
        options = getOptions();
        //AQUI VC ADICIONA AS RESPOSTAS CORRETAS DAS PERGUNTAS
        
        for (int i = 0; i < options.length; i++) { 
            try {
            if (options[i].equals("Reutilizar produtos do lixo")){                
                answers = aux[i];
            }
            else if (options[i].equals("Avião")){                
                answers = aux[i];
            }            
            else if (options[i].equals("Assoreamento")){                
                answers = aux[i];
            }
            else if (options[i].equals("Azul")){                
                answers = aux[i];
            }
            else if (options[i].equals("Brasil")){                
                answers = aux[i];
            }
            else if (options[i].equals("Alemanha")){                
                answers = aux[i];
            }
            else if (options[i].equals("7%")){                
                answers = aux[i];
            }
            else if (options[i].equals("Bicicleta")){                
                answers = aux[i];
            }
            else if (options[i].equals("39%")){                
                answers = aux[i];
            }
            else if (options[i].equals("2,34%")){                
                answers = aux[i];
            }
            else if (options[i].equals("Cinza")){                
                answers = aux[i];
            }
            else if (options[i].equals("4")){                
                answers = aux[i];
            }
            else if (options[i].equals("Inverno")){                
                answers = aux[i];
            }
            else if (options[i].equals("H2O")){                
                answers = aux[i];
            }
            else if (options[i].equals("3")){                
                answers = aux[i];
            }
            else if (options[i].equals("liquido, sólido e gasoso")){                
                answers = aux[i];
            }
            else if (options[i].equals("Atmósfera")){                
                answers = aux[i];
            }
            else if (options[i].equals("Um satelite natural")){                
                answers = aux[i];
            }
            else if (options[i].equals("Papel, pllástico, metal, vidro")){                
                answers = aux[i];
            }
            else if (options[i].equals("Uma estrela")){                
                answers = aux[i];
            }
            else if (options[i].equals("Jogar em locais especificos")){                
                answers = aux[i];
            }
            else if (options[i].equals("Todas as alternativas")){                
                answers = aux[i];
            }
            else if (options[i].equals("Reciclando todo tipo papal")){                
                answers = aux[i];
            }
            else if (options[i].equals("É renovável")){                
                answers = aux[i];
            }
            else if (options[i].equals("Não jogar lixo na rua")){                
                answers = aux[i];
            }
            else if (options[i].equals("8")){                
                answers = aux[i];
            }
            else if (options[i].equals("12 Meses")){                
                answers = aux[i];
            }
            else if (options[i].equals("Poluição do solo")){                
                answers = aux[i];
            }
            else if (options[i].equals("Tempo inderteninado")){                
                answers = aux[i];
            }
            else if (options[i].equals("4%")){                
                answers = aux[i];
            }
            } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "RESPOSTAS NÃO ENCONTRADAS!","ERRO",ERROR_MESSAGE);
            System.exit(0);
        }
        }
    }
    public char getAnswers() {
        return answers;
    }
    public void setAnswers(char answers) {
        this.answers = answers;
    } 
}
