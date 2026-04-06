import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        System.out.println("=== ÁREA RESTRITA: LOGIN ===");

        System.out.print("Usuário: ");
        String user = scanner.nextLine();

        System.out.print("Senha: ");
        String pass = scanner.nextLine();

        if (user == usuarioCorreto && pass.equals(senhaCorreta)) {
            System.out.println("\n✅ Acesso Concedido! Bem-vindo, Administrador.");
        } else {
            System.out.println("\n❌ Erro: Usuário ou senha incorretos.");
        }

        scanner.close();
    }
}
