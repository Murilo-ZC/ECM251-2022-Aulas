class Item:
    def __init__(self, id, nome, preco) -> None:
        self.id = id
        self.nome = nome
        self.preco = preco
    def __str__(self) -> str:
        return f'Item["id":{self.id}, "nome":{self.nome}, "preco":{self.preco}]'