## Principios Utilizados

`Princípio da Responsabilidade Única ( SRP )`: Separei a lógica de cálculo da média de notas em uma classe distinta (CalculadoraMediaNotas), pois essa funcionalidade pode ser reutilizada em várias partes do sistema.

`Princípio do Aberto/Fechado ( OCP )` : Criei uma interface (CriterioBomFornecedor) e implementei essa interface em uma classe (CriterioBomFornecedorPorNota). Assim, se no futuro a lógica para decidir se um fornecedor é bom mudar, basta criar uma nova implementação da interface sem precisar alterar a classe AvaliadorNovaNota.

## Alteracoes Feitas na Refatoração

`Com base no SRP`: Movi o cálculo da média de notas para a classe CalculadoraMediaNotas para que essa responsabilidade esteja separada e possa ser reutilizada.

`Com base no OCP`: Criei a interface CriterioBomFornecedor e sua implementação CriterioBomFornecedorPorNota para permitir que a lógica de decisão se o fornecedor é bom possa ser facilmente modificada ou extendida no futuro sem alterar a classe AvaliadorNovaNota.
