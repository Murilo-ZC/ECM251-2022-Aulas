class Product():
    def __init__(self, name, price, url) -> None:
        self.name = name
        self.price = price
        self.url = url
    def __str__(self) -> str:
        return f'Product(name"{self.name}, price:{self.price}, url:{self.url})'