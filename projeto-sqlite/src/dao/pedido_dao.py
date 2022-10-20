import sqlite3
from src.models.pedido import Pedido
from src.controllers.item_controller import ItemController
class PedidoDAO:
    
    _instance = None

    def __init__(self) -> None:
        self._connect()

    @classmethod
    def get_instance(cls):
        if cls._instance == None:
            cls._instance = PedidoDAO()
        return cls._instance

    def _connect(self):
        self.conn = sqlite3.connect('./databases/sqlite.db')

    def listar_pedidos(self):
        self.cursor = self.conn.cursor()
        self.cursor.execute("""
            SELECT * FROM Pedidos;
        """)
        resultados = []
        for resultado in self.cursor.fetchall():
            resultados.append(
                Pedido(
                    id=resultado[0], 
                    id_item=resultado[1], 
                    id_cliente=resultado[2],
                    quantidade=resultado[3],
                    numero_pedido=resultado[4],
                    data_hora=resultado[5]
                )
            )
        self.cursor.close()
        return resultados

    def total_pedido(self, numero):
        self.cursor = self.conn.cursor()
        self.cursor.execute(f"""
            SELECT (id_item, quantidade) 
            FROM Pedidos
            WHERE numero_pedido = '{numero}';
        """)
        items_quantidades = []
        for resultado in self.cursor.fetchall():
            items_quantidades.append(
                (resultado[0],resultado[1])
            )
        total = 0
        itemController = ItemController()
        for (item_id, quantidade) in items_quantidades:
            item = itemController.pegar_item(item_id)
            total += item.preco * quantidade
        self.cursor.close()
        return total