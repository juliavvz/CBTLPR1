import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        StringBuilder saida = new StringBuilder();

        // ----- Exercício 03 -----

        // Instancia p1 com construtor de parâmetros primitivos
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 6, 2026, "Maria Silva", "Dr. Carlos Lima");

        String bloco1 = "=== Propriedades de p1 (apos instanciacao) ===\n"
            + "Paciente : " + p1.getNomePaciente() + "\n"
            + "Medico   : " + p1.getNomeMedico() + "\n"
            + "Data     : " + p1.getData() + "\n"
            + "Hora     : " + p1.getHora() + "\n";
        System.out.println(bloco1);
        saida.append(bloco1).append("\n");

        // Instancia p2 com construtor de digitação
        System.out.println("=== Instanciando p2 (digite os dados) ===");
        ConsultaAgendada p2 = new ConsultaAgendada();

        String bloco2 = "=== Propriedades de p2 (apos instanciacao) ===\n"
            + "Paciente : " + p2.getNomePaciente() + "\n"
            + "Medico   : " + p2.getNomeMedico() + "\n"
            + "Data     : " + p2.getData() + "\n"
            + "Hora     : " + p2.getHora() + "\n";
        System.out.println(bloco2);
        saida.append(bloco2).append("\n");

        // Altera propriedades de p1 por digitação
        System.out.println("=== Alterando propriedades de p1 por digitacao ===");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        String bloco3 = "=== Propriedades de p1 (apos alteracao) ===\n"
            + "Paciente : " + p1.getNomePaciente() + "\n"
            + "Medico   : " + p1.getNomeMedico() + "\n"
            + "Data     : " + p1.getData() + "\n"
            + "Hora     : " + p1.getHora() + "\n";
        System.out.println(bloco3);
        saida.append(bloco3).append("\n");

        String blocoQtd = "Quantidade total de consultas agendadas: " + p1.getAmostra() + "\n";
        System.out.println(blocoQtd);
        saida.append(blocoQtd);

        // ----- Exercício 04 – grava em arquivo -----
        try (PrintWriter pw = new PrintWriter(new FileWriter("resultado.txt"))) {
            pw.print(saida.toString());
            System.out.println("Resultado gravado em resultado.txt");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
