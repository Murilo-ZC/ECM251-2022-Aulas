class Usuario:
    def __init__(self, user_name, password, email):
        self._user_name = user_name
        self._password = password
        self._email = email
    def get_user_name(self):
        return self._user_name
    
    def check_password(self, password):
        return password == self._password