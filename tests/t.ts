const greetUser = (name: string, greetingssss?: string): string => {
    if (greetingssss) {
        return `${greetingssss}, ${name}!`;
    }
    return `Hello, ${name}!`;

};


const customizedGreet = greetUser("Alice", "Welcome");
logMessage(customizedGreet);