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