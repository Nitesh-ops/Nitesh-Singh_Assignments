function calculateSum() {
    var number = document.getElementById("number").value;
    var sum = 0;
    for (var i = 0; i < number; i++) {
        sum += i;
    }

    document.write("<b>Sum of number upto the given number is <b>" + sum);
}

