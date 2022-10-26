from src.controllers.pedido_controller import PedidoController
from src.models.pedido import Pedido

controller = PedidoController()
#Exibe os itens de um pedido
resultado = controller.pegar_pedido("001")
for elemento in resultado:
    print(elemento)

item_pedido = resultado[0]
item_pedido.quantidade = 10
print(controller.atualizar_pedido(item_pedido))
print('#############################################')
resultado = controller.pegar_pedido("001")
for elemento in resultado:
    print(elemento)

print('#############################################')
pedido = Pedido(id='151', id_item='10', id_cliente='ZEZE', data_hora='26/10/2022', numero_pedido='1234', quantidade=2)
controller.inserir_pedido(pedido)
resultado = controller.pegar_pedido(numero_pedido='1234')
for elemento in resultado:
    print(elemento)
print('#############################################')
for elemento in resultado:
    print(controller.deletar_pedido(elemento.id))
    
resultado = controller.pegar_pedido(numero_pedido='1234')
for elemento in resultado:
    print(elemento)