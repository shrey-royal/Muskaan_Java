import csv

# fields = ['Dessert', 'Country', 'Main Ingredients']

# rows = [
#     {'Dessert': 'Baklava', 'Country': 'Turkey', 'Main Ingredients': 'Filo pastry, nuts, syrup/honey'},
#     {'Dessert': 'Tiramisu', 'Country': 'Italy', 'Main Ingredients': 'Ladyfingers, coffee, mascarpone cheese, cocoa'},
#     {'Dessert': 'Mochi', 'Country': 'Japan', 'Main Ingredients': 'Glutinous rice, sweet red bean paste/ice cream'},
#     {'Dessert': 'Gulab Jamun', 'Country': 'India', 'Main Ingredients': 'Milk solids, sugar syrup, cardamom/saffron'},
#     {'Dessert': 'Pastel de Nata', 'Country': 'Portugal', 'Main Ingredients': 'Egg custard, flaky crust, cinnamon'},
#     {'Dessert': 'Churros', 'Country': 'Spain', 'Main Ingredients': 'Fried dough, sugar, chocolate/dulce de leche'},
#     {'Dessert': 'Baklava', 'Country': 'Greece', 'Main Ingredients': 'Filo pastry, nuts, syrup/honey'},
#     {'Dessert': 'Pavlova', 'Country': 'New Zealand', 'Main Ingredients': 'Meringue, whipped cream, fresh fruits'},
#     {'Dessert': 'Tres Leches Cake', 'Country': 'Mexico', 'Main Ingredients': 'Sponge cake, evaporated milk, condensed milk, heavy cream'},
#     {'Dessert': 'Creme Brulee', 'Country': 'France', 'Main Ingredients': 'Custard, caramelized sugar'},
# ]

# with open('Desserts.csv', 'w', encoding='utf8', newline='') as f:
#     csv_writer = csv.DictWriter(f, fieldnames=fields)
#     csv_writer.writeheader()

#     for row in rows:
#         csv_writer.writerow(row)


with open('Desserts.csv', 'r') as f:
    reader = csv.reader(f)
    
    for line in reader:
        if line[0] == "Mochi": 
            # print(line)
            line.clear()
        print(line)
        
f.close()