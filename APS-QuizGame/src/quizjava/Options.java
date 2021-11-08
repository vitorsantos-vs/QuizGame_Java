package quizjava;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author vitor
 */
//Classe que mostra as opções da questões
public class Options extends Questions{
    private String[] questions = getQuestions();
    private String[] options = new String[4];
    private int index = 0;
    public Options(){
        organizar();
    }                                                             
    
    public void organizar(){
         //AQUI VC ADICIONA AS PERGUNTAS
        try { 
        if (questions[index].equals("O QUE É RECICLAGEM?")){  
            String[] opt =  {"“Jogar fora” o lixo produzido", "Reutilizar produtos do lixo","Guardar Lixo em casa","Nome do dado após o descarte"};
            options= opt;    
        }
        else if (questions[index].equals("MEIO DE TRANSPORTE MAIS POLUENTE?")){                
            String[] opt =  {"Carro","Moto","Bicicleta","Avião"};
            options = opt;
        }       
        else if (questions[index].equals("AÇÃO QUE NÃO AUMENTA A POLUIÇÃO DO AR?")){                
            String[] opt =  {"Queimadas","Emissão de gases industriais","Assoreamento","Queima de combustíveis fósseis"};
            options = opt;
        }
        else if (questions[index].equals("COR DA LIXEIRA RESPECTIVA PARA O PAPEL?")){                
            String[] opt =  {"Azul","Verde","Amarelo","Preta"};
            options = opt;
        }
        else if (questions[index].equals("PAIS QUE TEM O MENOR ÍNDICE DE RECICLAGEM?")){                
            String[] opt =  {"Brasil","Japão","China","Estados Unidos"};
            options = opt;
        }
        else if (questions[index].equals("PAIS LIDER MUNDIAL EM RECICLAGEM?")){                
            String[] opt =  {"Brasil","Estados Unidos","Alemanha","Áustria"};
            options = opt;
        }
        else if (questions[index].equals("QUANTIDADE DE PLÁSTICO PRODUZIDO NO BR?")){                
            String[] opt =  {"15%","7%","5%","10%"};
            options = opt;
        }
        else if (questions[index].equals("QUAL O MEIO DE TRANPORTE MENOS POLUENTE?")){                
            String[] opt =  {"Ônibus","Barco","Bicicleta","Moto"};
            options = opt;
        }
        else if (questions[index].equals("QUANTIDADE DE PAEPL PRODUZIDO NO BR?")){                
            String[] opt =  {"17%","33%","44%","39%"};
            options = opt;
        }
        else if (questions[index].equals("PORCENTAGEM DE RECICLAGEM DE VIDRO NO BR?")){                
            String[] opt =  {"2,34%","5,20%","2,95%","4,15%"};
            options = opt;
        }
        else if (questions[index].equals("COR DE LIXEIRA PARA LIXO ORGÂNICO?")){                
            String[] opt =  {"Verde","Marrom","Cinza","Preta"} ;
            options = opt;
        }
        else if (questions[index].equals("EXISTEM QUANTAS ESTAÇÕES CLIMATICAS?")){                
            String[] opt =  {"3", "4", "5", "2"};
            options = opt;
        }
        else if (questions[index].equals("ESTAÇÃO ONDE A TEMPERATURA É MAIS BAIXA?")){                
            String[] opt =  {"Verão", "Inverno", "Primavera", "Outono"};
            options = opt;
        }
        else if (questions[index].equals("QUAL É A FÓRMULA QUIMICA DA ÁGUA?")){                
            String[] opt =  {"cO²", "HO²", "O²H", "H2O"};
            options = opt;
        }
        else if (questions[index].equals("QUANTOS ESTADO A ÁGUA POSSUI?")){                
            String[] opt =  {"2", "4", "3", "1"};
            options = opt;
        }
        else if (questions[index].equals("OS ESTADOS DE TRANSFORMAÇÃO DA ÁGUA?")){                
            String[] opt =  {"liquido, sólido e gasoso", "liquido e sólido", "liquido", "liquido, gasoso, Sólido, Magma"};
            options = opt;
        }
        else if (questions[index].equals("CAMADA QUE ENVOLVEE A TERRA É?")){                
            String[] opt =  {"Hidrosfera", "Camada de Osonio", "Pelicula terretre", "Atmósfera"};
            options = opt;
        }
        else if (questions[index].equals("LOCALIZADO PRÓXIMO A TERRA A LUA É?")){                
            String[] opt =  {"Um planeta", "Uma estrla", "Uma constelação", "Um satelite natural"};
            options = opt;
        }
        else if (questions[index].equals("QUAIS MATERIAIS ABAIXO PODEMOS RECICLAR?")){                
            String[] opt =  {"Arroz", "Apenas plástico", "Papel, pllástico, metal, vidro", "Apenas vidro"};
            options = opt;
        }
        else if (questions[index].equals("NO MESMO SISTEMA SOLAR QUE TERRA O SOL É?")){                
            String[] opt =  {"Uma estrela", "Uma super nova", "Um planeta", "Um buraco branco"};
            options = opt;
        }
        else if (questions[index].equals("O QUE FAZER COM O LIXO ELETRÔNICO(PILHA)?")){                
            String[] opt =  {"Recolher e armazenar em casa", "Juntar com plásticos e metais", "Jogar no lixo comum", "Jogar em locais especificos"};
            options = opt;
        }
        else if (questions[index].equals("COMO CONSUMIR DE FORMA CONSCIÊNTE?")){                
            String[] opt =  {"Não deixa a torneira aberta", "Tomar banho em 5 minutos", "Reutilizar garrafas pet's", "Todas as alternativas"};
            options = opt;
        }
        else if (questions[index].equals("COMO PRESERVAR ÁRVORES E FLORESTAS?")){                
            String[] opt =  {"Construindo uma casa na árvore", "Reciclando todo tipo papal", "Reutilizando metais e vidros", "Indo em parques"};
            options = opt;
        }
        else if (questions[index].equals("INDIQUE UMA VANTAGEM DA ENERGIA SOLAR?")){                
            String[] opt =  {"É renovável", "Não é renováve", "É ineficaz", "Almeta o consumo de energia"};
            options = opt;
        }
        else if (questions[index].equals("UMA BOA AÇÃO PARA O MEIO AMBIÊNTE É?")){                
            String[] opt =  {"Não jogar o lixo fora", "Não reciclar papel", "Não jogar lixo na rua", "Usar moto ou carro"};
            options = opt;
        }
        else if (questions[index].equals("QUANTOS PLANETAS NO SISTEMAS SOLAR?")){                
            String[] opt =  {"6", "7", "8", "9"};
            options = opt;
        }
        else if (questions[index].equals("TEMPO PARA A TERRA DAR UMA VOLTA NO SOL?")){                
            String[] opt =  {"24 Horas", "3 Meses", "6 Meses", "12 Meses"};
            options = opt;
        }
        else if (questions[index].equals("CAUSA DA CONTAMINAÇÃO DO LENÇOL FREÁTICO?")){                
            String[] opt =  {"Poluição do ar", "Poluição do solo", "Poluição sonora", "Poluição da chuva"};
            options = opt;
        }
        else if (questions[index].equals("TEMPO QUE O VIDRO LEVA PARA SE DECOMPOR?")){                
            String[] opt =  {"Tempo inderteninado", "300 anos", "100 anos", "1000 anos"};
            options = opt;
        }
        else if (questions[index].equals("QUAL A PONCENTAGEM DE RECICLAGEM NO BR?")){                
            String[] opt =  {"20%", "10%", "5%", "4%"};
            options = opt;
        }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "PERGUNTAS NÃO ENCONTRADAS!","ERRO",ERROR_MESSAGE);
            System.exit(0);
        }
    }
    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
