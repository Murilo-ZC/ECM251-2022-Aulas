from src.controllers.pedido_controller import PedidoController

controller = PedidoController()
#Exibe os itens de um pedido
resultado = controller.pegar_pedido("00")
for elemento in resultado:
    print(elemento)