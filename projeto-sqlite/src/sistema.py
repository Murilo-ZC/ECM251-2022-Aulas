from src.controllers.app_controller import Application
class Sistema:
    def __init__(self) -> None:
        self.app = Application()
        self.continuar = True
        self.acoes = {
            "0":self.sair,
            "1":self.criar_pedido,
            "2":self.exibir_itens,
            "3":self.adicionar_item,
            "4":self.visualizar_pedido,
            "5":self.total_pedido
        }
    def menu(self):
        print("1 - Criar novo pedido")
        print("2 - Exibir itens")
        print("3 - Adicionar item")
        print("4 - Visualizar pedido")
        print("5 - Total do Pedido")
        print("0 - Sair")
    def sair(self):
        self.continuar = False

    def criar_pedido(self):
        cpf = input("CPF:")
        self.app.criar_novo_pedido(cpf=cpf)

    def exibir_itens(self):
        for item in self.app.listar_itens():
            print(item)
    def adicionar_item(self):
        id = input("Item ID:")
        quantidade = int(input("Quantidade:"))
        self.app.adicionar_item_no_pedido(id_item=id, quantidade=quantidade)
    def visualizar_pedido(self):
        print(self.app.visualizar_pedido())
    def total_pedido(self):
        print(self.app.fechar_pedido())
    def run(self):
        while self.continuar:
            self.menu()
            opcao = input()
            if opcao not in self.acoes.keys():
                print("Opcao Invalida")
                continue
            self.acoes[opcao]()
    