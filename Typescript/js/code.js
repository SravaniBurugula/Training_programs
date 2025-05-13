//Interfaces
//create an object that follows the person interface
var john = {
    name: "John Doe",
    age: 30,
    greet: function () {
        console.log('Hello, my name is: ${this.name}!');
    }
};
john.greet(); //output: "Hello, my name is John Doe!"
//Implement the interface in a class
var Employee = /** @class */ (function () {
    function Employee(name, age, jobTitle //can add additional properties
    ) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    Employee.prototype.greet = function () {
        console.log("Hi, I'm ${this.name}, a $(this.jobTitle)");
    };
    return Employee;
}());
var sarah = new Employee("Sarah Smith", 28, "Developer");
sarah.greet(); //Output: "Hi, I'm Sarah Smith, a Developer. 
var book1 = { title: "TS Basics", author: "Jane Doe" };
var book2 = { title: "TS advance", author: "Jane Smith", pages: 25 };
