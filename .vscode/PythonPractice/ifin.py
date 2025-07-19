import string
username= input("Enter the username:").lower()
password= input("Enter the password: ")

if username.isalpha() and len(password) >= 8:
    print("Logged in successfully")
else:
    print("Invalid password or username")