
# Contagem de Instruções - Algoritmo 2


Segue abaixo o 2º Algoritmo:

```http
Function BuscaLinerarEmOrdem(K){
    i = 1 
    enquanto i <= n e K >= A[i] {
        se A[i] == k entao {
            devolve i
        }
        i = i + 17 
    }
    devolve -1
}
```

### Fora do Loop
Linha 1:

```http
i = 1
```
Instrução: Inserção de valor

Total de Instruções: 1
\
\
Sendo assim, o total de instruções são: 1
### Dentro do Loop
Linha 2:
```http
enquanto i <= n e K >= A[i] {
```
Instrução: Comparação de Valores e Acesso da Valor de um Array

Total de Instruções: 2
\
\
Linha 3:
```http
se A[i] == k entao {
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

Total de Instruções: 2
\
\
Linha 4:
```http
devolve i
```
Instrução: Retorno de valor

Total de Instruções: 1
\
\
Linha 5:

```http
i = i + 17 
```
Instrução: Inserção de valor

Total de Instruções: 1
\
\
Sendo assim, o total de instruções são: 6


### Conclusão

Após ver os que está dentro e fora do loop, o loop contém 7 instruções, mas, para o pior caso (sendo i  maior que n), loop será executado aproximadamente n / 17 vezes. Após isso, precisaremos do produto entre o as intruções dentro e fora do loop, dando a seguinte conta:

```http
6 * (n / 17)
```