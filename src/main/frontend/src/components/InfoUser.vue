<script setup>

</script>

<template>
<div class="banner">
    <div class="infoUser">
    <div class="photoAndContact">  
        <div class="photoUser">
            <input type="file" @change="onFileChange" ref="fileInput" style="display:none">  
            <button @click="$refs.fileInput.click()">           
            <img class="imgProfile" src="../assets/images/imagesSomosF5/foto-perfil.png" alt="img">
        </button>
        </div>
        <div class="contacts">
            <p class="name">Marco Polo</p>
            <div class="contact">
                <img class="logo" src="../assets/images/imagesSomosF5/github.png" alt="gitHub">
                <p class="contactsName">Github</p>
            </div>
            <div class="contact">
                <img class="logo" src="../assets/images/imagesSomosF5/linkedin.png" alt="linkedin">
                <p class="contactsName">LinkedIn</p>
            </div>
            <div class="contact">
                <img class="logo" src="../assets/images/imagesSomosF5/Vector.png" alt="email">
                <p class="contactsName">Email</p>
            </div>
            <div class="contact">
                <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
                <p class="contactsName">Castropol</p>
            </div>   
        </div>
    </div> 
        <div class="design">       
            <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="">
            <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="">       
            <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="">
        </div>
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.banner{
    display: flex;
    // justify-content: center;
    align-items: end;
    .infoUser{
        width: 100%;
        background-color: map-get(c.$colors,"orange");
        height:15em;
        display: flex;
        align-items: center;
        justify-content: space-around;
        margin: 0 auto;
// margin: 2%;

    .photoAndContact{
        display: flex;
        // justify-content: space-between;
        align-items: center;
        // width: 25vw;

    .photoUser{
        width: 25em;
        display: flex;
        justify-content: center;

        .imgProfile{
            border-radius: 100%;
        }
    }

    .contacts{
        display: flex;
        flex-direction: column;
        
        .name{
            font-size: 2em;
            color: map-get(c.$colors,"white");
            font-family: 'openSans';
            font-weight: bold;
            
        }
        .contact{
            display: flex;
            flex-direction: row;
            align-items: center;
            font-family: 'openSans' ;
            margin-bottom: 0.5em;

            .logo{
                width: 10%;


            }
            .contactsName{
                color: white;
             
            }
        }
    }
}
    .design{
        display: flex;
        justify-content: flex-end;
        flex-direction: row;
        width: 30em;
        margin: 0 10em 5em 5em;
  
        
        .arrow{
            width: 30%;          
            z-index: 1;  
            rotate: -20deg;
        }
        .triangle{
            width: 40%;
            margin-bottom: -15%;
            rotate: 270deg;
        }
        .semicircle{
            z-index: 1;
            rotate: 180deg;
            width: 40%;
        }
    }
}

}

</style>