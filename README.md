# Lista_II_Metodos
#### Exercícios desenvolvidos para a faculdade

**1.** Faça um programa para a pousada Beira Mar que recebe o nome do hóspede, o tipo de acomodação
(1 - Standard, 2 - Luxo e 3 – Super Luxo), quantidade de diárias. Crie um método com retorno para
cálculo da estadia conforme tabela a seguir

Tipo Acomodação | Valor da Diária
----------------|----------------
1 - (Standard) | R$ 380,00
2 - (Luxo) | R$ 450,00
3 - (Super Luxo) | R$ 560,00

Após o cálculo da estadia crie um método que solicite a forma de pagamento sendo à vista (V) e a prazo
(P), para pagamento à vista desconto de 10% e exiba o valor final.

##

**2.** Faça um programa para a transportadora Express que calcule o valor transportado pelo caminhão. O
programa solicita o código do caminhão e a carga do caminhão em toneladas. Crie um primeiro método
com retorno que solicite o código da carga para calcular o preço da carga do caminhão, faça a conversão
do peso em tonelada para quilos. Crie um segundo método com retorno para cálculo do imposto
sabendo-se que o imposto é cobrado sobre o preço da carga do caminhão e depende do estado de
origem. Ao final exibir o valor total transportado pelo caminhão, preço da carga mais imposto.

Código do Estado | Imposto
-----------------|---------
1 | 25%                                    
2 | 20%                                    
3 | 15%                                   
4 | Isento

<br>

Código da Carga | Preço por Quilo
----------------|----------------
1 a 10 | R$ 120,00
11 a 20 | R$ 200,00
21 a 30 | R$ 280,00

##

**3.** Faça um programa para a área de rh da empresa que preencha três vetores com quatro posições cada.
O primeiro vetor receberá os nomes de quatro funcionários; o segundo e o terceiro vetor receberão,
respectivamente, o salário e o tempo de serviço de cada um. Crie uma função (método com retorno)
para verificar quais os funcionários que terão direito ao aumento, aqueles que possuem tempo de
serviço superior a três anos ou salário inferior a R$ 700,00. Mostre um relatório em um novo método
sem retorno com os nomes dos funcionários e indique se tem direito ou não ao aumento.


##

**4.** Crie um programa para controlar os chamados realizados no Call Center da empresa Abc, conforme
descrição abaixo:

**a.** Crie um método sem parâmetro e com retorno para a captação dos campos identificação
do funcionário, código do erro e critério do chamado armazene as informações em uma matriz
do tipo inteiro (5x3). Faça a validação para os campos código do erro e critério do chamado;


Código do Erro | Descrição
---------------|----------
1 | Sistema não inicia
2 | Nome ou caminho do banco de dados não encontrado
3 | Sistema não responde

<br>

Critério do Chamado | Descrição
--------------------|----------
0 1 | Sistema parado
1 2 |Grave
2 3 | Não Grave
3 4 | Dúvida ou questão


**b.** Crie um método com parâmetro sem retorno para exibir um relatório identificando o número de
erros dos chamados

**c.** Crie um método com parâmetro que retorne um vetor com a quantidade dos critérios das
chamadas
