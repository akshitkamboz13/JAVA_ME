const randomNumber = Math.floor(Math.random() * 12) + 1;
let month;

if (randomNumber === 1) {
    month = "January";
} else if (randomNumber === 2) {
    month = "February";
} else if (randomNumber === 3) {
    month = "March";
} else if (randomNumber === 4) {
    month = "April";
} else if (randomNumber === 5) {
    month = "May";
} else if (randomNumber === 6) {
    month = "June";
} else if (randomNumber === 7) {
    month = "July";
} else if (randomNumber === 8) {
    month = "August";
} else if (randomNumber === 9) {
    month = "September";
} else if (randomNumber === 10) {
    month = "October";
} else if (randomNumber === 11) {
    month = "November";
} else if (randomNumber === 12) {
    month = "December";
}

let horoscope;

if (month === "January") {
    horoscope = "♑ Capricorn";
} else if (month === "February") {
    horoscope = "♒ Aquarius";
} else if (month === "March") {
    horoscope = "♓ Pisces";
} else if (month === "April") {
    horoscope = "♈ Aries";
} else if (month === "May") {
    horoscope = "♉ Taurus";
} else if (month === "June") {
    horoscope = "♊ Gemini";
} else if (month === "July") {
    horoscope = "♋ Cancer";
} else if (month === "August") {
    horoscope = "♌ Leo";
} else if (month === "September") {
    horoscope = "♍ Virgo";
} else if (month === "October") {
    horoscope = "♎ Libra";
} else if (month === "November") {
    horoscope = "♏ Scorpio";
} else if (month === "December") {
    horoscope = "♐ Sagittarius";
}

console.log(`Your horoscope for ${month} is: ${horoscope}`);
