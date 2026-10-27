def sayHello(name, gender):
    print( )
    if gender == "male":
        print(f"Hello {name} 👋! How are you? You're going in B, that's where other men are.")
    else:
        print(f"Hello {name} 👋! How are you? You're going in A, that's where other women are.")


if __name__ == "__main__":
    yourName = input("Enter your name: ")
    gender = input("Gender (in full e.g male): ").lower()

    sayHello(name=yourName, gender=gender)

def sayG():
    return "Hello World!"