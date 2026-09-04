package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonagemView {

    private static JCheckBox chkBolaFogo = new JCheckBox("Bola de Fogo");
    private static JCheckBox chkDragaoAgua = new JCheckBox("Dragão de Água");
    private static JCheckBox chkSerpentePythonic = new JCheckBox("Serpente Python");
    private static JCheckBox chkCafeJava = new JCheckBox("Super Café Java");
    private static JCheckBox chkChidori = new JCheckBox("Chidori");
    private static JCheckBox chkRasengan = new JCheckBox("Rasengan");
    private static JCheckBox chkModoFuria = new JCheckBox("Modo Fúria");

    public static void verificarLimite(JCheckBox clicado) {
        int marcados = 0;

        if (chkBolaFogo.isSelected()) marcados++;
        if (chkCafeJava.isSelected()) marcados++;
        if (chkChidori.isSelected()) marcados++;
        if (chkDragaoAgua.isSelected()) marcados++;
        if (chkModoFuria.isSelected()) marcados++;
        if (chkRasengan.isSelected()) marcados++;
        if (chkSerpentePythonic.isSelected()) marcados++;

        if (marcados > 2) {
            clicado.setSelected(false);
        }
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("Gerador de Personagem de RPG");
        
        // CORREÇÃO VISUAL: Aumentei o tamanho da janela para caber tudo sem amassar os componentes
        janela.setSize(400, 550);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        String[] classes = { "guerreiro", "mago", "paladino", "ladino", "monge", "artífice", "bruxo", "clérigo",
                "bárbaro", "bardo", "druída", "ranger" };
        
        // CORREÇÃO DE ORDEM: Criando as caixas de texto e botões no início para o ActionListener conseguir ler
        JTextField caixaNome = new JTextField(20);
        JButton criarPersonagem = new JButton("Criar Personagem");
        
        JRadioButton facil = new JRadioButton("Facil");
        JRadioButton medio = new JRadioButton("Medio");
        JRadioButton dificil = new JRadioButton("Dificil");

        JPanel painelDificu = new JPanel();
        JComboBox<String> classe2 = new JComboBox<>(classes);
        ButtonGroup grupoClasse = new ButtonGroup();
        grupoClasse.add(facil);
        grupoClasse.add(medio);
        grupoClasse.add(dificil);

        painelDificu.add(new JLabel("Escolha a Dificuldade:"));
        painelDificu.add(facil);
        painelDificu.add(medio);
        painelDificu.add(dificil);

        ActionListener acaoClique = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox clicado = (JCheckBox) e.getSource();
                verificarLimite(clicado);
            }
        };
        
        chkBolaFogo.addActionListener(acaoClique);
        chkDragaoAgua.addActionListener(acaoClique);
        chkSerpentePythonic.addActionListener(acaoClique);
        chkCafeJava.addActionListener(acaoClique);
        chkChidori.addActionListener(acaoClique);
        chkRasengan.addActionListener(acaoClique);
        chkModoFuria.addActionListener(acaoClique);

        JPanel painelHabilidades = new JPanel();
        painelHabilidades.add(new JLabel("Escolha até duas habilidades: "));
        painelHabilidades.add(chkBolaFogo);
        painelHabilidades.add(chkDragaoAgua);
        painelHabilidades.add(chkSerpentePythonic);
        painelHabilidades.add(chkCafeJava);
        painelHabilidades.add(chkChidori);
        painelHabilidades.add(chkRasengan);
        painelHabilidades.add(chkModoFuria);

        JSlider nivel = new JSlider(1, 10, 1);
        nivel.setPaintLabels(true); 
        nivel.setMajorTickSpacing(1); 
        nivel.setPaintTicks(true); 

        // O ActionListener agora lê perfeitamente as variáveis caixaNome e criarPersonagem
        criarPersonagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] selecionados = new String[6];

                selecionados[0] = caixaNome.getText();
                selecionados[1] = (String) classe2.getSelectedItem();

                if (facil.isSelected()) {
                    selecionados[2] = "Fácil";
                } else if (medio.isSelected()) {
                    selecionados[2] = "Médio";
                } else if (dificil.isSelected()) {
                    selecionados[2] = "Difícil";
                }

                selecionados[3] = String.valueOf(nivel.getValue());

                int indiceHabilidade = 4;

                if (chkBolaFogo.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Bola de Fogo";
                if (chkDragaoAgua.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Dragão de Água";
                if (chkSerpentePythonic.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Serpente Python";
                if (chkCafeJava.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Super Café Java";
                if (chkChidori.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Chidori";
                if (chkRasengan.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Rasengan";
                if (chkModoFuria.isSelected() && indiceHabilidade <= 5)
                    selecionados[indiceHabilidade++] = "Modo Fúria";
                
                String textoVetor = 
                        "Nome: " + selecionados[0] + "\n" +
                        "Classe: " + selecionados[1] + "\n" +
                        "Dificuldade: " + selecionados[2] + "\n" +
                        "Nível: " + selecionados[3] + "\n" +
                        "Habilidade 1: " + (selecionados[4] != null ? selecionados[4] : "Nenhuma") + "\n" +
                        "Habilidade 2: " + (selecionados[5] != null ? selecionados[5] : "Nenhuma");

                javax.swing.JOptionPane.showMessageDialog(janela, textoVetor);
            }
        });

        // Adicionando tudo fisicamente na tela
        janela.add(new JLabel("Digite o nome do personagem: "));
        janela.add(caixaNome);
        janela.add(painelDificu);
        janela.add(new JLabel("Classe: "));
        janela.add(classe2);
        janela.add(painelHabilidades);
        janela.add(new JLabel("Selecione o Nível Inicial: "));
        janela.add(nivel);
        janela.add(criarPersonagem);

        janela.setVisible(true);
    }
}
