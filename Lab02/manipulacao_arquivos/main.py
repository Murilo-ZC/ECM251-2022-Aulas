#Programa que escreve em um arquivo

arquivo = open("dados.txt", "a")
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
