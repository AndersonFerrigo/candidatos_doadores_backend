﻿# candidatos_doadores_backend
﻿# Para realizar a conexão com o banco de dados mysql, será necessário configurar o user and password no arquivo application.properties como:
 # user: root
 # password: estudos2012
﻿
 # Existe dois arquivos de migration que são responsaveis por : 
  #criar a tabela.
  #e o outro realiza a criação de uma view onde algumas mudanças foram realizadas, uma deslas é transformar a data de nascimento de String para Date e calcular a idade, passando o campo de data_nasc para idade, e a outra modificação é a criação de uma tabela IMC pegando o resultado do calculo entre peso e altura contidos na tabela  original. 
