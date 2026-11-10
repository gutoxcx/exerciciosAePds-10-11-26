# Exercícios de Algoritmos e Programação Estruturada

Projeto em Java organizado a partir da lista de exercícios do PDF. Cada exercício tem sua própria classe em `src/exercicios/`. Os arquivos são estruturas iniciais, sem as soluções implementadas.

## Estrutura

```text
exercicios-AePdS/
├── src/
│   ├── App.java
│   └── exercicios/
│       ├── Exercicio01.java
│       ├── ...
│       └── Exercicio10.java
├── .gitignore
└── README.md
```

## Compilar

Na pasta `exercicios-AePdS`, usando JDK instalado:

```bash
javac -d bin src/App.java src/exercicios/*.java
```

## Executar

```bash
java -cp bin App
```

Para executar uma classe de exercício após implementá-la:

```bash
java -cp bin exercicios.Exercicio01
```

Troque `Exercicio01` pelo exercício desejado. Consulte a lista em PDF na pasta pai para os enunciados.
