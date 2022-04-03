function calculateSum() {
    var number = document.getElementById("number").value;
    var sum = 0;
    for (var i = 0; i < number; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
        continue;
    }

    document.write("<b>Sum of number upto the given number is(Only multiples of 3 and 5): <b>" + sum);
}

