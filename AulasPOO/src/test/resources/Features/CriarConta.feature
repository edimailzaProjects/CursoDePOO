#language: pt

@integradosCriarConta
Funcionalidade: Criação de Conta
  Como uma pessoa que tem dinheiro
  Eu quero abrir uma conta no banco
  Para que eu possa administrar meu capital

 Esquema do Cenario: Criação de conta
    Dado que informo meu <nome>
    E escolho o tipo de <conta>
    Quando o gerente inserir o numero da conta
    Entao o sera exibida a <mensagem> 
    
	Exemplos:
   | nome     | conta | mensagem                                                                                                                                |
   | "Maria"  | "cc" 	| "Numero da conta: 100. Nome do proprietario: Maria. Conta do tipo cc -> conta corrente, com saldo de: 50.0. Conta criada com sucesso! " |
   | "Jose"   | "cp"  | "Numero da conta: 101. Nome do proprietario: Jose. Conta do tipo cp -> conta poupança, com saldo de: 150.0. Conta criada com sucesso! " |
   | ""     	| "cp"  | "Insira um nome válido. "                                                                                                               |                                                                                                               
   | "Pheobe" | "aa"  | "O tipo de conta deve ser apenas cc ou cp. "                                                                                            |