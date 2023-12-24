import os
from fileExists import isExist

def create_file():
    file_name = input("Enter the name of the file to create: ")
    try:
        with open(file_name, 'w'):
            print(f"File '{file_name}' created Successfully!")
    except Exception as e:
        print(f"Error Creating file: {e}")

def read_file():
    file_name = input("Enter the name of the file to read: ")
    try:
        if isExist(file_name):
            with open(file_name, 'r') as file:
                content = file.read()
                print(f"--- Content of '{file_name}' ---\n\n {content}")
    except Exception as e:
        print(f"Error reading file: {e}")

def write_file():
    file_name = input("Enter the name of the file to write: ")
    content = input("Enter the content to write into the file: ")
    try:
        with open(file_name, 'w') as file:
            file.write(content)
            print(f"Content written to '{file_name}' successfully!")
    except Exception as e:
        print(f"Error writing to file: {e}")

def delete_file():
    file_name = input("Enter the name of the file to delete: ")
    try:
        os.remove(file_name)
        print(f"File '{file_name}' deleted Successfully!")
    except FileNotFoundError:
        print(f"File '{file_name}' not found.")
    except Exception as e:
        print(f"Error deleting file: {e}")

def display_menu():
    print("File Handling Menu:")
    print("1. Create a file")
    print("2. Read a file")
    print("3. Write to a file")
    print("4. Delete a file")
    print("5. Exit")


def main():
    while True:
        display_menu()
        choice = input("Enter your choice (1-5): ")

        if choice == '1':
            create_file()
        elif choice == '2':
            read_file()
        elif choice == '3':
            write_file()
        elif choice == '4':
            delete_file()
        elif choice == '5':
            print("Exiting the program. Goodbye!")
            break
        else:
            print("Invalid choice. Please enter a valid option (1-5).")


if __name__ == '__main__':
    main()