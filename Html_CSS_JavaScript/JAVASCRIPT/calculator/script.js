let screen=document.getElementById('screen')
let equals=document.querySelector(".equals")
let buttons=document.getElementsByClassName('btn')
let ac=document.querySelector(".allclr")
let c=document.querySelector(".clr")
for(let button of buttons){
    button.addEventListener('click',()=>{
        screen.value+=button.innerText
    })
}

equals.addEventListener('click',()=>{
    screen.value=eval(screen.vlaue);
})

ac.addEventListener('click',()=>{
    screen.value=""
})
