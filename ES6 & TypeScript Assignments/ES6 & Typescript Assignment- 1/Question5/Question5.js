/* Extended parameter handling:
a.	Write a add() with default values.
b.	Write a function userFriends() that takes 2 arguments username & array of user friends. The function should print username & his list of friends. (Use rest parameters)
c.	Write a function printCapitalNames() that takes five names as argument & prints them in capital letters. Use spread operator in order to call printCapitalNames() function.*/
function add(a, b) {
    if (a === void 0) { a = 5; }
    if (b === void 0) { b = 6; }
    return a + b;
}
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("\nName: ".concat(username, "\nList of Friends"));
    for (var _a = 0, friends_1 = friends; _a < friends_1.length; _a++) {
        var friend = friends_1[_a];
        console.log(friend);
    }
}
function printCapitalNames() {
    var lowerCaseName = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        lowerCaseName[_i] = arguments[_i];
    }
    console.log("\nAll Capital Names\n");
    for (var _a = 0, lowerCaseName_1 = lowerCaseName; _a < lowerCaseName_1.length; _a++) {
        var capital = lowerCaseName_1[_a];
        console.log(capital.toUpperCase());
    }
}
console.log("\nAddition Function with default values : ".concat(add()));
var arr = ["ABC", "DEF", "GHI", "JKL", "MNO"];
userFriends("Nitesh", arr);
var lowerCaseName = ["Nitesh", "Satyam", "Surender", "Mohit", "Aman"];
printCapitalNames.apply(void 0, lowerCaseName);
