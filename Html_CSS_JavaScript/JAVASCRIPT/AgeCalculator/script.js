let form=document.querySelector('form')
let spanelm=document.getElementById('age')
form.addEventListener('submit',(event)=>{
    let user_dob=event.target[0].value
    if(user_dob=='')
    {
        alert('Form Not Submitted empty fields')
    }
    let yob=new Date(user_dob).getFullYear()
    let mob=new Date(user_dob).getMonth()
    let dob=new Date(user_dob).getDate()
    let yr=new Date().getFullYear()
    let mon=new Date().getMonth()
    let dy=new Date().getDate();
    let days;
    let months;
    if(dob>dy)
        {
             mon--;
            if(mon%2!=0 && mon<8 || mon>7 && mon%2==0)
            {
                days=(31+dy)-dob;
            }
            else if(mon==2)
            {
                if(leapYr(yr))
                {
                    days=(29+dy)-dob;
                }
                else
                {
                    days=(28+dy)-dob;
                }
            }
            else
            {
                days=(30+dy)-dob;
                    
            } 
        }
    else
        {
            days=dy-dob;
        }
    if(mob>mon)
        {
            yr--;
            months=(mon+12)-mob;
        } 
    else
        {
            months=mon-mob;
        }
    spanelm.innerText=` ${yr-yob} years  ${months} months ${days} days`    
    event.preventDefault();    
    })
    // function leapYr(yr){
    //     if(((yr % 4 === 0 && yr % 100 !== 0) || (yr % 400 === 0))){
    //         return true
    //     }
    //     else{
    //         return false
    //     }
    // }