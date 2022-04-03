/* Assuming that the Rectangle constructor takes a width and a height, why does the following output
20 instead of 200? (Hint: if you see an answer that seems too obvious to be what I am looking for,
it probably is the answer I am looking for.)
Rectangle r = new Rectangle(4, 5);
r.hieght = 50;
r.getArea(); --> 20 // Not 200 */


class Rectangle {
    constructor(width, height) {
        Object.defineProperty(this, "width", {
            value: width,
            writable: false,
            configurable: false,
            enumerable: true, // or false, doesn't matter
        });

        Object.defineProperty(this, "height", {
            value: height,
            writable: false,
            configurable: false,
            enumerable: true, // or false, doesn't matter
        });
    }
}

Rectangle.prototype.getArea = function () {
    var areaWidth = this.width;
    var areaHeight = this.height;
    return " Area of rectangle is: " + (areaWidth * areaHeight);
}

var sides1 = new Rectangle(4, 5);
sides1.height = 50;

console.log(sides1.getArea());

