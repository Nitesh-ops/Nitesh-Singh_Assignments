function find() {
    var number = document.getElementById("number").value;
    var result = findEvenOdd(number);
    document.write(number + " is: " + result);
}

function findEvenOdd(number) {
    if (number % 2 == 0) {
        return "Even";
    } else {
        return "Odd";
    }

}