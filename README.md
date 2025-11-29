Relatório Técnico – Sistema de Conversões Numéricas e Segurança da Informação em Java
1. Introdução

Este projeto desenvolvido em Java tem como objetivo demonstrar o uso de operações essenciais de conversão numérica, bem como a aplicação de conceitos fundamentais de segurança da informação. O código permite realizar conversões entre diferentes bases numéricas, como decimal, binário, octal e hexadecimal, além de implementar funcionalidades de hashing e criptografia de dados utilizando algoritmos modernos.

2. Visão Geral do Sistema

O sistema apresenta um menu interativo onde o usuário pode escolher diversas operações envolvendo conversões numéricas e recursos de segurança. Entre as principais funcionalidades do projeto podemos destacar:

Conversão entre diferentes bases numéricas (Decimal, Binário, Octal e Hexadecimal).

Hash de senhas utilizando o algoritmo SHA-256.

Criptografia e descriptografia de mensagens utilizando o algoritmo AES.

3. Conversões Numéricas

As conversões numéricas são fundamentais no campo da computação. Cada base possui sua aplicação prática no mundo real, especialmente em áreas como redes de computadores, armazenamento de informação e representação de dados binários.

O código implementa métodos para transformar valores utilizando estruturas do Java como:

Integer.toBinaryString

Integer.toOctalString

Integer.toHexString

Integer.parseInt

Essas funções são amplamente utilizadas em sistemas embarcados, protocolos e manipulação de dados.

4. Hashing com SHA-256

O hashing é uma técnica essencial na segurança da informação, especialmente no armazenamento seguro de senhas e dados sensíveis. O algoritmo SHA-256 é amplamente utilizado por grandes empresas e sistemas operacionais para garantir que dados não sejam acessados ou lidos de forma indevida.

O sistema recebe uma senha digitada pelo usuário e transforma esse texto em hash utilizando:

MessageDigest.getInstance("SHA-256")

5. Criptografia e Descriptografia com AES

O projeto utiliza também o algoritmo AES (Advanced Encryption Standard), que é o padrão global de criptografia simétrica. Ele é utilizado por:

Bancos

Sistemas militares

Aplicações corporativas

Mensagens instantâneas

A implementação Java utiliza:

KeyGenerator para gerar chaves

Cipher para criptografar e descriptografar

Assim, o usuário consegue enviar uma mensagem que será criptografada e depois recuperar seu conteúdo original.

6. Impacto na Tecnologia e no Mundo Real

Este projeto demonstra tecnologias e conceitos que têm impacto direto no desenvolvimento de sistemas modernos. Conversões numéricas e segurança de dados estão presentes em diversos cenários atuais como:

Criptografia em comunicações digitais (WhatsApp, bancos, e-commerce)

Segurança de senhas e autenticação

Desenvolvimento de sistemas distribuídos e redes

IoT, Blockchain e Cloud Computing

A importância de implementar criptografia e hashing cresce a cada ano, pois protege informações pessoais e financeiras em uma era digital.

7. Conclusão

O código em Java apresentado demonstra na prática como a programação pode ser aplicada para resolver problemas reais envolvendo conversão de dados e segurança da informação. Além disso, permite compreender como conceitos básicos de matemática e criptografia são essenciais para o avanço da tecnologia moderna.
