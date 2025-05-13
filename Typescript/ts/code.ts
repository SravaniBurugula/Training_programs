//Interfaces

//Define an interface for a person
interface Person{
    name: string;
    age: number;
    greet(): void; // Method Signature
}
//create an object that follows the person interface
const john: Person = {
    name:"John Doe",
    age: 30,
    greet(){
        console.log('Hello, my name is: ${this.name}!');

    }
};

john.greet(); //output: "Hello, my name is John Doe!"

//Implement the interface in a class
class Employee implements Person{
    constructor(
        public name: string,
        public age: number,
        public jobTitle:string //can add additional properties

    ){}
    greet(){
        console.log("Hi, I'm ${this.name}, a $(this.jobTitle)");
    }
}

const sarah = new Employee("Sarah Smith", 28, "Developer");
sarah.greet(); //Output: "Hi, I'm Sarah Smith, a Developer. 

////////////////////////////////////////////////////

//Interface with optional property
interface Book{
    title: string;
    author: string;
    pages?: number; //optional property
}
const book1: Book = {title: "TS Basics", author:"Jane Doe"};
const book2: Book = {title: "TS advance",author:"Jane Smith", pages:25};
