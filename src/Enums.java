// ******* Enums são estruturas com constantes definidas -> dias da semana, meses, turnos do dia, estações

public class Enums {
    public static void main(String[] args) {
        enum DiasDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiasDaSemana hoje = DiasDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.SENIOR;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); // O valor de name precisa der JUNIOR, PLENO OU SENIOR

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nível é Junior");
                break;
            case PLENO:
                System.out.println("Seu nível é Pleno");
                break;
            case SENIOR:
                System.out.println("Seu nível é Senior");
                break;

        }

        // ~~~~~Versão Enhanced ~~~~
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
