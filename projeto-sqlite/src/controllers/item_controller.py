from src.models.item import Item
from src.dao.item_dao import ItemDAO
class ItemController:
    def __init__(self) -> None:
        pass

    def pegar_item(self, id) -> Item:
        item = ItemDAO.get_instance().pegar_item(id)
        return item

    def inserir_item(self, item) -> bool:
        try:
            ItemDAO.get_instance().inserir_item(item)
        except:
            return False
        return True

    def pegar_todos_itens(self) -> list[Item]:
        itens = ItemDAO.get_instance().get_all()
        return itens

    def atualizar_item(self, item) -> bool:
        return ItemDAO.get_instance().atualiza_item(item)

    def deletar_item(self, id) -> bool:
        return ItemDAO.get_instance().deleta_item(id)
    
    def buscar_item_nome(self, nome) -> list[Item]:
        itens = ItemDAO.get_instance().buscar_item_nome(nome)
        return itens