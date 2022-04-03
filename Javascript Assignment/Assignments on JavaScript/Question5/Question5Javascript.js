function leapYears() {
    var currDate = new Date();
    var currYear = currDate.getFullYear();
    var totalYears = 20;
    while (totalYears > 0) {

        if ((currYear % 4 == 0) && (currYear % 100 != 0) || (currYear % 400 == 0)) {
            document.write(currYear + ", ");
            currYear++;
            totalYears--;
        }
        else {
            currYear++;
        }
    }

}