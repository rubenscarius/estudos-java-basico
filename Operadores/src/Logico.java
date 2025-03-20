public class Logico {
    public static void main(String[] args) throws Exception {
        // Lógicos
        /*
         * && e
         * || ou
         * ! não
         */
        float salario = 1000f;
        boolean estaDeFerias = false;
        boolean temDesconto = salario > 1000 || estaDeFerias;
        
        if (temDesconto) {
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Desconto não aplicado");
        }
    }
}
