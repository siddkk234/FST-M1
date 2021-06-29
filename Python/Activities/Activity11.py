fruit_shop = {
    "kiwi": 5,
    "banana": 15,
    "orange": 11,
    "mango": 10
}

check = input("Enter the fruit name").lower()

if(check in fruit_shop):
    print("Its available")
else:
    print("Its unavailable")