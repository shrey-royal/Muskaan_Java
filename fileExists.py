from os.path import exists

def isExist(file_name):
    # file_name = "readme.txt"
    file_exists = exists(file_name)

    if file_exists:
        # print(f"{file_name} exist!")
        return True
    else:
        # print(f"{file_name} doesn't exist!")
        return False

# next topic: csv handling