from src.dao.item_dao import ItemDAO

items = ItemDAO.get_instance().get_all()

for item in items:
    print(item)