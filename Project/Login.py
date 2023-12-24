import sys
from PyQt5.QtWidgets import QApplication, QWidget, QVBoxLayout, QLabel, QLineEdit, QPushButton, QMessageBox, QDesktopWidget

from PyQt5.QtGui import QIcon

# Mock user credentials for demonstration purposes
user_credentials = {
    'user1': 'password1',
    'user2': 'password2'
}

class LoginScreen(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle('Login')

        # Get screen dimensions
        screen = QDesktopWidget().screenGeometry()
        self.setGeometry(300, 300, 300, 200)

        layout = QVBoxLayout()

        self.username_label = QLabel('Username:')
        layout.addWidget(self.username_label)

        self.username_input = QLineEdit()
        layout.addWidget(self.username_input)

        self.password_label = QLabel('Password:')
        layout.addWidget(self.password_label)

        self.password_input = QLineEdit()
        self.password_input.setEchoMode(QLineEdit.Password)
        layout.addWidget(self.password_input)

        self.login_button = QPushButton('Login')
        self.login_button.clicked.connect(self.login)
        layout.addWidget(self.login_button)

        self.setLayout(layout)

    def login(self):
        username = self.username_input.text()
        password = self.password_input.text()

        if username in user_credentials and user_credentials[username] == password:
            QMessageBox.information(self, 'Login Successful', 'Welcome!')
        else:
            QMessageBox.warning(self, 'Login Failed', 'Invalid username or password')


if __name__ == '__main__':
    app = QApplication(sys.argv)

    app_icon = QIcon('logo.png')
    app.setWindowIcon(app_icon)


    login_screen = LoginScreen()
    login_screen.show()
    sys.exit(app.exec_())
