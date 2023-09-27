
# Contagem de Instruções - Algoritmo 1


Segue abaixo o 1º Algoritmo:

```http
Function BuscaLinerar(K) {
    i = 1
    for (i < n; i++) {
        se A[i] == k {
            devolve i
        }
    }
    Devolve i
}
```

### Fora do loop

Linha 1:
```http
i = 1
```
Instrução: Inserção de valor

Total de Instruções: 1
\
\
Linha 7:
```http
Devolve i
```
Instrução: Retorno de valor

Total de Instruções: 1

### Dentro do loop

Linha 2:
```http
for (i < n; i++) {
```
Instrução: Comparação de Valores e Incrementação

Total de Instruções: 2
\
\
Linha 3:
```http
se A[i] == k {
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

Total de Instruções: 2


### Conclusão
Após ver os que está dentro e fora do loop, o loop contém 7 intruções, mas, para o pior caso (sendo i maior que n), loop será executado aproximadamente n. Após isso, precisaremos do produto entre o as intruções dentro e fora do loop, dando a seguinte conta:

```http
6 * (n)
```


