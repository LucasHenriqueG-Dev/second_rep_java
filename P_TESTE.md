# second_rep_java
baseado na mesma atividade do dia 06/04 foi proposto uma atividade para trabalhar a habilidade de usar ao readme e outras funcionalidades.
test001: login correto
entrada:
usuario: admin
senha: 12345

retorno_esperado:
exibir mensagem de acesso concedido

resultado:
o sistema exibiu  uma mensagem de erro

test002: usuário incorreto
entrada:
usuario: user
senha: 12345

retorno_esperado:
exibir mensagem de erro de login

resultado:
o sistema exibiu mensagem de erro corretamente

test003: senha incorreta
entrada:
usuario: admin
senha: 00000

retorno_esperado:
exibir mensagem de erro de login

resultado:
o sistema exibiu mensagem de erro corretamente

test004: usuário e senha incorretos
entrada:
usuario: teste
senha: teste

retorno_esperado:
exibir mensagem de erro

resultado:
o sistema exibiu mensagem de erro corretamente

test005: comparação incorreta de usuário (bug)
entrada:
usuario: admin
senha: 12345

retorno_esperado:
acesso concedido

resultado:
o sistema pode falhar ao validar o usuário devido ao uso de == em vez de .equals() para comparação de strings

test006: campos vazios
entrada:
usuario: ""
senha: ""

retorno_esperado:
exibir mensagem de erro sem travar

resultado:
o sistema exibiu mensagem de erro corretamente

test007: usuário com espaços
entrada:
usuario: " admin "
senha: 12345

retorno_esperado:
considerar inválido ou tratar espaços

resultado:
o sistema considerou inválido, pois não remove espaços extras

test008: tentativa de entrada maliciosa (simulada)
entrada:
usuario: admin' OR '1'='1
senha: qualquer

retorno_esperado:
negar acesso

resultado:
o sistema negou acesso corretamente
