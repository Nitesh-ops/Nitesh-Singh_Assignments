/* Try reading the middleName property from your variable above. Try assigning to the middleName
property. Try reading the property again after you assign to it. Is this behavior a good thing or a bad
thing? */

var person = {
    firstName: "Nitesh",
    lastName: "Rajput"
};
person.middleName = "Singh";

console.log("Full name: " + person.firstName + " " + person.middleName+ " " + person.lastName);
