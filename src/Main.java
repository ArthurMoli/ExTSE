import javax.swing.JOptionPane;

public class SistemaVotos {
    public static void main(String[] args) {
        String[] nomes = {"Fulano", "Ciclano", "Beltrano"};
        int[] votos = new int[nomes.length];
//Nessa aprte aqui, foi criado o esqueleto do array, relacionando eles e os dados que serao inseridos
        int primeiraTela = 0;
        while (primeiraTela != 3) {
            primeiraTela = Integer.parseInt(JOptionPane.showInputDialog("Olá! Bem vindo(a) ao Sistema Eletrônico eleitoral!\nDigite 1 - Para Abrir a aba Eleitor\nDigite 2 - Para Abrir a aba Mesário (Apenas acesso autorizado!)\nDigite 3 - Para Sair"));
//Aqui temos o início da estrutura lógica, com a primeira tela simulando a entrada na "urna"
            
//Logo abaixo temos o bloco lógico central do código, o do voto; Onde apertado o 1 (seleção eleitor), aparecem os candidatos            
            if (primeiraTela == 1) {
                int voto = -1;
                while (voto != 9) {
                    String input = JOptionPane.showInputDialog("Escolha um dos seguintes nomes para votar:\n"
                            + "0: Fulano\n"
                            + "1: Ciclano\n"
                            + "2: Beltrano\n"
                            + "9: Sair");
                    voto = Integer.parseInt(input);
                    if (voto == 9) {
                        break;
                    } else if (voto >= 0 && voto < nomes.length) {
                        votos[voto]++;
                        JOptionPane.showMessageDialog(null, "Voto computado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    }
                }
                //Aqui temos a opção "Mesário", com uma tela de senha de enfeite, só pra simulação mesmo
            } else if (primeiraTela == 2) {
                JOptionPane.showMessageDialog(null, "Insira a senha de acesso (para fins de demonstração, não há senha).");

                //Aqui temos a opção "Mesário" ainda, mas agora com a função de mostrar votos através dos dados do contadores de nome e votos e os dados inseridos no array
                String result = "Número total de votos para cada nome:\n";
                for (int i = 0; i < nomes.length; i++) {
                    result += nomes[i] + ": " + votos[i] + "\n";
                }
                JOptionPane.showMessageDialog(null, result);
            }
            //aqui são apenas situações excepcionais como a saída do sistema e interações inválidas
            else if (primeiraTela == 3) {
                JOptionPane.showMessageDialog(null, "Saindo do sistema.");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
