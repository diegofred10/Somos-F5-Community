<script setup>
import colors from '../scss/_colors.scss'
</script>

<template>
<div class="infoUser">
    <div class="photoUser">
        <img class="imgProfile" src="../assets/images/imagesSomosF5/foto-perfil.png" alt="img">
    </div>
    <div class="info">
        <h3 class="name">Marco Polo</h3>
        <div class="contacts">
            <img class="logo" src="../assets/images/imagesSomosF5/github.png" alt="gitHub">
            <p class="contactsName">Github</p>
        </div>
        <div class="contacts">
            <img class="logo" src="../assets/images/imagesSomosF5/linkedin.png" alt="linkedin">
            <p class="contactsName">LinkedIn</p>
        </div>
        <div class="contacts">
            <img class="logo" src="../assets/images/imagesSomosF5/Vector.png" alt="email">
            <p class="contactsName">Email</p>
        </div>
        <div class="contacts">
            <img class="logo" src="../assets/images/imagesSomosF5/geo-alt.png" alt="geo">
            <p class="contactsName">Castropol</p>
        </div>   
    </div>
    <div class="design">       
        <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="">
        <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="">       
        <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="">
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;

.infoUser{
background-color: map-get(c.$colors,"orange");
height: 30vh;
width: 90vw;
display: flex;
align-items: center;

    .photoUser{
        width: 25vh;
        margin-left: 3%;
        margin-right: 3%;
        .imgProfile{
            border-radius: 100%;
        }
    }

    .info{
        display: flex;
        align-items: center;
        justify-content: center;
        flex-direction: column;
        align-items: flex-start;
        
        .name{
            font-size: 4vw;
            color: map-get(c.$colors,"white");
            font-family: 'Open Sans', sans-serif ;
            
        }
        .contacts{
        display: flex;
        float:left;
        margin-top: 2%;
        font-family: 'Open Sans', sans-serif ;
            .logo{
                width: 18%;

            }
            .contactsName{
                color: white;
                margin-left: 2%;
            }
        }

    }

    .design{
        display: flex;
        justify-content: flex-end;
        width: 55%;
        height: 85%;

        .arrow{
            width: 15%;          
            z-index: 2;
            right: 35vw;
            top: 10%;
            margin-top: -2%;
            position: absolute;    
            rotate: -20deg;
        }
        .triangle{
            width: 10%;
            right: 27vw;
            top: -10%;
            position: absolute;
            rotate: 270deg;
        }
        .semicircle{
            right: 10%;
            rotate: 180deg;
            width: 15%;
            top: -2%;
            position: absolute;
        }
    }
}



</style>