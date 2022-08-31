from cgitb import text
from unittest.mock import DEFAULT
import ttkbootstrap as ttk
from ttkbootstrap.constants import *
from tkinter import PhotoImage

class MinhaUI():
    def _construir_base(self):
        janela = ttk.Window(
            title="Minha GUI Mauá",
            size= (1024,400),
            position= (100,100),
            minsize= (600,300),
            maxsize= (1800,900),
            alpha=1.0
        )
        janela.iconphoto(False, PhotoImage(file='calculator.png'))
        return janela

    def _criar_botao(self, texto, acao):
        return ttk.Button(
            self.base,
            text=texto,
            bootstyle=(DEFAULT),
            command=acao
        )

    def _criar_texto(self, guardar):
        return ttk.Entry(
            self.base,
            textvariable=guardar
        )

    def __init__(self) -> None:
        self.base = self._construir_base()
        self.bot = self._criar_botao(texto="AÇÃO", acao=self.mostrar_texto)
        self.bot.grid(row=3, column=2, padx=5, pady=5)
        self.valor_digitado = ""
        self.text = self._criar_texto(guardar=self.valor_digitado)
        self.text.grid(row=2, column=1, padx=5, pady=5)
    def run(self):
        self.base.mainloop()

    def mostrar_texto(self):
        print("Valor Digitado:", self.text.get())


if __name__ == "__main__":
    app = MinhaUI()
    app.run()