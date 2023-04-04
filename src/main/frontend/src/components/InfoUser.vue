<script setup>
//import colors from '../scss/_colors.scss';
</script>

<template>
<div class="infoUser">
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
    <div class="design">       
        <img class="arrow" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/632a9e30dd20f538a3049cc4_shape-13.svg" alt="">
        <img class="triangle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/6329c1bbaf7322b42359abe7_shape-5.svg" alt="">       
        <img class="semicircle" src="https://uploads-ssl.webflow.com/62e2b7b9c42bdda27c83d493/63c7aad88f903d7f30ff4eff_emp-shape-05.svg" alt="">
    </div>
</div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/fonts";

.infoUser{
background-color: map-get(c.$colors,"orange");
height:auto;
width: 96%;
display: flex;
align-items: center;
// justify-content: space-around;
margin: 2%;

    .photoUser{
        width: 15%;
        // margin:2vw;
        // margin-top:2vw;
        // margin-bottom:2vw;
        // margin-left:2vw;
        .imgProfile{
            border-radius: 100%;
        }
    }

    .contacts{
        display: flex;
        // align-items: center;
        // justify-content: center;
        flex-direction: column;
        // align-items: flex-start;
        // margin-right: 6vw;
        
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
        // margin-top: 2%;
        font-family: 'openSans' ;
        margin-bottom: 0.5em;

            .logo{
                width: 10%;


            }
            .contactsName{
                color: white;
                margin-left: 2%;
            }
        }

    }

    .design{
        display: flex;
        // justify-content: flex-end;
        // display: contents;
        flex-direction: row;
        width: 40%;
  
        
        .arrow{
            width: 45%;          
            z-index: 1;
            // right: 35vw;
            // top: 10%;
            // margin-top: -2%;
            // position: relative;    
            rotate: -20deg;
        }
        .triangle{
            width: 20%;
            margin-bottom: -15%;
            // top: -13%;
           
            // position: relative;
            rotate: 270deg;
        }
        .semicircle{
            // left: 5%;
            z-index: 1;
            rotate: 180deg;
            width: 60%;
            // top: -12%;
            // position: relative;
        }
    }
}



</style>