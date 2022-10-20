class Pedido:
    def __init__(self, id, id_item, quantidade, numero_pedido, id_cliente, data_hora) -> None:
        self.id = id
        self.id_item = id_item
        self.quantidade = quantidade
        self.numero_pedido = numero_pedido
        self.id_cliente = id_cliente
        self.data_hora = data_hora

    def __str__(self) -> str:
        return f'Pedido: id: {self.id} - Item: {self.id_item} - Quantidade: {self.quantidade} - Número do Pedido: {self.numero_pedido} - Cliente: {self.id_cliente} - Data e Hora: {self.data_hora}'
