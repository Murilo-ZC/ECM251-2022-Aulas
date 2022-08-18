from abc import ABC, abstractmethod
class Pagamento(ABC):
    @abstractmethod
    def realizar_pagamento(self):
        pass
