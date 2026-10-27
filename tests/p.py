def sayAmen():
    """
    This just serves to demonstrate or test some capabilities of the IDE
    """
    greeting = "Hello world"
    return greeting


userName = "sayAmen"
count = 0

while count <= 5:
    count += 1
    print(userName)

    """A great method."""
    print("This is great!")


class Demo:
    """
    A sample demonstration class just to show capabilities
    """

    def __init__(self) -> None:
        pass

    def great(self):
        return "Hello World of Programmers"


newDemo = Demo()
print(newDemo.great())
