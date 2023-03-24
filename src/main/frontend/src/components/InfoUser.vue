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
        <img class="arrow" src="../assets/images/imagesSomosF5/flecha2 2.png" alt="">
        <img class="triangle" src="../assets/images/imagesSomosF5/trianguloCeleste 1.png" alt="">       
        <img class="semicircle" src="../assets/images/imagesSomosF5/semiCirculo 2.png" alt="">
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
            width: 18%;          
            z-index: 2;
            right: 30vw;
            margin-top: -2%;
            position: absolute;
        }
        .triangle{
            width: 25%;
            right: 15vw;
            position: absolute;
        }
        .semicircle{
            width: 5%;
            position: absolute;
        }
    }
}



</style>