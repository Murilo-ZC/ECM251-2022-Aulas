from src.controllers.item_controller import ItemController
from src.controllers.pedido_controller import PedidoController
from src.models.item import Item
from src.models.pedido import Pedido
from src.models.cliente import PedidoCliente
import uuid

class Application:
    def __init__(self):
        self.item_controller = ItemController()
        self.pedido_controller = PedidoController()
        self.cliente_pedido_atual = None

    def criar_novo_pedido(self, cpf):
        self.cliente_pedido_atual = PedidoCliente(
            id_cliente=cpf,
            id_pedido=str(uuid.uuid4())
        )
    
    def listar_itens(self):
        return self.item_controller.pegar_todos_itens()
    
    def adicionar_item_no_pedido(self, id_item, quantidade):
        pedido = Pedido(
            id=None,
            id_cliente=self.cliente_pedido_atual.id_cliente,
            numero_pedido=self.cliente_pedido_atual.id_pedido,
            data_hora=self.cliente_pedido_atual.data,
            id_item=id_item,
            quantidade=quantidade
        )
        self.pedido_controller.inserir_pedido(pedido)
    
    def visualizar_pedido(self):
        retorno = {
            "id_cliente":self.cliente_pedido_atual.id_cliente,
            "data":self.cliente_pedido_atual.data,
            "items":[]
        }
        itens_pedido = self.pedido_controller.pegar_pedido(self.cliente_pedido_atual.id_pedido)
        for item in itens_pedido:
            item_data = self.item_controller.pegar_item(item.id_item)
            retorno["items"].append({"nome":item_data.nome, "preco": item_data.preco, "quantidade": item.quantidade})
        return retorno
    def fechar_pedido(self):
        return self.pedido_controller.total_pedido(self.cliente_pedido_atual.id_pedido)
