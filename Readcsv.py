import csv

# with open("country.csv", 'r') as f:
#     csv_reader = csv.reader(f);
#     for line in csv_reader:
#         print(line)


# with open("country.csv", encoding="utf8") as f:
#     csv_reader = csv.reader(f);
#     next(csv_reader)  # skipping line
#     for line_no, line in enumerate(csv_reader, 1):
#         if line_no == 1:
#             print("Header: ")
#             print(line)
#             print("Data: ")
#         else:
#             print(line)


# total_area = 0
# with open("country.csv", encoding="utf8") as f:
#     csv_reader = csv.reader(f)

#     next(csv_reader)

#     for line in csv_reader:
#         # total_area += float(line[1])
#         print(f"The area of {line[0]} is {line[1]} km2")

# print(total_area)
        


with open("country.csv", encoding="utf8") as f:
    csv_reader = csv.DictReader(f)

    next(csv_reader)

    for line in csv_reader:
        # print(line)
        print(f"The area of {line['name']} is {line['area']} km2")

f.close()