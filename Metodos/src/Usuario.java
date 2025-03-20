/**
     * Classe Usuario - Demonstra o uso da classe SmartTv
     * Esta classe contém o método main que serve como ponto de entrada para testar
     * as funcionalidades da classe SmartTv.
     */
public class Usuario {
        /**
         * Método principal que demonstra as operações básicas de uma SmartTv
         * 
         * @param args Argumentos de linha de comando (não utilizados)
         * @throws Exception Possíveis exceções durante a execução
         */
        public static void main(String[] args) throws Exception {
            // Instancia um novo objeto SmartTv
            SmartTv smartTv = new SmartTv();

            // Exibe o estado inicial da TV
            System.out.println("TV ligada? " + smartTv.ligada);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);

            // Demonstra a manipulação do volume
            smartTv.diminuirVolume(); // Diminui o volume em 1
            smartTv.diminuirVolume(); // Diminui o volume em 1
            smartTv.diminuirVolume(); // Diminui o volume em 1
            smartTv.aumentarVolume(); // Aumenta o volume em 1
            System.out.println("Volume atual: " + smartTv.volume);

            // Demonstra a mudança de canal
            smartTv.aumentarCanal(); // Aumenta o canal em 1
            System.out.println("Canal atual: " + smartTv.canal);

            // Demonstra o ligamento e desligamento da TV
            smartTv.ligar(); // Liga a TV
            System.out.println("TV ligada? " + smartTv.ligada);
            smartTv.desligar(); // Desliga a TV
            System.out.println("TV ligada? " + smartTv.ligada);
        }
}