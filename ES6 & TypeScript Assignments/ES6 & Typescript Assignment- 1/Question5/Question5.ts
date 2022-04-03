/* Extended parameter handling:
a.	Write a add() with default values.
b.	Write a function userFriends() that takes 2 arguments username & array of user friends. The function should print username & his list of friends. (Use rest parameters)
c.	Write a function printCapitalNames() that takes five names as argument & prints them in capital letters. Use spread operator in order to call printCapitalNames() function.*/

function add(a = 5, b = 6) {
  return a + b;
}

function userFriends(username: string, ...friends: string[][]) {
  console.log(`\nName: ${username}\nList of Friends`);
  for (let friend of friends) {
    console.log(friend);
  }
}

function printCapitalNames(...lowerCaseName: string[]) {
  console.log("\nAll Capital Names\n");
  for (let capital of lowerCaseName) {
    console.log(capital.toUpperCase());
  }
}

console.log(`\nAddition Function with default values : ${add()}`);

const arr = ["ABC", "DEF", "GHI", "JKL", "MNO"];
userFriends("Nitesh", arr);

const lowerCaseName = ["Nitesh", "Satyam", "Surender", "Mohit", "Aman"];
printCapitalNames(...lowerCaseName);
