from datetime import datetime
class PedidoCliente:
    def __init__(self, id_cliente, id_pedido):
        self.id_cliente = id_cliente
        self.id_pedido = id_pedido
        self.data = datetime.today().strftime('%d/%m/%Y')