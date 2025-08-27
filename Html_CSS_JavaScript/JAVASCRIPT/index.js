 console.log("rakshan shetty k")
 var str="welcome";
 console.log(str)
 console.log(str.toUpperCase()) 
 console.log(str.toLowerCase())
 console.log(str.charAt(0))
 console.log(str.charCodeAt(2))//Prints char Ascii value
 console.log(str.concat(" Students"))// does concatination operation
 console.log(str.endsWith('e')) //true or returns a boolean 
 console.log(str.endsWith('r')) // false
 console.log(str.startsWith('w'))// true
 console.log(str.startsWith('wetcom'))//false -- returns a boolean based on the string is starting with specific character or a substring
 console.log(str.startsWith('wel'))//true 
 console.log(str.indexOf('l')) //2--returns index value of substring
 console.log(str.indexOf('e',1)) //1--returns index value of 1st occurance of substring
 console.log(str.indexOf('e',2)) // 6--returns index value of 2nd occurance of substring
 str="JavaScript is easy"
 console.log(str)
 console.log(str.indexOf('is'))
 console.log(str.repeat(2)) //returns the string 2 times
 console.log(str.replace('JavaScript','TypeSript'))
 console.log(str.split())// converts to array
 console.log(str.split(''))// returns every letter (18) ['J', 'a', 'v', 'a', 'S', 'c', 'r', 'i', 'p', 't', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y']
 console.log(str.split(' '))// returns every word present (3) ['JavaScript', 'is', 'easy']




