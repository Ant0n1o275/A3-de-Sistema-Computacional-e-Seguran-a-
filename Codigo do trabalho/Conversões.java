import java.security.MessageDigest;
import java.util.Scanner;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

public class Conversões {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        
        
        SecretKey chaveArmazenada = null;
        String mensagemArmazenada = null;

        System.out.println(" Este projeto em Java tem como objetivo demonstrar \n o uso de operações fundamentais de conversão numérica \n e técnicas de segurança da informação. \n O sistema desenvolvido realiza conversões entre diferentes \n bases numéricas, permitindo transformar valores entre \n decimal, binário, octal e hexadecimal.");
        System.out.println(" Além disso o sistema permite que receba uma senha e trasnforme ela em Hash. ");
        System.out.println(" E você tem a opção de enviar uma mensagens que será Criptografada e Descriptografada");
        while (continuar) {
            System.out.println("\n1 ---Decimais----");
            System.out.println("2 ----Binário----");
            System.out.println("3 -----Octal-----");
            System.out.println("4 --Hexadecimal--");
            System.out.println("5 --Digite a senha que será hasheada--");
            System.out.println("6 --Mensagem que sera Criptografada--");
            System.out.println("7 --Mensagem que será Descriptografada--");
            System.out.println("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha para qual base deseja converter:");
                    System.out.println("1 --Binário--");
                    System.out.println("2 --Octal--");
                    System.out.println("3 --Hexadecimal--");
                    int baseDestino = scanner.nextInt();
                    System.out.println("Digite o número decimal: ");
                    int numeroDecimal = scanner.nextInt();
                    scanner.nextLine();
                    if (baseDestino == 1) { 
                        System.out.println("Resultado --> Número em Binário: " + Integer.toBinaryString(numeroDecimal));
                    } else if (baseDestino == 2) {
                        System.out.println("Resultado --> Número em Octal: " + Integer.toOctalString(numeroDecimal));
                    } else if (baseDestino == 3) {
                        System.out.println("Resultado --> Número em Hexadecimal: " + Integer.toHexString(numeroDecimal).toUpperCase());
                    } else {
                        System.out.println("Base inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Escolha para qual base deseja converter:");
                    System.out.println("1 --Decimal--");
                    System.out.println("2 --Octal--");
                    System.out.println("3 --Hexadecimal--");
                    int baseDestinoBinario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o número binário: ");
                    int numeroBinario = scanner.nextInt(); 
                    if (baseDestinoBinario == 1) {
                        int decimalFromBinary = Integer.parseInt(String.valueOf(numeroBinario), 2);
                        System.out.println("Resultado --> Número em Decimal: " + decimalFromBinary);
                    } else if (baseDestinoBinario == 2) {
                        int decimalFromBinary = Integer.parseInt(String.valueOf(numeroBinario), 2);
                        System.out.println("Resultado --> Número em Octal: " + Integer.toOctalString(decimalFromBinary));
                    } else if (baseDestinoBinario == 3) {
                        int decimalFromBinary = Integer.parseInt(String.valueOf(numeroBinario), 2);
                        System.out.println("Resultado --> Número em Hexadecimal: " + Integer.toHexString(decimalFromBinary).toUpperCase());
                    } else {
                        System.out.println("Base inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Escolha para qual base deseja converter:");
                    System.out.println("1 --Decimal-----");
                    System.out.println("2 --Binário-----");   
                    System.out.println("3 --Hexadecimal--");
                    int baseDestinoOctal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o número octal: ");
                    int numeroOctal = scanner.nextInt();
                    if (baseDestinoOctal == 1) {
                        int decimalFromOctal = Integer.parseInt(String.valueOf(numeroOctal), 8);
                        System.out.println("Resultado --> Número em Decimal: " + decimalFromOctal);
                    } else if (baseDestinoOctal == 2) {
                        int decimalFromOctal = Integer.parseInt(String.valueOf(numeroOctal), 8);
                        System.out.println("Resultado --> Número em Binário: " + Integer.toBinaryString(decimalFromOctal));
                    } else if (baseDestinoOctal == 3) {
                        int decimalFromOctal = Integer.parseInt(String.valueOf(numeroOctal), 8);
                        System.out.println("Resultado --> Número em Hexadecimal: " + Integer.toHexString(decimalFromOctal).toUpperCase());
                    } else {
                        System.out.println("Base inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Escolha para qual base deseja converter:");
                    System.out.println("1 -Decimal-");
                    System.out.println("2 -Binário-");   
                    System.out.println("3 -Octal---");
                    int baseDestinoHexadecimal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o número hexadecimal: ");
                    String numeroHexadecimal = scanner.nextLine();
                    if (baseDestinoHexadecimal == 1) {
                        int decimalFromHexadecimal = Integer.parseInt(numeroHexadecimal, 16);
                        System.out.println("Resultado --> Número em Decimal: " + decimalFromHexadecimal);
                    } else if (baseDestinoHexadecimal == 2) {
                        int decimalFromHexadecimal = Integer.parseInt(numeroHexadecimal, 16);
                        System.out.println("Resultado --> Número em Binário: " + Integer.toBinaryString(decimalFromHexadecimal));
                    } else if (baseDestinoHexadecimal == 3) {
                        int decimalFromHexadecimal = Integer.parseInt(numeroHexadecimal, 16);
                        System.out.println("Resultado --> Número em Octal: " + Integer.toOctalString(decimalFromHexadecimal));
                    } else {
                        System.out.println("Base inválida.");
                    }
                    break;
                case 5:
                    try {
                    System.out.println("Digite a senha que será hasheada: ");
                    String senha = scanner.nextLine();
                    MessageDigest gerador = MessageDigest.getInstance("SHA-256");
                    byte[] hashBytes = gerador.digest(senha.getBytes());
                    StringBuilder builder = new StringBuilder();
                    for(byte b : hashBytes) {
                        builder.append(String.format("%02x", b));
                    }   
                    System.out.println("Resultado --> texto hasheada: " + builder.toString());
                    break;
                    } catch (Exception e) {
                        System.out.println("Erro ao hashear o texto: " + e.getMessage());
                    }
                case 6: {
                    try {
                        System.out.println("Digite a mensagem que será criptografada: ");
                        String mensagem = scanner.nextLine();
                        
                        KeyGenerator chave = KeyGenerator.getInstance("AES");
                        chave.init(128);
                        chaveArmazenada = chave.generateKey(); 
                        
                        Cipher cipher = Cipher.getInstance("AES");
                        cipher.init(Cipher.ENCRYPT_MODE, chaveArmazenada);
                        byte[] mensagemCriptografada = cipher.doFinal(mensagem.getBytes());
                        
                        mensagemArmazenada = java.util.Base64.getEncoder().encodeToString(mensagemCriptografada);
                        
                        System.out.println("Mensagem original: " + mensagem);
                        System.out.println("\nMensagem criptografada: " + mensagemArmazenada);

                        break;
                    } catch (Exception e) {
                        System.out.println("Erro ao criptografar: " + e.getMessage());
                    }
                }
                
                case 7: {
                    try {
                        if (chaveArmazenada == null) {
                            System.out.println("Erro: Use a opção 6 primeiro para gerar uma chave!");
                            break;
                        }
                        
                        System.out.println("Digite a mensagem criptografada : ");
                        String mensagemCriptografadaEntrada = scanner.nextLine();
                        
                        byte[] mensagemBytes = java.util.Base64.getDecoder().decode(mensagemCriptografadaEntrada);
                        Cipher cipher2 = Cipher.getInstance("AES");
                        cipher2.init(Cipher.DECRYPT_MODE, chaveArmazenada);
                        byte[] mensagemDescriptografada = cipher2.doFinal(mensagemBytes);
                        String mensagemFinal = new String(mensagemDescriptografada);
                        
                        System.out.println("\nMensagem descriptografada: " + mensagemFinal);
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro ao descriptografar: " + e.getMessage());
                    }
                }

                default:
                    System.out.println("Opção inválida.");
                    break;
            }        
        }
    }
}