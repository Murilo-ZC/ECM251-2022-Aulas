from src.dao.pedido_dao import PedidoDAO
from src.models.pedido import Pedido
from src.controllers.item_controller import ItemController
class PedidoController:
    def __init__(self) -> None:
        pass
    def total_pedido(self, numero_pedido) -> float:
        items_pedido = PedidoDAO.get_instance().pegar_pedido(numero_pedido)
        total = 0
        item_controller = ItemController()
        for item in items_pedido:
            item_elemento = item_controller.pegar_item(item.id_item)
            total += item_elemento.preco * item.quantidade
        return total
    def pegar_pedido(self, numero_pedido)-> list[Pedido]:
        return PedidoDAO.get_instance().pegar_pedido(numero_pedido)

    def atualizar_pedido(self, pedido)-> bool:
        return PedidoDAO.get_instance().atualizar_pedido(pedido)
    def deletar_pedido(self, id) ->bool:
        return PedidoDAO.get_instance().deletar_item(id)
    def inserir_pedido(self, pedido)->None:
        PedidoDAO.get_instance().inserir_pedido(pedido)