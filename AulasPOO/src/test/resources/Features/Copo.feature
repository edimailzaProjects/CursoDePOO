#language: pt

@integradosCucumber
Funcionalidade: Preencher copos
  Como uma aluna do Curso de POO do Guga
  Eu quero fazer testes unitarios com Cucumber e JUnit4

  @adesivadoDestampado
  Esquema do Cenario: Copo adesivado destampado
    Dado que o copo adesivado de cor "<cor>" esta destampado
    Quando preencher o copo "<estado>"
    Entao o sera exibida a mensagem "<mensagem>"
    E o copo estara com "Capacidade atual: Cheio."
    
	Exemplos:
   |cor         | estado 		 | mensagem                    |
   | Turquesa   | Vazio 	   | Enchendo o copo Vazio.      |
   | Turquesa   | Incompleto | Enchendo o copo Incompleto. |
   | Turquesa   | Cheio 	   | O copo já está Cheio!       |
   | Azul       | Vazio 	   | Enchendo o copo Vazio.      |
   | Azul       | Incompleto | Enchendo o copo Incompleto. |
   | Azul       | Cheio 	   | O copo já está Cheio!       |
   
  
  @adesivadoDestampado
  Esquema do Cenario: Copo adesivado tampado
    Dado que o copo adesivado de cor "<cor>" esta tampado
    Quando preencher o copo "<estado>"
    Entao o sera exibida a mensagem "<mensagem>"
    
    
	Exemplos:
   |cor         | estado 		 | mensagem                                           |
   | Turquesa   | Vazio 	   | Copo Vazio e tampado não pode ser preenchido.      |
   | Turquesa   | Incompleto | Copo Incompleto e tampado não pode ser preenchido. |
   | Turquesa   | Cheio 	   | O copo já está Cheio!                              |
   | Azul       | Vazio 	   | Copo Vazio e tampado não pode ser preenchido.      |
   | Azul       | Incompleto | Copo Incompleto e tampado não pode ser preenchido. |
   | Azul       | Cheio 	   | O copo já está Cheio!                              |
    



