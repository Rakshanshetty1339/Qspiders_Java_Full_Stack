var r
console.log(typeof r)

var p=1
console.log(p)

let skill="javascript is dynamic lang"
console.log(skill)
console.log(typeof skill)
console.log(skill[1])
console.log(skill[5])

console.log(skill.toUpperCase())//uppercase
console.log(skill.toLowerCase())//lowercase
console.log(skill.slice(10))//slice
console.log(skill.slice(4,10))//slice
console.log(skill.charAt(2))
console.log(skill.charCodeAt(1))
console.log(skill.concat("uage"))
console.log(skill.endsWith('g'))
console.log(skill.startsWith('a'))
console.log(skill.includes('is'))
console.log(skill.indexOf('i'))
console.log(skill.repeat(2))
console.log(skill.replace("dynamic","easy"))
console.log(skill.split())//
console.log(skill.split(''))//
console.log(skill.split(' '))//


let exp=((true*2)+15+20)
console.log(exp)

let a=10 ,b=20
res=++a + a++ -b--
console.log(res)

let c=10
console.log(typeof 10)



// factoral of a number in javascript

function factorial(n) {
  if (n < 0) {
    return "Factorial is not defined for negative numbers";
  }
  let result = 1;
  for (let i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}

// Example usage:
const number = 5;
const result = factorial(number);
console.log(`The factorial of ${number} is ${result}`);


// Add two numbers using an arrow function
const addNumbers = (a, b) => a + b;

// Example usage:
let num1 = 10;
let num2 = 5;
let sum = addNumbers(num1, num2);
console.log(`The sum of ${num1} and ${num2} is ${sum}`);


//for of
let str="rakshan"
for(let i of str)
    console.log(i)

//for in
let str2="shetty"
for(let i in str2)
    console.log(i)

//Normal function
function addtonumber(x,y){
    let result=x+y
    return result
}
console.log(addtonumber(10,20))

//anonymous function
let fun=function(a,b){
    let result=a+b
    return result
}
console.log(fun(10,20))

//arrow function
let arrow=(a,b)=>{
    let result=a+b
    return result
}
console.log(arrow(10,20))

//self-invoking function
let self=((a,b)=>console.log(a+b))(10,20)
    

// Add two numbers using a self-invoking arrow function
const sumOfTwo = ((a, b, c) => a + b + c)(10, 20,30);
console.log(`The sum is ${sumOfTwo}`);

// Add two numbers using an anonymous function
const add = function(a, b) {
  return a + b;
};

let resultOfAddition = add(5, 15);
console.log(`The sum is: ${resultOfAddition}`);


//Nested function
function outer(){
    let a=10
    function inner(){
        let b=20
        console.log(a+b)
    }
    inner()
}
outer()


//higherorder function
function outer(){
    let a=10
    function inner(){
        let b=20
        console.log(a+b)
    }
    return inner
}
outer()()

//callback function


//closure


//promise
let promise=new Promise((resolve,reject)=>{
    let a=10
    let b=20
    let c=a+b
    if(c==30)
        resolve()
    else
        reject()

})


let names = ["Alice", "Bob", "Charlie", "David", "Eve"];
console.log(names);

//for loop
for(i=0;i<names.length;i++)
    console.log(names[i],`is fruit`)

//for of loop
for(let name of names)
    console.log(name)


//for in loop
for(let name in names)
    console.log(name)

//for each loop
names.forEach(name=>console.log(name))


let num=[1,2,3,4,5];
let numsum=0;
// for(i=0;i<num.length;i++)
//     numsum+=num[i]

for(let n of num)
    numsum+=n
console.log(numsum)

numsum=0
num.forEach(n=>numsum+=n)
console.log(numsum)



