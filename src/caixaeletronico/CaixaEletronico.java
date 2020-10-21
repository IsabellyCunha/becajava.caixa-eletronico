package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int aux = 0;
		
		int saque;
		
		System.out.print("Digite o valor que deseja sacar: ");
		saque = leitor.nextInt();
		
		
		if(saque>=200) {
		do {
			saque = saque - 200;
			aux++;
		}while(saque > 200);
		System.out.println(aux +" - notas de 200");
		}
			if(saque>=100) {
				aux = 0;
				do {
					saque = saque - 100;
					aux++;
				}while(saque > 100);
				System.out.println(aux +" - notas de 100");
			}
				if(saque>=50) {
					aux = 0;
					do {
						saque = saque - 50;
						aux++;
					}while(saque > 50);
					System.out.println(aux +" - notas de 50");
				}
					if(saque>=20) {
						aux = 0;
						do {
							saque = saque - 20;
							aux++;
						}while(saque >= 20);
						System.out.println(aux +" - notas de 20");
					}
					if(saque % 2 != 0) {
						if(saque>=10) {
							aux = 0;
							do {
								saque = saque - 10;
								aux++;
							}while(saque > 10);
							System.out.println(aux +" - notas de 10");
						}
					}
						if(saque % 2 != 0) {
							if(saque>=5) {		
								aux = 0;
								do {									
									saque = saque - 5;
									aux++;
									
								}while(saque > 5);
								System.out.println(aux +" - notas de 5");
							}
						
						}		
								if(saque >= 2) {
									aux = 0;
									do {	
										saque = saque - 2;
										aux++;
			
									}while(saque >= 2);
									System.out.println(aux +" - notas de 2");
							}
								if(saque >= 0) {
									aux = 0;
									do {
										saque = saque - 1;
										aux++;
									}while(saque != 0);
										System.out.println(aux +" - notas de 1");
								}							
		}
	}

