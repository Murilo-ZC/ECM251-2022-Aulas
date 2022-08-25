class Conta:
    def __init__(self, id=None, historico_de_compras = []):
        self._id = id
        self._historico_de_compras = historico_de_compras
    def get_historico_de_compras(self):
        return self._historico_de_compras