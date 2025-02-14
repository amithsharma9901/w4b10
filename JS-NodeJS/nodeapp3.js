var buf = new Buffer('Simply Easy Learning');
var json = buf.toJSON(buf);

console.log(json);

buf1 = new Buffer(256);
len = buf.toJSON("Simply Easy Learning");

console.log("Octets written : "+  len);