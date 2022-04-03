/* 4.	Arrow functions: Take an array of strings & convert it into another array of object which has two properties {string, string_length}. For example:
let names = [‘Tom’, ‘Ivan’, ‘Jerry’]
Output: [ {name: ’Tom’, length: 3}, {name: ’Ivan’, length: 4 }, {name: ’Jerry’, length: 5} ] */
var names = ["Tom", "Ivan", "Jerry"];
var name_obj = names.map(function (data) {
    return {
        name: data,
        length: data.length
    };
});
console.log(name_obj);
