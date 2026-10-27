#include <iostream>
#include <string>

int add(int a, int b) {
    return a + b;
}

int main(){
    std::string username;
    int age;

    
    std::cout << "What's your name: ";
    std::cin >> username;

    std::cout << "Your age: ";
    std::cin >> age;

    std::cout << "\nHello " << username << "! You are " << age << " right?" << std::endl;

    std::cout << "The sum of the two numbers is: " << add(2,4) << std::endl;

    return 0; 
}
