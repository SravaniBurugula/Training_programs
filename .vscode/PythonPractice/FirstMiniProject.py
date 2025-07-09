Year_of_Birth = int(input("Enter your year of birth: ") )
if Year_of_Birth > 0:
    current_year = 2025
    age= current_year -Year_of_Birth
    print(f"Your age is {age} years")
else:
    print("Print a valid year")