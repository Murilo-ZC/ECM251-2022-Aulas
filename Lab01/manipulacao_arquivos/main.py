#Código para escrever dados em um arquivo

arquivo = open("data/sistemas.txt", "a")
continuar = True
while continuar:
    os_name = input("Diga um OS (vazio para sair):")
    if not os_name:
        continuar = False
        continue
    arquivo.write(os_name+'\n')
arquivo.close()