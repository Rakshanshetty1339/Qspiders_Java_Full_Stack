// function gernerateNumber() {
//     let span = Math.round(Math.random() * 10000);
//     if (span > 999 && num<=9999) {
//         console.log(number);
//     }
//     else{
//         gernerateNumber();
//     }
// }
// button.addEventListener('click',()=>{
//     gernerateNumber();
// })


let button = document.getElementById('createbtn')
let span = document.querySelector('span')
let myCaptcha;

button.addEventListener('click', () => {
    let str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM!@#$%&1234567890"
    let captcha = ''
    for (let i = 0; i < 4; i++) {  // generate 4 chars
        let num = Math.floor(Math.random() * str.length)
        captcha += str[num]
    }
    span.innerText = captcha
    myCaptcha = captcha
})

// validation
let form = document.querySelector('form')
let p = document.getElementById('msg')

form.addEventListener('submit', (event) => {
    event.preventDefault()
    let user_input = document.getElementById('captchaInput').value
    if (user_input === myCaptcha) {
        p.style.color = 'green'
        p.innerText = 'Valid Captcha'
    } else {
        p.style.color = 'red'
        p.innerText = 'Invalid Captcha'
    }
})

