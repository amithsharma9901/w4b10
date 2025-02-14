var fs = require("fs");   //file stream

//callback function , passing funciton as argument/param  to other function
fs.readFile('input.txt', function (err, data) {
   if (err) return console.error(err);
   console.log(data.toString());
});

console.log("Program Ended");