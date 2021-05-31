
public class TesteGerente {

    public static void main(String[] args) {
        
        Autenticavel referencia = new Gerente();
        Autenticavel referencia_1 = new Cliente();
        Gerente gerente = new Gerente();

        gerente.setNome("Nico");
        gerente.setCpf("122345678");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        
        
        gerente.setSenha(22227);
        boolean autenticou = gerente.autentica(22227);
        System.out.println(autenticou);
        
        System.out.println(gerente.getBonificao());

    }

}
