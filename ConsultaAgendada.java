import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    private static final Scanner sc = new Scanner(System.in);

    // Construtor 1 – digitação pelo usuário
    public ConsultaAgendada() {
        System.out.print("Digite o dia: ");
        int d = sc.nextInt();
        System.out.print("Digite o mes: ");
        int m = sc.nextInt();
        System.out.print("Digite o ano: ");
        int a = sc.nextInt();
        this.data = new Data(d, m, a);

        System.out.print("Digite a hora: ");
        int h = sc.nextInt();
        System.out.print("Digite os minutos: ");
        int mi = sc.nextInt();
        System.out.print("Digite os segundos: ");
        int s = sc.nextInt();
        this.hora = new Hora(h, mi, s);

        sc.nextLine();
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = sc.nextLine();

        System.out.print("Digite o nome do medico: ");
        this.nomeMedico = sc.nextLine();

        quantidade++;
    }

    // Construtor 2 – valores primitivos como parâmetros
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    // Construtor 3 – objetos Data e Hora como parâmetros
    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        System.out.print("Novo dia: ");
        int d = sc.nextInt();
        System.out.print("Novo mes: ");
        int m = sc.nextInt();
        System.out.print("Novo ano: ");
        int a = sc.nextInt();
        this.data = new Data(d, m, a);
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        System.out.print("Nova hora: ");
        int h = sc.nextInt();
        System.out.print("Novos minutos: ");
        int mi = sc.nextInt();
        System.out.print("Novos segundos: ");
        int s = sc.nextInt();
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        sc.nextLine();
        System.out.print("Novo nome do paciente: ");
        this.nomePaciente = sc.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Novo nome do medico: ");
        this.nomeMedico = sc.nextLine();
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.toString();
    }

    public String getHora() {
        return hora.toString();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}