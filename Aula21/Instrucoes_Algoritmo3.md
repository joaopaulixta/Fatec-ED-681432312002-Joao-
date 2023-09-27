
# Contagem de Instruções - Algoritmo 3


Segue abaixo o 3º Algoritmo:

```http
Function BuscaBinaria(x){
    esq = 1 
    dir = n
        enquanto esq <= dir faca{
            meio = ((esq + dir) /2) 
            se A[meio] == x entao 
                devolve meio 
            senao se x > A[meio] entao 
                    esq = meio + 1 
                senao 
                    dir = meio - 1 
            }
            14 devolve -1
        }
```

### Fora do Loop
Linha 1:
```http
esq = 1
```
Instrução: Inserção de valor

Total de Instruções: 1
\
\
Linha 2:
```http
dir = n
```
Instrução: Inserção de valor

Total de Instruções: 1

Sendo assim, o total de instruções são: 2

### Dentro do Loop
Linha 3:
```http
enquanto esq <= dir faca{
```
Instrução: Comparação de Valores

Total de Instruções: 1
\
\
Linha 4:
```http
meio = ((esq + dir) /2)
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

Total de Instruções: 2
\
\
Linha 5:
```http
se A[meio] == x entao 
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

Total de Instruções: 2
\
\
Linha 6:
```http
devolve meio 
```
Instrução: Retorno de valor

Total de Instruções: 1
\
\
Linha 7:
```http
senao se x > A[meio] entao 
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

Total de Instruções: 2
\
\
Linha 8:
```http
esq = meio + 1 
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

Total de Instruções: 2
\
\
Linha 10:
```http
dir = meio - 1 
```
Instrução: inserção de Valores e Operação Aritmética Simples (Subtração)

Total de Instruções: 2

Sendo assim, o total de instruções são: 12

### Conclusão
Após ver os que está dentro e fora do loop, o loop contém 14 instruções, mas, para o pior caso (sendo dir maior que esq), a contagem ser o produto do indstruções dentro do loop com as fora do loop, as 14 e o número de interações feitas no loop:

```http
(dentro) * (fora) * (14) * (interações)
```

