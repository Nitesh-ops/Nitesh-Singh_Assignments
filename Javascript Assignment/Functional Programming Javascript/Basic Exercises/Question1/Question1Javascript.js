function composedValue() {
    var number = document.getElementById("num").value;
    document.write("Composed value of " + number + " is: " + composed(square, double, number));
}

function square(x) {
    return x * x;
}

function double(x) {
    return x * 2;
}

function composed(square, double, value) {
    return square(double(value));
}