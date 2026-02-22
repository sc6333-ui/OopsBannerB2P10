// OOPS Banner using String Array and Loop

// Create array to store 7 lines
let lines = [];

// Populate banner using join()
lines[0] = [" ***** ", " ****** ", " ****** ", " ***** "].join("   ");
lines[1] = ["*     *", "*      *", "*      *", "*     *"].join("   ");
lines[2] = ["*     *", "*      *", "*      *", "*     *"].join("   ");
lines[3] = ["*     *", " ****** ", " ****** ", " ***** "].join("   ");
lines[4] = ["*     *", "*", "*", "*"].join("   ");
lines[5] = ["*     *", "*", "*", "*"].join("   ");
lines[6] = [" ***** ", "*", "*", " ***** "].join("   ");

// Use for-of loop to print
for (let line of lines) {
    console.log(line);
}