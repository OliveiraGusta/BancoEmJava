import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int escolhaMenu = 0;
        String menu = ("""
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair   
                
                Digite a opção desejada:""");

        String nomeDoCliente = "Gustavo Oliveira";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 1536.00;

        System.out.println("""                
                ==========================================
                
                Nome            | %s
                Tipo de Conta   | %s
                Saldo Inicial   | R$%.2f
                
                ==========================================
                """.formatted(nomeDoCliente, tipoDeConta, saldoDaConta));

        while (escolhaMenu != 4){
            System.out.println(menu);
            escolhaMenu = leitura.nextInt();

            if (escolhaMenu == 1) {

                System.out.println("""                        
                        
                        Consultar saldos
                                  
                        Nome            | %s                    
                        Saldo Atual     | R$%.2f                
                        """.formatted(nomeDoCliente, saldoDaConta));
            }
            else if (escolhaMenu == 2) {
                System.out.println("""
                        
                        Receber valor   
                                              
                        Digite o valor para receber:""");
                double valorReceber = leitura.nextDouble();

                double saldoAntigo = saldoDaConta;
                saldoDaConta += valorReceber;

                System.out.println("""
                        
                        Receber valor   
                                                                                           
                        Saldo Anterior     |  R$%.2f
                        Valor Recebido     | +R$%.2f
                        Saldo Atual        |  R$%.2f
                            """.formatted(saldoAntigo, valorReceber, saldoDaConta));
            }
            else if (escolhaMenu == 3){
                System.out.println("""
                    
                    Transferir valor
                                          
                    Digite o valor para transferir:""");

                double valorTransferir = leitura.nextDouble();
                double saldoAntigo = saldoDaConta;

                if ( valorTransferir > saldoDaConta ) {
                    System.out.println("""
                        
                        Transferir valor
                        
                        Encontramos um erro ao tentar transferir este valor
                                      
                        Saldo Atual        |  R$%.2f
                        Valor à Transferir | -R$%.2f
                        
                        Saldo Insuficente!
                        """.formatted(saldoDaConta, valorTransferir));
                }else {
                    saldoDaConta += valorTransferir;
                    System.out.println("""
                        
                        Transferir valor
                                                        
                        Saldo Anterior     |  R$%.2f
                        Valor Transferido  | -R$%.2f
                        Saldo Atual        |  R$%.2f
                        
                        Valor Transferido!
                        """.formatted(saldoAntigo, valorTransferir, saldoDaConta));
                    }
            }
            else if (escolhaMenu == 4){
                System.out.println("""
                        
                        Sair
                        
                        Obrigado por utilizar nossos serviços""");
            }
            else if (escolhaMenu != 4){
                System.out.println("\nOpção Inválida\n");
            }
        }
    }
}

