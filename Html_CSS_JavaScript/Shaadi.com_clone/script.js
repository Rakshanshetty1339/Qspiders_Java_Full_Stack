 // JavaScript code for generating age options
    let ageDropdown = document.getElementById("age");

    for (let i = 21; i <= 70; i++) {
      let option = document.createElement("option");
      option.value = i;
      option.text = i;
      ageDropdown.appendChild(option);
    }
    

    let ageDropdown2 = document.getElementById("age2");

    for (let i = 21; i <= 70; i++) {
      let option = document.createElement("option");
      option.value = i;
      option.text = i;
      ageDropdown2.appendChild(option);
    }
    
    