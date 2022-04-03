function rectangularFrame() {
    var sentence = document.getElementById("sentence").value;
    var listWords = sentence.split(" ");
    var lengthword = lengthCalculator(listWords);
    var arrLength=listWords.length;
    var star = "*"
    document.write(star.repeat(lengthword + 4) + "<br>");
    for (var i = 0; i < arrLength; i++) {
        document.write("* ");
        document.write(listWords[i]);
        document.write(" *<br>");

    }
    document.write(star.repeat(lengthword + 4));

}

function lengthCalculator(list) {
    var max_str = list[0].length;
    var ans = list[0];
    for (var i = 1; i < list.length; i++) {
        var maxi = list[i].length;
        if (maxi > max_str) {
            ans = list[i];
            max_str = maxi;
        }
    }
    return ans.length;
}