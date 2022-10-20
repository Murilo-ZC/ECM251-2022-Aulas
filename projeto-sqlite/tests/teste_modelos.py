from src.models.pedido import Pedido
from src.models.item import Item

pedido1 = Pedido(1,"ABC", 10, "qwerty", "teste", "19/10/2022-09:18")
pedido2 = Pedido(2,"SQL", 2, "qwerty", "teste", "19/10/2022-09:19")

item1 = Item("SQL", "Aula", 19.9)
item2 = Item("LALAL", "Música", 12.9)

print(pedido1)
print(pedido2)

print(item1)
print(item2)