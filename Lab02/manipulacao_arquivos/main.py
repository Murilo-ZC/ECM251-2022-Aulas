#Programa que escreve em um arquivo
try:
    arquivo = open("data/dados.txt", "a")
    continuar = True

    while continuar:
        #time é str
        time = input("Time (vazio para sair):")
        #TODA STR VAZIA É FALSA
        #Entra no if se a string estã vazia
        if not time:
            continuar = False
            continue
        arquivo.write(time+'\n')
    arquivo.close()

    x = 9+"ola"
except FileNotFoundError:
    print("Arquivo ou diretõrio não encontrado")
except ZeroDivisionError:
    print("Alguem tentou dividir por zero")
except:
    print("Algo de errado aconteceu!")
finally:
    print("Enfim terminou!")